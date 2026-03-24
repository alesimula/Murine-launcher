package android.location;

public interface ILocationListener extends android.os.IInterface {
    public void onLocationChanged(java.util.List<android.location.Location> p0, android.os.IRemoteCallback p1) throws android.os.RemoteException;
    public void onProviderEnabledChanged(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void onFlushComplete(int p0) throws android.os.RemoteException;

    public static class Default implements android.location.ILocationListener {
        public Default() {}
        public void onLocationChanged(java.util.List<android.location.Location> p0, android.os.IRemoteCallback p1) throws android.os.RemoteException {}
        public void onProviderEnabledChanged(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void onFlushComplete(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.location.ILocationListener {
        public static final java.lang.String DESCRIPTOR = "android.location.ILocationListener";
        static final int TRANSACTION_onLocationChanged = 1;
        static final int TRANSACTION_onProviderEnabledChanged = 2;
        static final int TRANSACTION_onFlushComplete = 3;
        public Stub() { super(); }
        public static android.location.ILocationListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.location.ILocationListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onLocationChanged(java.util.List<android.location.Location> p0, android.os.IRemoteCallback p1) throws android.os.RemoteException {}
            public void onProviderEnabledChanged(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void onFlushComplete(int p0) throws android.os.RemoteException {}
        }
    }
}
