package android.app;

public final class UiAutomationConnection extends android.app.IUiAutomationConnection.Stub {
    public UiAutomationConnection() { super(); }
    public void connect(android.accessibilityservice.IAccessibilityServiceClient p0, int p1) {}
    public void disconnect() {}
    public boolean injectInputEvent(android.view.InputEvent p0, boolean p1, boolean p2) { return false; }
    public void injectInputEventToInputFilter(android.view.InputEvent p0) throws android.os.RemoteException {}
    public void syncInputTransactions(boolean p0) {}
    public boolean setRotation(int p0) { return false; }
    public boolean takeScreenshot(android.graphics.Rect p0, android.window.ScreenCapture.ScreenCaptureListener p1) { return false; }
    @android.annotation.Nullable
    public boolean takeSurfaceControlScreenshot(android.view.SurfaceControl p0, android.window.ScreenCapture.ScreenCaptureListener p1) { return false; }
    public boolean clearWindowContentFrameStats(int p0) throws android.os.RemoteException { return false; }
    public android.view.WindowContentFrameStats getWindowContentFrameStats(int p0) throws android.os.RemoteException { return null; }
    public void clearWindowAnimationFrameStats() {}
    public android.view.WindowAnimationFrameStats getWindowAnimationFrameStats() { return null; }
    public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
    public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
    public void adoptShellPermissionIdentity(int p0, java.lang.String[] p1) throws android.os.RemoteException {}
    public void dropShellPermissionIdentity() throws android.os.RemoteException {}
    @android.annotation.Nullable
    public java.util.List<java.lang.String> getAdoptedShellPermissions() throws android.os.RemoteException { return null; }
    public void addOverridePermissionState(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
    public void removeOverridePermissionState(int p0, java.lang.String p1) throws android.os.RemoteException {}
    public void clearOverridePermissionStates(int p0) throws android.os.RemoteException {}
    public void clearAllOverridePermissionStates() throws android.os.RemoteException {}
    public void executeShellCommand(java.lang.String p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2) throws android.os.RemoteException {}
    public void executeShellCommandWithStderr(java.lang.String p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException {}
    public void shutdown() {}

    public class Repeater implements java.lang.Runnable {
        public Repeater(android.app.UiAutomationConnection p0, java.io.InputStream p1, java.io.OutputStream p2) {}
        public void run() {}
    }
}
