package jjcdevelopments.munchies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Creates the main page.
 */
public final class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = (Button) findViewById(R.id.LogBtn);
        //Button Register = (Button) findViewById(R.id.RegBtn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                login();
            }
        });
    }

    /**
     * Displays the login/register page.
     */
    private void login() {
        Intent intent = new Intent(this, FeedMe.class);
        startActivity(intent);
    }
}
