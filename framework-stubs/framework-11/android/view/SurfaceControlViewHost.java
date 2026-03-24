package android.view;

public class SurfaceControlViewHost {
    private final android.view.ViewRootImpl mViewRoot = null;
    private android.view.WindowlessWindowManager mWm;
    private android.view.SurfaceControl mSurfaceControl;
    private android.view.accessibility.IAccessibilityEmbeddedConnection mAccessibilityEmbeddedConnection;
    public SurfaceControlViewHost(android.content.Context p0, android.view.Display p1, android.view.WindowlessWindowManager p2) {}
    public SurfaceControlViewHost(android.content.Context p0, android.view.Display p1, android.view.WindowlessWindowManager p2, boolean p3) {}
    public SurfaceControlViewHost(android.content.Context p0, android.view.Display p1, android.os.IBinder p2) {}
    protected void finalize() throws java.lang.Throwable {}
    public android.view.SurfaceControlViewHost.SurfacePackage getSurfacePackage() { return null; }
    public void setView(android.view.View p0, android.view.WindowManager.LayoutParams p1) {}
    public void setView(android.view.View p0, int p1, int p2) {}
    public android.view.View getView() { return null; }
    public android.view.IWindow getWindowToken() { return null; }
    public android.view.WindowlessWindowManager getWindowlessWM() { return null; }
    public void relayout(android.view.WindowManager.LayoutParams p0) {}
    public void relayout(int p0, int p1) {}
    public void release() {}

    public static final class SurfacePackage implements android.os.Parcelable {
        private android.view.SurfaceControl mSurfaceControl;
        private final android.view.accessibility.IAccessibilityEmbeddedConnection mAccessibilityEmbeddedConnection = null;
        public static final android.os.Parcelable.Creator<android.view.SurfaceControlViewHost.SurfacePackage> CREATOR = null;
        SurfacePackage(android.view.SurfaceControl p0, android.view.accessibility.IAccessibilityEmbeddedConnection p1) {}
        private SurfacePackage(android.os.Parcel p0) {}
        public android.view.SurfaceControl getSurfaceControl() { return null; }
        public android.view.accessibility.IAccessibilityEmbeddedConnection getAccessibilityEmbeddedConnection() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void release() {}
    }
}
