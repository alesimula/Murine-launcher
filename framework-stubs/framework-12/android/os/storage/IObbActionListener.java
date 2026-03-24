package android.os.storage;

public interface IObbActionListener extends android.os.IInterface {
    public void onObbResult(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.os.storage.IObbActionListener {
        public Default() {}
        public void onObbResult(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.storage.IObbActionListener {
        public static final java.lang.String DESCRIPTOR = "android.os.storage.IObbActionListener";
        static final int TRANSACTION_onObbResult = 1;
        public Stub() { super(); }
        public static android.os.storage.IObbActionListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.storage.IObbActionListener p0) { return false; }
        public static android.os.storage.IObbActionListener getDefaultImpl() { return null; }

        private static class Proxy implements android.os.storage.IObbActionListener {
            private android.os.IBinder mRemote;
            public static android.os.storage.IObbActionListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onObbResult(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        }
    }
}
