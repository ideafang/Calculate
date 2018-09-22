package com.example.calculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    View view;

    private Button mbtn_1;
    private Button mbtn_2;
    private Button mbtn_3;
    private Button mbtn_4;
    private Button mbtn_5;
    private Button mbtn_6;
    private Button mbtn_7;
    private Button mbtn_8;
    private Button mbtn_9;
    private Button mbtn_0;
    private Button mbtn_add;
    private Button mbtn_sub;
    private Button mbtn_multiply;
    private Button mbtn_divide;
    private Button mbtn_del;
    private Button mbtn_equal;
    private Button mbtn_point;
    private Button mbtn_clean;
    private TextView mtv_result;
    private TextView med_play;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        mbtn_0 = (Button) view.findViewById(R.id.btn_0);
        mbtn_1 = (Button) view.findViewById(R.id.btn_1);
        mbtn_2 = (Button) view.findViewById(R.id.btn_2);
        mbtn_3 = (Button) view.findViewById(R.id.btn_3);
        mbtn_4 = (Button) view.findViewById(R.id.btn_4);
        mbtn_5 = (Button) view.findViewById(R.id.btn_5);
        mbtn_6 = (Button) view.findViewById(R.id.btn_6);
        mbtn_7 = (Button) view.findViewById(R.id.btn_7);
        mbtn_8 = (Button) view.findViewById(R.id.btn_8);
        mbtn_9 = (Button) view.findViewById(R.id.btn_9);
        mbtn_add = (Button) view.findViewById(R.id.btn_add);
        mbtn_sub = (Button) view.findViewById(R.id.btn_sub);
        mbtn_multiply = (Button) view.findViewById(R.id.btn_multiply);
        mbtn_divide = (Button) view.findViewById(R.id.btn_divide);
        mbtn_del = (Button) view.findViewById(R.id.btn_del);
        mbtn_equal = (Button) view.findViewById(R.id.btn_equal);
        mbtn_point = (Button) view.findViewById(R.id.btn_point);
        mbtn_clean = (Button) view.findViewById(R.id.btn_clear);
        med_play = (TextView) view.findViewById(R.id.edt_calc);
        med_play.setText("");
        mtv_result = (TextView) view.findViewById(R.id.txt_calc);

        
    }
}
