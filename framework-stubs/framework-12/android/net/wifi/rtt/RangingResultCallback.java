package android.net.wifi.rtt;

public abstract class RangingResultCallback {
    public static final int STATUS_CODE_FAIL = 1;
    public static final int STATUS_CODE_FAIL_RTT_NOT_AVAILABLE = 2;
    public RangingResultCallback() {}
    public abstract void onRangingFailure(int p0);
    public abstract void onRangingResults(java.util.List<android.net.wifi.rtt.RangingResult> p0);
}
