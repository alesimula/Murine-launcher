package android.bluetooth;

public abstract class BluetoothGattCallback {
    public BluetoothGattCallback() {}
    public void onPhyUpdate(android.bluetooth.BluetoothGatt p0, int p1, int p2, int p3) {}
    public void onPhyRead(android.bluetooth.BluetoothGatt p0, int p1, int p2, int p3) {}
    public void onConnectionStateChange(android.bluetooth.BluetoothGatt p0, int p1, int p2) {}
    public void onServicesDiscovered(android.bluetooth.BluetoothGatt p0, int p1) {}
    public void onCharacteristicRead(android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1, int p2) {}
    public void onCharacteristicWrite(android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1, int p2) {}
    public void onCharacteristicChanged(android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1) {}
    public void onDescriptorRead(android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattDescriptor p1, int p2) {}
    public void onDescriptorWrite(android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattDescriptor p1, int p2) {}
    public void onReliableWriteCompleted(android.bluetooth.BluetoothGatt p0, int p1) {}
    public void onReadRemoteRssi(android.bluetooth.BluetoothGatt p0, int p1, int p2) {}
    public void onMtuChanged(android.bluetooth.BluetoothGatt p0, int p1, int p2) {}
    public void onConnectionUpdated(android.bluetooth.BluetoothGatt p0, int p1, int p2, int p3, int p4) {}
}
