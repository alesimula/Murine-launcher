package android.location;

public interface ICountryDetector extends android.os.IInterface {
    public android.location.Country detectCountry() throws android.os.RemoteException;
    public void addCountryListener(android.location.ICountryListener p0) throws android.os.RemoteException;
    public void removeCountryListener(android.location.ICountryListener p0) throws android.os.RemoteException;

    public static class Default implements android.location.ICountryDetector {
        public Default() {}
        public android.location.Country detectCountry() throws android.os.RemoteException { return null; }
        public void addCountryListener(android.location.ICountryListener p0) throws android.os.RemoteException {}
        public void removeCountryListener(android.location.ICountryListener p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.location.ICountryDetector {
        public static final java.lang.String DESCRIPTOR = "android.location.ICountryDetector";
        static final int TRANSACTION_detectCountry = 1;
        static final int TRANSACTION_addCountryListener = 2;
        static final int TRANSACTION_removeCountryListener = 3;
        public Stub() { super(); }
        public static android.location.ICountryDetector asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.location.ICountryDetector p0) { return false; }
        public static android.location.ICountryDetector getDefaultImpl() { return null; }

        private static class Proxy implements android.location.ICountryDetector {
            private android.os.IBinder mRemote;
            public static android.location.ICountryDetector sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.location.Country detectCountry() throws android.os.RemoteException { return null; }
            public void addCountryListener(android.location.ICountryListener p0) throws android.os.RemoteException {}
            public void removeCountryListener(android.location.ICountryListener p0) throws android.os.RemoteException {}
        }
    }
}
