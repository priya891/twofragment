package com.example.twofragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

public class frag2 extends Fragment {
    TextView text;
    int position;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_frag2, container, false);
        text = (TextView) view.findViewById(R.id.text);
        int args = getArguments().getInt("hello");
        switch (args){
            case 0:
                text.setText("monday");
                break;
            case 1:
                text.setText("Tuesday");
                break;
            case 2:
                text.setText("Wednesday");
                break;
            case 3:
                text.setText("Wednesday");
                break;
            case 4:
                text.setText("thursday");
                break;
            case 5:
                text.setText("Friday");
                break;
            case 6:
                text.setText("Saturday");
                break;

            default:text.setText("wrong day number");
        }

        return view;
    }

}
