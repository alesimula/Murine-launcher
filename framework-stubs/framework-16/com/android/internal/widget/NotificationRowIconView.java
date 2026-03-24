package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class NotificationRowIconView extends com.android.internal.widget.CachingIconView {
    public NotificationRowIconView(android.content.Context p0) { super((android.content.Context)null); }
    public NotificationRowIconView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public NotificationRowIconView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public NotificationRowIconView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public void setIconProvider(com.android.internal.widget.NotificationRowIconView.NotificationIconProvider p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setImageIconAsync")
    public void setImageIcon(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public java.lang.Runnable setImageIconAsync(android.graphics.drawable.Icon p0) { return null; }
    @android.view.RemotableViewMethod
    public void setBackgroundColor(int p0) {}
    @android.view.RemotableViewMethod
    public void setOriginalIconColor(int p0) {}

    public static interface NotificationIconProvider {
        public boolean shouldShowAppIcon();
        @android.annotation.Nullable
        public android.graphics.drawable.Drawable getAppIcon();
    }
}
