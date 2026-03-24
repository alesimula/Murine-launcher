package com.android.internal.widget.remotecompose.player.platform;

public class RemoteComposeCanvas extends android.widget.FrameLayout implements android.view.View.OnAttachStateChangeListener {
    static final boolean USE_VIEW_AREA_CLICK = true;
    com.android.internal.widget.remotecompose.player.RemoteComposeDocument mDocument;
    int mTheme;
    boolean mInActionDown;
    boolean mDebug;
    android.graphics.Point mActionDownPoint;
    com.android.internal.widget.remotecompose.player.platform.AndroidRemoteContext mARContext;
    public RemoteComposeCanvas(android.content.Context p0) { super((android.content.Context)null); }
    public RemoteComposeCanvas(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public RemoteComposeCanvas(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public void setDebug(boolean p0) {}
    public void setDocument(com.android.internal.widget.remotecompose.player.RemoteComposeDocument p0) {}
    public void onViewAttachedToWindow(android.view.View p0) {}
    public void onViewDetachedFromWindow(android.view.View p0) {}
    public void addClickListener(com.android.internal.widget.remotecompose.player.platform.RemoteComposeCanvas.ClickCallbacks p0) {}
    public int getTheme() { return 0; }
    public void setTheme(int p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean performClick() { return false; }
    public int measureDimension(int p0, int p1) { return 0; }
    protected void onMeasure(int p0, int p1) {}
    protected void onDraw(android.graphics.Canvas p0) {}

    public static interface ClickCallbacks {
        public void click(int p0, java.lang.String p1);
    }
}
