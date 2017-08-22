package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    RectF mRectf = new RectF();
    int mWidth = 960;

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mWidth = MeasureSpec.getSize(widthMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        //1.实心圆
        canvas.drawCircle(mWidth / 4, 100, 100, mPaint);

        //2.空心圆
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle((mWidth / 4 * 3), 100, 100, mPaint);

        //3.蓝色实心圆
        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((mWidth / 4), 350, 100, mPaint);

        //4.线宽为20的空心园
        mPaint.reset();
//        mPaint.setStyle(Paint.Style.FILL);
        Path path = new Path();
        path.setFillType(Path.FillType.WINDING);
        path.addCircle((mWidth / 4 * 3), 350, 100, Path.Direction.CW);
        path.addCircle((mWidth / 4 * 3), 350, 80, Path.Direction.CCW);
        canvas.drawPath(path,mPaint);

    }
}
