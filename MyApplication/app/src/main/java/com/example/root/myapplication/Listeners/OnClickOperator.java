package com.example.root.myapplication.Listeners;

import android.view.View;
import android.widget.Button;

import com.example.root.myapplication.MainActivity;

/**
 * Created by Mateus on 16/09/2016.
 */
public class OnClickOperator implements View.OnClickListener {

    MainActivity main;

    public OnClickOperator (MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View view) {
        Button b = (Button) view;

        if(main.op.equals("")){
            main.textScr += b.getText();
            main.op = (String) b.getText();
            main.updateScr();

        } else {
            main.textScr = String.valueOf(main.result()) + b.getText();
            main.op = (String) b.getText();
            main.updateScr();
        }

    }
}
