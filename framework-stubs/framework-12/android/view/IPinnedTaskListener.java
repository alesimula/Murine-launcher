package android.view;

public interface IPinnedTaskListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.IPinnedTaskListener";
    public void onMovementBoundsChanged(boolean p0) throws android.os.RemoteException;
    public void onImeVisibilityChanged(boolean p0, int p1) throws android.os.RemoteException;
    public void onActionsChanged(android.content.pm.ParceledListSlice<android.app.RemoteAction> p0) throws android.os.RemoteException;
    public void onActivityHidden(android.content.ComponentName p0) throws android.os.RemoteException;
    public void onAspectRatioChanged(float p0) throws android.os.RemoteException;

    public static class Default implements android.view.IPinnedTaskListener {
        public Default() {}
        public void onMovementBoundsChanged(boolean p0) throws android.os.RemoteException {}
        public void onImeVisibilityChanged(boolean p0, int p1) throws android.os.RemoteException {}
        public void onActionsChanged(android.content.pm.ParceledListSlice<android.app.RemoteAction> p0) throws android.os.RemoteException {}
        public void onActivityHidden(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void onAspectRatioChanged(float p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IPinnedTaskListener {
        static final int TRANSACTION_onMovementBoundsChanged = 1;
        static final int TRANSACTION_onImeVisibilityChanged = 2;
        static final int TRANSACTION_onActionsChanged = 3;
        static final int TRANSACTION_onActivityHidden = 4;
        static final int TRANSACTION_onAspectRatioChanged = 5;
        public Stub() { super(); }
        public static android.view.IPinnedTaskListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.IPinnedTaskListener p0) { return false; }
        public static android.view.IPinnedTaskListener getDefaultImpl() { return null; }

        private static class Proxy implements android.view.IPinnedTaskListener {
            private android.os.IBinder mRemote;
            public static android.view.IPinnedTaskListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onMovementBoundsChanged(boolean p0) throws android.os.RemoteException {}
            public void onImeVisibilityChanged(boolean p0, int p1) throws android.os.RemoteException {}
            public void onActionsChanged(android.content.pm.ParceledListSlice<android.app.RemoteAction> p0) throws android.os.RemoteException {}
            public void onActivityHidden(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void onAspectRatioChanged(float p0) throws android.os.RemoteException {}
        }
    }
}
