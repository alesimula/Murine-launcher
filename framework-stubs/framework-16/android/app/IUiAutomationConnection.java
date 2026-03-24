package android.app;

public interface IUiAutomationConnection extends android.os.IInterface {
    public void connect(android.accessibilityservice.IAccessibilityServiceClient p0, int p1) throws android.os.RemoteException;
    public void disconnect() throws android.os.RemoteException;
    public boolean injectInputEvent(android.view.InputEvent p0, boolean p1, boolean p2) throws android.os.RemoteException;
    public void injectInputEventToInputFilter(android.view.InputEvent p0) throws android.os.RemoteException;
    public void syncInputTransactions(boolean p0) throws android.os.RemoteException;
    public boolean setRotation(int p0) throws android.os.RemoteException;
    public boolean takeScreenshot(android.graphics.Rect p0, android.window.ScreenCapture.ScreenCaptureListener p1, int p2) throws android.os.RemoteException;
    public boolean takeSurfaceControlScreenshot(android.view.SurfaceControl p0, android.window.ScreenCapture.ScreenCaptureListener p1) throws android.os.RemoteException;
    public boolean clearWindowContentFrameStats(int p0) throws android.os.RemoteException;
    public android.view.WindowContentFrameStats getWindowContentFrameStats(int p0) throws android.os.RemoteException;
    public void clearWindowAnimationFrameStats() throws android.os.RemoteException;
    public android.view.WindowAnimationFrameStats getWindowAnimationFrameStats() throws android.os.RemoteException;
    public void executeShellCommand(java.lang.String p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2) throws android.os.RemoteException;
    public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void adoptShellPermissionIdentity(int p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void dropShellPermissionIdentity() throws android.os.RemoteException;
    public void shutdown() throws android.os.RemoteException;
    public void executeShellCommandWithStderr(java.lang.String p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException;
    public void executeShellCommandArrayWithStderr(java.lang.String[] p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAdoptedShellPermissions() throws android.os.RemoteException;
    public void addOverridePermissionState(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void removeOverridePermissionState(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void clearOverridePermissionStates(int p0) throws android.os.RemoteException;
    public void clearAllOverridePermissionStates() throws android.os.RemoteException;

    public static class Default implements android.app.IUiAutomationConnection {
        public Default() {}
        public void connect(android.accessibilityservice.IAccessibilityServiceClient p0, int p1) throws android.os.RemoteException {}
        public void disconnect() throws android.os.RemoteException {}
        public boolean injectInputEvent(android.view.InputEvent p0, boolean p1, boolean p2) throws android.os.RemoteException { return false; }
        public void injectInputEventToInputFilter(android.view.InputEvent p0) throws android.os.RemoteException {}
        public void syncInputTransactions(boolean p0) throws android.os.RemoteException {}
        public boolean setRotation(int p0) throws android.os.RemoteException { return false; }
        public boolean takeScreenshot(android.graphics.Rect p0, android.window.ScreenCapture.ScreenCaptureListener p1, int p2) throws android.os.RemoteException { return false; }
        public boolean takeSurfaceControlScreenshot(android.view.SurfaceControl p0, android.window.ScreenCapture.ScreenCaptureListener p1) throws android.os.RemoteException { return false; }
        public boolean clearWindowContentFrameStats(int p0) throws android.os.RemoteException { return false; }
        public android.view.WindowContentFrameStats getWindowContentFrameStats(int p0) throws android.os.RemoteException { return null; }
        public void clearWindowAnimationFrameStats() throws android.os.RemoteException {}
        public android.view.WindowAnimationFrameStats getWindowAnimationFrameStats() throws android.os.RemoteException { return null; }
        public void executeShellCommand(java.lang.String p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2) throws android.os.RemoteException {}
        public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void adoptShellPermissionIdentity(int p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void dropShellPermissionIdentity() throws android.os.RemoteException {}
        public void shutdown() throws android.os.RemoteException {}
        public void executeShellCommandWithStderr(java.lang.String p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException {}
        public void executeShellCommandArrayWithStderr(java.lang.String[] p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getAdoptedShellPermissions() throws android.os.RemoteException { return null; }
        public void addOverridePermissionState(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void removeOverridePermissionState(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void clearOverridePermissionStates(int p0) throws android.os.RemoteException {}
        public void clearAllOverridePermissionStates() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IUiAutomationConnection {
        public static final java.lang.String DESCRIPTOR = "android.app.IUiAutomationConnection";
        static final int TRANSACTION_connect = 1;
        static final int TRANSACTION_disconnect = 2;
        static final int TRANSACTION_injectInputEvent = 3;
        static final int TRANSACTION_injectInputEventToInputFilter = 4;
        static final int TRANSACTION_syncInputTransactions = 5;
        static final int TRANSACTION_setRotation = 6;
        static final int TRANSACTION_takeScreenshot = 7;
        static final int TRANSACTION_takeSurfaceControlScreenshot = 8;
        static final int TRANSACTION_clearWindowContentFrameStats = 9;
        static final int TRANSACTION_getWindowContentFrameStats = 10;
        static final int TRANSACTION_clearWindowAnimationFrameStats = 11;
        static final int TRANSACTION_getWindowAnimationFrameStats = 12;
        static final int TRANSACTION_executeShellCommand = 13;
        static final int TRANSACTION_grantRuntimePermission = 14;
        static final int TRANSACTION_revokeRuntimePermission = 15;
        static final int TRANSACTION_adoptShellPermissionIdentity = 16;
        static final int TRANSACTION_dropShellPermissionIdentity = 17;
        static final int TRANSACTION_shutdown = 18;
        static final int TRANSACTION_executeShellCommandWithStderr = 19;
        static final int TRANSACTION_executeShellCommandArrayWithStderr = 20;
        static final int TRANSACTION_getAdoptedShellPermissions = 21;
        static final int TRANSACTION_addOverridePermissionState = 22;
        static final int TRANSACTION_removeOverridePermissionState = 23;
        static final int TRANSACTION_clearOverridePermissionStates = 24;
        static final int TRANSACTION_clearAllOverridePermissionStates = 25;
        public Stub() { super(); }
        public static android.app.IUiAutomationConnection asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.IUiAutomationConnection {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void connect(android.accessibilityservice.IAccessibilityServiceClient p0, int p1) throws android.os.RemoteException {}
            public void disconnect() throws android.os.RemoteException {}
            public boolean injectInputEvent(android.view.InputEvent p0, boolean p1, boolean p2) throws android.os.RemoteException { return false; }
            public void injectInputEventToInputFilter(android.view.InputEvent p0) throws android.os.RemoteException {}
            public void syncInputTransactions(boolean p0) throws android.os.RemoteException {}
            public boolean setRotation(int p0) throws android.os.RemoteException { return false; }
            public boolean takeScreenshot(android.graphics.Rect p0, android.window.ScreenCapture.ScreenCaptureListener p1, int p2) throws android.os.RemoteException { return false; }
            public boolean takeSurfaceControlScreenshot(android.view.SurfaceControl p0, android.window.ScreenCapture.ScreenCaptureListener p1) throws android.os.RemoteException { return false; }
            public boolean clearWindowContentFrameStats(int p0) throws android.os.RemoteException { return false; }
            public android.view.WindowContentFrameStats getWindowContentFrameStats(int p0) throws android.os.RemoteException { return null; }
            public void clearWindowAnimationFrameStats() throws android.os.RemoteException {}
            public android.view.WindowAnimationFrameStats getWindowAnimationFrameStats() throws android.os.RemoteException { return null; }
            public void executeShellCommand(java.lang.String p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2) throws android.os.RemoteException {}
            public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void adoptShellPermissionIdentity(int p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void dropShellPermissionIdentity() throws android.os.RemoteException {}
            public void shutdown() throws android.os.RemoteException {}
            public void executeShellCommandWithStderr(java.lang.String p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException {}
            public void executeShellCommandArrayWithStderr(java.lang.String[] p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getAdoptedShellPermissions() throws android.os.RemoteException { return null; }
            public void addOverridePermissionState(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void removeOverridePermissionState(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void clearOverridePermissionStates(int p0) throws android.os.RemoteException {}
            public void clearAllOverridePermissionStates() throws android.os.RemoteException {}
        }
    }
}
