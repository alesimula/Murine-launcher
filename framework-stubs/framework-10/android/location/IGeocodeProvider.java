package android.location;

public interface IGeocodeProvider extends android.os.IInterface {
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getFromLocation(double p0, double p1, int p2, android.location.GeocoderParams p3, java.util.List<android.location.Address> p4) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getFromLocationName(java.lang.String p0, double p1, double p2, double p3, double p4, int p5, android.location.GeocoderParams p6, java.util.List<android.location.Address> p7) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.location.IGeocodeProvider {
        private static final java.lang.String DESCRIPTOR = "android.location.IGeocodeProvider";
        static final int TRANSACTION_getFromLocation = 1;
        static final int TRANSACTION_getFromLocationName = 2;
        public Stub() { super(); }
        public static android.location.IGeocodeProvider asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.location.IGeocodeProvider p0) { return false; }
        public static android.location.IGeocodeProvider getDefaultImpl() { return null; }

        private static class Proxy implements android.location.IGeocodeProvider {
            private android.os.IBinder mRemote;
            public static android.location.IGeocodeProvider sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getFromLocation(double p0, double p1, int p2, android.location.GeocoderParams p3, java.util.List<android.location.Address> p4) throws android.os.RemoteException { return null; }
            public java.lang.String getFromLocationName(java.lang.String p0, double p1, double p2, double p3, double p4, int p5, android.location.GeocoderParams p6, java.util.List<android.location.Address> p7) throws android.os.RemoteException { return null; }
        }
    }

    public static class Default implements android.location.IGeocodeProvider {
        public Default() {}
        public java.lang.String getFromLocation(double p0, double p1, int p2, android.location.GeocoderParams p3, java.util.List<android.location.Address> p4) throws android.os.RemoteException { return null; }
        public java.lang.String getFromLocationName(java.lang.String p0, double p1, double p2, double p3, double p4, int p5, android.location.GeocoderParams p6, java.util.List<android.location.Address> p7) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }
}
