package android.view;

public interface IPinnedStackListener extends android.os.IInterface {
    public void onListenerRegistered(android.view.IPinnedStackController p0) throws android.os.RemoteException;
    public void onMovementBoundsChanged(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, boolean p3, boolean p4, int p5) throws android.os.RemoteException;
    public void onImeVisibilityChanged(boolean p0, int p1) throws android.os.RemoteException;
    public void onShelfVisibilityChanged(boolean p0, int p1) throws android.os.RemoteException;
    public void onMinimizedStateChanged(boolean p0) throws android.os.RemoteException;
    public void onActionsChanged(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.view.IPinnedStackListener {
        private static final java.lang.String DESCRIPTOR = "android.view.IPinnedStackListener";
        static final int TRANSACTION_onListenerRegistered = 1;
        static final int TRANSACTION_onMovementBoundsChanged = 2;
        static final int TRANSACTION_onImeVisibilityChanged = 3;
        static final int TRANSACTION_onShelfVisibilityChanged = 4;
        static final int TRANSACTION_onMinimizedStateChanged = 5;
        static final int TRANSACTION_onActionsChanged = 6;
        public Stub() { super(); }
        public static android.view.IPinnedStackListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.IPinnedStackListener p0) { return false; }
        public static android.view.IPinnedStackListener getDefaultImpl() { return null; }

        private static class Proxy implements android.view.IPinnedStackListener {
            private android.os.IBinder mRemote;
            public static android.view.IPinnedStackListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onListenerRegistered(android.view.IPinnedStackController p0) throws android.os.RemoteException {}
            public void onMovementBoundsChanged(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, boolean p3, boolean p4, int p5) throws android.os.RemoteException {}
            public void onImeVisibilityChanged(boolean p0, int p1) throws android.os.RemoteException {}
            public void onShelfVisibilityChanged(boolean p0, int p1) throws android.os.RemoteException {}
            public void onMinimizedStateChanged(boolean p0) throws android.os.RemoteException {}
            public void onActionsChanged(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.view.IPinnedStackListener {
        public Default() {}
        public void onListenerRegistered(android.view.IPinnedStackController p0) throws android.os.RemoteException {}
        public void onMovementBoundsChanged(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, boolean p3, boolean p4, int p5) throws android.os.RemoteException {}
        public void onImeVisibilityChanged(boolean p0, int p1) throws android.os.RemoteException {}
        public void onShelfVisibilityChanged(boolean p0, int p1) throws android.os.RemoteException {}
        public void onMinimizedStateChanged(boolean p0) throws android.os.RemoteException {}
        public void onActionsChanged(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
