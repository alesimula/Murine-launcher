package android.hardware.gnss;

public interface IGnssGeofenceCallback extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "fc957f1d3d261d065ff5e5415f2d21caa79c310f";
    public static final java.lang.String DESCRIPTOR = null;
    public static final int ENTERED = 1;
    public static final int EXITED = 2;
    public static final int UNCERTAIN = 4;
    public static final int UNAVAILABLE = 1;
    public static final int AVAILABLE = 2;
    public static final int OPERATION_SUCCESS = 0;
    public static final int ERROR_TOO_MANY_GEOFENCES = -100;
    public static final int ERROR_ID_EXISTS = -101;
    public static final int ERROR_ID_UNKNOWN = -102;
    public static final int ERROR_INVALID_TRANSITION = -103;
    public static final int ERROR_GENERIC = -149;
    public void gnssGeofenceTransitionCb(int p0, android.hardware.gnss.GnssLocation p1, int p2, long p3) throws android.os.RemoteException;
    public void gnssGeofenceStatusCb(int p0, android.hardware.gnss.GnssLocation p1) throws android.os.RemoteException;
    public void gnssGeofenceAddCb(int p0, int p1) throws android.os.RemoteException;
    public void gnssGeofenceRemoveCb(int p0, int p1) throws android.os.RemoteException;
    public void gnssGeofencePauseCb(int p0, int p1) throws android.os.RemoteException;
    public void gnssGeofenceResumeCb(int p0, int p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.gnss.IGnssGeofenceCallback {
        public Default() {}
        public void gnssGeofenceTransitionCb(int p0, android.hardware.gnss.GnssLocation p1, int p2, long p3) throws android.os.RemoteException {}
        public void gnssGeofenceStatusCb(int p0, android.hardware.gnss.GnssLocation p1) throws android.os.RemoteException {}
        public void gnssGeofenceAddCb(int p0, int p1) throws android.os.RemoteException {}
        public void gnssGeofenceRemoveCb(int p0, int p1) throws android.os.RemoteException {}
        public void gnssGeofencePauseCb(int p0, int p1) throws android.os.RemoteException {}
        public void gnssGeofenceResumeCb(int p0, int p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.IGnssGeofenceCallback {
        static final int TRANSACTION_gnssGeofenceTransitionCb = 1;
        static final int TRANSACTION_gnssGeofenceStatusCb = 2;
        static final int TRANSACTION_gnssGeofenceAddCb = 3;
        static final int TRANSACTION_gnssGeofenceRemoveCb = 4;
        static final int TRANSACTION_gnssGeofencePauseCb = 5;
        static final int TRANSACTION_gnssGeofenceResumeCb = 6;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.gnss.IGnssGeofenceCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.gnss.IGnssGeofenceCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void gnssGeofenceTransitionCb(int p0, android.hardware.gnss.GnssLocation p1, int p2, long p3) throws android.os.RemoteException {}
            public void gnssGeofenceStatusCb(int p0, android.hardware.gnss.GnssLocation p1) throws android.os.RemoteException {}
            public void gnssGeofenceAddCb(int p0, int p1) throws android.os.RemoteException {}
            public void gnssGeofenceRemoveCb(int p0, int p1) throws android.os.RemoteException {}
            public void gnssGeofencePauseCb(int p0, int p1) throws android.os.RemoteException {}
            public void gnssGeofenceResumeCb(int p0, int p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
