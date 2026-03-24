package android.view.accessibility;

public final class AccessibilityInteractionClient extends android.view.accessibility.IAccessibilityInteractionConnectionCallback.Stub {
    public static final int NO_ID = -1;
    private static final java.lang.String LOG_TAG = "AccessibilityInteractionClient";
    private static final boolean DEBUG = false;
    private static final boolean CHECK_INTEGRITY = true;
    private static final long TIMEOUT_INTERACTION_MILLIS = 5000L;
    private static final java.lang.Object sStaticLock = null;
    private static final android.util.LongSparseArray<android.view.accessibility.AccessibilityInteractionClient> sClients = null;
    private static final android.util.SparseArray<android.accessibilityservice.IAccessibilityServiceConnection> sConnectionCache = null;
    private static android.view.accessibility.AccessibilityCache sAccessibilityCache;
    private final java.util.concurrent.atomic.AtomicInteger mInteractionIdCounter = null;
    private final java.lang.Object mInstanceLock = null;
    private volatile int mInteractionId;
    private android.view.accessibility.AccessibilityNodeInfo mFindAccessibilityNodeInfoResult;
    private java.util.List<android.view.accessibility.AccessibilityNodeInfo> mFindAccessibilityNodeInfosResult;
    private boolean mPerformAccessibilityActionResult;
    private android.os.Message mSameThreadMessage;
    @android.annotation.UnsupportedAppUsage
    public static android.view.accessibility.AccessibilityInteractionClient getInstance() { return null; }
    public static android.view.accessibility.AccessibilityInteractionClient getInstanceForThread(long p0) { return null; }
    public static android.accessibilityservice.IAccessibilityServiceConnection getConnection(int p0) { return null; }
    public static void addConnection(int p0, android.accessibilityservice.IAccessibilityServiceConnection p1) {}
    public static void removeConnection(int p0) {}
    public static void setCache(android.view.accessibility.AccessibilityCache p0) {}
    private AccessibilityInteractionClient() { super(); }
    @android.annotation.UnsupportedAppUsage
    public void setSameThreadMessage(android.os.Message p0) {}
    public android.view.accessibility.AccessibilityNodeInfo getRootInActiveWindow(int p0) { return null; }
    public android.view.accessibility.AccessibilityWindowInfo getWindow(int p0, int p1) { return null; }
    public java.util.List<android.view.accessibility.AccessibilityWindowInfo> getWindows(int p0) { return null; }
    public android.view.accessibility.AccessibilityNodeInfo findAccessibilityNodeInfoByAccessibilityId(int p0, int p1, long p2, boolean p3, int p4, android.os.Bundle p5) { return null; }
    private static java.lang.String idToString(int p0, long p1) { return null; }
    public java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId(int p0, int p1, long p2, java.lang.String p3) { return null; }
    public java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText(int p0, int p1, long p2, java.lang.String p3) { return null; }
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int p0, int p1, long p2, int p3) { return null; }
    public android.view.accessibility.AccessibilityNodeInfo focusSearch(int p0, int p1, long p2, int p3) { return null; }
    public boolean performAccessibilityAction(int p0, int p1, long p2, int p3, android.os.Bundle p4) { return false; }
    @android.annotation.UnsupportedAppUsage
    public void clearCache() {}
    public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    private android.view.accessibility.AccessibilityNodeInfo getFindAccessibilityNodeInfoResultAndClear(int p0) { return null; }
    public void setFindAccessibilityNodeInfoResult(android.view.accessibility.AccessibilityNodeInfo p0, int p1) {}
    private java.util.List<android.view.accessibility.AccessibilityNodeInfo> getFindAccessibilityNodeInfosResultAndClear(int p0) { return null; }
    public void setFindAccessibilityNodeInfosResult(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0, int p1) {}
    private boolean getPerformAccessibilityActionResultAndClear(int p0) { return false; }
    public void setPerformAccessibilityActionResult(boolean p0, int p1) {}
    private void clearResultLocked() {}
    private boolean waitForResultTimedLocked(int p0) { return false; }
    private void finalizeAndCacheAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0, int p1, boolean p2, java.lang.String[] p3) {}
    private void finalizeAndCacheAccessibilityNodeInfos(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0, int p1, boolean p2, java.lang.String[] p3) {}
    private android.os.Message getSameProcessMessageAndClear() { return null; }
    private void checkFindAccessibilityNodeInfoResultIntegrity(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0) {}
}
