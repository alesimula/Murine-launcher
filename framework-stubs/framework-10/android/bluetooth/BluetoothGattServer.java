package android.bluetooth;

public final class BluetoothGattServer implements android.bluetooth.BluetoothProfile {
    private static final java.lang.String TAG = "BluetoothGattServer";
    private static final boolean DBG = true;
    private static final boolean VDBG = false;
    private android.bluetooth.BluetoothAdapter mAdapter;
    private android.bluetooth.IBluetoothGatt mService;
    private android.bluetooth.BluetoothGattServerCallback mCallback;
    private java.lang.Object mServerIfLock;
    private int mServerIf;
    private int mTransport;
    private android.bluetooth.BluetoothGattService mPendingService;
    private java.util.List<android.bluetooth.BluetoothGattService> mServices;
    private static final int CALLBACK_REG_TIMEOUT = 10000;
    private final android.bluetooth.IBluetoothGattServerCallback mBluetoothGattServerCallback = null;
    BluetoothGattServer(android.bluetooth.IBluetoothGatt p0, int p1) {}
    android.bluetooth.BluetoothGattCharacteristic getCharacteristicByHandle(int p0) { return null; }
    android.bluetooth.BluetoothGattDescriptor getDescriptorByHandle(int p0) { return null; }
    public void close() {}
    boolean registerCallback(android.bluetooth.BluetoothGattServerCallback p0) { return false; }
    private void unregisterCallback() {}
    android.bluetooth.BluetoothGattService getService(java.util.UUID p0, int p1, int p2) { return null; }
    public boolean connect(android.bluetooth.BluetoothDevice p0, boolean p1) { return false; }
    public void cancelConnection(android.bluetooth.BluetoothDevice p0) {}
    public void setPreferredPhy(android.bluetooth.BluetoothDevice p0, int p1, int p2, int p3) {}
    public void readPhy(android.bluetooth.BluetoothDevice p0) {}
    public boolean sendResponse(android.bluetooth.BluetoothDevice p0, int p1, int p2, int p3, byte[] p4) { return false; }
    public boolean notifyCharacteristicChanged(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothGattCharacteristic p1, boolean p2) { return false; }
    public boolean addService(android.bluetooth.BluetoothGattService p0) { return false; }
    public boolean removeService(android.bluetooth.BluetoothGattService p0) { return false; }
    public void clearServices() {}
    public java.util.List<android.bluetooth.BluetoothGattService> getServices() { return null; }
    public android.bluetooth.BluetoothGattService getService(java.util.UUID p0) { return null; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
}
