package com.example.elijah.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.view.View.OnClickListener;

import static android.app.PendingIntent.getActivity;


public class MyAppPortfolio extends Activity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.main);
        for (int i = 0; i < relativeLayout.getChildCount(); ++i) {
            View v = relativeLayout.getChildAt(i);

          //
           v.setOnClickListener(myls);
        }



    }
    private OnClickListener myls = new OnClickListener() {
        @Override
        public void onClick(View v) {
          toast(v);

        }
    };
    public void toast(View v) {
        View vl = v.findViewWithTag("Text");

        Toast.makeText(this,"Launch "+v.getTag().toString(), Toast.LENGTH_SHORT).show();
    }

};