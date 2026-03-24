package android.bluetooth;

public final class BluetoothGattServer implements android.bluetooth.BluetoothProfile {
    private static final java.lang.String TAG = "BluetoothGattServer";
    private static final boolean DBG = true;
    private static final boolean VDBG = false;
    private final android.bluetooth.IBluetoothGatt mService = null;
    private final android.bluetooth.BluetoothAdapter mAdapter = null;
    private final android.content.AttributionSource mAttributionSource = null;
    private android.bluetooth.BluetoothGattServerCallback mCallback;
    private java.lang.Object mServerIfLock;
    private int mServerIf;
    private int mTransport;
    private android.bluetooth.BluetoothGattService mPendingService;
    private java.util.List<android.bluetooth.BluetoothGattService> mServices;
    private static final int CALLBACK_REG_TIMEOUT = 10000;
    @android.annotation.SuppressLint("AndroidFrameworkBluetoothPermission")
    private final android.bluetooth.IBluetoothGattServerCallback mBluetoothGattServerCallback = null;
    BluetoothGattServer(android.bluetooth.IBluetoothGatt p0, int p1, android.bluetooth.BluetoothAdapter p2) {}
    android.bluetooth.BluetoothGattCharacteristic getCharacteristicByHandle(int p0) { return null; }
    android.bluetooth.BluetoothGattDescriptor getDescriptorByHandle(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void close() {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    boolean registerCallback(android.bluetooth.BluetoothGattServerCallback p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    boolean registerCallback(android.bluetooth.BluetoothGattServerCallback p0, boolean p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    private void unregisterCallback() {}
    android.bluetooth.BluetoothGattService getService(java.util.UUID p0, int p1, int p2) { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean connect(android.bluetooth.BluetoothDevice p0, boolean p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void cancelConnection(android.bluetooth.BluetoothDevice p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void setPreferredPhy(android.bluetooth.BluetoothDevice p0, int p1, int p2, int p3) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void readPhy(android.bluetooth.BluetoothDevice p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean sendResponse(android.bluetooth.BluetoothDevice p0, int p1, int p2, int p3, byte[] p4) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean notifyCharacteristicChanged(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothGattCharacteristic p1, boolean p2) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean addService(android.bluetooth.BluetoothGattService p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean removeService(android.bluetooth.BluetoothGattService p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void clearServices() {}
    @android.annotation.RequiresNoPermission
    public java.util.List<android.bluetooth.BluetoothGattService> getServices() { return null; }
    @android.annotation.RequiresNoPermission
    public android.bluetooth.BluetoothGattService getService(java.util.UUID p0) { return null; }
    @android.annotation.RequiresNoPermission
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.RequiresNoPermission
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    @android.annotation.RequiresNoPermission
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
}
