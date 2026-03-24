package android.view.accessibility;

public class AccessibilityCache {
    private static final java.lang.String LOG_TAG = "AccessibilityCache";
    private static final boolean DEBUG = false;
    private static final boolean CHECK_INTEGRITY = Boolean.valueOf(false);
    public static final int CACHE_CRITICAL_EVENTS_MASK = 4307005;
    private final java.lang.Object mLock = null;
    private final android.view.accessibility.AccessibilityCache.AccessibilityNodeRefresher mAccessibilityNodeRefresher = null;
    private long mAccessibilityFocus;
    private long mInputFocus;
    private boolean mIsAllWindowsCached;
    private final android.util.SparseArray<android.view.accessibility.AccessibilityWindowInfo> mWindowCache = null;
    private final android.util.SparseArray<android.util.LongSparseArray<android.view.accessibility.AccessibilityNodeInfo>> mNodeCache = null;
    private final android.util.SparseArray<android.view.accessibility.AccessibilityWindowInfo> mTempWindowArray = null;
    public AccessibilityCache(android.view.accessibility.AccessibilityCache.AccessibilityNodeRefresher p0) {}
    public void setWindows(java.util.List<android.view.accessibility.AccessibilityWindowInfo> p0) {}
    public void addWindow(android.view.accessibility.AccessibilityWindowInfo p0) {}
    public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    private void refreshCachedNodeLocked(int p0, long p1) {}
    public android.view.accessibility.AccessibilityNodeInfo getNode(int p0, long p1) { return null; }
    public java.util.List<android.view.accessibility.AccessibilityWindowInfo> getWindows() { return null; }
    public android.view.accessibility.AccessibilityWindowInfo getWindow(int p0) { return null; }
    public void add(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public void clear() {}
    private void clearWindowCache() {}
    private void clearNodesForWindowLocked(int p0) {}
    private void clearSubTreeLocked(int p0, long p1) {}
    private boolean clearSubTreeRecursiveLocked(android.util.LongSparseArray<android.view.accessibility.AccessibilityNodeInfo> p0, long p1) { return false; }
    public void checkIntegrity() {}

    public static class AccessibilityNodeRefresher {
        public AccessibilityNodeRefresher() {}
        public boolean refreshNode(android.view.accessibility.AccessibilityNodeInfo p0, boolean p1) { return false; }
    }
}
