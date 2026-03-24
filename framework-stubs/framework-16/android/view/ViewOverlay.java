package android.view;

public class ViewOverlay {
    android.view.ViewOverlay.OverlayViewGroup mOverlayViewGroup;
    ViewOverlay(android.content.Context p0, android.view.View p1) {}
    android.view.ViewGroup getOverlayView() { return null; }
    public void add(android.graphics.drawable.Drawable p0) {}
    public void remove(android.graphics.drawable.Drawable p0) {}
    public void clear() {}
    boolean isEmpty() { return false; }

    static class OverlayViewGroup extends android.view.ViewGroup {
        final android.view.View mHostView = null;
        java.util.ArrayList<android.graphics.drawable.Drawable> mDrawables;
        OverlayViewGroup(android.content.Context p0, android.view.View p1) { super((android.content.Context)null); }
        public void add(android.graphics.drawable.Drawable p0) {}
        public void remove(android.graphics.drawable.Drawable p0) {}
        protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }
        public void add(android.view.View p0) {}
        public void remove(android.view.View p0) {}
        public void clear() {}
        boolean isEmpty() { return false; }
        public void invalidateDrawable(android.graphics.drawable.Drawable p0) {}
        protected void dispatchDraw(android.graphics.Canvas p0) {}
        protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
        public void invalidate(android.graphics.Rect p0) {}
        public void invalidate(int p0, int p1, int p2, int p3) {}
        public void invalidate() {}
        public void invalidate(boolean p0) {}
        void invalidateViewProperty(boolean p0, boolean p1) {}
        protected void invalidateParentCaches() {}
        protected void invalidateParentIfNeeded() {}
        public void onDescendantInvalidated(android.view.View p0, android.view.View p1) {}
        public android.view.ViewParent invalidateChildInParent(int[] p0, android.graphics.Rect p1) { return null; }
        @android.annotation.FlaggedApi("android.view.flags.view_velocity_api")
        public float getFrameContentVelocity() { return 0.0f; }
    }
}
