package jjcdevelopments.munchies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.ui.PlacePicker;

/**
 * Creates the Menu page.
 */
public final class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button Feed = (Button) findViewById(R.id.FeedMeBtn);
        Feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Search();
            }
        });

        Button Plan = (Button) findViewById(R.id.PlanMealBtn);
        Plan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Plan();
            }
        });
    }

    private void Search(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    private void Plan(){
        Intent intent = new Intent(this,Planner.class);
        startActivity(intent);
    }
}
