package jjcdevelopments.munchies;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Planner extends AppCompatActivity {

    FloatingActionButton Add;
    ArrayList<Meal>Meals;
    Bundle holder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planner);
        Meals = new ArrayList<>();
        Add = (FloatingActionButton) findViewById(R.id.AddMealBtn);
        final ListView LV = (ListView) findViewById(R.id.meals);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewMeal();
            }
        });
        AddMeals();
        LV.setAdapter(new MealAdapter(this, Meals));
        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {

                Object o = LV.getItemAtPosition(position);
                Meal item = (Meal) o;
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.putExtra("address", "5175815998,6165107654");
                String l1 = "Your friend has invited you to a meal \n";
                String l2 =  item.getName() + "\n";
                String l3 =  item.getAddr() + "\n";
                String l4 = item.getAddr2() + "\n";
                String l5 = item.getDay()  + "\n";
                String l6 = item.getTime() + "\n";
                String l7 = "Sent from Munchies";
                String complete = l1 + l2 + l3 + l4 + l5 + l6 + l7;
                intent.putExtra("sms_body", complete);
                intent.setData(Uri.parse("smsto:5175815998,6165107654"));
                startActivity(intent);

            }
        });
    }

    private void NewMeal(){
        Intent i = new Intent(this,Meal_Plan.class);
        i.putExtras(holder);
        startActivity(i);
    }

    private void AddMeals() {
        //Get the bundle
        holder = getIntent().getExtras();
        if (holder != null){
        //Extract the data…
        String data = holder.getString("Meals");


        String[] ad = data.split("#");
        for(String temp:ad) {

            String [] s = temp.split("!");
            Meal m = new Meal();
            m.setName(s[0]);
            m.setAddr(s[1]);
            m.setAddr2(s[2]);
            m.setDay(s[3]);
            m.setTime(s[4]);
            Meals.add(m);
        }
        holder.putString("Meals",data);
    }else {
            holder = new Bundle();
            holder.putString("Meals"," ");
        }
    }
}
