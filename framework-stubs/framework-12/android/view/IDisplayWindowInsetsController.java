package android.view;

public interface IDisplayWindowInsetsController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.IDisplayWindowInsetsController";
    public void topFocusedWindowChanged(java.lang.String p0) throws android.os.RemoteException;
    public void insetsChanged(android.view.InsetsState p0) throws android.os.RemoteException;
    public void insetsControlChanged(android.view.InsetsState p0, android.view.InsetsSourceControl[] p1) throws android.os.RemoteException;
    public void showInsets(int p0, boolean p1) throws android.os.RemoteException;
    public void hideInsets(int p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.view.IDisplayWindowInsetsController {
        public Default() {}
        public void topFocusedWindowChanged(java.lang.String p0) throws android.os.RemoteException {}
        public void insetsChanged(android.view.InsetsState p0) throws android.os.RemoteException {}
        public void insetsControlChanged(android.view.InsetsState p0, android.view.InsetsSourceControl[] p1) throws android.os.RemoteException {}
        public void showInsets(int p0, boolean p1) throws android.os.RemoteException {}
        public void hideInsets(int p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IDisplayWindowInsetsController {
        static final int TRANSACTION_topFocusedWindowChanged = 1;
        static final int TRANSACTION_insetsChanged = 2;
        static final int TRANSACTION_insetsControlChanged = 3;
        static final int TRANSACTION_showInsets = 4;
        static final int TRANSACTION_hideInsets = 5;
        public Stub() { super(); }
        public static android.view.IDisplayWindowInsetsController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.IDisplayWindowInsetsController p0) { return false; }
        public static android.view.IDisplayWindowInsetsController getDefaultImpl() { return null; }

        private static class Proxy implements android.view.IDisplayWindowInsetsController {
            private android.os.IBinder mRemote;
            public static android.view.IDisplayWindowInsetsController sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void topFocusedWindowChanged(java.lang.String p0) throws android.os.RemoteException {}
            public void insetsChanged(android.view.InsetsState p0) throws android.os.RemoteException {}
            public void insetsControlChanged(android.view.InsetsState p0, android.view.InsetsSourceControl[] p1) throws android.os.RemoteException {}
            public void showInsets(int p0, boolean p1) throws android.os.RemoteException {}
            public void hideInsets(int p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}
