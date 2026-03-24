package android.view.accessibility;

public class AccessibilityCache {
    public static final int CACHE_CRITICAL_EVENTS_MASK = 4307005;
    public AccessibilityCache(android.view.accessibility.AccessibilityCache.AccessibilityNodeRefresher p0) {}
    public boolean isEnabled() { return false; }
    public void setEnabled(boolean p0) {}
    public void setWindowsOnAllDisplays(android.util.SparseArray<java.util.List<android.view.accessibility.AccessibilityWindowInfo>> p0, long p1) {}
    public void addWindow(android.view.accessibility.AccessibilityWindowInfo p0) {}
    public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    public android.view.accessibility.AccessibilityNodeInfo getNode(int p0, long p1) { return null; }
    public boolean isNodeInCache(android.view.accessibility.AccessibilityNodeInfo p0) { return false; }
    public android.util.SparseArray<java.util.List<android.view.accessibility.AccessibilityWindowInfo>> getWindowsOnAllDisplays() { return null; }
    public android.view.accessibility.AccessibilityWindowInfo getWindow(int p0) { return null; }
    public void add(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public void clear() {}
    public android.view.accessibility.AccessibilityNodeInfo getFocus(int p0, long p1, int p2) { return null; }
    public boolean clearSubTree(android.view.accessibility.AccessibilityNodeInfo p0) { return false; }
    public void checkIntegrity() {}

    public static class AccessibilityNodeRefresher {
        public AccessibilityNodeRefresher() {}
        public boolean refreshNode(android.view.accessibility.AccessibilityNodeInfo p0, boolean p1) { return false; }
        public boolean refreshWindow(android.view.accessibility.AccessibilityWindowInfo p0) { return false; }
    }
}
