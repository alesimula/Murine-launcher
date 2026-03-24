package android.view.accessibility;

public final class AccessibilityNodeIdManager {
    private android.view.accessibility.WeakSparseArray<android.view.View> mIdsToViews;
    private static android.view.accessibility.AccessibilityNodeIdManager sIdManager;
    public static synchronized android.view.accessibility.AccessibilityNodeIdManager getInstance() { return null; }
    private AccessibilityNodeIdManager() {}
    public void registerViewWithId(android.view.View p0, int p1) {}
    public void unregisterViewWithId(int p0) {}
    public android.view.View findView(int p0) { return null; }
}
