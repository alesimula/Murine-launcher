package android.bluetooth.le;

public final class PeriodicAdvertisingManager {
    private static final java.lang.String TAG = "PeriodicAdvertisingManager";
    private static final int SKIP_MIN = 0;
    private static final int SKIP_MAX = 499;
    private static final int TIMEOUT_MIN = 10;
    private static final int TIMEOUT_MAX = 16384;
    private static final int SYNC_STARTING = -1;
    private final android.bluetooth.BluetoothAdapter mBluetoothAdapter = null;
    private final android.bluetooth.IBluetoothManager mBluetoothManager = null;
    private final android.content.AttributionSource mAttributionSource = null;
    java.util.Map<android.bluetooth.le.PeriodicAdvertisingCallback, android.bluetooth.le.IPeriodicAdvertisingCallback> mCallbackWrappers;
    public PeriodicAdvertisingManager(android.bluetooth.BluetoothAdapter p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public void registerSync(android.bluetooth.le.ScanResult p0, int p1, int p2, android.bluetooth.le.PeriodicAdvertisingCallback p3) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public void registerSync(android.bluetooth.le.ScanResult p0, int p1, int p2, android.bluetooth.le.PeriodicAdvertisingCallback p3, android.os.Handler p4) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public void unregisterSync(android.bluetooth.le.PeriodicAdvertisingCallback p0) {}
    @android.annotation.SuppressLint("AndroidFrameworkBluetoothPermission")
    private android.bluetooth.le.IPeriodicAdvertisingCallback wrap(android.bluetooth.le.PeriodicAdvertisingCallback p0, android.os.Handler p1) { return null; }
}
