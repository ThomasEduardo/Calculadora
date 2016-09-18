package com.example.root.myapplication.Listeners;

import android.view.View;
import android.widget.Button;

import com.example.root.myapplication.MainActivity;

/**
 * Created by Thomas on 16/09/2016.
 */
public class OnClickNumber implements View.OnClickListener {

    MainActivity main;

    public OnClickNumber(MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View view) {
        Button b = (Button) view;
        main.textScr += b.getText();
        main.updateScr();
    }

}
