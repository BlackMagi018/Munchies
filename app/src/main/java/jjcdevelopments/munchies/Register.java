package jjcdevelopments.munchies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText fullname = (EditText) findViewById(R.id.FNBtn);
        EditText username = (EditText) findViewById(R.id.UserBtn);
        EditText pass1 = (EditText) findViewById(R.id.Pass1Btn);
        EditText pass2 = (EditText) findViewById(R.id.Pass2Btn);
        Button Register = (Button) findViewById(R.id.RegBtn);

    }
}
