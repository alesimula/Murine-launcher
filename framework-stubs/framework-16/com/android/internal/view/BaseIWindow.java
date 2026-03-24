package com.android.internal.view;

public class BaseIWindow extends android.view.IWindow.Stub {
    public BaseIWindow() { super(); }
    public void setSession(android.view.IWindowSession p0) {}
    public void resized(android.view.WindowRelayoutResult p0, boolean p1, boolean p2, int p3, boolean p4, boolean p5) {}
    public void insetsControlChanged(android.view.InsetsState p0, android.view.InsetsSourceControl.Array p1) {}
    public void showInsets(int p0, android.view.inputmethod.ImeTracker.Token p1) {}
    public void hideInsets(int p0, android.view.inputmethod.ImeTracker.Token p1) {}
    public void moved(int p0, int p1) {}
    public void dispatchAppVisibility(boolean p0, int p1) {}
    public void dispatchGetNewSurface() {}
    public void executeCommand(java.lang.String p0, java.lang.String p1, android.os.ParcelFileDescriptor p2) {}
    public void closeSystemDialogs(java.lang.String p0) {}
    public void dispatchWallpaperOffsets(float p0, float p1, float p2, float p3, float p4, boolean p5) {}
    public void dispatchDragEvent(android.view.DragEvent p0) {}
    public void dispatchWallpaperCommand(java.lang.String p0, int p1, int p2, int p3, android.os.Bundle p4, boolean p5) {}
    public void dispatchWindowShown() {}
    public void requestAppKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) {}
    public void requestScrollCapture(android.view.IScrollCaptureResponseListener p0) {}
    public void dumpWindow(android.os.ParcelFileDescriptor p0) {}
}
