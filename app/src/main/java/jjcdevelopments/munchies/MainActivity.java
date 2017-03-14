package jjcdevelopments.munchies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Login = (Button) findViewById(R.id.LogBtn);
        Button Register = (Button) findViewById(R.id.RegBtn);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Login(view);
            }
        });
    }

    private void Login(View v){
        Intent intent = new Intent(this, FeedMe.class);
        startActivity(intent);
    }
}
