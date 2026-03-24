package android.hardware.location;

public interface IGeofenceHardwareCallback extends android.os.IInterface {
    public void onGeofenceTransition(int p0, int p1, android.location.Location p2, long p3, int p4) throws android.os.RemoteException;
    public void onGeofenceAdd(int p0, int p1) throws android.os.RemoteException;
    public void onGeofenceRemove(int p0, int p1) throws android.os.RemoteException;
    public void onGeofencePause(int p0, int p1) throws android.os.RemoteException;
    public void onGeofenceResume(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.location.IGeofenceHardwareCallback {
        public Default() {}
        public void onGeofenceTransition(int p0, int p1, android.location.Location p2, long p3, int p4) throws android.os.RemoteException {}
        public void onGeofenceAdd(int p0, int p1) throws android.os.RemoteException {}
        public void onGeofenceRemove(int p0, int p1) throws android.os.RemoteException {}
        public void onGeofencePause(int p0, int p1) throws android.os.RemoteException {}
        public void onGeofenceResume(int p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.location.IGeofenceHardwareCallback {
        public static final java.lang.String DESCRIPTOR = "android.hardware.location.IGeofenceHardwareCallback";
        static final int TRANSACTION_onGeofenceTransition = 1;
        static final int TRANSACTION_onGeofenceAdd = 2;
        static final int TRANSACTION_onGeofenceRemove = 3;
        static final int TRANSACTION_onGeofencePause = 4;
        static final int TRANSACTION_onGeofenceResume = 5;
        public Stub() { super(); }
        public static android.hardware.location.IGeofenceHardwareCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.location.IGeofenceHardwareCallback p0) { return false; }
        public static android.hardware.location.IGeofenceHardwareCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.location.IGeofenceHardwareCallback {
            private android.os.IBinder mRemote;
            public static android.hardware.location.IGeofenceHardwareCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onGeofenceTransition(int p0, int p1, android.location.Location p2, long p3, int p4) throws android.os.RemoteException {}
            public void onGeofenceAdd(int p0, int p1) throws android.os.RemoteException {}
            public void onGeofenceRemove(int p0, int p1) throws android.os.RemoteException {}
            public void onGeofencePause(int p0, int p1) throws android.os.RemoteException {}
            public void onGeofenceResume(int p0, int p1) throws android.os.RemoteException {}
        }
    }
}
