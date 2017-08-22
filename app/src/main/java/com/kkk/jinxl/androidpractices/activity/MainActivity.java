package com.kkk.jinxl.androidpractices.activity;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import com.kkk.jinxl.androidpractices.R;
import com.kkk.jinxl.androidpractices.weight.MessageListItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MessageListItem messageListItem = (MessageListItem) findViewById(R.id.mli_msg);
//        messageListItem.setMessageReaded(true);

        final TextInputLayout textInputLayout = (TextInputLayout) findViewById(R.id.til_pwd);

        EditText editText = textInputLayout.getEditText();
//        textInputLayout.setHint("Password");

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (s.length() > 4) {
                    textInputLayout.setError("Password error");
                    textInputLayout.setErrorEnabled(true);
                } else {
                    textInputLayout.setErrorEnabled(false);
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });
    }
}
