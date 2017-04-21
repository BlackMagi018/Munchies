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
    /** List of Valid Users */
    ArrayList<String>Users;

    /**
     * Creates layout and begins Main Activity
     * @param savedInstanceState - Instance State data
     */
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Adds Credentials to Users
        Users = new ArrayList<String>();
        Users.add("Loganjer:Shadow22");
        Users.add("Garetyca:Password1");
        Users.add("Wardjor:Password2");

        // Create Layout element references
        Button register = (Button) findViewById(R.id.RegBtn);
        Button login = (Button) findViewById(R.id.LogBtn);

        //Creates OnClickListener for Login Button, when clicked login method is called
        login.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick ( final View view){
                login();
                }
            });
        //Creates OnClickListener for Register Button, when clicked register method is called
        register.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick (View view){
                register();
                }
            });
    }

    /**
     * Checks Login Credentials and if approved starts Menu Activity
     */
    private void login(){
            /** Retrives submitted Username and Password */
            EditText User = (EditText) findViewById(R.id.Username);
            EditText Pass = (EditText) findViewById(R.id.Password);
            /** Check if credentials are valid */
            String username = User.getText().toString();
            String password = Pass.getText().toString();
            String pair = username + ":" + password;
           if(Users.contains(pair)){
               startActivity(new Intent(this, Menu.class));
               }else{
               Toast.makeText(this, "Incorrect Username/Password", Toast.LENGTH_LONG).show();
           }
    }

    /**
     * starts Register Activity
     */
    private void register(){
        startActivity(new Intent(this, MapsActivity.class));
    }
}
