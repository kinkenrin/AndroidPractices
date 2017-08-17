package com.kkk.jinxl.androidpractices.weight;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * canvas_1
 * Created by jinxl on 2017/8/17.
 */
public class Canvas_1 extends View {
    public Canvas_1(Context context) {
        this(context, null);
    }

    public Canvas_1(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Canvas_1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {

    }

    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        mPaint.setAntiAlias(false);

//        canvas.drawColor(Color.BLUE);

//        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.RED);
//        canvas.drawCircle(300,300,200,mPaint);


//        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(20);
        canvas.drawCircle(430, 950, 400, mPaint);


//        mPaint.setStyle(Paint.Style.FILL);
//        canvas.drawRect(100,100,500,500,mPaint);

        float x = 550;
        float y = 100;
        mPaint.setStrokeCap(Paint.Cap.SQUARE);
//        mPaint.setStrokeCap(Paint.Cap.ROUND);
//        for (int i = 0; i < 5; i++) {
//            canvas.drawPoint(x + 50 * i, y + 50 * i, mPaint);
//            canvas.drawPoint(x - 50 * i, y + 50 * i, mPaint);
//
//        }
//        float[] points = {0, 0, 50, 50, 50, 100, 100, 50, 100, 100, 150, 50, 150, 100};
        // 绘制四个点：(50, 50) (50, 100) (100, 50) (100, 100)
//        canvas.drawPoints(points, 2 /* 跳过两个数，即前两个 0 */,
//                8 /* 一共绘制8个数字*/, mPaint);

        RectF rectF = new RectF(100, 100, 500, 300);

//        canvas.drawOval(rectF,mPaint);

//        canvas.drawLine(200, 200, 800, 500, mPaint);
//        canvas.drawColor(Color.parseColor("#88888800"));

        float[] points2 = {20, 20, 120, 20, 70, 20, 70, 120, 20, 120, 120, 120, 150, 20, 250, 20, 150, 20, 150, 120, 250, 20, 250, 120, 150, 120, 250, 120};
//        canvas.drawLines(points2, mPaint);

        mPaint.setStrokeWidth(10);
        //画圆角矩形
//        canvas.drawRoundRect(rectF,10,10,mPaint);

        canvas.drawArc(200, 100, 800, 500, 0, -90, false, mPaint); // 绘制扇形
//        canvas.drawArc(200, 100, 800, 500, 20, 140, false, mPaint);

        Path path = new Path();
        path.addArc(200, 200, 400, 400, -225, 225);
        path.arcTo(400, 200, 600, 400, -180, 225, false);
        path.lineTo(400,542);
        path.close();
        canvas.drawPath(path,mPaint);
    }
}
