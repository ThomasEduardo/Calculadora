package com.example.root.myapplication.Listeners;

import android.view.View;

import com.example.root.myapplication.MainActivity;

/**
 * Created by Thomas on 17/09/2016.
 */
public class OnClickIgual  implements View.OnClickListener  {

    MainActivity main;

    public OnClickIgual (MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View view) {

        main.scr.setText( String.valueOf (main.result()) );

    }
}
