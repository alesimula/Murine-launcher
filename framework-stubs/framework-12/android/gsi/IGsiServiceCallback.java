package android.gsi;

public interface IGsiServiceCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.gsi.IGsiServiceCallback";
    public void onResult(int p0) throws android.os.RemoteException;

    public static class Default implements android.gsi.IGsiServiceCallback {
        public Default() {}
        public void onResult(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.gsi.IGsiServiceCallback {
        static final int TRANSACTION_onResult = 1;
        public Stub() { super(); }
        public static android.gsi.IGsiServiceCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.gsi.IGsiServiceCallback p0) { return false; }
        public static android.gsi.IGsiServiceCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.gsi.IGsiServiceCallback {
            private android.os.IBinder mRemote;
            public static android.gsi.IGsiServiceCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onResult(int p0) throws android.os.RemoteException {}
        }
    }
}
