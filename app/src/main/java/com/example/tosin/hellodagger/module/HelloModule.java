package com.example.tosin.hellodagger.module;

import android.app.Application;

import com.example.tosin.hellodagger.BaseApplication;
import com.example.tosin.hellodagger.HelloActivity;
import com.example.tosin.hellodagger.HelloPresenter;
import com.example.tosin.hellodagger.HelloPresenterImpl;
import com.example.tosin.hellodagger.HelloView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tosin on 3/13/2017.
 */

@Module
public class HelloModule {

    private Application application;

    public HelloModule(Application application){
        this.application = application;
    }

    @Provides
    public HelloPresenter getHelloPresenter(){
        return new HelloPresenterImpl(application);
    }

}
