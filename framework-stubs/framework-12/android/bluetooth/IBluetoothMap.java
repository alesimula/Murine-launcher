package android.bluetooth;

public interface IBluetoothMap extends android.os.IInterface {
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getState(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothDevice getClient(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean disconnect(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean isConnected(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getConnectionState(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;

    public static class Default implements android.bluetooth.IBluetoothMap {
        public Default() {}
        public int getState(android.content.AttributionSource p0) throws android.os.RemoteException { return 0; }
        public android.bluetooth.BluetoothDevice getClient(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
        public boolean disconnect(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public boolean isConnected(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0, android.content.AttributionSource p1) throws android.os.RemoteException { return null; }
        public int getConnectionState(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
        public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothMap {
        public static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothMap";
        static final int TRANSACTION_getState = 1;
        static final int TRANSACTION_getClient = 2;
        static final int TRANSACTION_disconnect = 3;
        static final int TRANSACTION_isConnected = 4;
        static final int TRANSACTION_getConnectedDevices = 5;
        static final int TRANSACTION_getDevicesMatchingConnectionStates = 6;
        static final int TRANSACTION_getConnectionState = 7;
        static final int TRANSACTION_setConnectionPolicy = 8;
        static final int TRANSACTION_getConnectionPolicy = 9;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothMap asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothMap p0) { return false; }
        public static android.bluetooth.IBluetoothMap getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothMap {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothMap sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int getState(android.content.AttributionSource p0) throws android.os.RemoteException { return 0; }
            public android.bluetooth.BluetoothDevice getClient(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
            public boolean disconnect(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public boolean isConnected(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0, android.content.AttributionSource p1) throws android.os.RemoteException { return null; }
            public int getConnectionState(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
            public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
            public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        }
    }
}
