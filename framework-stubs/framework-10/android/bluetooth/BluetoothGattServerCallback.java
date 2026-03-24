package android.bluetooth;

public abstract class BluetoothGattServerCallback {
    public BluetoothGattServerCallback() {}
    public void onConnectionStateChange(android.bluetooth.BluetoothDevice p0, int p1, int p2) {}
    public void onServiceAdded(int p0, android.bluetooth.BluetoothGattService p1) {}
    public void onCharacteristicReadRequest(android.bluetooth.BluetoothDevice p0, int p1, int p2, android.bluetooth.BluetoothGattCharacteristic p3) {}
    public void onCharacteristicWriteRequest(android.bluetooth.BluetoothDevice p0, int p1, android.bluetooth.BluetoothGattCharacteristic p2, boolean p3, boolean p4, int p5, byte[] p6) {}
    public void onDescriptorReadRequest(android.bluetooth.BluetoothDevice p0, int p1, int p2, android.bluetooth.BluetoothGattDescriptor p3) {}
    public void onDescriptorWriteRequest(android.bluetooth.BluetoothDevice p0, int p1, android.bluetooth.BluetoothGattDescriptor p2, boolean p3, boolean p4, int p5, byte[] p6) {}
    public void onExecuteWrite(android.bluetooth.BluetoothDevice p0, int p1, boolean p2) {}
    public void onNotificationSent(android.bluetooth.BluetoothDevice p0, int p1) {}
    public void onMtuChanged(android.bluetooth.BluetoothDevice p0, int p1) {}
    public void onPhyUpdate(android.bluetooth.BluetoothDevice p0, int p1, int p2, int p3) {}
    public void onPhyRead(android.bluetooth.BluetoothDevice p0, int p1, int p2, int p3) {}
    public void onConnectionUpdated(android.bluetooth.BluetoothDevice p0, int p1, int p2, int p3, int p4) {}
}
