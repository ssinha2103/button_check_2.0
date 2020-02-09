package com.sudarshan.buttoncheck20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void clicked(View view)
    {
        Log.i("Note", "Button Pressed");
        ImageView image = (ImageView) findViewById(R.id.id1);
        if (String.valueOf(image.getTag())=="img_google") {
            image.setImageResource(R.drawable.apple);
            image.setTag("img_apple");
        }else{
            image.setImageResource(R.drawable.google);
            image.setTag("img_google");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
