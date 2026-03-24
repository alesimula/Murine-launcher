package android.hardware;

public interface ICameraServiceProxy extends android.os.IInterface {
    public void pingForUserUpdate() throws android.os.RemoteException;
    public void notifyCameraState(android.hardware.CameraSessionStats p0) throws android.os.RemoteException;
    public void notifyFeatureCombinationStats(android.hardware.CameraFeatureCombinationStats p0) throws android.os.RemoteException;
    public int getRotateAndCropOverride(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public int getAutoframingOverride(java.lang.String p0) throws android.os.RemoteException;
    public boolean isCameraDisabled(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.ICameraServiceProxy {
        public Default() {}
        public void pingForUserUpdate() throws android.os.RemoteException {}
        public void notifyCameraState(android.hardware.CameraSessionStats p0) throws android.os.RemoteException {}
        public void notifyFeatureCombinationStats(android.hardware.CameraFeatureCombinationStats p0) throws android.os.RemoteException {}
        public int getRotateAndCropOverride(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
        public int getAutoframingOverride(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public boolean isCameraDisabled(int p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.ICameraServiceProxy {
        public static final java.lang.String DESCRIPTOR = "android.hardware.ICameraServiceProxy";
        static final int TRANSACTION_pingForUserUpdate = 1;
        static final int TRANSACTION_notifyCameraState = 2;
        static final int TRANSACTION_notifyFeatureCombinationStats = 3;
        static final int TRANSACTION_getRotateAndCropOverride = 4;
        static final int TRANSACTION_getAutoframingOverride = 5;
        static final int TRANSACTION_isCameraDisabled = 6;
        public Stub() { super(); }
        public static android.hardware.ICameraServiceProxy asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.ICameraServiceProxy {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void pingForUserUpdate() throws android.os.RemoteException {}
            public void notifyCameraState(android.hardware.CameraSessionStats p0) throws android.os.RemoteException {}
            public void notifyFeatureCombinationStats(android.hardware.CameraFeatureCombinationStats p0) throws android.os.RemoteException {}
            public int getRotateAndCropOverride(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
            public int getAutoframingOverride(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public boolean isCameraDisabled(int p0) throws android.os.RemoteException { return false; }
        }
    }
}
