package com.example.user.bmi_4020d070_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    public final static String EXTRA_MESSAGE = "com.example.user.bmi_4020d070_2.EXTRA_MESSAGE";
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

        Intent intent = new Intent(this, key1.class);
        String key1 = ("姓名" + a + "\n" + "身高" + b + "\n" + "體重" + c + "\n" + "BMI" + BMI + "");
        intent.putExtra(EXTRA_MESSAGE, key1);
        startActivity(intent);
        tv.setText("姓名" + a + "\n" + "身高" + b + "\n" + "體重" + c + "\n" + "BMI" + BMI + "");

    }
}


