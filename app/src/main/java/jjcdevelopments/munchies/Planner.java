package jjcdevelopments.munchies;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Planner extends AppCompatActivity {

    FloatingActionButton Add;
    ArrayList<Meal>Meals;
    Bundle holder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planner);
        Meals = new ArrayList<Meal>();
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
    }

    private void NewMeal(){
        Intent i = new Intent(this,Meal_Plan.class);
        startActivity(i);
    }

    private void AddMeals() {
        //Get the bundle
        holder = getIntent().getExtras();
        if (holder != null){
        //Extract the data…
        String data = holder.getString("Meals");

        String[] s = data.split("!");
        Meal m = new Meal();
        m.setName(s[0]);
        m.setAddr(s[1]);
        m.setAddr2(s[2]);
        m.setDay(s[3]);
        m.setTime(s[4]);
        Meals.add(m);
    }
    }
}
