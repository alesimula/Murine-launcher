package android.location.provider;

public interface IGeocodeProvider extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.location.provider.IGeocodeProvider";
    public void forwardGeocode(android.location.provider.ForwardGeocodeRequest p0, android.location.provider.IGeocodeCallback p1) throws android.os.RemoteException;
    public void reverseGeocode(android.location.provider.ReverseGeocodeRequest p0, android.location.provider.IGeocodeCallback p1) throws android.os.RemoteException;

    public static class Default implements android.location.provider.IGeocodeProvider {
        public Default() {}
        public void forwardGeocode(android.location.provider.ForwardGeocodeRequest p0, android.location.provider.IGeocodeCallback p1) throws android.os.RemoteException {}
        public void reverseGeocode(android.location.provider.ReverseGeocodeRequest p0, android.location.provider.IGeocodeCallback p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.location.provider.IGeocodeProvider {
        static final int TRANSACTION_forwardGeocode = 1;
        static final int TRANSACTION_reverseGeocode = 2;
        public Stub() { super(); }
        public static android.location.provider.IGeocodeProvider asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.location.provider.IGeocodeProvider {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void forwardGeocode(android.location.provider.ForwardGeocodeRequest p0, android.location.provider.IGeocodeCallback p1) throws android.os.RemoteException {}
            public void reverseGeocode(android.location.provider.ReverseGeocodeRequest p0, android.location.provider.IGeocodeCallback p1) throws android.os.RemoteException {}
        }
    }
}
