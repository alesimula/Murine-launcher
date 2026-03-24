package com.android.internal.widget;

public class LinearLayoutWithDefaultTouchRecepient extends android.widget.LinearLayout {
    private final android.graphics.Rect mTempRect = null;
    private android.view.View mDefaultTouchRecepient;
    @android.annotation.UnsupportedAppUsage
    public LinearLayoutWithDefaultTouchRecepient(android.content.Context p0) { super((android.content.Context)null); }
    public LinearLayoutWithDefaultTouchRecepient(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    @android.annotation.UnsupportedAppUsage
    public void setDefaultTouchRecepient(android.view.View p0) {}
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
}
