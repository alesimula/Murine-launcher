package android.bluetooth;

public final class BluetoothGatt implements android.bluetooth.BluetoothProfile {
    public static final int CONNECTION_PRIORITY_BALANCED = 0;
    public static final int CONNECTION_PRIORITY_HIGH = 1;
    public static final int CONNECTION_PRIORITY_LOW_POWER = 2;
    public static final int GATT_CONNECTION_CONGESTED = 143;
    public static final int GATT_FAILURE = 257;
    public static final int GATT_INSUFFICIENT_AUTHENTICATION = 5;
    public static final int GATT_INSUFFICIENT_AUTHORIZATION = 8;
    public static final int GATT_INSUFFICIENT_ENCRYPTION = 15;
    public static final int GATT_INVALID_ATTRIBUTE_LENGTH = 13;
    public static final int GATT_INVALID_OFFSET = 7;
    public static final int GATT_READ_NOT_PERMITTED = 2;
    public static final int GATT_REQUEST_NOT_SUPPORTED = 6;
    public static final int GATT_SUCCESS = 0;
    public static final int GATT_WRITE_NOT_PERMITTED = 3;
    BluetoothGatt() {}
    public void close() {}
    public void disconnect() {}
    public boolean connect() { return false; }
    public void setPreferredPhy(int p0, int p1, int p2) {}
    public void readPhy() {}
    public android.bluetooth.BluetoothDevice getDevice() { return null; }
    public boolean discoverServices() { return false; }
    public java.util.List<android.bluetooth.BluetoothGattService> getServices() { return null; }
    public android.bluetooth.BluetoothGattService getService(java.util.UUID p0) { return null; }
    public boolean readCharacteristic(android.bluetooth.BluetoothGattCharacteristic p0) { return false; }
    @java.lang.Deprecated
    public boolean writeCharacteristic(android.bluetooth.BluetoothGattCharacteristic p0) { return false; }
    public int writeCharacteristic(android.bluetooth.BluetoothGattCharacteristic p0, byte[] p1, int p2) { return 0; }
    public boolean readDescriptor(android.bluetooth.BluetoothGattDescriptor p0) { return false; }
    @java.lang.Deprecated
    public boolean writeDescriptor(android.bluetooth.BluetoothGattDescriptor p0) { return false; }
    public int writeDescriptor(android.bluetooth.BluetoothGattDescriptor p0, byte[] p1) { return 0; }
    public boolean beginReliableWrite() { return false; }
    public boolean executeReliableWrite() { return false; }
    public void abortReliableWrite() {}
    @java.lang.Deprecated
    public void abortReliableWrite(android.bluetooth.BluetoothDevice p0) {}
    public boolean setCharacteristicNotification(android.bluetooth.BluetoothGattCharacteristic p0, boolean p1) { return false; }
    public boolean readRemoteRssi() { return false; }
    public boolean requestMtu(int p0) { return false; }
    public boolean requestConnectionPriority(int p0) { return false; }
    @java.lang.Deprecated
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    @java.lang.Deprecated
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    @java.lang.Deprecated
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
}
