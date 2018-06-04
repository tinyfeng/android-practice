package com.example.yanlihou.uiwidgettest;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit_text = findViewById(R.id.edit_text);
                String text = edit_text.getText().toString();
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
                ImageView image_view = findViewById(R.id.image_view);
                image_view.setImageResource(R.drawable.ic_launcher_background);
                ProgressDialog progress_dialog = new ProgressDialog(MainActivity.this);
                progress_dialog.setTitle("Title");
                progress_dialog.setMessage("Message");
                progress_dialog.setCancelable(false);
                progress_dialog.show();
                SystemClock.sleep(3000);
                progress_dialog.dismiss();

                /*
                ProgressBar progress_bar = findViewById(R.id.progress_bar);
                int progress = progress_bar.getProgress();
                progress_bar.setProgress(progress + 10);
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("Title");
                dialog.setMessage("Message");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();
                */
            }
        });
    }
}
