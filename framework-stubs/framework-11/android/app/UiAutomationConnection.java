package android.app;

public final class UiAutomationConnection extends android.app.IUiAutomationConnection.Stub {
    private static final java.lang.String TAG = "UiAutomationConnection";
    private static final int INITIAL_FROZEN_ROTATION_UNSPECIFIED = -1;
    private final android.view.IWindowManager mWindowManager = null;
    private final android.view.accessibility.IAccessibilityManager mAccessibilityManager = null;
    private final android.permission.IPermissionManager mPermissionManager = null;
    private final android.app.IActivityManager mActivityManager = null;
    private final java.lang.Object mLock = null;
    private final android.os.Binder mToken = null;
    private int mInitialFrozenRotation;
    private android.accessibilityservice.IAccessibilityServiceClient mClient;
    private boolean mIsShutdown;
    private int mOwningUid;
    public UiAutomationConnection() { super(); }
    public void connect(android.accessibilityservice.IAccessibilityServiceClient p0, int p1) {}
    public void disconnect() {}
    public boolean injectInputEvent(android.view.InputEvent p0, boolean p1) { return false; }
    public void syncInputTransactions() {}
    public boolean setRotation(int p0) { return false; }
    public android.graphics.Bitmap takeScreenshot(android.graphics.Rect p0, int p1) { return null; }
    public boolean clearWindowContentFrameStats(int p0) throws android.os.RemoteException { return false; }
    public android.view.WindowContentFrameStats getWindowContentFrameStats(int p0) throws android.os.RemoteException { return null; }
    public void clearWindowAnimationFrameStats() {}
    public android.view.WindowAnimationFrameStats getWindowAnimationFrameStats() { return null; }
    public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
    public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
    public void adoptShellPermissionIdentity(int p0, java.lang.String[] p1) throws android.os.RemoteException {}
    public void dropShellPermissionIdentity() throws android.os.RemoteException {}
    public void executeShellCommand(java.lang.String p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2) throws android.os.RemoteException {}
    public void shutdown() {}
    private void registerUiTestAutomationServiceLocked(android.accessibilityservice.IAccessibilityServiceClient p0, int p1) {}
    private void unregisterUiTestAutomationServiceLocked() {}
    private void storeRotationStateLocked() {}
    private void restoreRotationStateLocked() {}
    private boolean isConnectedLocked() { return false; }
    private void throwIfShutdownLocked() {}
    private void throwIfNotConnectedLocked() {}
    private void throwIfCalledByNotTrustedUidLocked() {}

    public class Repeater implements java.lang.Runnable {
        private final java.io.InputStream readFrom = null;
        private final java.io.OutputStream writeTo = null;
        public Repeater(android.app.UiAutomationConnection p0, java.io.InputStream p1, java.io.OutputStream p2) {}
        public void run() {}
    }
}
