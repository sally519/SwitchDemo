package com.mpaas.wtdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;

    private String isRelease = BuildConfig.isRelease;
    private boolean isLKLMode = BuildConfig.isLKLMode.equals("true");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);

        String baseUrl = isRelease;

        text.setText(isLKLMode
                + "\nUrl:" + baseUrl
                + "\n" + getMarket());

    }

    private String getMarket() {
        String market = "";
        switch (BuildConfig.BUILD_TYPE) {
            case "ali":
                market = "这是阿里的应用市场";
                break;
            case "tencent":
                market = "这是腾讯的应用市场";
                break;
            case "debug":
                market = "这是测试用包";
                break;
            case "release":
                market = "这是发行版本的包";
                break;
        }
        return market;
    }
}