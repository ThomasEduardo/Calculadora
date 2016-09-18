package com.example.root.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.root.myapplication.Listeners.OnClickIgual;
import com.example.root.myapplication.Listeners.OnClickNumber;
import com.example.root.myapplication.Listeners.OnClickOperator;


import java.util.regex.Pattern;

public class MainActivity extends Activity{
    public TextView scr;
    public String textScr = "";
    public String op = "";
    public Double number;
    int result;

    Button btPlus; Button btIquals; Button btLeast; Button bt0;
    Button bt1; Button bt2; Button bt3; Button bt4; Button bt5;
    Button bt6; Button bt7; Button bt8; Button bt9; Button btClear;
    Button btMult; Button btDiv; Button btDot;
    EditText etNumber1; EditText etNumber2;
    TextView scrResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scr = (TextView) findViewById(R.id.screen);
        updateScr();

        btDiv = (Button) findViewById(R.id.btDiv);
        btMult = (Button) findViewById(R.id.btMult);
        btPlus = (Button) findViewById(R.id.btPlus);
        btLeast = (Button) findViewById(R.id.btLeast);
        bt0 = (Button) findViewById(R.id.bt0);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 = (Button) findViewById(R.id.bt5);
        bt6 = (Button) findViewById(R.id.bt6);
        bt7 = (Button) findViewById(R.id.bt7);
        bt8 = (Button) findViewById(R.id.bt8);
        bt9 = (Button) findViewById(R.id.bt9);
        btClear = (Button) findViewById(R.id.btClear);
        btDot = (Button) findViewById(R.id.btDot);
        btIquals = (Button) findViewById(R.id.btIquals);
        bt0.setOnClickListener(new OnClickNumber(this));
        bt1.setOnClickListener(new OnClickNumber(this));
        bt2.setOnClickListener(new OnClickNumber(this));
        bt3.setOnClickListener(new OnClickNumber(this));
        bt4.setOnClickListener(new OnClickNumber(this));
        bt5.setOnClickListener(new OnClickNumber(this));
        bt6.setOnClickListener(new OnClickNumber(this));
        bt7.setOnClickListener(new OnClickNumber(this));
        bt8.setOnClickListener(new OnClickNumber(this));
        bt9.setOnClickListener(new OnClickNumber(this));
        btDot.setOnClickListener(new OnClickNumber(this));
        btDiv.setOnClickListener(new OnClickOperator(this));
        btMult.setOnClickListener(new OnClickOperator(this));
        btLeast.setOnClickListener(new OnClickOperator(this));
        btPlus.setOnClickListener(new OnClickOperator(this));
        btIquals.setOnClickListener(new OnClickIgual(this));

    }

    public void updateScr() {
        scr.setText(textScr);
    }

    public double result() {
        String[] numbers=textScr.split(Pattern.quote(op));

        if (numbers.length==1) {
            return Double.parseDouble(numbers[0]);
        } else {

            switch(op) {
                case "+":

                    return Double.parseDouble(numbers[0])+Double.parseDouble(numbers[1]);
                case "-":

                    return Double.parseDouble(numbers[0])-Double.parseDouble(numbers[1]);
                case "/":

                    return Double.parseDouble(numbers[0])/Double.parseDouble(numbers[1]);
                case "*":

                    return Double.parseDouble(numbers[0])*Double.parseDouble(numbers[1]);
                default:

                    return 0;
            }
        }
    }



}

