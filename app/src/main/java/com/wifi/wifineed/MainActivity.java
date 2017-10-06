package com.wifi.wifineed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        WifiAdmin.getWifiAdmin().setmContext(MainActivity.this);
        WifiAdmin.getWifiAdmin().getWifiMeathod();

    }
}
