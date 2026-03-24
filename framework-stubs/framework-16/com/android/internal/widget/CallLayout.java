package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class CallLayout extends android.widget.FrameLayout {
    public CallLayout(android.content.Context p0) { super((android.content.Context)null); }
    public CallLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public CallLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public CallLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onFinishInflate() {}
    public java.lang.Runnable setLayoutColorAsync(int p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setLayoutColorAsync")
    public void setLayoutColor(int p0) {}
    @android.view.RemotableViewMethod
    public void setNotificationBackgroundColor(int p0) {}
    public java.lang.Runnable setLargeIconAsync(android.graphics.drawable.Icon p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setLargeIconAsync")
    public void setLargeIcon(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setDataAsync")
    public void setData(android.os.Bundle p0) {}
    public java.lang.Runnable setDataAsync(android.os.Bundle p0) { return null; }
}
