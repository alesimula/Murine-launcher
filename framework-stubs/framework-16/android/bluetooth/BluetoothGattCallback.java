package android.bluetooth;

public abstract class BluetoothGattCallback {
    public BluetoothGattCallback() {}
    @java.lang.Deprecated
    public void onCharacteristicChanged(android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1) {}
    public void onCharacteristicChanged(android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1, byte[] p2) {}
    public void onCharacteristicRead(android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1, byte[] p2, int p3) {}
    @java.lang.Deprecated
    public void onCharacteristicRead(android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1, int p2) {}
    public void onCharacteristicWrite(android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1, int p2) {}
    public void onConnectionStateChange(android.bluetooth.BluetoothGatt p0, int p1, int p2) {}
    @java.lang.Deprecated
    public void onDescriptorRead(android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattDescriptor p1, int p2) {}
    public void onDescriptorRead(android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattDescriptor p1, int p2, byte[] p3) {}
    public void onDescriptorWrite(android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattDescriptor p1, int p2) {}
    public void onMtuChanged(android.bluetooth.BluetoothGatt p0, int p1, int p2) {}
    public void onPhyRead(android.bluetooth.BluetoothGatt p0, int p1, int p2, int p3) {}
    public void onPhyUpdate(android.bluetooth.BluetoothGatt p0, int p1, int p2, int p3) {}
    public void onReadRemoteRssi(android.bluetooth.BluetoothGatt p0, int p1, int p2) {}
    public void onReliableWriteCompleted(android.bluetooth.BluetoothGatt p0, int p1) {}
    public void onServiceChanged(android.bluetooth.BluetoothGatt p0) {}
    public void onServicesDiscovered(android.bluetooth.BluetoothGatt p0, int p1) {}
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.le_subrate_api")
    public void onSubrateChange(android.bluetooth.BluetoothGatt p0, int p1, int p2) {}
}
