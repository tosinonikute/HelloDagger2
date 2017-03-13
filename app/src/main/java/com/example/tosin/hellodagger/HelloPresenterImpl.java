package com.example.tosin.hellodagger;

import android.graphics.drawable.Drawable;

/**
 * Created by tosin on 3/13/2017.
 */

public class HelloPresenterImpl implements HelloPresenter{


    public HelloPresenterImpl() {
    }

    public void getHelloMsg(String helloMsg){
         String hello = helloMsg;
        // calls the setHelloMsg in HelloView and gives it a value

    }

    public void getNiceImage(Drawable drawable){
        Drawable friendlyImage = drawable;
        // calls the setNiceImage in HelloView and gives it a value

    }

}
