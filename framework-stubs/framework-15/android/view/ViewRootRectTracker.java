package android.view;

class ViewRootRectTracker {
    ViewRootRectTracker(java.util.function.Function<android.view.View, java.util.List<android.graphics.Rect>> p0) {}
    public void updateRectsForView(android.view.View p0) {}
    @android.annotation.Nullable
    public java.util.List<android.graphics.Rect> computeChangedRects() { return null; }
    public boolean computeChanges() { return false; }
    @android.annotation.NonNull
    public java.util.List<android.graphics.Rect> getLastComputedRects() { return null; }
    public void setRootRects(java.util.List<android.graphics.Rect> p0) {}
    @android.annotation.NonNull
    public java.util.List<android.graphics.Rect> getRootRects() { return null; }

    private class ViewInfo {
        public static final int CHANGED = 0;
        public static final int UNCHANGED = 1;
        public static final int GONE = 2;
        boolean mDirty;
        java.util.List<android.graphics.Rect> mRects;
        ViewInfo(android.view.ViewRootRectTracker p0, android.view.View p1) {}
        public android.view.View getView() { return null; }
        public int update() { return 0; }
    }
}
