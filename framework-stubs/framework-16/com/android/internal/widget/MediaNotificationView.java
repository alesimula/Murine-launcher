package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class MediaNotificationView extends android.widget.FrameLayout {
    public MediaNotificationView(android.content.Context p0) { super((android.content.Context)null); }
    public MediaNotificationView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public MediaNotificationView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public MediaNotificationView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onFinishInflate() {}
    public void onVisibilityAggregated(boolean p0) {}
    public void addVisibilityListener(com.android.internal.widget.MediaNotificationView.VisibilityChangeListener p0) {}
    public void removeVisibilityListener(com.android.internal.widget.MediaNotificationView.VisibilityChangeListener p0) {}

    public static interface VisibilityChangeListener {
        public void onAggregatedVisibilityChanged(boolean p0);
    }
}
