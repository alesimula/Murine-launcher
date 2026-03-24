package android.telephony;

public final class TelephonyScanManager {
    public static final java.lang.String SCAN_RESULT_KEY = "scanResult";
    public static final int CALLBACK_SCAN_RESULTS = 1;
    public static final int CALLBACK_SCAN_ERROR = 2;
    public static final int CALLBACK_SCAN_COMPLETE = 3;
    public static final int CALLBACK_RESTRICTED_SCAN_RESULTS = 4;
    public static final int CALLBACK_TELEPHONY_DIED = 5;
    public static final int INVALID_SCAN_ID = -1;
    public TelephonyScanManager() {}
    public android.telephony.NetworkScan requestNetworkScan(int p0, boolean p1, android.telephony.NetworkScanRequest p2, java.util.concurrent.Executor p3, android.telephony.TelephonyScanManager.NetworkScanCallback p4, java.lang.String p5, java.lang.String p6) { return null; }

    public static abstract class NetworkScanCallback {
        public NetworkScanCallback() {}
        public void onResults(java.util.List<android.telephony.CellInfo> p0) {}
        public void onComplete() {}
        public void onError(int p0) {}
    }

    private static class NetworkScanInfo {
        NetworkScanInfo(android.telephony.NetworkScanRequest p0, java.util.concurrent.Executor p1, android.telephony.TelephonyScanManager.NetworkScanCallback p2) {}
    }
}
