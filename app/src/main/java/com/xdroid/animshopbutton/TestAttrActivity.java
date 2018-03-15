package com.xdroid.animshopbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xdroid.lib.AnimShopButton;

public class TestAttrActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_attr);

        final AnimShopButton animShopButton = (AnimShopButton) findViewById(R.id.btnReplenish);
        animShopButton.setReplenish(true);
    }
}
