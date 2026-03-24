package com.android.internal.app;

public class ChooserGridLayoutManager extends com.android.internal.widget.GridLayoutManager {
    public ChooserGridLayoutManager(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null, 0); }
    public ChooserGridLayoutManager(android.content.Context p0, int p1) { super((android.content.Context)null, 0); }
    public ChooserGridLayoutManager(android.content.Context p0, int p1, int p2, boolean p3) { super((android.content.Context)null, 0); }
    public void onAttachedToWindow(com.android.internal.widget.RecyclerView p0) {}
    public void onDetachedFromWindow(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.Recycler p1) {}
    public int getRowCountForAccessibility(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) { return 0; }
    void setVerticalScrollEnabled(boolean p0) {}
    public boolean canScrollVertically() { return false; }
    public void onInitializeAccessibilityNodeInfoForItem(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, android.view.View p2, android.view.accessibility.AccessibilityNodeInfo p3) {}
    public void onInitializeAccessibilityNodeInfo(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, android.view.accessibility.AccessibilityNodeInfo p2) {}
    public boolean isLayoutHierarchical(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) { return false; }
}
