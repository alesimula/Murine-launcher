package android.widget.inline;

public class InlineContentView extends android.view.ViewGroup {
    public InlineContentView(android.content.Context p0) { super((android.content.Context)null); }
    public InlineContentView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public InlineContentView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    @android.annotation.Nullable
    public android.view.SurfaceControl getSurfaceControl() { return null; }
    public void setClipBounds(android.graphics.Rect p0) {}
    public InlineContentView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public void setChildSurfacePackageUpdater(android.widget.inline.InlineContentView.SurfacePackageUpdater p0) {}
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    public void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void setSurfaceControlCallback(android.widget.inline.InlineContentView.SurfaceControlCallback p0) {}
    public boolean isZOrderedOnTop() { return false; }
    public boolean setZOrderedOnTop(boolean p0) { return false; }

    public static interface SurfaceControlCallback {
        public void onCreated(android.view.SurfaceControl p0);
        public void onDestroyed(android.view.SurfaceControl p0);
    }

    public static interface SurfacePackageUpdater {
        public void onSurfacePackageReleased();
        public void getSurfacePackage(java.util.function.Consumer<android.view.SurfaceControlViewHost.SurfacePackage> p0);
    }
}
