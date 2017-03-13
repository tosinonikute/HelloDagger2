package com.example.tosin.hellodagger;

import android.graphics.drawable.Drawable;

/**
 * Created by tosin on 3/13/2017.
 */

public interface HelloView {

    public void setHelloMsg();

    public void changeHelloMsg(String friendlyText);

    public void setNiceImage();

    public void changeNiceImage(Drawable drawable);
}
