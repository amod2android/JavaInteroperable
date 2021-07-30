package com.amod2android.javainteroperable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Student student=Student.getStudent();
        System.out.println("4343    "+student.get_name());
        System.out.println("4343    "+student.get_roll());

    }
}