package android.bluetooth;

public final class BluetoothManager {
    private static final java.lang.String TAG = "BluetoothManager";
    private static final boolean DBG = false;
    private final android.content.AttributionSource mAttributionSource = null;
    private final android.bluetooth.BluetoothAdapter mAdapter = null;
    public BluetoothManager(android.content.Context p0) {}
    public static android.content.AttributionSource resolveAttributionSource(android.content.Context p0) { return null; }
    @android.annotation.RequiresNoPermission
    public android.bluetooth.BluetoothAdapter getAdapter() { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getConnectionState(android.bluetooth.BluetoothDevice p0, int p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int p0, int[] p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothGattServer openGattServer(android.content.Context p0, android.bluetooth.BluetoothGattServerCallback p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothGattServer openGattServer(android.content.Context p0, android.bluetooth.BluetoothGattServerCallback p1, boolean p2) { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothGattServer openGattServer(android.content.Context p0, android.bluetooth.BluetoothGattServerCallback p1, int p2) { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothGattServer openGattServer(android.content.Context p0, android.bluetooth.BluetoothGattServerCallback p1, int p2, boolean p3) { return null; }
}
