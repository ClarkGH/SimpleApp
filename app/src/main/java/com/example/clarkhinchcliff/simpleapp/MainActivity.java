package com.example.clarkhinchcliff.simpleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    boolean textHidden = false;

    public void hideText(View view){
        if(textHidden == false){
            textView = (TextView)findViewById(R.id.textView);
            textView.setVisibility(View.GONE);
            textHidden = true;
        }
    }

    public void showText(View viw){
        if(textHidden == true) {
            textView = (TextView)findViewById(R.id.textView);
            textView.setVisibility(View.VISIBLE);
            textHidden = false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
