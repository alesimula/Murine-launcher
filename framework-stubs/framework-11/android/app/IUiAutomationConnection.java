package android.app;

public interface IUiAutomationConnection extends android.os.IInterface {
    public void connect(android.accessibilityservice.IAccessibilityServiceClient p0, int p1) throws android.os.RemoteException;
    public void disconnect() throws android.os.RemoteException;
    public boolean injectInputEvent(android.view.InputEvent p0, boolean p1) throws android.os.RemoteException;
    public void syncInputTransactions() throws android.os.RemoteException;
    public boolean setRotation(int p0) throws android.os.RemoteException;
    public android.graphics.Bitmap takeScreenshot(android.graphics.Rect p0, int p1) throws android.os.RemoteException;
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

    public static class Default implements android.app.IUiAutomationConnection {
        public Default() {}
        public void connect(android.accessibilityservice.IAccessibilityServiceClient p0, int p1) throws android.os.RemoteException {}
        public void disconnect() throws android.os.RemoteException {}
        public boolean injectInputEvent(android.view.InputEvent p0, boolean p1) throws android.os.RemoteException { return false; }
        public void syncInputTransactions() throws android.os.RemoteException {}
        public boolean setRotation(int p0) throws android.os.RemoteException { return false; }
        public android.graphics.Bitmap takeScreenshot(android.graphics.Rect p0, int p1) throws android.os.RemoteException { return null; }
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
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IUiAutomationConnection {
        private static final java.lang.String DESCRIPTOR = "android.app.IUiAutomationConnection";
        static final int TRANSACTION_connect = 1;
        static final int TRANSACTION_disconnect = 2;
        static final int TRANSACTION_injectInputEvent = 3;
        static final int TRANSACTION_syncInputTransactions = 4;
        static final int TRANSACTION_setRotation = 5;
        static final int TRANSACTION_takeScreenshot = 6;
        static final int TRANSACTION_clearWindowContentFrameStats = 7;
        static final int TRANSACTION_getWindowContentFrameStats = 8;
        static final int TRANSACTION_clearWindowAnimationFrameStats = 9;
        static final int TRANSACTION_getWindowAnimationFrameStats = 10;
        static final int TRANSACTION_executeShellCommand = 11;
        static final int TRANSACTION_grantRuntimePermission = 12;
        static final int TRANSACTION_revokeRuntimePermission = 13;
        static final int TRANSACTION_adoptShellPermissionIdentity = 14;
        static final int TRANSACTION_dropShellPermissionIdentity = 15;
        static final int TRANSACTION_shutdown = 16;
        public Stub() { super(); }
        public static android.app.IUiAutomationConnection asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.IUiAutomationConnection p0) { return false; }
        public static android.app.IUiAutomationConnection getDefaultImpl() { return null; }

        private static class Proxy implements android.app.IUiAutomationConnection {
            private android.os.IBinder mRemote;
            public static android.app.IUiAutomationConnection sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void connect(android.accessibilityservice.IAccessibilityServiceClient p0, int p1) throws android.os.RemoteException {}
            public void disconnect() throws android.os.RemoteException {}
            public boolean injectInputEvent(android.view.InputEvent p0, boolean p1) throws android.os.RemoteException { return false; }
            public void syncInputTransactions() throws android.os.RemoteException {}
            public boolean setRotation(int p0) throws android.os.RemoteException { return false; }
            public android.graphics.Bitmap takeScreenshot(android.graphics.Rect p0, int p1) throws android.os.RemoteException { return null; }
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
        }
    }
}
