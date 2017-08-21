package com.kkk.jinxl.androidpractices.weight;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import com.kkk.jinxl.androidpractices.R;


/**
 * Created by jinxl on 2017/8/18.
 */

public class MessageListItem extends RelativeLayout {

    private static final int[] STATE_MESSAGE_READED = {R.attr.state_message_unread};
    private boolean mMessgeReaded = false;

    public MessageListItem(Context context) {
        this(context, null);
    }

    public MessageListItem(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MessageListItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    public void setMessageReaded(boolean readed) {
        if (this.mMessgeReaded != readed) {
            mMessgeReaded = readed;
            refreshDrawableState();
        }
    }

    @Override
    protected int[] onCreateDrawableState(int extraSpace) {
        if (mMessgeReaded) {
            final int[] states = super.onCreateDrawableState(extraSpace + 1);
            mergeDrawableStates(states, STATE_MESSAGE_READED);
            return states;
        }
        return super.onCreateDrawableState(extraSpace);
    }
}
