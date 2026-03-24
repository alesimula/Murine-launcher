package android.os;

public interface IDumpstate extends android.os.IInterface {
    public static final int BUGREPORT_MODE_FULL = 0;
    public static final int BUGREPORT_MODE_INTERACTIVE = 1;
    public static final int BUGREPORT_MODE_REMOTE = 2;
    public static final int BUGREPORT_MODE_WEAR = 3;
    public static final int BUGREPORT_MODE_TELEPHONY = 4;
    public static final int BUGREPORT_MODE_WIFI = 5;
    public static final int BUGREPORT_MODE_DEFAULT = 6;
    public void startBugreport(int p0, java.lang.String p1, java.io.FileDescriptor p2, java.io.FileDescriptor p3, int p4, android.os.IDumpstateListener p5, boolean p6) throws android.os.RemoteException;
    public void cancelBugreport() throws android.os.RemoteException;

    public static class Default implements android.os.IDumpstate {
        public Default() {}
        public void startBugreport(int p0, java.lang.String p1, java.io.FileDescriptor p2, java.io.FileDescriptor p3, int p4, android.os.IDumpstateListener p5, boolean p6) throws android.os.RemoteException {}
        public void cancelBugreport() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IDumpstate {
        private static final java.lang.String DESCRIPTOR = "android.os.IDumpstate";
        static final int TRANSACTION_startBugreport = 1;
        static final int TRANSACTION_cancelBugreport = 2;
        public Stub() { super(); }
        public static android.os.IDumpstate asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IDumpstate p0) { return false; }
        public static android.os.IDumpstate getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IDumpstate {
            private android.os.IBinder mRemote;
            public static android.os.IDumpstate sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void startBugreport(int p0, java.lang.String p1, java.io.FileDescriptor p2, java.io.FileDescriptor p3, int p4, android.os.IDumpstateListener p5, boolean p6) throws android.os.RemoteException {}
            public void cancelBugreport() throws android.os.RemoteException {}
        }
    }
}
