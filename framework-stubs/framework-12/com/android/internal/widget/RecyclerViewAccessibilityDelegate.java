package com.android.internal.widget;

public class RecyclerViewAccessibilityDelegate extends android.view.View.AccessibilityDelegate {
    final com.android.internal.widget.RecyclerView mRecyclerView = null;
    final android.view.View.AccessibilityDelegate mItemDelegate = null;
    public RecyclerViewAccessibilityDelegate(com.android.internal.widget.RecyclerView p0) { super(); }
    boolean shouldIgnore() { return false; }
    public boolean performAccessibilityAction(android.view.View p0, int p1, android.os.Bundle p2) { return false; }
    public void onInitializeAccessibilityNodeInfo(android.view.View p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
    public void onInitializeAccessibilityEvent(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) {}
    public android.view.View.AccessibilityDelegate getItemDelegate() { return null; }
}
