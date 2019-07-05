package com.example.quizz3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMessage(View v) {
        Toast toast = Toast.makeText(this, "Register button is clicked.", Toast.LENGTH_LONG);
        toast.show();
    }

    public void displayLogin(View v){
        Intent i = new Intent(this, LogIn.class);
        startActivity(i);
    }

}
