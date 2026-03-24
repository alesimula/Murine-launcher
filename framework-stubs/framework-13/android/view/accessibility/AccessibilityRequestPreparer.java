package android.view.accessibility;

public abstract class AccessibilityRequestPreparer {
    public static final int REQUEST_TYPE_EXTRA_DATA = 1;
    public AccessibilityRequestPreparer(android.view.View p0, int p1) {}
    public abstract void onPrepareExtraData(int p0, java.lang.String p1, android.os.Bundle p2, android.os.Message p3);
    public android.view.View getView() { return null; }
    int getAccessibilityViewId() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequestTypes {
    }

    private class ViewAttachStateListener implements android.view.View.OnAttachStateChangeListener {
        public void onViewAttachedToWindow(android.view.View p0) {}
        public void onViewDetachedFromWindow(android.view.View p0) {}
    }
}
