package jjcdevelopments.munchies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Creates the main page.
 */
public final class MainActivity extends AppCompatActivity {

    ArrayList<String>Users;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Users = new ArrayList<String>();
        Users.add("Loganjer:Shadow22");
        Users.add("Garetyca:Password1");
        Users.add("Wardjor:Password2");


        Button register = (Button) findViewById(R.id.RegBtn);
        Button login = (Button) findViewById(R.id.LogBtn);

        login.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick ( final View view){
                login();
                }
            });
        register.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick (View view){
                register();
                }
            });
    }

    /**
     * Displays the login/register page.
     */
    private void login(){

            //EditText User = (EditText) findViewById(R.id.Username);
            //EditText Pass = (EditText) findViewById(R.id.Password);

            //String username = User.getText().toString();
            //String password = Pass.getText().toString();
            //String pair = username + ":" + password;
           //if(Users.contains(pair)){
            Intent intent = new Intent(this, Menu.class);
            startActivity(intent);
               //}else{
               //Toast.makeText(this, "Incorrect Username/Password", Toast.LENGTH_LONG).show();
           //}
    }

    private void register(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}
