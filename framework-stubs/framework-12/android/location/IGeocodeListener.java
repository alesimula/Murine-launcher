package android.location;

public interface IGeocodeListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.location.IGeocodeListener";
    public void onResults(java.lang.String p0, java.util.List<android.location.Address> p1) throws android.os.RemoteException;

    public static class Default implements android.location.IGeocodeListener {
        public Default() {}
        public void onResults(java.lang.String p0, java.util.List<android.location.Address> p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.location.IGeocodeListener {
        static final int TRANSACTION_onResults = 1;
        public Stub() { super(); }
        public static android.location.IGeocodeListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.location.IGeocodeListener p0) { return false; }
        public static android.location.IGeocodeListener getDefaultImpl() { return null; }

        private static class Proxy implements android.location.IGeocodeListener {
            private android.os.IBinder mRemote;
            public static android.location.IGeocodeListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onResults(java.lang.String p0, java.util.List<android.location.Address> p1) throws android.os.RemoteException {}
        }
    }
}
