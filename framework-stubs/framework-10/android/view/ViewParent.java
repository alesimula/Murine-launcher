package android.view;

public interface ViewParent {
    public void requestLayout();
    public boolean isLayoutRequested();
    public void requestTransparentRegion(android.view.View p0);
    default public void onDescendantInvalidated(android.view.View p0, android.view.View p1) {}
    @java.lang.Deprecated
    public void invalidateChild(android.view.View p0, android.graphics.Rect p1);
    @java.lang.Deprecated
    public android.view.ViewParent invalidateChildInParent(int[] p0, android.graphics.Rect p1);
    public android.view.ViewParent getParent();
    public void requestChildFocus(android.view.View p0, android.view.View p1);
    public void recomputeViewAttributes(android.view.View p0);
    public void clearChildFocus(android.view.View p0);
    public boolean getChildVisibleRect(android.view.View p0, android.graphics.Rect p1, android.graphics.Point p2);
    public android.view.View focusSearch(android.view.View p0, int p1);
    public android.view.View keyboardNavigationClusterSearch(android.view.View p0, int p1);
    public void bringChildToFront(android.view.View p0);
    public void focusableViewAvailable(android.view.View p0);
    public boolean showContextMenuForChild(android.view.View p0);
    public boolean showContextMenuForChild(android.view.View p0, float p1, float p2);
    public void createContextMenu(android.view.ContextMenu p0);
    public android.view.ActionMode startActionModeForChild(android.view.View p0, android.view.ActionMode.Callback p1);
    public android.view.ActionMode startActionModeForChild(android.view.View p0, android.view.ActionMode.Callback p1, int p2);
    public void childDrawableStateChanged(android.view.View p0);
    public void requestDisallowInterceptTouchEvent(boolean p0);
    public boolean requestChildRectangleOnScreen(android.view.View p0, android.graphics.Rect p1, boolean p2);
    public boolean requestSendAccessibilityEvent(android.view.View p0, android.view.accessibility.AccessibilityEvent p1);
    public void childHasTransientStateChanged(android.view.View p0, boolean p1);
    public void requestFitSystemWindows();
    public android.view.ViewParent getParentForAccessibility();
    public void notifySubtreeAccessibilityStateChanged(android.view.View p0, android.view.View p1, int p2);
    public boolean canResolveLayoutDirection();
    public boolean isLayoutDirectionResolved();
    public int getLayoutDirection();
    public boolean canResolveTextDirection();
    public boolean isTextDirectionResolved();
    public int getTextDirection();
    public boolean canResolveTextAlignment();
    public boolean isTextAlignmentResolved();
    public int getTextAlignment();
    public boolean onStartNestedScroll(android.view.View p0, android.view.View p1, int p2);
    public void onNestedScrollAccepted(android.view.View p0, android.view.View p1, int p2);
    public void onStopNestedScroll(android.view.View p0);
    public void onNestedScroll(android.view.View p0, int p1, int p2, int p3, int p4);
    public void onNestedPreScroll(android.view.View p0, int p1, int p2, int[] p3);
    public boolean onNestedFling(android.view.View p0, float p1, float p2, boolean p3);
    public boolean onNestedPreFling(android.view.View p0, float p1, float p2);
    public boolean onNestedPrePerformAccessibilityAction(android.view.View p0, int p1, android.os.Bundle p2);
    default public void subtractObscuredTouchableRegion(android.graphics.Region p0, android.view.View p1) {}
}
