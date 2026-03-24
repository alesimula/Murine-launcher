package android.location.provider;

public interface IGeocodeCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.location.provider.IGeocodeCallback";
    public void onError(java.lang.String p0) throws android.os.RemoteException;
    public void onResults(java.util.List<android.location.Address> p0) throws android.os.RemoteException;

    public static class Default implements android.location.provider.IGeocodeCallback {
        public Default() {}
        public void onError(java.lang.String p0) throws android.os.RemoteException {}
        public void onResults(java.util.List<android.location.Address> p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.location.provider.IGeocodeCallback {
        static final int TRANSACTION_onError = 1;
        static final int TRANSACTION_onResults = 2;
        public Stub() { super(); }
        public static android.location.provider.IGeocodeCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.location.provider.IGeocodeCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onError(java.lang.String p0) throws android.os.RemoteException {}
            public void onResults(java.util.List<android.location.Address> p0) throws android.os.RemoteException {}
        }
    }
}
