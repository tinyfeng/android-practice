package com.example.yanlihou.activitylifecycletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class NormalActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_layout);
        Button start_normal = (Button) findViewById(R.id.start_normal_activity);
        Button start_dialog = (Button) findViewById(R.id.start_dialog_activity);
        button_start_activity(start_normal, _NormalActivity.class);
        button_start_activity(start_dialog, DialogActivity.class);
    }

    private void button_start_activity(Button button, final Class ActivityClass){
        Log.d("main_activity_d", "init button");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.os.Process.killProcess(android.os.Process.myPid());
                Log.d("main_activity_d", "click");
                Intent intent = new Intent(NormalActivity.this, ActivityClass);
                startActivity(intent);
                Log.d("main_activity_d", "after start activity");
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("main_activity_d", "on pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("main_activity_d", "on resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("main_activity_d", "on restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("main_activity_d", "on destroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("main_activity_d", "on stop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("main_activity_d", "on start");
    }

}
