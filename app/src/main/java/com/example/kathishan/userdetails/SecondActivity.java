package com.example.kathishan.userdetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        switch (intent.getAction()) {
            case "sendingPerson":
                StringBuilder sb = new StringBuilder();
                Person person = (Person) intent.getSerializableExtra(Constant.KEY_2);
                sb.append(person.getFirstname());
                sb.append(" ");
                sb.append(person.getMiddlename());
                sb.append(" ");
                sb.append(person.getLastname());
                textView.setText(sb.toString());
                Log.d(TAG, "Person " + sb.toString());
                break;


        }


        Log.d(TAG, "onCreate: ");
    }
}
