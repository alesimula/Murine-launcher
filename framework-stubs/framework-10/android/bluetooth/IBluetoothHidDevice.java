package android.bluetooth;

public interface IBluetoothHidDevice extends android.os.IInterface {
    public boolean registerApp(android.bluetooth.BluetoothHidDeviceAppSdpSettings p0, android.bluetooth.BluetoothHidDeviceAppQosSettings p1, android.bluetooth.BluetoothHidDeviceAppQosSettings p2, android.bluetooth.IBluetoothHidDeviceCallback p3) throws android.os.RemoteException;
    public boolean unregisterApp() throws android.os.RemoteException;
    public boolean sendReport(android.bluetooth.BluetoothDevice p0, int p1, byte[] p2) throws android.os.RemoteException;
    public boolean replyReport(android.bluetooth.BluetoothDevice p0, byte p1, byte p2, byte[] p3) throws android.os.RemoteException;
    public boolean reportError(android.bluetooth.BluetoothDevice p0, byte p1) throws android.os.RemoteException;
    public boolean unplug(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException;
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException;
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public java.lang.String getUserAppName() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothHidDevice {
        private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothHidDevice";
        static final int TRANSACTION_registerApp = 1;
        static final int TRANSACTION_unregisterApp = 2;
        static final int TRANSACTION_sendReport = 3;
        static final int TRANSACTION_replyReport = 4;
        static final int TRANSACTION_reportError = 5;
        static final int TRANSACTION_unplug = 6;
        static final int TRANSACTION_connect = 7;
        static final int TRANSACTION_disconnect = 8;
        static final int TRANSACTION_getConnectedDevices = 9;
        static final int TRANSACTION_getDevicesMatchingConnectionStates = 10;
        static final int TRANSACTION_getConnectionState = 11;
        static final int TRANSACTION_getUserAppName = 12;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothHidDevice asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothHidDevice p0) { return false; }
        public static android.bluetooth.IBluetoothHidDevice getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothHidDevice {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothHidDevice sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean registerApp(android.bluetooth.BluetoothHidDeviceAppSdpSettings p0, android.bluetooth.BluetoothHidDeviceAppQosSettings p1, android.bluetooth.BluetoothHidDeviceAppQosSettings p2, android.bluetooth.IBluetoothHidDeviceCallback p3) throws android.os.RemoteException { return false; }
            public boolean unregisterApp() throws android.os.RemoteException { return false; }
            public boolean sendReport(android.bluetooth.BluetoothDevice p0, int p1, byte[] p2) throws android.os.RemoteException { return false; }
            public boolean replyReport(android.bluetooth.BluetoothDevice p0, byte p1, byte p2, byte[] p3) throws android.os.RemoteException { return false; }
            public boolean reportError(android.bluetooth.BluetoothDevice p0, byte p1) throws android.os.RemoteException { return false; }
            public boolean unplug(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
            public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException { return null; }
            public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getUserAppName() throws android.os.RemoteException { return null; }
        }
    }

    public static class Default implements android.bluetooth.IBluetoothHidDevice {
        public Default() {}
        public boolean registerApp(android.bluetooth.BluetoothHidDeviceAppSdpSettings p0, android.bluetooth.BluetoothHidDeviceAppQosSettings p1, android.bluetooth.BluetoothHidDeviceAppQosSettings p2, android.bluetooth.IBluetoothHidDeviceCallback p3) throws android.os.RemoteException { return false; }
        public boolean unregisterApp() throws android.os.RemoteException { return false; }
        public boolean sendReport(android.bluetooth.BluetoothDevice p0, int p1, byte[] p2) throws android.os.RemoteException { return false; }
        public boolean replyReport(android.bluetooth.BluetoothDevice p0, byte p1, byte p2, byte[] p3) throws android.os.RemoteException { return false; }
        public boolean reportError(android.bluetooth.BluetoothDevice p0, byte p1) throws android.os.RemoteException { return false; }
        public boolean unplug(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
        public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException { return null; }
        public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getUserAppName() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }
}
