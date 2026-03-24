package android.location;

public interface ILocationListener extends android.os.IInterface {
    @android.annotation.UnsupportedAppUsage
    public void onLocationChanged(android.location.Location p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void onProviderEnabled(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void onProviderDisabled(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void onStatusChanged(java.lang.String p0, int p1, android.os.Bundle p2) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.location.ILocationListener {
        private static final java.lang.String DESCRIPTOR = "android.location.ILocationListener";
        static final int TRANSACTION_onLocationChanged = 1;
        static final int TRANSACTION_onProviderEnabled = 2;
        static final int TRANSACTION_onProviderDisabled = 3;
        static final int TRANSACTION_onStatusChanged = 4;
        public Stub() { super(); }
        public static android.location.ILocationListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.location.ILocationListener p0) { return false; }
        public static android.location.ILocationListener getDefaultImpl() { return null; }

        private static class Proxy implements android.location.ILocationListener {
            private android.os.IBinder mRemote;
            public static android.location.ILocationListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onLocationChanged(android.location.Location p0) throws android.os.RemoteException {}
            public void onProviderEnabled(java.lang.String p0) throws android.os.RemoteException {}
            public void onProviderDisabled(java.lang.String p0) throws android.os.RemoteException {}
            public void onStatusChanged(java.lang.String p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.location.ILocationListener {
        public Default() {}
        public void onLocationChanged(android.location.Location p0) throws android.os.RemoteException {}
        public void onProviderEnabled(java.lang.String p0) throws android.os.RemoteException {}
        public void onProviderDisabled(java.lang.String p0) throws android.os.RemoteException {}
        public void onStatusChanged(java.lang.String p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
