package android.view;

class GestureExclusionTracker {
    private boolean mGestureExclusionViewsChanged;
    private boolean mRootGestureExclusionRectsChanged;
    private java.util.List<android.graphics.Rect> mRootGestureExclusionRects;
    private java.util.List<android.view.GestureExclusionTracker.GestureExclusionViewInfo> mGestureExclusionViewInfos;
    private java.util.List<android.graphics.Rect> mGestureExclusionRects;
    GestureExclusionTracker() {}
    public void updateRectsForView(android.view.View p0) {}
    public java.util.List<android.graphics.Rect> computeChangedRects() { return null; }
    public void setRootSystemGestureExclusionRects(java.util.List<android.graphics.Rect> p0) {}
    public java.util.List<android.graphics.Rect> getRootSystemGestureExclusionRects() { return null; }

    private static class GestureExclusionViewInfo {
        public static final int CHANGED = 0;
        public static final int UNCHANGED = 1;
        public static final int GONE = 2;
        private final java.lang.ref.WeakReference<android.view.View> mView = null;
        boolean mDirty;
        java.util.List<android.graphics.Rect> mExclusionRects;
        GestureExclusionViewInfo(android.view.View p0) {}
        public android.view.View getView() { return null; }
        public int update() { return 0; }
    }
}
