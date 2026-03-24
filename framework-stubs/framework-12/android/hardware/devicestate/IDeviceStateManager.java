package android.hardware.devicestate;

public interface IDeviceStateManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.devicestate.IDeviceStateManager";
    public android.hardware.devicestate.DeviceStateInfo getDeviceStateInfo() throws android.os.RemoteException;
    public void registerCallback(android.hardware.devicestate.IDeviceStateManagerCallback p0) throws android.os.RemoteException;
    public void requestState(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException;
    public void cancelRequest(android.os.IBinder p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.devicestate.IDeviceStateManager {
        public Default() {}
        public android.hardware.devicestate.DeviceStateInfo getDeviceStateInfo() throws android.os.RemoteException { return null; }
        public void registerCallback(android.hardware.devicestate.IDeviceStateManagerCallback p0) throws android.os.RemoteException {}
        public void requestState(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
        public void cancelRequest(android.os.IBinder p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.devicestate.IDeviceStateManager {
        static final int TRANSACTION_getDeviceStateInfo = 1;
        static final int TRANSACTION_registerCallback = 2;
        static final int TRANSACTION_requestState = 3;
        static final int TRANSACTION_cancelRequest = 4;
        public Stub() { super(); }
        public static android.hardware.devicestate.IDeviceStateManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.devicestate.IDeviceStateManager p0) { return false; }
        public static android.hardware.devicestate.IDeviceStateManager getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.devicestate.IDeviceStateManager {
            private android.os.IBinder mRemote;
            public static android.hardware.devicestate.IDeviceStateManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.devicestate.DeviceStateInfo getDeviceStateInfo() throws android.os.RemoteException { return null; }
            public void registerCallback(android.hardware.devicestate.IDeviceStateManagerCallback p0) throws android.os.RemoteException {}
            public void requestState(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
            public void cancelRequest(android.os.IBinder p0) throws android.os.RemoteException {}
        }
    }
}
