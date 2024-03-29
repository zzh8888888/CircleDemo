package com.sangcomz.fishbun;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;


import com.sangcomz.fishbun.define.Define;

public abstract class BaseActivity extends AppCompatActivity {
    protected Define define = new Define();
    protected Fishton fishton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        }
        super.onCreate(savedInstanceState);
        fishton = Fishton.getInstance();
    }
}
