package com.mmj.personality;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import uk.co.imallan.jellyrefresh.JellyRefreshLayout;


public class MainActivity extends AppCompatActivity {
    private RoundImageView img_round;
    private Titanic titanic;
    private TitanicTextView myTitanicView;
    private JellyRefreshLayout mJellyLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_round = (RoundImageView) findViewById(R.id.img_round);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.pic);
        img_round.setBitmap(bitmap);
        myTitanicView=new TitanicTextView(this);
        titanic=new Titanic();
        titanic.start(myTitanicView);
        mJellyLayout=new JellyRefreshLayout(this);
    }
}
