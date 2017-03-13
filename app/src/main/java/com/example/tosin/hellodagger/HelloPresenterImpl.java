package com.example.tosin.hellodagger;

import android.app.Application;
import android.graphics.drawable.Drawable;

import javax.inject.Inject;

/**
 * Created by tosin on 3/13/2017.
 */

public class HelloPresenterImpl implements HelloPresenter{

    private final Application application;
    private HelloView helloView;


    public HelloPresenterImpl(Application application){
        this.application = application;
    }

    @Override
    public void setView(HelloView helloView){
        this.helloView = helloView;
    }

    public void getHelloMsg(String helloMsg){
         String hello = helloMsg;
        // calls the setHelloMsg in HelloView and gives it a value
        helloView.changeHelloMsg(hello);
    }

    public void getNiceImage(Drawable drawable){
        Drawable friendlyImage = drawable;
        // calls the setNiceImage in HelloView and gives it a value
        helloView.changeNiceImage(drawable);

    }

}
