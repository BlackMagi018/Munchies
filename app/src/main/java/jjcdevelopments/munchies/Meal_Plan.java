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

public class Meal_Plan extends AppCompatActivity {

    /** Layout TextView References */
    TextView Name;
    TextView Addr;
    TextView Addr2;
    /** Layout Button Reference*/
    Button submit;
    /** Layout EditText References */
    EditText DateSel;
    EditText TimeSel;
    /** Layout Switch Reference */
    Switch aSwitch;

    /**
     * Creates layout and begins Meal Plan Activity
     * @param savedInstanceState - Instance State data
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal__plan);
        // Links References to Layout Objects
        Name = (TextView) findViewById(R.id.rName);
        Addr = (TextView) findViewById(R.id.rAddress);
        Addr2 = (TextView) findViewById(R.id.rAddress2);
        DateSel = (EditText) findViewById(R.id.DateSel);
        TimeSel = (EditText) findViewById(R.id.TimeSel);
        aSwitch = (Switch) findViewById(R.id.switch1) ;
        submit = (Button) findViewById(R.id.submit);
        //Creates submit button OnClickListener and sets it to
        //run submit method when clicked                    */
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Submit();
            }
        });
        // Launches Plan Method
        Plan();
    }

    /**
     * Method to save Meal and add it Saved Meals
     */
    private void Submit() {
        Intent i = new Intent(this,Planner.class);
        String s = "";
        // Figure out if time period is set to AM or PM
        if(aSwitch.isChecked() == true){
            s = "PM";
        }
        else {
            s = "AM";
        }
        //Create the bundle and retrieve data sent from Planner class
        Bundle bundle = getIntent().getExtras();
        String save = bundle.getString("Meals");
        //Create data string
        String data = Name.getText() + "!" + Addr.getText() + "!" + Addr2.getText() + "!" + DateSel.getText().toString() + "!" + TimeSel.getText().toString() + " " + s + "#";
        //combine old data with new data
        data = save + data;
        //save data in bundle
        bundle.putString("Meals",data);

        //Add the bundle to the intent
        i.putExtras(bundle);

        //start Planner Activity
        startActivity(i);
    }

    /**
     * Starts the Place Picker Activity to get Restaurant Name and Address
     */
    private void Plan(){
        PlacePicker.IntentBuilder builder = new PlacePicker.IntentBuilder();
        try {
            startActivityForResult(builder.build(this), 1);
        } catch (GooglePlayServicesRepairableException | GooglePlayServicesNotAvailableException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method run once PlacePicker intent finished and Place is selected
     * @param requestCode - determines request type
     * @param resultCode - determine result type
     * @param data - intent
     */
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
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
