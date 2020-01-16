package com.example.naje.sudanesefood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView sudaneseFoodView = findViewById(R.id.food_name);

        String[] foodNames = FoodList.getFoodName();

        for (String name : foodNames) {
            sudaneseFoodView.append(name + "\n\n\n");
        }

    }
}
