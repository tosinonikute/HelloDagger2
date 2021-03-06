package com.example.tosin.hellodagger;

import android.app.Application;

import com.example.tosin.hellodagger.component.DaggerHelloComponent;
import com.example.tosin.hellodagger.component.HelloComponent;
import com.example.tosin.hellodagger.module.HelloModule;


/**
 * Created by tosin on 3/13/2017.
 */

public class BaseApplication extends Application {

    public HelloComponent component;

    @Override
    public void onCreate(){
        super.onCreate();

        component = DaggerHelloComponent
                .builder()
                .helloModule(new HelloModule(this))
                .build();

    }

    public HelloComponent getComponent() {
        return component;
    }

}
