package android.location;

public interface IGeofenceProvider extends android.os.IInterface {
    public void setGeofenceHardware(android.hardware.location.IGeofenceHardware p0) throws android.os.RemoteException;

    public static class Default implements android.location.IGeofenceProvider {
        public Default() {}
        public void setGeofenceHardware(android.hardware.location.IGeofenceHardware p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.location.IGeofenceProvider {
        public static final java.lang.String DESCRIPTOR = "android.location.IGeofenceProvider";
        static final int TRANSACTION_setGeofenceHardware = 1;
        public Stub() { super(); }
        public static android.location.IGeofenceProvider asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.location.IGeofenceProvider p0) { return false; }
        public static android.location.IGeofenceProvider getDefaultImpl() { return null; }

        private static class Proxy implements android.location.IGeofenceProvider {
            private android.os.IBinder mRemote;
            public static android.location.IGeofenceProvider sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setGeofenceHardware(android.hardware.location.IGeofenceHardware p0) throws android.os.RemoteException {}
        }
    }
}
