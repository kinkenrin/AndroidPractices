package com.kkk.jinxl.androidpractices.weight;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.kkk.jinxl.androidpractices.R;

/**
 * Created by jinxl on 2017/8/17.
 */

public class BubbleLinearLayout extends LinearLayout {
    private BubbleDrawable bubbleDrawable;
    private float mArrowWidth;
    private float mAngle;
    private float mArrowHeight;
    private float mArrowPosition;
    private BubbleDrawable.ArrowLocation mArrowLocation;
    private int bubbleColor;
    private boolean mArrowCenter;

    public BubbleLinearLayout(Context context) {
        this(context, null);
    }

    public BubbleLinearLayout(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BubbleLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(attrs);
    }


    private void initView(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray array = getContext().obtainStyledAttributes(attrs, R.styleable.BubbleLinearLayout);
            mArrowWidth = array.getDimension(R.styleable.BubbleLinearLayout_arrowWidth,
                    BubbleDrawable.Builder.DEFAULT_ARROW_WITH);
            mArrowHeight = array.getDimension(R.styleable.BubbleLinearLayout_arrowHeight,
                    BubbleDrawable.Builder.DEFAULT_ARROW_HEIGHT);
            mAngle = array.getDimension(R.styleable.BubbleLinearLayout_angle,
                    BubbleDrawable.Builder.DEFAULT_ANGLE);
            mArrowPosition = array.getDimension(R.styleable.BubbleLinearLayout_arrowPosition,
                    BubbleDrawable.Builder.DEFAULT_ARROW_POSITION);
            bubbleColor = array.getColor(R.styleable.BubbleLinearLayout_bubbleColor,
                    BubbleDrawable.Builder.DEFAULT_BUBBLE_COLOR);
            int location = array.getInt(R.styleable.BubbleLinearLayout_arrowLocation, 0);
            mArrowLocation = BubbleDrawable.ArrowLocation.mapIntToValue(location);
            mArrowCenter = array.getBoolean(R.styleable.BubbleLinearLayout_arrowCenter, false);
            array.recycle();
        }
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (w > 0 && h > 0) {
            setUp(w, h);
        }
    }

    private void setUp(int left, int right, int top, int bottom) {
        if (right < left || bottom < top)
            return;
        RectF rectF = new RectF(left, top, right, bottom);
        bubbleDrawable = new BubbleDrawable.Builder()
                .rect(rectF)
                .arrowLocation(mArrowLocation)
                .bubbleType(BubbleDrawable.BubbleType.COLOR)
                .angle(mAngle)
                .arrowHeight(mArrowHeight)
                .arrowWidth(mArrowWidth)
                .arrowPosition(mArrowPosition)
                .bubbleColor(bubbleColor)
                .arrowCenter(mArrowCenter)
                .build();
    }

    private void setUp(int width, int height) {
        setUp(getPaddingLeft(), width - getPaddingRight(),
                getPaddingTop(), height - getPaddingBottom());
        setBackgroundDrawable(bubbleDrawable);
    }

    public void setUpBubbleDrawable() {
        setBackgroundDrawable(null);
        post(new Runnable() {
            @Override
            public void run() {
                setUp(getWidth(), getHeight());
            }
        });
    }

}
