package android.bluetooth.le;

public final class BluetoothLeScanner {
    private static final java.lang.String TAG = "BluetoothLeScanner";
    private static final boolean DBG = true;
    private static final boolean VDBG = false;
    public static final java.lang.String EXTRA_LIST_SCAN_RESULT = "android.bluetooth.le.extra.LIST_SCAN_RESULT";
    public static final java.lang.String EXTRA_ERROR_CODE = "android.bluetooth.le.extra.ERROR_CODE";
    public static final java.lang.String EXTRA_CALLBACK_TYPE = "android.bluetooth.le.extra.CALLBACK_TYPE";
    private final android.bluetooth.BluetoothAdapter mBluetoothAdapter = null;
    private final android.bluetooth.IBluetoothManager mBluetoothManager = null;
    private final android.content.AttributionSource mAttributionSource = null;
    private final android.os.Handler mHandler = null;
    private final java.util.Map<android.bluetooth.le.ScanCallback, android.bluetooth.le.BluetoothLeScanner.BleScanCallbackWrapper> mLeScanClients = null;
    public BluetoothLeScanner(android.bluetooth.BluetoothAdapter p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public void startScan(android.bluetooth.le.ScanCallback p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public void startScan(java.util.List<android.bluetooth.le.ScanFilter> p0, android.bluetooth.le.ScanSettings p1, android.bluetooth.le.ScanCallback p2) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public int startScan(java.util.List<android.bluetooth.le.ScanFilter> p0, android.bluetooth.le.ScanSettings p1, android.app.PendingIntent p2) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_SCAN", "android.permission.UPDATE_DEVICE_STATS"})
    public void startScanFromSource(android.os.WorkSource p0, android.bluetooth.le.ScanCallback p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_SCAN", "android.permission.UPDATE_DEVICE_STATS"})
    @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
    public void startScanFromSource(java.util.List<android.bluetooth.le.ScanFilter> p0, android.bluetooth.le.ScanSettings p1, android.os.WorkSource p2, android.bluetooth.le.ScanCallback p3) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    private int startScan(java.util.List<android.bluetooth.le.ScanFilter> p0, android.bluetooth.le.ScanSettings p1, android.os.WorkSource p2, android.bluetooth.le.ScanCallback p3, android.app.PendingIntent p4, java.util.List<java.util.List<android.bluetooth.le.ResultStorageDescriptor>> p5) { return 0; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public void stopScan(android.bluetooth.le.ScanCallback p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public void stopScan(android.app.PendingIntent p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public void flushPendingScanResults(android.bluetooth.le.ScanCallback p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public void startTruncatedScan(java.util.List<android.bluetooth.le.TruncatedFilter> p0, android.bluetooth.le.ScanSettings p1, android.bluetooth.le.ScanCallback p2) {}
    @android.annotation.RequiresNoPermission
    public void cleanup() {}
    private int postCallbackErrorOrReturn(android.bluetooth.le.ScanCallback p0, int p1) { return 0; }
    @android.annotation.SuppressLint("AndroidFrameworkBluetoothPermission")
    private void postCallbackError(android.bluetooth.le.ScanCallback p0, int p1) {}
    private boolean isSettingsConfigAllowedForScan(android.bluetooth.le.ScanSettings p0) { return false; }
    private boolean isSettingsAndFilterComboAllowed(android.bluetooth.le.ScanSettings p0, java.util.List<android.bluetooth.le.ScanFilter> p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    private boolean isHardwareResourcesAvailableForScan(android.bluetooth.le.ScanSettings p0) { return false; }

    @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
    private class BleScanCallbackWrapper extends android.bluetooth.le.IScannerCallback.Stub {
        private static final int REGISTRATION_CALLBACK_TIMEOUT_MILLIS = 2000;
        private final android.bluetooth.le.ScanCallback mScanCallback = null;
        private final java.util.List<android.bluetooth.le.ScanFilter> mFilters = null;
        private final android.os.WorkSource mWorkSource = null;
        private android.bluetooth.le.ScanSettings mSettings;
        private android.bluetooth.IBluetoothGatt mBluetoothGatt;
        private java.util.List<java.util.List<android.bluetooth.le.ResultStorageDescriptor>> mResultStorages;
        private int mScannerId;
        public BleScanCallbackWrapper(android.bluetooth.IBluetoothGatt p0, java.util.List<android.bluetooth.le.ScanFilter> p1, android.bluetooth.le.ScanSettings p2, android.os.WorkSource p3, android.bluetooth.le.ScanCallback p4, java.util.List<java.util.List<android.bluetooth.le.ResultStorageDescriptor>> p5) { super(); }
        public void startRegistration() {}
        @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
        public void stopLeScan() {}
        @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
        void flushPendingBatchResults() {}
        public void onScannerRegistered(int p0, int p1) {}
        public void onScanResult(android.bluetooth.le.ScanResult p0) {}
        public void onBatchScanResults(java.util.List<android.bluetooth.le.ScanResult> p0) {}
        public void onFoundOrLost(boolean p0, android.bluetooth.le.ScanResult p1) {}
        public void onScanManagerErrorCallback(int p0) {}
    }
}
