package android.location;

public interface IFusedGeofenceHardware extends android.os.IInterface {
    public boolean isSupported() throws android.os.RemoteException;
    public void addGeofences(android.hardware.location.GeofenceHardwareRequestParcelable[] p0) throws android.os.RemoteException;
    public void removeGeofences(int[] p0) throws android.os.RemoteException;
    public void pauseMonitoringGeofence(int p0) throws android.os.RemoteException;
    public void resumeMonitoringGeofence(int p0, int p1) throws android.os.RemoteException;
    public void modifyGeofenceOptions(int p0, int p1, int p2, int p3, int p4, int p5) throws android.os.RemoteException;

    public static class Default implements android.location.IFusedGeofenceHardware {
        public Default() {}
        public boolean isSupported() throws android.os.RemoteException { return false; }
        public void addGeofences(android.hardware.location.GeofenceHardwareRequestParcelable[] p0) throws android.os.RemoteException {}
        public void removeGeofences(int[] p0) throws android.os.RemoteException {}
        public void pauseMonitoringGeofence(int p0) throws android.os.RemoteException {}
        public void resumeMonitoringGeofence(int p0, int p1) throws android.os.RemoteException {}
        public void modifyGeofenceOptions(int p0, int p1, int p2, int p3, int p4, int p5) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.location.IFusedGeofenceHardware {
        public static final java.lang.String DESCRIPTOR = "android.location.IFusedGeofenceHardware";
        static final int TRANSACTION_isSupported = 1;
        static final int TRANSACTION_addGeofences = 2;
        static final int TRANSACTION_removeGeofences = 3;
        static final int TRANSACTION_pauseMonitoringGeofence = 4;
        static final int TRANSACTION_resumeMonitoringGeofence = 5;
        static final int TRANSACTION_modifyGeofenceOptions = 6;
        public Stub() { super(); }
        public static android.location.IFusedGeofenceHardware asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.location.IFusedGeofenceHardware p0) { return false; }
        public static android.location.IFusedGeofenceHardware getDefaultImpl() { return null; }

        private static class Proxy implements android.location.IFusedGeofenceHardware {
            private android.os.IBinder mRemote;
            public static android.location.IFusedGeofenceHardware sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isSupported() throws android.os.RemoteException { return false; }
            public void addGeofences(android.hardware.location.GeofenceHardwareRequestParcelable[] p0) throws android.os.RemoteException {}
            public void removeGeofences(int[] p0) throws android.os.RemoteException {}
            public void pauseMonitoringGeofence(int p0) throws android.os.RemoteException {}
            public void resumeMonitoringGeofence(int p0, int p1) throws android.os.RemoteException {}
            public void modifyGeofenceOptions(int p0, int p1, int p2, int p3, int p4, int p5) throws android.os.RemoteException {}
        }
    }
}
