package android.bluetooth.le;

public final class BluetoothLeScanner {
    public static final java.lang.String EXTRA_CALLBACK_TYPE = "android.bluetooth.le.extra.CALLBACK_TYPE";
    public static final java.lang.String EXTRA_ERROR_CODE = "android.bluetooth.le.extra.ERROR_CODE";
    public static final java.lang.String EXTRA_LIST_SCAN_RESULT = "android.bluetooth.le.extra.LIST_SCAN_RESULT";
    BluetoothLeScanner() {}
    public void flushPendingScanResults(android.bluetooth.le.ScanCallback p0) {}
    public void startScan(android.bluetooth.le.ScanCallback p0) {}
    public int startScan(java.util.List<android.bluetooth.le.ScanFilter> p0, android.bluetooth.le.ScanSettings p1, android.app.PendingIntent p2) { return 0; }
    public void startScan(java.util.List<android.bluetooth.le.ScanFilter> p0, android.bluetooth.le.ScanSettings p1, android.bluetooth.le.ScanCallback p2) {}
    public void startScanFromSource(android.os.WorkSource p0, android.bluetooth.le.ScanCallback p1) {}
    public void startScanFromSource(java.util.List<android.bluetooth.le.ScanFilter> p0, android.bluetooth.le.ScanSettings p1, android.os.WorkSource p2, android.bluetooth.le.ScanCallback p3) {}
    public void stopScan(android.app.PendingIntent p0) {}
    public void stopScan(android.bluetooth.le.ScanCallback p0) {}
}
