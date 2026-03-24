package com.android.internal.widget;

public abstract class ExploreByTouchHelper extends android.view.View.AccessibilityDelegate {
    public static final int INVALID_ID = -2147483648;
    public static final int HOST_ID = -1;
    public ExploreByTouchHelper(android.view.View p0) { super(); }
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View p0) { return null; }
    public boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean sendEventForVirtualView(int p0, int p1) { return false; }
    public void invalidateRoot() {}
    public void invalidateVirtualView(int p0) {}
    public void invalidateVirtualView(int p0, int p1) {}
    public int getFocusedVirtualView() { return 0; }
    protected abstract int getVirtualViewAt(float p0, float p1);
    protected abstract void getVisibleVirtualViews(android.util.IntArray p0);
    protected abstract void onPopulateEventForVirtualView(int p0, android.view.accessibility.AccessibilityEvent p1);
    protected void onPopulateEventForHost(android.view.accessibility.AccessibilityEvent p0) {}
    protected abstract void onPopulateNodeForVirtualView(int p0, android.view.accessibility.AccessibilityNodeInfo p1);
    protected void onPopulateNodeForHost(android.view.accessibility.AccessibilityNodeInfo p0) {}
    protected abstract boolean onPerformActionForVirtualView(int p0, int p1, android.os.Bundle p2);

    private class ExploreByTouchNodeProvider extends android.view.accessibility.AccessibilityNodeProvider {
        public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int p0) { return null; }
        public boolean performAction(int p0, int p1, android.os.Bundle p2) { return false; }
    }
}
