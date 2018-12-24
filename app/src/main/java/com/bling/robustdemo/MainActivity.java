package com.bling.robustdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bling.robustdemo.robust.PatchManipulateImp;
import com.bling.robustdemo.robust.RobustCallBackSample;
import com.meituan.robust.PatchExecutor;

public class MainActivity extends AppCompatActivity {

    Button btnFix;
    Button btnJump;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFix=(Button)findViewById(R.id.btn_fix);
        btnJump=(Button)findViewById(R.id.btn_jump);
        btnJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        btnFix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new PatchExecutor(getApplicationContext(), new PatchManipulateImp(), new RobustCallBackSample()).start();
            }
        });

    }
}
