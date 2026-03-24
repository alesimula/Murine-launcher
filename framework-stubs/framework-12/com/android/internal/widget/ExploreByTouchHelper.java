package com.android.internal.widget;

public abstract class ExploreByTouchHelper extends android.view.View.AccessibilityDelegate {
    public static final int INVALID_ID = -2147483648;
    public static final int HOST_ID = -1;
    private static final java.lang.String DEFAULT_CLASS_NAME = null;
    private static final android.graphics.Rect INVALID_PARENT_BOUNDS = null;
    private android.graphics.Rect mTempScreenRect;
    private android.graphics.Rect mTempParentRect;
    private int[] mTempGlobalRect;
    private android.graphics.Rect mTempVisibleRect;
    private android.util.IntArray mTempArray;
    private final android.view.accessibility.AccessibilityManager mManager = null;
    private final android.view.View mView = null;
    private final android.content.Context mContext = null;
    private com.android.internal.widget.ExploreByTouchHelper.ExploreByTouchNodeProvider mNodeProvider;
    private int mFocusedVirtualViewId;
    private int mHoveredVirtualViewId;
    public ExploreByTouchHelper(android.view.View p0) { super(); }
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View p0) { return null; }
    public boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean sendEventForVirtualView(int p0, int p1) { return false; }
    public void invalidateRoot() {}
    public void invalidateVirtualView(int p0) {}
    public void invalidateVirtualView(int p0, int p1) {}
    public int getFocusedVirtualView() { return 0; }
    private void updateHoveredVirtualView(int p0) {}
    private android.view.accessibility.AccessibilityEvent createEvent(int p0, int p1) { return null; }
    private android.view.accessibility.AccessibilityEvent createEventForHost(int p0) { return null; }
    private android.view.accessibility.AccessibilityEvent createEventForChild(int p0, int p1) { return null; }
    private android.view.accessibility.AccessibilityNodeInfo createNode(int p0) { return null; }
    private android.view.accessibility.AccessibilityNodeInfo createNodeForHost() { return null; }
    private android.view.accessibility.AccessibilityNodeInfo createNodeForChild(int p0) { return null; }
    private void ensureTempRects() {}
    private boolean performAction(int p0, int p1, android.os.Bundle p2) { return false; }
    private boolean performActionForHost(int p0, android.os.Bundle p1) { return false; }
    private boolean performActionForChild(int p0, int p1, android.os.Bundle p2) { return false; }
    private boolean manageFocusForChild(int p0, int p1) { return false; }
    private boolean intersectVisibleToUser(android.graphics.Rect p0) { return false; }
    private boolean isAccessibilityFocused(int p0) { return false; }
    private boolean requestAccessibilityFocus(int p0) { return false; }
    private boolean clearAccessibilityFocus(int p0) { return false; }
    protected abstract int getVirtualViewAt(float p0, float p1);
    protected abstract void getVisibleVirtualViews(android.util.IntArray p0);
    protected abstract void onPopulateEventForVirtualView(int p0, android.view.accessibility.AccessibilityEvent p1);
    protected void onPopulateEventForHost(android.view.accessibility.AccessibilityEvent p0) {}
    protected abstract void onPopulateNodeForVirtualView(int p0, android.view.accessibility.AccessibilityNodeInfo p1);
    protected void onPopulateNodeForHost(android.view.accessibility.AccessibilityNodeInfo p0) {}
    protected abstract boolean onPerformActionForVirtualView(int p0, int p1, android.os.Bundle p2);

    private class ExploreByTouchNodeProvider extends android.view.accessibility.AccessibilityNodeProvider {
        private ExploreByTouchNodeProvider(com.android.internal.widget.ExploreByTouchHelper p0) { super(); }
        public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int p0) { return null; }
        public boolean performAction(int p0, int p1, android.os.Bundle p2) { return false; }
    }
}
