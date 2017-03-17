package jjcdevelopments.munchies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Creates the main page.
 */
public final class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText User = (EditText) findViewById(R.id.Username);
        EditText Pass = (EditText) findViewById(R.id.Password);
        Button Login = (Button) findViewById(R.id.LogBtn);
        Button Register = (Button) findViewById(R.id.RegBtn);
        Login.setOnClickListener(new View.OnClickListener() {
        Button login = (Button) findViewById(R.id.LogBtn);
        //Button Register = (Button) findViewById(R.id.RegBtn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                login();
            }
        });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Register();
            }
        });
    }

    /**
     * Displays the login/register page.
     */
    private void login() {
        Intent intent = new Intent(this, FeedMe.class);
    private void Login(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    private void Register(){
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}
