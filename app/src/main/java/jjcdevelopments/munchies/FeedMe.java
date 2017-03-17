package jjcdevelopments.munchies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Creates the FeedMe page.
 */
public final class FeedMe extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_me);

        Button Feed = (Button) findViewById(R.id.FeedMeBtn);
        Feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Search();
            }
        });
    }

    private void Search(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}
