package android.view.accessibility;

public final class AccessibilityInteractionClient extends android.view.accessibility.IAccessibilityInteractionConnectionCallback.Stub {
    public static final int NO_ID = -1;
    public static final java.lang.String CALL_STACK = "call_stack";
    public static final java.lang.String IGNORE_CALL_STACK = "ignore_call_stack";
    public static android.view.accessibility.AccessibilityInteractionClient getInstance() { return null; }
    public static android.view.accessibility.AccessibilityInteractionClient getInstanceForThread(long p0) { return null; }
    public static android.view.accessibility.AccessibilityInteractionClient getInstance(android.content.Context p0) { return null; }
    public static android.view.accessibility.AccessibilityInteractionClient getInstanceForThread(long p0, android.content.Context p1) { return null; }
    public static android.accessibilityservice.IAccessibilityServiceConnection getConnection(int p0) { return null; }
    public static void addConnection(int p0, android.accessibilityservice.IAccessibilityServiceConnection p1, boolean p2) {}
    public static int addDirectConnection(android.view.accessibility.IAccessibilityInteractionConnection p0, android.view.accessibility.AccessibilityManager p1) { return 0; }
    public static boolean hasAnyDirectConnection() { return false; }
    public static android.view.accessibility.AccessibilityCache getCache(int p0) { return null; }
    public static void removeConnection(int p0) {}
    public static void setCache(int p0, android.view.accessibility.AccessibilityCache p1) {}
    public void setSameThreadMessage(android.os.Message p0) {}
    public android.view.accessibility.AccessibilityNodeInfo getRootInActiveWindow(int p0, int p1) { return null; }
    public android.view.accessibility.AccessibilityWindowInfo getWindow(int p0, int p1) { return null; }
    public android.view.accessibility.AccessibilityWindowInfo getWindow(int p0, int p1, boolean p2) { return null; }
    public java.util.List<android.view.accessibility.AccessibilityWindowInfo> getWindows(int p0) { return null; }
    public java.util.List<android.view.accessibility.AccessibilityWindowInfo> getWindowsOnDisplay(int p0, int p1) { return null; }
    public android.util.SparseArray<java.util.List<android.view.accessibility.AccessibilityWindowInfo>> getWindowsOnAllDisplays(int p0) { return null; }
    public android.view.accessibility.AccessibilityNodeInfo findAccessibilityNodeInfoByAccessibilityId(int p0, android.os.IBinder p1, long p2, boolean p3, int p4, android.os.Bundle p5) { return null; }
    public android.view.accessibility.AccessibilityNodeInfo findAccessibilityNodeInfoByAccessibilityId(int p0, int p1, long p2, boolean p3, int p4, android.os.Bundle p5) { return null; }
    public java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId(int p0, int p1, long p2, java.lang.String p3) { return null; }
    public void takeScreenshotOfWindow(int p0, int p1, java.util.concurrent.Executor p2, android.accessibilityservice.AccessibilityService.TakeScreenshotCallback p3) {}
    public java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText(int p0, int p1, long p2, java.lang.String p3) { return null; }
    @android.annotation.SuppressLint("LongLogTag")
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int p0, int p1, long p2, int p3) { return null; }
    public android.view.accessibility.AccessibilityNodeInfo focusSearch(int p0, int p1, long p2, int p3) { return null; }
    public boolean performAccessibilityAction(int p0, int p1, long p2, int p3, android.os.Bundle p4) { return false; }
    public void clearCache(int p0) {}
    public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0, int p1) {}
    public void setFindAccessibilityNodeInfoResult(android.view.accessibility.AccessibilityNodeInfo p0, int p1) {}
    public void setFindAccessibilityNodeInfosResult(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0, int p1) {}
    public void setPrefetchAccessibilityNodeInfoResult(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0, int p1) {}
    public void setPerformAccessibilityActionResult(boolean p0, int p1) {}
    public void sendTakeScreenshotOfWindowError(int p0, int p1) {}
    public void attachAccessibilityOverlayToWindow(int p0, int p1, android.view.SurfaceControl p2) {}
}
