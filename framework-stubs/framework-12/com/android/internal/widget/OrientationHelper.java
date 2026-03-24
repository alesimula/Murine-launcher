package com.android.internal.widget;

public abstract class OrientationHelper {
    private static final int INVALID_SIZE = -2147483648;
    protected final com.android.internal.widget.RecyclerView.LayoutManager mLayoutManager = null;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    private int mLastTotalSpace;
    final android.graphics.Rect mTmpRect = null;
    private OrientationHelper(com.android.internal.widget.RecyclerView.LayoutManager p0) {}
    public void onLayoutComplete() {}
    public int getTotalSpaceChange() { return 0; }
    public abstract int getDecoratedStart(android.view.View p0);
    public abstract int getDecoratedEnd(android.view.View p0);
    public abstract int getTransformedEndWithDecoration(android.view.View p0);
    public abstract int getTransformedStartWithDecoration(android.view.View p0);
    public abstract int getDecoratedMeasurement(android.view.View p0);
    public abstract int getDecoratedMeasurementInOther(android.view.View p0);
    public abstract int getStartAfterPadding();
    public abstract int getEndAfterPadding();
    public abstract int getEnd();
    public abstract void offsetChildren(int p0);
    public abstract int getTotalSpace();
    public abstract void offsetChild(android.view.View p0, int p1);
    public abstract int getEndPadding();
    public abstract int getMode();
    public abstract int getModeInOther();
    public static com.android.internal.widget.OrientationHelper createOrientationHelper(com.android.internal.widget.RecyclerView.LayoutManager p0, int p1) { return null; }
    public static com.android.internal.widget.OrientationHelper createHorizontalHelper(com.android.internal.widget.RecyclerView.LayoutManager p0) { return null; }
    public static com.android.internal.widget.OrientationHelper createVerticalHelper(com.android.internal.widget.RecyclerView.LayoutManager p0) { return null; }
}
