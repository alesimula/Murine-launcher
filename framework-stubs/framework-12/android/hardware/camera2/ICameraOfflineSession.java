package android.hardware.camera2;

public interface ICameraOfflineSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.camera2.ICameraOfflineSession";
    public void disconnect() throws android.os.RemoteException;

    public static class Default implements android.hardware.camera2.ICameraOfflineSession {
        public Default() {}
        public void disconnect() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.ICameraOfflineSession {
        static final int TRANSACTION_disconnect = 1;
        public Stub() { super(); }
        public static android.hardware.camera2.ICameraOfflineSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.camera2.ICameraOfflineSession p0) { return false; }
        public static android.hardware.camera2.ICameraOfflineSession getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.camera2.ICameraOfflineSession {
            private android.os.IBinder mRemote;
            public static android.hardware.camera2.ICameraOfflineSession sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void disconnect() throws android.os.RemoteException {}
        }
    }
}
