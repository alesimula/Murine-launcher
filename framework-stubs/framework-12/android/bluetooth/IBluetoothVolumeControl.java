package android.bluetooth;

public interface IBluetoothVolumeControl extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothVolumeControl";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean connect(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean disconnect(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getConnectionState(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void setVolume(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void setVolumeGroup(int p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException;

    public static class Default implements android.bluetooth.IBluetoothVolumeControl {
        public Default() {}
        public boolean connect(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public boolean disconnect(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0, android.content.AttributionSource p1) throws android.os.RemoteException { return null; }
        public int getConnectionState(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
        public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        public void setVolume(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public void setVolumeGroup(int p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothVolumeControl {
        static final int TRANSACTION_connect = 1;
        static final int TRANSACTION_disconnect = 2;
        static final int TRANSACTION_getConnectedDevices = 3;
        static final int TRANSACTION_getDevicesMatchingConnectionStates = 4;
        static final int TRANSACTION_getConnectionState = 5;
        static final int TRANSACTION_setConnectionPolicy = 6;
        static final int TRANSACTION_getConnectionPolicy = 7;
        static final int TRANSACTION_setVolume = 8;
        static final int TRANSACTION_setVolumeGroup = 9;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothVolumeControl asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothVolumeControl p0) { return false; }
        public static android.bluetooth.IBluetoothVolumeControl getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothVolumeControl {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothVolumeControl sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean connect(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public boolean disconnect(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0, android.content.AttributionSource p1) throws android.os.RemoteException { return null; }
            public int getConnectionState(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
            public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
            public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
            public void setVolume(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public void setVolumeGroup(int p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        }
    }
}
