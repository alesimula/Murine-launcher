package android.proximity;

public interface IProximityResultCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.proximity.IProximityResultCallback";
    public void onError(int p0) throws android.os.RemoteException;
    public void onSuccess(int p0) throws android.os.RemoteException;

    public static class Default implements android.proximity.IProximityResultCallback {
        public Default() {}
        public void onError(int p0) throws android.os.RemoteException {}
        public void onSuccess(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.proximity.IProximityResultCallback {
        static final int TRANSACTION_onError = 1;
        static final int TRANSACTION_onSuccess = 2;
        public Stub() { super(); }
        public static android.proximity.IProximityResultCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.proximity.IProximityResultCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onError(int p0) throws android.os.RemoteException {}
            public void onSuccess(int p0) throws android.os.RemoteException {}
        }
    }
}
