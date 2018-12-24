package com.bling.robustdemo;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;



public class FixActivity extends AppCompatActivity {

    TextView tvFix;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fix);
        tvFix=(TextView)findViewById(R.id.tv_fix);

       tvFix.setText(getText());
    }
//    @Modify
    public String getText(){
    //简单方法不能插桩所以调用一个add()方法，没有实际意义
        add();
//        return "修复前";
        return "修复后";
    }
    public int add(){
        int i=1;
        int j=1;
        int x=i+j;
        return x;
    }
}
