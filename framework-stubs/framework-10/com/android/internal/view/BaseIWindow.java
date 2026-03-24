package com.android.internal.view;

public class BaseIWindow extends android.view.IWindow.Stub {
    private android.view.IWindowSession mSession;
    public int mSeq;
    public BaseIWindow() { super(); }
    public void setSession(android.view.IWindowSession p0) {}
    public void resized(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4, android.graphics.Rect p5, boolean p6, android.util.MergedConfiguration p7, android.graphics.Rect p8, boolean p9, boolean p10, int p11, android.view.DisplayCutout.ParcelableWrapper p12) {}
    public void locationInParentDisplayChanged(android.graphics.Point p0) {}
    public void insetsChanged(android.view.InsetsState p0) {}
    public void insetsControlChanged(android.view.InsetsState p0, android.view.InsetsSourceControl[] p1) throws android.os.RemoteException {}
    public void moved(int p0, int p1) {}
    public void dispatchAppVisibility(boolean p0) {}
    public void dispatchGetNewSurface() {}
    public void windowFocusChanged(boolean p0, boolean p1) {}
    public void executeCommand(java.lang.String p0, java.lang.String p1, android.os.ParcelFileDescriptor p2) {}
    public void closeSystemDialogs(java.lang.String p0) {}
    public void dispatchWallpaperOffsets(float p0, float p1, float p2, float p3, boolean p4) {}
    public void dispatchDragEvent(android.view.DragEvent p0) {}
    public void updatePointerIcon(float p0, float p1) {}
    public void dispatchSystemUiVisibilityChanged(int p0, int p1, int p2, int p3) {}
    public void dispatchWallpaperCommand(java.lang.String p0, int p1, int p2, int p3, android.os.Bundle p4, boolean p5) {}
    public void dispatchWindowShown() {}
    public void requestAppKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) {}
    public void dispatchPointerCaptureChanged(boolean p0) {}
}
