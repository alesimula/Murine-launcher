package com.android.internal.widget.remotecompose.accessibility;

public class PlatformRemoteComposeTouchHelper extends com.android.internal.widget.ExploreByTouchHelper {
    public PlatformRemoteComposeTouchHelper(android.view.View p0, com.android.internal.widget.remotecompose.accessibility.RemoteComposeDocumentAccessibility p1, com.android.internal.widget.remotecompose.accessibility.SemanticNodeApplier<android.view.accessibility.AccessibilityNodeInfo> p2) { super(null); }
    public static com.android.internal.widget.remotecompose.accessibility.PlatformRemoteComposeTouchHelper forRemoteComposePlayer(android.view.View p0, com.android.internal.widget.remotecompose.core.CoreDocument p1) { return null; }
    protected int getVirtualViewAt(float p0, float p1) { return 0; }
    public void getVisibleVirtualViews(android.util.IntArray p0) {}
    public java.util.List<java.lang.Integer> getVisibleChildVirtualViews() { return null; }
    public void onPopulateNodeForVirtualView(int p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
    protected void onPopulateEventForVirtualView(int p0, android.view.accessibility.AccessibilityEvent p1) {}
    protected boolean onPerformActionForVirtualView(int p0, int p1, android.os.Bundle p2) { return false; }
}
