package android.location;

public interface IGeocodeProvider extends android.os.IInterface {
    public void getFromLocation(double p0, double p1, int p2, android.location.GeocoderParams p3, android.location.IGeocodeListener p4) throws android.os.RemoteException;
    public void getFromLocationName(java.lang.String p0, double p1, double p2, double p3, double p4, int p5, android.location.GeocoderParams p6, android.location.IGeocodeListener p7) throws android.os.RemoteException;

    public static class Default implements android.location.IGeocodeProvider {
        public Default() {}
        public void getFromLocation(double p0, double p1, int p2, android.location.GeocoderParams p3, android.location.IGeocodeListener p4) throws android.os.RemoteException {}
        public void getFromLocationName(java.lang.String p0, double p1, double p2, double p3, double p4, int p5, android.location.GeocoderParams p6, android.location.IGeocodeListener p7) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.location.IGeocodeProvider {
        public static final java.lang.String DESCRIPTOR = "android.location.IGeocodeProvider";
        static final int TRANSACTION_getFromLocation = 1;
        static final int TRANSACTION_getFromLocationName = 2;
        public Stub() { super(); }
        public static android.location.IGeocodeProvider asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.location.IGeocodeProvider {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getFromLocation(double p0, double p1, int p2, android.location.GeocoderParams p3, android.location.IGeocodeListener p4) throws android.os.RemoteException {}
            public void getFromLocationName(java.lang.String p0, double p1, double p2, double p3, double p4, int p5, android.location.GeocoderParams p6, android.location.IGeocodeListener p7) throws android.os.RemoteException {}
        }
    }
}
