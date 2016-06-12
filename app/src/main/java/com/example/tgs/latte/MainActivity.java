package com.example.tgs.latte;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void touch1(View v){
        Intent intent = new Intent(this, NextActivity.class);
        startActivity(intent);
        Log.v("알림","터치1이 터치되어 이미지 더보기 실행");
    }

    public void touch2(View v){
        Intent intent2 = new Intent(Intent.ACTION_VIEW);
        Uri u = Uri.parse("http://m.naver.com");

        intent2.setData(u);
        startActivity(intent2);
        Log.v("라떼","터치2가 터치되어 라떼 실행");
    }

    public void touch3(View v){
        Intent intent3 = new Intent(this,MediaActivity.class);
        startActivity(intent3);
        Log.v("알림","터치3가 터치되어 영상 실행");
    }
}
