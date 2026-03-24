package com.android.internal.view;

public abstract class BaseSurfaceHolder implements android.view.SurfaceHolder {
    static final boolean DEBUG = false;
    public final java.util.ArrayList<android.view.SurfaceHolder.Callback> mCallbacks = null;
    android.view.SurfaceHolder.Callback[] mGottenCallbacks;
    boolean mHaveGottenCallbacks;
    public final java.util.concurrent.locks.ReentrantLock mSurfaceLock = null;
    public android.view.Surface mSurface;
    int mRequestedWidth;
    int mRequestedHeight;
    protected int mRequestedFormat;
    int mRequestedType;
    long mLastLockTime;
    int mType;
    final android.graphics.Rect mSurfaceFrame = null;
    android.graphics.Rect mTmpDirty;
    public BaseSurfaceHolder() {}
    public abstract void onUpdateSurface();
    public abstract void onRelayoutContainer();
    public abstract boolean onAllowLockCanvas();
    public int getRequestedWidth() { return 0; }
    public int getRequestedHeight() { return 0; }
    public int getRequestedFormat() { return 0; }
    public int getRequestedType() { return 0; }
    public void addCallback(android.view.SurfaceHolder.Callback p0) {}
    public void removeCallback(android.view.SurfaceHolder.Callback p0) {}
    public android.view.SurfaceHolder.Callback[] getCallbacks() { return null; }
    public void ungetCallbacks() {}
    public void setFixedSize(int p0, int p1) {}
    public void setSizeFromLayout() {}
    public void setFormat(int p0) {}
    public void setType(int p0) {}
    public android.graphics.Canvas lockCanvas() { return null; }
    public android.graphics.Canvas lockCanvas(android.graphics.Rect p0) { return null; }
    public android.graphics.Canvas lockHardwareCanvas() { return null; }
    public void unlockCanvasAndPost(android.graphics.Canvas p0) {}
    public android.view.Surface getSurface() { return null; }
    public android.graphics.Rect getSurfaceFrame() { return null; }
    public void setSurfaceFrameSize(int p0, int p1) {}
}
