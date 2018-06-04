package com.example.yanlihou.activitylifecycletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class _NormalActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._normal_layout);
        Log.d("_normal_activity_d", "on create");
    }
}
