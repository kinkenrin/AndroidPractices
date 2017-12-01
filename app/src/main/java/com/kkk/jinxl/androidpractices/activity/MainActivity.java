package com.kkk.jinxl.androidpractices.activity;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import com.kkk.jinxl.androidpractices.R;
import com.kkk.jinxl.androidpractices.weight.BubbleLinearLayout;
import com.kkk.jinxl.androidpractices.weight.MessageListItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MessageListItem messageListItem = (MessageListItem) findViewById(R.id.mli_msg);
//        messageListItem.setMessageReaded(true);
//        messageListItem.setMessageReaded(true);
//        messageListItem.setMessageReaded(true);
//        messageListItem.setMessageReaded(true);
//        messageListItem.setMessageReaded(true);
//        messageListItem.setMessageReaded(true);
//        messageListItem.setMessageReaded(true);
//        messageListItem.setMessageReaded(true);
//        messageListItem.setMessageReaded(true);

        BubbleLinearLayout bll_bg = (BubbleLinearLayout) findViewById(R.id.bll_bg);
        bll_bg.setArrowPosition(60);
    }
}
