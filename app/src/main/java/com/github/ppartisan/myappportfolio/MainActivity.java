package com.github.ppartisan.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final int[] buttonIds = new int[] {
                R.id.popular_movies_btn, R.id.stock_hawk_btn, R.id.build_it_bigger_btn,
                R.id.make_your_own_app_material_btn, R.id.go_ubiquitous_btn, R.id.capstone_btn
        };

        for (int id : buttonIds) {
            findViewById(id).setOnClickListener(this);
        }

    }

    private void printButtonMessage(String name) {
        String message = getString(R.string.button_message, name);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        printButtonMessage(((Button)view).getText().toString());
    }

}
