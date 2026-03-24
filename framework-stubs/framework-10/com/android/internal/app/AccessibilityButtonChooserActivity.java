package com.android.internal.app;

public class AccessibilityButtonChooserActivity extends android.app.Activity {
    private static final java.lang.String MAGNIFICATION_COMPONENT_ID = "com.android.server.accessibility.MagnificationController";
    private com.android.internal.app.AccessibilityButtonChooserActivity.AccessibilityButtonTarget mMagnificationTarget;
    private java.util.List<com.android.internal.app.AccessibilityButtonChooserActivity.AccessibilityButtonTarget> mTargets;
    public AccessibilityButtonChooserActivity() { super(); }
    protected void onCreate(android.os.Bundle p0) {}
    private boolean isGestureNavigateEnabled() { return false; }
    private boolean isTouchExploreOn() { return false; }
    private static java.util.List<com.android.internal.app.AccessibilityButtonChooserActivity.AccessibilityButtonTarget> getServiceAccessibilityButtonTargets(android.content.Context p0) { return null; }
    private void onTargetSelected(com.android.internal.app.AccessibilityButtonChooserActivity.AccessibilityButtonTarget p0) {}

    private class TargetAdapter extends android.widget.BaseAdapter {
        private TargetAdapter(com.android.internal.app.AccessibilityButtonChooserActivity p0) { super(); }
        public int getCount() { return 0; }
        public java.lang.Object getItem(int p0) { return null; }
        public long getItemId(int p0) { return 0L; }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    }

    private static class AccessibilityButtonTarget {
        public java.lang.String mId;
        public java.lang.CharSequence mLabel;
        public android.graphics.drawable.Drawable mDrawable;
        public AccessibilityButtonTarget(android.content.Context p0, android.accessibilityservice.AccessibilityServiceInfo p1) {}
        public AccessibilityButtonTarget(android.content.Context p0, java.lang.String p1, int p2, int p3) {}
        public java.lang.String getId() { return null; }
        public java.lang.CharSequence getLabel() { return null; }
        public android.graphics.drawable.Drawable getDrawable() { return null; }
    }
}
