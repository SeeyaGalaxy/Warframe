package com.wyx.warframe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/**
 * 欢迎页面
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //展示3秒后跳转主页面
        handler.sendEmptyMessageDelayed(0,3000);
    }
    private Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            Intent intent = new Intent(getBaseContext(),HomeActivity.class);
            startActivity(intent);
            finish();
            return false;
        }
    });
}
