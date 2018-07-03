package com.example.maxim.androidhw14;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    String TAG = "myTag";
    EditText editText;
    CheckBox checkBox;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.main_et_city);
        checkBox = findViewById(R.id.main_cb);
        aSwitch = findViewById(R.id.main_sw);
    }

    public void onClickBtn(View view){
        String city = editText.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("city", city);
        intent.putExtra("humidity", checkBox.isChecked());
        intent.putExtra("wind", aSwitch.isChecked());
        startActivity(intent);
    }
}