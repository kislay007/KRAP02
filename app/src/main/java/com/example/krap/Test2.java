package com.example.krap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

public class Test2 extends AppCompatActivity {

    ElegantNumberButton elegantNumberButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        textView=(TextView)findViewById(R.id.textView);
        elegantNumberButton=(ElegantNumberButton)findViewById(R.id.elegantNumberButton);

        elegantNumberButton.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int oldValue, int newValue) {

                String count=elegantNumberButton.getNumber();
                textView.setText(count);
            }
        });
    }
}
