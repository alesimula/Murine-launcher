package android.telephony;

public final class TelephonyScanManager {
    private static final java.lang.String TAG = "TelephonyScanManager";
    public static final java.lang.String SCAN_RESULT_KEY = "scanResult";
    public static final int CALLBACK_SCAN_RESULTS = 1;
    public static final int CALLBACK_SCAN_ERROR = 2;
    public static final int CALLBACK_SCAN_COMPLETE = 3;
    public static final int CALLBACK_RESTRICTED_SCAN_RESULTS = 4;
    public static final int INVALID_SCAN_ID = -1;
    private final android.os.Looper mLooper = null;
    private final android.os.Messenger mMessenger = null;
    private android.util.SparseArray<android.telephony.TelephonyScanManager.NetworkScanInfo> mScanInfo;
    public TelephonyScanManager() {}
    public android.telephony.NetworkScan requestNetworkScan(int p0, android.telephony.NetworkScanRequest p1, java.util.concurrent.Executor p2, android.telephony.TelephonyScanManager.NetworkScanCallback p3, java.lang.String p4) { return null; }
    private void saveScanInfo(int p0, android.telephony.NetworkScanRequest p1, java.util.concurrent.Executor p2, android.telephony.TelephonyScanManager.NetworkScanCallback p3) {}
    private com.android.internal.telephony.ITelephony getITelephony() { return null; }

    private static class NetworkScanInfo {
        private final android.telephony.NetworkScanRequest mRequest = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.telephony.TelephonyScanManager.NetworkScanCallback mCallback = null;
        NetworkScanInfo(android.telephony.NetworkScanRequest p0, java.util.concurrent.Executor p1, android.telephony.TelephonyScanManager.NetworkScanCallback p2) {}
    }

    public static abstract class NetworkScanCallback {
        public NetworkScanCallback() {}
        public void onResults(java.util.List<android.telephony.CellInfo> p0) {}
        public void onComplete() {}
        public void onError(int p0) {}
    }
}
