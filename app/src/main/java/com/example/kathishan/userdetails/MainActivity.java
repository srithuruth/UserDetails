package com.example.kathishan.userdetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";
    private EditText etFirstName, etMiddleName, etLastName;
    private Button btnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstName = findViewById(R.id.etFirstName);
        etMiddleName = findViewById(R.id.etMiddleName);
        etLastName = findViewById(R.id.etLastName);

        Log.d(TAG, "onCreate:");

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    public void doNext(View view){
            String firstname = etFirstName.getText().toString();
            String middlename = etMiddleName.getText().toString();
            String lastname = etLastName.getText().toString();

            Person person = new Person(firstname, middlename, lastname);
            Intent intent = new Intent(this, SecondActivity.class);
            intent.setAction("sendingPerson");
            intent.putExtra(Constant.KEY_2,  person);
            startActivity(intent);
    }
}

