package android.app.blob;

public interface IBlobCommitCallback extends android.os.IInterface {
    public void onResult(int p0) throws android.os.RemoteException;

    public static class Default implements android.app.blob.IBlobCommitCallback {
        public Default() {}
        public void onResult(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.blob.IBlobCommitCallback {
        private static final java.lang.String DESCRIPTOR = "android.app.blob.IBlobCommitCallback";
        static final int TRANSACTION_onResult = 1;
        public Stub() { super(); }
        public static android.app.blob.IBlobCommitCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.blob.IBlobCommitCallback p0) { return false; }
        public static android.app.blob.IBlobCommitCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.app.blob.IBlobCommitCallback {
            private android.os.IBinder mRemote;
            public static android.app.blob.IBlobCommitCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onResult(int p0) throws android.os.RemoteException {}
        }
    }
}
