package com.youmingxing.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.RadioButton;

import com.youmingxing.R;

public class MainActivity extends FragmentActivity implements View.OnClickListener{

    private android.support.v4.app.FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private HXFragment haixuan;
    private GCFragment guangchang;
    private GZFragment guanzhu;
    private WDFragment wode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton button1 = (RadioButton) findViewById(R.id.button1);
        button1.setChecked(true);
        button1.setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);

        fragmentManager = getSupportFragmentManager();

        if (haixuan == null) {
            haixuan = new HXFragment();
        }
        if (guangchang == null) {
            guangchang = new GCFragment();
        }
        if (guanzhu == null) {
            guanzhu = new GZFragment();
        }
        if (wode == null) {
            wode = new WDFragment();
        }

        
    }

    @Override
    public void onClick(View view) {
        transaction = fragmentManager.beginTransaction();
        switch (view.getId()) {
            case R.id.button1:
                transaction.add(R.id.fragment_holder, haixuan).commit();
                break;
            case R.id.button2:
                transaction.add(R.id.fragment_holder, guangchang).commit();
                break;
            case R.id.button3:
                transaction.add(R.id.fragment_holder, guanzhu).commit();
                break;
            case R.id.button4:
                transaction.add(R.id.fragment_holder, wode).commit();
                break;
        }
    }
}
