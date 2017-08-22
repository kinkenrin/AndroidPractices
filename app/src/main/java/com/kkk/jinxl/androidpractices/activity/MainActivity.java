package com.kkk.jinxl.androidpractices.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kkk.jinxl.androidpractices.R;
import com.kkk.jinxl.androidpractices.weight.MessageListItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MessageListItem messageListItem = (MessageListItem) findViewById(R.id.mli_msg);
//        messageListItem.setMessageReaded(true);
    }
}
