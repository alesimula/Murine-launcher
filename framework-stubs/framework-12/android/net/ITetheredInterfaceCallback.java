package android.net;

public interface ITetheredInterfaceCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.ITetheredInterfaceCallback";
    public void onAvailable(java.lang.String p0) throws android.os.RemoteException;
    public void onUnavailable() throws android.os.RemoteException;

    public static class Default implements android.net.ITetheredInterfaceCallback {
        public Default() {}
        public void onAvailable(java.lang.String p0) throws android.os.RemoteException {}
        public void onUnavailable() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.ITetheredInterfaceCallback {
        static final int TRANSACTION_onAvailable = 1;
        static final int TRANSACTION_onUnavailable = 2;
        public Stub() { super(); }
        public static android.net.ITetheredInterfaceCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.ITetheredInterfaceCallback p0) { return false; }
        public static android.net.ITetheredInterfaceCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.net.ITetheredInterfaceCallback {
            private android.os.IBinder mRemote;
            public static android.net.ITetheredInterfaceCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAvailable(java.lang.String p0) throws android.os.RemoteException {}
            public void onUnavailable() throws android.os.RemoteException {}
        }
    }
}
