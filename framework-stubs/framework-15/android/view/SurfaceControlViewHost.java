package android.view;

public class SurfaceControlViewHost {
    public SurfaceControlViewHost(android.content.Context p0, android.view.Display p1, android.view.WindowlessWindowManager p2, java.lang.String p3) {}
    public SurfaceControlViewHost(android.content.Context p0, android.view.Display p1, android.os.IBinder p2) {}
    @android.annotation.FlaggedApi("com.android.window.flags.surface_control_input_receiver")
    public SurfaceControlViewHost(android.content.Context p0, android.view.Display p1, android.window.InputTransferToken p2) {}
    public SurfaceControlViewHost(android.content.Context p0, android.view.Display p1, android.window.InputTransferToken p2, java.lang.String p3) {}
    protected void finalize() throws java.lang.Throwable {}
    @android.annotation.Nullable
    public android.view.SurfaceControlViewHost.SurfacePackage getSurfacePackage() { return null; }
    @android.annotation.NonNull
    public android.view.AttachedSurfaceControl getRootSurfaceControl() { return null; }
    public void setView(android.view.View p0, int p1, int p2) {}
    public void setView(android.view.View p0, android.view.WindowManager.LayoutParams p1) {}
    @android.annotation.Nullable
    public android.view.View getView() { return null; }
    public android.view.IWindow getWindowToken() { return null; }
    @android.annotation.NonNull
    public android.view.WindowlessWindowManager getWindowlessWM() { return null; }
    public void relayout(android.view.WindowManager.LayoutParams p0, android.view.WindowlessWindowManager.ResizeCompleteCallback p1) {}
    public void relayout(android.view.WindowManager.LayoutParams p0) {}
    public void relayout(int p0, int p1) {}
    public void release() {}
    public android.window.InputTransferToken getInputTransferToken() { return null; }
    @java.lang.Deprecated
    public boolean transferTouchGestureToHost() { return false; }

    private final class ISurfaceControlViewHostImpl extends android.view.ISurfaceControlViewHost.Stub {
        public void onConfigurationChanged(android.content.res.Configuration p0) {}
        public void onDispatchDetachedFromWindow() {}
        public void onInsetsChanged(android.view.InsetsState p0, android.graphics.Rect p1) {}
        public android.window.ISurfaceSyncGroup getSurfaceSyncGroup() { return null; }
        public void attachParentInterface(android.view.ISurfaceControlViewHostParent p0) {}
    }

    public static final class SurfacePackage implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.view.SurfaceControlViewHost.SurfacePackage> CREATOR = null;
        SurfacePackage(android.view.SurfaceControl p0, android.view.accessibility.IAccessibilityEmbeddedConnection p1, android.window.InputTransferToken p2, android.view.ISurfaceControlViewHost p3) {}
        public SurfacePackage(android.view.SurfaceControlViewHost.SurfacePackage p0) {}
        @android.annotation.NonNull
        public android.view.SurfaceControl getSurfaceControl() { return null; }
        public android.view.accessibility.IAccessibilityEmbeddedConnection getAccessibilityEmbeddedConnection() { return null; }
        @android.annotation.NonNull
        public android.view.ISurfaceControlViewHost getRemoteInterface() { return null; }
        public void notifyConfigurationChanged(android.content.res.Configuration p0) {}
        public void notifyDetachedFromWindow() {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void release() {}
        @android.annotation.Nullable
        @android.annotation.FlaggedApi("com.android.window.flags.surface_control_input_receiver")
        public android.window.InputTransferToken getInputTransferToken() { return null; }
        public java.lang.String toString() { return null; }
    }
}
