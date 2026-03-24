package android.view;

public interface ISurfaceControlViewHostParent extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.ISurfaceControlViewHostParent";
    public void updateParams(android.view.WindowManager.LayoutParams[] p0) throws android.os.RemoteException;
    public void forwardBackKeyToParent(android.view.KeyEvent p0) throws android.os.RemoteException;

    public static class Default implements android.view.ISurfaceControlViewHostParent {
        public Default() {}
        public void updateParams(android.view.WindowManager.LayoutParams[] p0) throws android.os.RemoteException {}
        public void forwardBackKeyToParent(android.view.KeyEvent p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.ISurfaceControlViewHostParent {
        static final int TRANSACTION_updateParams = 1;
        static final int TRANSACTION_forwardBackKeyToParent = 2;
        public Stub() { super(); }
        public static android.view.ISurfaceControlViewHostParent asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.view.ISurfaceControlViewHostParent {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void updateParams(android.view.WindowManager.LayoutParams[] p0) throws android.os.RemoteException {}
            public void forwardBackKeyToParent(android.view.KeyEvent p0) throws android.os.RemoteException {}
        }
    }
}
