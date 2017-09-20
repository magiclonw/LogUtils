package com.magiclon.logutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.magiclon.logutilslibrary.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.init("MagicLon",true);
        String json = "{\"key_a\":asd,\"key_b\":\"这是bbbbbbbbb的值\"}";
        String text = "这是一条测试日志";
        Log.d(json);
        Log.e(json);
        Log.w(json);
        Log.d(text);
        Log.e(text);
        Log.w(text);
    }
}
