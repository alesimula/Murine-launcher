package com.android.internal.view;

public interface RootViewSurfaceTaker {
    public android.view.SurfaceHolder.Callback2 willYouTakeTheSurface();
    public void setSurfaceType(int p0);
    public void setSurfaceFormat(int p0);
    public void setSurfaceKeepScreenOn(boolean p0);
    public android.view.InputQueue.Callback willYouTakeTheInputQueue();
    public void onRootViewScrollYChanged(int p0);
    @android.annotation.Nullable
    public android.view.PendingInsetsController providePendingInsetsController();
}
