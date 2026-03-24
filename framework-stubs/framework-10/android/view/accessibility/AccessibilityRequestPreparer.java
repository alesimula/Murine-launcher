package android.view.accessibility;

public abstract class AccessibilityRequestPreparer {
    public static final int REQUEST_TYPE_EXTRA_DATA = 1;
    private final java.lang.ref.WeakReference<android.view.View> mViewRef = null;
    private final int mAccessibilityViewId = 0;
    private final int mRequestTypes = 0;
    public AccessibilityRequestPreparer(android.view.View p0, int p1) {}
    public abstract void onPrepareExtraData(int p0, java.lang.String p1, android.os.Bundle p2, android.os.Message p3);
    public android.view.View getView() { return null; }
    int getAccessibilityViewId() { return 0; }

    private class ViewAttachStateListener implements android.view.View.OnAttachStateChangeListener {
        private ViewAttachStateListener(android.view.accessibility.AccessibilityRequestPreparer p0) {}
        public void onViewAttachedToWindow(android.view.View p0) {}
        public void onViewDetachedFromWindow(android.view.View p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequestTypes {
    }
}
