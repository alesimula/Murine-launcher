package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class EmphasizedNotificationButton extends android.widget.Button {
    private final android.graphics.drawable.RippleDrawable mRipple = null;
    private final android.graphics.drawable.GradientDrawable mBackground = null;
    private boolean mPriority;
    public EmphasizedNotificationButton(android.content.Context p0) { super((android.content.Context)null); }
    public EmphasizedNotificationButton(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public EmphasizedNotificationButton(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public EmphasizedNotificationButton(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    @android.view.RemotableViewMethod
    public void setRippleColor(android.content.res.ColorStateList p0) {}
    @android.view.RemotableViewMethod
    public void setButtonBackground(android.content.res.ColorStateList p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setImageIconAsync")
    public void setImageIcon(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public java.lang.Runnable setImageIconAsync(android.graphics.drawable.Icon p0) { return null; }
    private void setImageDrawable(android.graphics.drawable.Drawable p0) {}
    @android.view.RemotableViewMethod
    public void setIsPriority(boolean p0) {}
    public boolean isPriority() { return false; }
}
