package android.hardware.devicestate;

public interface IDeviceStateManagerCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.devicestate.IDeviceStateManagerCallback";
    public void onDeviceStateInfoChanged(android.hardware.devicestate.DeviceStateInfo p0) throws android.os.RemoteException;
    public void onRequestActive(android.os.IBinder p0) throws android.os.RemoteException;
    public void onRequestCanceled(android.os.IBinder p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.devicestate.IDeviceStateManagerCallback {
        public Default() {}
        public void onDeviceStateInfoChanged(android.hardware.devicestate.DeviceStateInfo p0) throws android.os.RemoteException {}
        public void onRequestActive(android.os.IBinder p0) throws android.os.RemoteException {}
        public void onRequestCanceled(android.os.IBinder p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.devicestate.IDeviceStateManagerCallback {
        static final int TRANSACTION_onDeviceStateInfoChanged = 1;
        static final int TRANSACTION_onRequestActive = 2;
        static final int TRANSACTION_onRequestCanceled = 3;
        public Stub() { super(); }
        public static android.hardware.devicestate.IDeviceStateManagerCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.devicestate.IDeviceStateManagerCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDeviceStateInfoChanged(android.hardware.devicestate.DeviceStateInfo p0) throws android.os.RemoteException {}
            public void onRequestActive(android.os.IBinder p0) throws android.os.RemoteException {}
            public void onRequestCanceled(android.os.IBinder p0) throws android.os.RemoteException {}
        }
    }
}
