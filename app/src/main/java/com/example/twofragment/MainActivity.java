package com.example.twofragment;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button b1;
    static TextView t1;
    public FragmentManager fragmentManager = getSupportFragmentManager();
    public  FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


    String[] s;
    ArrayList list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.text);
         fragmentManager = getSupportFragmentManager();
         fragmentTransaction = fragmentManager.beginTransaction();
        frag1 frag1 = new frag1();
        fragmentTransaction.add(R.id.frame1, frag1);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

    }


