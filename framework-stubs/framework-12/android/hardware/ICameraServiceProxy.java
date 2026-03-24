package android.hardware;

public interface ICameraServiceProxy extends android.os.IInterface {
    public void pingForUserUpdate() throws android.os.RemoteException;
    public void notifyCameraState(android.hardware.CameraSessionStats p0) throws android.os.RemoteException;
    public boolean isRotateAndCropOverrideNeeded(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.hardware.ICameraServiceProxy {
        public Default() {}
        public void pingForUserUpdate() throws android.os.RemoteException {}
        public void notifyCameraState(android.hardware.CameraSessionStats p0) throws android.os.RemoteException {}
        public boolean isRotateAndCropOverrideNeeded(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.ICameraServiceProxy {
        public static final java.lang.String DESCRIPTOR = "android.hardware.ICameraServiceProxy";
        static final int TRANSACTION_pingForUserUpdate = 1;
        static final int TRANSACTION_notifyCameraState = 2;
        static final int TRANSACTION_isRotateAndCropOverrideNeeded = 3;
        public Stub() { super(); }
        public static android.hardware.ICameraServiceProxy asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.ICameraServiceProxy p0) { return false; }
        public static android.hardware.ICameraServiceProxy getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.ICameraServiceProxy {
            private android.os.IBinder mRemote;
            public static android.hardware.ICameraServiceProxy sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void pingForUserUpdate() throws android.os.RemoteException {}
            public void notifyCameraState(android.hardware.CameraSessionStats p0) throws android.os.RemoteException {}
            public boolean isRotateAndCropOverrideNeeded(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
        }
    }
}
