package com.it.yb.ouredu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.it.yb.mylibrary.Hello;
import com.it.yb.mylibrary.MainHiActivity;

public class MainActivity extends Activity {

    Hello h;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        h=new Hello("some message","050999888");
        tv1=findViewById(R.id.textView1);
        tv1.setText(h.getMsg()+" :  "+h.getTarget());

    }




    public void moveToLibraryActivity(View view) {
        Intent i=new Intent(this,MainHiActivity.class);
        startActivity(i);
    }
}
