package android.hardware;

public interface ICameraServiceListener extends android.os.IInterface {
    public static final int STATUS_NOT_PRESENT = 0;
    public static final int STATUS_PRESENT = 1;
    public static final int STATUS_ENUMERATING = 2;
    public static final int STATUS_NOT_AVAILABLE = -2;
    public static final int STATUS_UNKNOWN = -1;
    public static final int TORCH_STATUS_NOT_AVAILABLE = 0;
    public static final int TORCH_STATUS_AVAILABLE_OFF = 1;
    public static final int TORCH_STATUS_AVAILABLE_ON = 2;
    public static final int TORCH_STATUS_UNKNOWN = -1;
    public void onStatusChanged(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onTorchStatusChanged(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onCameraAccessPrioritiesChanged() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.hardware.ICameraServiceListener {
        private static final java.lang.String DESCRIPTOR = "android.hardware.ICameraServiceListener";
        static final int TRANSACTION_onStatusChanged = 1;
        static final int TRANSACTION_onTorchStatusChanged = 2;
        static final int TRANSACTION_onCameraAccessPrioritiesChanged = 3;
        public Stub() { super(); }
        public static android.hardware.ICameraServiceListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.ICameraServiceListener p0) { return false; }
        public static android.hardware.ICameraServiceListener getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.ICameraServiceListener {
            private android.os.IBinder mRemote;
            public static android.hardware.ICameraServiceListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStatusChanged(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onTorchStatusChanged(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onCameraAccessPrioritiesChanged() throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.hardware.ICameraServiceListener {
        public Default() {}
        public void onStatusChanged(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onTorchStatusChanged(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onCameraAccessPrioritiesChanged() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
