package jjcdevelopments.munchies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    EditText fullname;
    EditText username;
    EditText pass1;
    EditText pass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fullname = (EditText) findViewById(R.id.FNBtn);
        username = (EditText) findViewById(R.id.UserBtn);
        pass1 = (EditText) findViewById(R.id.Pass1Btn);
        pass2 = (EditText) findViewById(R.id.Pass2Btn);
        Button Register = (Button) findViewById(R.id.RegBtn);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Register();
            }
        });
    }

    private void Register(){
        if(pass1.getText().toString().equals(pass2.getText().toString())){
            Intent intent = new Intent(this, FeedMe.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Passwords don't match", Toast.LENGTH_LONG).show();
        }
    }
}
