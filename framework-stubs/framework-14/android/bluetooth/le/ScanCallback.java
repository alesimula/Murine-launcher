package android.bluetooth.le;

public abstract class ScanCallback {
    public static final int SCAN_FAILED_ALREADY_STARTED = 1;
    public static final int SCAN_FAILED_APPLICATION_REGISTRATION_FAILED = 2;
    public static final int SCAN_FAILED_FEATURE_UNSUPPORTED = 4;
    public static final int SCAN_FAILED_INTERNAL_ERROR = 3;
    public static final int SCAN_FAILED_OUT_OF_HARDWARE_RESOURCES = 5;
    public static final int SCAN_FAILED_SCANNING_TOO_FREQUENTLY = 6;
    public ScanCallback() {}
    public void onScanResult(int p0, android.bluetooth.le.ScanResult p1) {}
    public void onBatchScanResults(java.util.List<android.bluetooth.le.ScanResult> p0) {}
    public void onScanFailed(int p0) {}
}
