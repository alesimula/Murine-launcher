package com.android.internal.widget.remotecompose.player.platform;

public class RemoteComposeCanvas extends android.widget.FrameLayout implements android.view.View.OnAttachStateChangeListener {
    static final boolean USE_VIEW_AREA_CLICK = true;
    static final float DEFAULT_FRAME_RATE = 60.0f;
    static final float POST_TO_NEXT_FRAME_THRESHOLD = 60.0f;
    com.android.internal.widget.remotecompose.player.RemoteComposeDocument mDocument;
    int mTheme;
    boolean mInActionDown;
    int mDebug;
    boolean mHasClickAreas;
    android.graphics.Point mActionDownPoint;
    com.android.internal.widget.remotecompose.player.platform.AndroidRemoteContext mARContext;
    float mDensity;
    long mStart;
    long mLastFrameDelay;
    float mMaxFrameRate;
    long mMaxFrameDelay;
    long mLastFrameCall;
    public RemoteComposeCanvas(android.content.Context p0) { super((android.content.Context)null); }
    public RemoteComposeCanvas(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public RemoteComposeCanvas(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public void setDebug(int p0) {}
    public void setDocument(com.android.internal.widget.remotecompose.player.RemoteComposeDocument p0) {}
    public void onViewAttachedToWindow(android.view.View p0) {}
    public void setHapticEngine(com.android.internal.widget.remotecompose.core.CoreDocument.HapticEngine p0) {}
    public void onViewDetachedFromWindow(android.view.View p0) {}
    public java.lang.String[] getNamedColors() { return null; }
    public java.lang.String[] getNamedVariables(int p0) { return null; }
    public void setColor(java.lang.String p0, int p1) {}
    public void setLong(java.lang.String p0, long p1) {}
    public com.android.internal.widget.remotecompose.player.RemoteComposeDocument getDocument() { return null; }
    public void setLocalString(java.lang.String p0, java.lang.String p1) {}
    public void clearLocalString(java.lang.String p0) {}
    public void setLocalInt(java.lang.String p0, int p1) {}
    public void clearLocalInt(java.lang.String p0) {}
    public void setLocalColor(java.lang.String p0, int p1) {}
    public void clearLocalColor(java.lang.String p0) {}
    public void setLocalFloat(java.lang.String p0, java.lang.Float p1) {}
    public void clearLocalFloat(java.lang.String p0) {}
    public void setLocalBitmap(java.lang.String p0, android.graphics.Bitmap p1) {}
    public void clearLocalBitmap(java.lang.String p0) {}
    public int hasSensorListeners(int[] p0) { return 0; }
    public void setExternalFloat(int p0, float p1) {}
    public boolean isDraggable() { return false; }
    public void checkShaders(com.android.internal.widget.remotecompose.core.CoreDocument.ShaderControl p0) {}
    public void setUseChoreographer(boolean p0) {}
    public com.android.internal.widget.remotecompose.core.RemoteContext getRemoteContext() { return null; }
    public void addIdActionListener(com.android.internal.widget.remotecompose.player.platform.RemoteComposeCanvas.ClickCallbacks p0) {}
    public int getTheme() { return 0; }
    public void setTheme(int p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean performClick() { return false; }
    public int measureDimension(int p0, int p1) { return 0; }
    protected void onMeasure(int p0, int p1) {}
    public float getEvalTime() { return 0.0f; }
    protected void onDraw(android.graphics.Canvas p0) {}

    public static interface ClickCallbacks {
        public void click(int p0, java.lang.String p1);
    }
}
