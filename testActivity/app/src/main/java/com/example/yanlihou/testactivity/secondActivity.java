package com.example.yanlihou.testactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class secondActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        set_result();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        final Intent intent = getIntent();
        String data = intent.getStringExtra("test");
        Log.d("secondActivity", data);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                set_result();
                finish();
            }
        });
    }

    private void set_result(){
        Intent intent1 = new Intent();
        intent1.putExtra("res", "res");
        setResult(RESULT_OK, intent1);

    }
}
