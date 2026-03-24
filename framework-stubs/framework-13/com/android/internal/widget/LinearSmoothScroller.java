package com.android.internal.widget;

public class LinearSmoothScroller extends com.android.internal.widget.RecyclerView.SmoothScroller {
    public static final int SNAP_TO_START = -1;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_ANY = 0;
    protected final android.view.animation.LinearInterpolator mLinearInterpolator = null;
    protected final android.view.animation.DecelerateInterpolator mDecelerateInterpolator = null;
    protected android.graphics.PointF mTargetVector;
    protected int mInterimTargetDx;
    protected int mInterimTargetDy;
    public LinearSmoothScroller(android.content.Context p0) { super(); }
    protected void onStart() {}
    protected void onTargetFound(android.view.View p0, com.android.internal.widget.RecyclerView.State p1, com.android.internal.widget.RecyclerView.SmoothScroller.Action p2) {}
    protected void onSeekTargetStep(int p0, int p1, com.android.internal.widget.RecyclerView.State p2, com.android.internal.widget.RecyclerView.SmoothScroller.Action p3) {}
    protected void onStop() {}
    protected float calculateSpeedPerPixel(android.util.DisplayMetrics p0) { return 0.0f; }
    protected int calculateTimeForDeceleration(int p0) { return 0; }
    protected int calculateTimeForScrolling(int p0) { return 0; }
    protected int getHorizontalSnapPreference() { return 0; }
    protected int getVerticalSnapPreference() { return 0; }
    protected void updateActionForInterimTarget(com.android.internal.widget.RecyclerView.SmoothScroller.Action p0) {}
    public int calculateDtToFit(int p0, int p1, int p2, int p3, int p4) { return 0; }
    public int calculateDyToMakeVisible(android.view.View p0, int p1) { return 0; }
    public int calculateDxToMakeVisible(android.view.View p0, int p1) { return 0; }
    public android.graphics.PointF computeScrollVectorForPosition(int p0) { return null; }
}
