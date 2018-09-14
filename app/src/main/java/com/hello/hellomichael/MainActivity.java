package com.hello.hellomichael;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorPrimary));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.orange));
            }
        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // grab text user inputted
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();

                if (TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Michael");
                } else {
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }
                    // put the inputted text into text view once the 'chance text' button is clicked
                //((TextView) findViewById(R.id.textView)).setText("Goodbye");
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // reset text color to black
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.black));
                // reset background color colorAccent
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorAccent));
                // reset text back to 'Hello from Michael!'
                ((TextView) findViewById(R.id.textView)).setText("Hello from Michael!");

            }
        });

    }
}
