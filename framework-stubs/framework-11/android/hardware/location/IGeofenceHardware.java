package android.hardware.location;

public interface IGeofenceHardware extends android.os.IInterface {
    public void setGpsGeofenceHardware(android.location.IGpsGeofenceHardware p0) throws android.os.RemoteException;
    public void setFusedGeofenceHardware(android.location.IFusedGeofenceHardware p0) throws android.os.RemoteException;
    public int[] getMonitoringTypes() throws android.os.RemoteException;
    public int getStatusOfMonitoringType(int p0) throws android.os.RemoteException;
    public boolean addCircularFence(int p0, android.hardware.location.GeofenceHardwareRequestParcelable p1, android.hardware.location.IGeofenceHardwareCallback p2) throws android.os.RemoteException;
    public boolean removeGeofence(int p0, int p1) throws android.os.RemoteException;
    public boolean pauseGeofence(int p0, int p1) throws android.os.RemoteException;
    public boolean resumeGeofence(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean registerForMonitorStateChangeCallback(int p0, android.hardware.location.IGeofenceHardwareMonitorCallback p1) throws android.os.RemoteException;
    public boolean unregisterForMonitorStateChangeCallback(int p0, android.hardware.location.IGeofenceHardwareMonitorCallback p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.location.IGeofenceHardware {
        public Default() {}
        public void setGpsGeofenceHardware(android.location.IGpsGeofenceHardware p0) throws android.os.RemoteException {}
        public void setFusedGeofenceHardware(android.location.IFusedGeofenceHardware p0) throws android.os.RemoteException {}
        public int[] getMonitoringTypes() throws android.os.RemoteException { return null; }
        public int getStatusOfMonitoringType(int p0) throws android.os.RemoteException { return 0; }
        public boolean addCircularFence(int p0, android.hardware.location.GeofenceHardwareRequestParcelable p1, android.hardware.location.IGeofenceHardwareCallback p2) throws android.os.RemoteException { return false; }
        public boolean removeGeofence(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean pauseGeofence(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean resumeGeofence(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean registerForMonitorStateChangeCallback(int p0, android.hardware.location.IGeofenceHardwareMonitorCallback p1) throws android.os.RemoteException { return false; }
        public boolean unregisterForMonitorStateChangeCallback(int p0, android.hardware.location.IGeofenceHardwareMonitorCallback p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.location.IGeofenceHardware {
        private static final java.lang.String DESCRIPTOR = "android.hardware.location.IGeofenceHardware";
        static final int TRANSACTION_setGpsGeofenceHardware = 1;
        static final int TRANSACTION_setFusedGeofenceHardware = 2;
        static final int TRANSACTION_getMonitoringTypes = 3;
        static final int TRANSACTION_getStatusOfMonitoringType = 4;
        static final int TRANSACTION_addCircularFence = 5;
        static final int TRANSACTION_removeGeofence = 6;
        static final int TRANSACTION_pauseGeofence = 7;
        static final int TRANSACTION_resumeGeofence = 8;
        static final int TRANSACTION_registerForMonitorStateChangeCallback = 9;
        static final int TRANSACTION_unregisterForMonitorStateChangeCallback = 10;
        public Stub() { super(); }
        public static android.hardware.location.IGeofenceHardware asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.location.IGeofenceHardware p0) { return false; }
        public static android.hardware.location.IGeofenceHardware getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.location.IGeofenceHardware {
            private android.os.IBinder mRemote;
            public static android.hardware.location.IGeofenceHardware sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setGpsGeofenceHardware(android.location.IGpsGeofenceHardware p0) throws android.os.RemoteException {}
            public void setFusedGeofenceHardware(android.location.IFusedGeofenceHardware p0) throws android.os.RemoteException {}
            public int[] getMonitoringTypes() throws android.os.RemoteException { return null; }
            public int getStatusOfMonitoringType(int p0) throws android.os.RemoteException { return 0; }
            public boolean addCircularFence(int p0, android.hardware.location.GeofenceHardwareRequestParcelable p1, android.hardware.location.IGeofenceHardwareCallback p2) throws android.os.RemoteException { return false; }
            public boolean removeGeofence(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean pauseGeofence(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean resumeGeofence(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean registerForMonitorStateChangeCallback(int p0, android.hardware.location.IGeofenceHardwareMonitorCallback p1) throws android.os.RemoteException { return false; }
            public boolean unregisterForMonitorStateChangeCallback(int p0, android.hardware.location.IGeofenceHardwareMonitorCallback p1) throws android.os.RemoteException { return false; }
        }
    }
}
