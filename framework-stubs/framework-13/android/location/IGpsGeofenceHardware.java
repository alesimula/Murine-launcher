package android.location;

public interface IGpsGeofenceHardware extends android.os.IInterface {
    public boolean isHardwareGeofenceSupported() throws android.os.RemoteException;
    public boolean addCircularHardwareGeofence(int p0, double p1, double p2, double p3, int p4, int p5, int p6, int p7) throws android.os.RemoteException;
    public boolean removeHardwareGeofence(int p0) throws android.os.RemoteException;
    public boolean pauseHardwareGeofence(int p0) throws android.os.RemoteException;
    public boolean resumeHardwareGeofence(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.location.IGpsGeofenceHardware {
        public Default() {}
        public boolean isHardwareGeofenceSupported() throws android.os.RemoteException { return false; }
        public boolean addCircularHardwareGeofence(int p0, double p1, double p2, double p3, int p4, int p5, int p6, int p7) throws android.os.RemoteException { return false; }
        public boolean removeHardwareGeofence(int p0) throws android.os.RemoteException { return false; }
        public boolean pauseHardwareGeofence(int p0) throws android.os.RemoteException { return false; }
        public boolean resumeHardwareGeofence(int p0, int p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.location.IGpsGeofenceHardware {
        public static final java.lang.String DESCRIPTOR = "android.location.IGpsGeofenceHardware";
        static final int TRANSACTION_isHardwareGeofenceSupported = 1;
        static final int TRANSACTION_addCircularHardwareGeofence = 2;
        static final int TRANSACTION_removeHardwareGeofence = 3;
        static final int TRANSACTION_pauseHardwareGeofence = 4;
        static final int TRANSACTION_resumeHardwareGeofence = 5;
        public Stub() { super(); }
        public static android.location.IGpsGeofenceHardware asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.location.IGpsGeofenceHardware {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isHardwareGeofenceSupported() throws android.os.RemoteException { return false; }
            public boolean addCircularHardwareGeofence(int p0, double p1, double p2, double p3, int p4, int p5, int p6, int p7) throws android.os.RemoteException { return false; }
            public boolean removeHardwareGeofence(int p0) throws android.os.RemoteException { return false; }
            public boolean pauseHardwareGeofence(int p0) throws android.os.RemoteException { return false; }
            public boolean resumeHardwareGeofence(int p0, int p1) throws android.os.RemoteException { return false; }
        }
    }
}
