package com.android.internal.widget;

public interface NestedScrollingChild {
    public void setNestedScrollingEnabled(boolean p0);
    public boolean isNestedScrollingEnabled();
    public boolean startNestedScroll(int p0);
    public void stopNestedScroll();
    public boolean hasNestedScrollingParent();
    public boolean dispatchNestedScroll(int p0, int p1, int p2, int p3, int[] p4);
    public boolean dispatchNestedPreScroll(int p0, int p1, int[] p2, int[] p3);
    public boolean dispatchNestedFling(float p0, float p1, boolean p2);
    public boolean dispatchNestedPreFling(float p0, float p1);
}
