package jjcdevelopments.munchies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlacePicker;

import static jjcdevelopments.munchies.R.id.DateSel;

public class Meal_Plan extends AppCompatActivity {

    private static int PLACE_PICKER_REQUEST = 1;
    TextView Name;
    TextView Addr;
    TextView Addr2;
    Button submit;
    EditText DateSel;
    EditText TimeSel;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal__plan);
        Name = (TextView) findViewById(R.id.rName);
        Addr = (TextView) findViewById(R.id.rAddress);
        Addr2 = (TextView) findViewById(R.id.rAddress2);
        DateSel = (EditText) findViewById(R.id.DateSel);
        TimeSel = (EditText) findViewById(R.id.TimeSel);
        aSwitch = (Switch) findViewById(R.id.switch1) ;
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Submit();
            }
        });
        Plan();
    }

    private void Submit() {
        Intent i = new Intent(this,Planner.class);
        String s = "";
        if(aSwitch.isChecked() == true){
            s = "PM";
        }
        else {
            s = "AM";
        }
        //Create the bundle
        Bundle bundle = getIntent().getExtras();
        String save = bundle.getString("Meals");

        String data = Name.getText() + "!" + Addr.getText() + "!" + Addr2.getText() + "!" + DateSel.getText().toString() + "!" + TimeSel.getText().toString() + " " + s + "#";
        data = save + data;
        bundle.putString("Meals",data);

        //Add the bundle to the intent
        i.putExtras(bundle);

        //Fire that second activity
        startActivity(i);
    }

    private void Plan(){
        PlacePicker.IntentBuilder builder = new PlacePicker.IntentBuilder();
        try {
            startActivityForResult(builder.build(this), PLACE_PICKER_REQUEST);
        } catch (GooglePlayServicesRepairableException | GooglePlayServicesNotAvailableException e) {
            e.printStackTrace();
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == PLACE_PICKER_REQUEST) {
            if (resultCode == RESULT_OK) {
                Place place = PlacePicker.getPlace(this,data);
                Name.setText(place.getName());
                String s = (String) place.getAddress();
                String[]temp = s.split(",");
                Addr.setText(temp[0]);
                Addr2.setText(temp[1] + "," + temp[2] + ", " + temp[3]);
            }
        }
    }

}
