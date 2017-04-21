package jjcdevelopments.munchies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Creates the Menu page.
 */
public final class Menu extends AppCompatActivity {

    /**
     * Creates Menu Layout and creates listeners for the buttons
     * @param savedInstanceState - State of Instance
     */
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

    /**
     * Starts Feed Me Activity
     */
    private void Search(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    /**
     * Starts Planner Activity
     */
    private void Plan(){
        Intent intent = new Intent(this,Planner.class);
        startActivity(intent);
    }
}
