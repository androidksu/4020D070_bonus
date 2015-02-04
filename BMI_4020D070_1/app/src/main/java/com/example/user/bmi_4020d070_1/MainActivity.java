package com.example.user.bmi_4020d070_1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText name, height, weight;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.editText1);
        height = (EditText) findViewById(R.id.editText2);
        weight = (EditText) findViewById(R.id.editText);
        tv = (TextView) findViewById(R.id.textView3);
    }

    public void bt5(View v) {
        String a = name.getText().toString();
        String b = height.getText().toString();
        String c = weight.getText().toString();
        double height1 = Double.parseDouble(height.getText().toString()) / 100;
        double width = Double.parseDouble(weight.getText().toString());
        double BMI = width / (height1 * height1);
        tv.setText("姓名" + a + "\n" + "身高" + b + "\n" + "體重" + c + "\n" + "BMI" + BMI + "");

    }
}
