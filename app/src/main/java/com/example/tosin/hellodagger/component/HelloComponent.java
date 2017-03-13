package com.example.tosin.hellodagger.component;

import com.example.tosin.hellodagger.HelloActivity;
import com.example.tosin.hellodagger.module.HelloModule;
import com.example.tosin.hellodagger.scope.UserScope;

import dagger.Component;

/**
 * Created by tosin on 3/13/2017.
 */

@UserScope
@Component(modules = {HelloModule.class})
public class HelloComponent {

    void inject(HelloActivity helloActivity);

}
