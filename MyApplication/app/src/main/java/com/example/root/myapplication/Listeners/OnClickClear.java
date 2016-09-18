package com.example.root.myapplication.Listeners;

import android.view.View;

import com.example.root.myapplication.MainActivity;

/**
 * Created by Thomas on 16/09/2016.
 */
public class OnClickClear implements View.OnClickListener {

    MainActivity main;

    public OnClickClear(MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View view) {
        main.textScr = "";
        main.op = "";
        main.updateScr();

    }
}
