package android.location;

public interface ICountryListener extends android.os.IInterface {
    public void onCountryDetected(android.location.Country p0) throws android.os.RemoteException;

    public static class Default implements android.location.ICountryListener {
        public Default() {}
        public void onCountryDetected(android.location.Country p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.location.ICountryListener {
        public static final java.lang.String DESCRIPTOR = "android.location.ICountryListener";
        static final int TRANSACTION_onCountryDetected = 1;
        public Stub() { super(); }
        public static android.location.ICountryListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.location.ICountryListener p0) { return false; }
        public static android.location.ICountryListener getDefaultImpl() { return null; }

        private static class Proxy implements android.location.ICountryListener {
            private android.os.IBinder mRemote;
            public static android.location.ICountryListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCountryDetected(android.location.Country p0) throws android.os.RemoteException {}
        }
    }
}
