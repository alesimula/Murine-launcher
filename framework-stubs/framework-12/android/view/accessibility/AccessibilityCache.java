package android.view.accessibility;

public class AccessibilityCache {
    private static final java.lang.String LOG_TAG = "AccessibilityCache";
    private static final boolean DEBUG = Boolean.valueOf(false);
    private static final boolean VERBOSE = Boolean.valueOf(false);
    private static final boolean CHECK_INTEGRITY = Boolean.valueOf(false);
    public static final int CACHE_CRITICAL_EVENTS_MASK = 4307005;
    private final java.lang.Object mLock = null;
    private final android.view.accessibility.AccessibilityCache.AccessibilityNodeRefresher mAccessibilityNodeRefresher = null;
    private long mAccessibilityFocus;
    private long mInputFocus;
    private int mAccessibilityFocusedWindow;
    private boolean mIsAllWindowsCached;
    private final android.util.SparseArray<android.util.SparseArray<android.view.accessibility.AccessibilityWindowInfo>> mWindowCacheByDisplay = null;
    private final android.util.SparseArray<android.util.LongSparseArray<android.view.accessibility.AccessibilityNodeInfo>> mNodeCache = null;
    private final android.util.SparseArray<android.view.accessibility.AccessibilityWindowInfo> mTempWindowArray = null;
    public AccessibilityCache(android.view.accessibility.AccessibilityCache.AccessibilityNodeRefresher p0) {}
    public void setWindowsOnAllDisplays(android.util.SparseArray<java.util.List<android.view.accessibility.AccessibilityWindowInfo>> p0) {}
    public void addWindow(android.view.accessibility.AccessibilityWindowInfo p0) {}
    private void addWindowByDisplayLocked(int p0, android.view.accessibility.AccessibilityWindowInfo p1) {}
    public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    private android.view.accessibility.AccessibilityNodeInfo removeCachedNodeLocked(int p0, long p1) { return null; }
    public android.view.accessibility.AccessibilityNodeInfo getNode(int p0, long p1) { return null; }
    public android.util.SparseArray<java.util.List<android.view.accessibility.AccessibilityWindowInfo>> getWindowsOnAllDisplays() { return null; }
    public android.view.accessibility.AccessibilityWindowInfo getWindow(int p0) { return null; }
    public void add(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public void clear() {}
    private void clearWindowCacheLocked() {}
    private void clearNodesForWindowLocked(int p0) {}
    private void clearSubTreeLocked(int p0, long p1) {}
    private boolean clearSubTreeRecursiveLocked(android.util.LongSparseArray<android.view.accessibility.AccessibilityNodeInfo> p0, long p1) { return false; }
    public void checkIntegrity() {}

    public static class AccessibilityNodeRefresher {
        public AccessibilityNodeRefresher() {}
        public boolean refreshNode(android.view.accessibility.AccessibilityNodeInfo p0, boolean p1) { return false; }
        public boolean refreshWindow(android.view.accessibility.AccessibilityWindowInfo p0) { return false; }
    }
}
