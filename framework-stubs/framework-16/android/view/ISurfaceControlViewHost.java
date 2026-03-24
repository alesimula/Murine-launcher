package android.view;

public interface ISurfaceControlViewHost extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.ISurfaceControlViewHost";
    public void onConfigurationChanged(android.content.res.Configuration p0) throws android.os.RemoteException;
    public void onDispatchAttachedToWindow(android.window.InputTransferToken p0) throws android.os.RemoteException;
    public void onDispatchDetachedFromWindow() throws android.os.RemoteException;
    public void onInsetsChanged(android.view.InsetsState p0, android.graphics.Rect p1) throws android.os.RemoteException;
    public android.window.ISurfaceSyncGroup getSurfaceSyncGroup() throws android.os.RemoteException;
    public void attachParentInterface(android.view.ISurfaceControlViewHostParent p0) throws android.os.RemoteException;

    public static class Default implements android.view.ISurfaceControlViewHost {
        public Default() {}
        public void onConfigurationChanged(android.content.res.Configuration p0) throws android.os.RemoteException {}
        public void onDispatchAttachedToWindow(android.window.InputTransferToken p0) throws android.os.RemoteException {}
        public void onDispatchDetachedFromWindow() throws android.os.RemoteException {}
        public void onInsetsChanged(android.view.InsetsState p0, android.graphics.Rect p1) throws android.os.RemoteException {}
        public android.window.ISurfaceSyncGroup getSurfaceSyncGroup() throws android.os.RemoteException { return null; }
        public void attachParentInterface(android.view.ISurfaceControlViewHostParent p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.ISurfaceControlViewHost {
        static final int TRANSACTION_onConfigurationChanged = 1;
        static final int TRANSACTION_onDispatchAttachedToWindow = 2;
        static final int TRANSACTION_onDispatchDetachedFromWindow = 3;
        static final int TRANSACTION_onInsetsChanged = 4;
        static final int TRANSACTION_getSurfaceSyncGroup = 5;
        static final int TRANSACTION_attachParentInterface = 6;
        public Stub() { super(); }
        public static android.view.ISurfaceControlViewHost asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.view.ISurfaceControlViewHost {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onConfigurationChanged(android.content.res.Configuration p0) throws android.os.RemoteException {}
            public void onDispatchAttachedToWindow(android.window.InputTransferToken p0) throws android.os.RemoteException {}
            public void onDispatchDetachedFromWindow() throws android.os.RemoteException {}
            public void onInsetsChanged(android.view.InsetsState p0, android.graphics.Rect p1) throws android.os.RemoteException {}
            public android.window.ISurfaceSyncGroup getSurfaceSyncGroup() throws android.os.RemoteException { return null; }
            public void attachParentInterface(android.view.ISurfaceControlViewHostParent p0) throws android.os.RemoteException {}
        }
    }
}
