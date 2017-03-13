package com.example.tosin.hellodagger;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity implements HelloView{

    private TextView friendlyText;
    private ImageView friendlyImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        friendlyText = (TextView) findViewById(R.id.friendly_text);
        friendlyImage = (ImageView) findViewById(R.id.friendly_image);

    }

    public void setHelloMsg(){
        // calls getHelloMsg and pass this string
        String hellomsg = "hey buddy!";
    }

    public void changeHelloMsg(String hello){
        friendlyText.setText(hello);
    }

    public void setNiceImage(){
        Drawable drawable = getResources().getDrawable(R.drawable.friendly_image);
        // calls the getNiceImage and pass the drawable

    }

    public void changeNiceImage(Drawable drawable){
        friendlyImage.setImageDrawable(drawable);
    }


}
