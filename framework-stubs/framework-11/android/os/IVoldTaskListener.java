package android.os;

public interface IVoldTaskListener extends android.os.IInterface {
    public void onStatus(int p0, android.os.PersistableBundle p1) throws android.os.RemoteException;
    public void onFinished(int p0, android.os.PersistableBundle p1) throws android.os.RemoteException;

    public static class Default implements android.os.IVoldTaskListener {
        public Default() {}
        public void onStatus(int p0, android.os.PersistableBundle p1) throws android.os.RemoteException {}
        public void onFinished(int p0, android.os.PersistableBundle p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IVoldTaskListener {
        private static final java.lang.String DESCRIPTOR = "android.os.IVoldTaskListener";
        static final int TRANSACTION_onStatus = 1;
        static final int TRANSACTION_onFinished = 2;
        public Stub() { super(); }
        public static android.os.IVoldTaskListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IVoldTaskListener p0) { return false; }
        public static android.os.IVoldTaskListener getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IVoldTaskListener {
            private android.os.IBinder mRemote;
            public static android.os.IVoldTaskListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStatus(int p0, android.os.PersistableBundle p1) throws android.os.RemoteException {}
            public void onFinished(int p0, android.os.PersistableBundle p1) throws android.os.RemoteException {}
        }
    }
}
