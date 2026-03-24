package android.view;

public interface IPinnedStackController extends android.os.IInterface {
    public void setIsMinimized(boolean p0) throws android.os.RemoteException;
    public void setMinEdgeSize(int p0) throws android.os.RemoteException;
    public int getDisplayRotation() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.view.IPinnedStackController {
        private static final java.lang.String DESCRIPTOR = "android.view.IPinnedStackController";
        static final int TRANSACTION_setIsMinimized = 1;
        static final int TRANSACTION_setMinEdgeSize = 2;
        static final int TRANSACTION_getDisplayRotation = 3;
        public Stub() { super(); }
        public static android.view.IPinnedStackController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.IPinnedStackController p0) { return false; }
        public static android.view.IPinnedStackController getDefaultImpl() { return null; }

        private static class Proxy implements android.view.IPinnedStackController {
            private android.os.IBinder mRemote;
            public static android.view.IPinnedStackController sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setIsMinimized(boolean p0) throws android.os.RemoteException {}
            public void setMinEdgeSize(int p0) throws android.os.RemoteException {}
            public int getDisplayRotation() throws android.os.RemoteException { return 0; }
        }
    }

    public static class Default implements android.view.IPinnedStackController {
        public Default() {}
        public void setIsMinimized(boolean p0) throws android.os.RemoteException {}
        public void setMinEdgeSize(int p0) throws android.os.RemoteException {}
        public int getDisplayRotation() throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }
}
