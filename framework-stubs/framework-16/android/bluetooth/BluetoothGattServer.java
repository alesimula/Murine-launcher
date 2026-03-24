package android.bluetooth;

public final class BluetoothGattServer implements android.bluetooth.BluetoothProfile {
    BluetoothGattServer() {}
    public boolean addService(android.bluetooth.BluetoothGattService p0) { return false; }
    public void cancelConnection(android.bluetooth.BluetoothDevice p0) {}
    public void clearServices() {}
    public void close() {}
    public boolean connect(android.bluetooth.BluetoothDevice p0, boolean p1) { return false; }
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    public android.bluetooth.BluetoothGattService getService(java.util.UUID p0) { return null; }
    public java.util.List<android.bluetooth.BluetoothGattService> getServices() { return null; }
    @java.lang.Deprecated
    public boolean notifyCharacteristicChanged(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothGattCharacteristic p1, boolean p2) { return false; }
    public int notifyCharacteristicChanged(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothGattCharacteristic p1, boolean p2, byte[] p3) { return 0; }
    public void readPhy(android.bluetooth.BluetoothDevice p0) {}
    public boolean removeService(android.bluetooth.BluetoothGattService p0) { return false; }
    public boolean sendResponse(android.bluetooth.BluetoothDevice p0, int p1, int p2, int p3, byte[] p4) { return false; }
    public void setPreferredPhy(android.bluetooth.BluetoothDevice p0, int p1, int p2, int p3) {}
}
