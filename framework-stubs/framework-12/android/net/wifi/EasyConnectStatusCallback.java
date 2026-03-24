package android.net.wifi;

public abstract class EasyConnectStatusCallback {
    public static final int EASY_CONNECT_EVENT_FAILURE_AUTHENTICATION = -2;
    public static final int EASY_CONNECT_EVENT_FAILURE_BUSY = -5;
    public static final int EASY_CONNECT_EVENT_FAILURE_CANNOT_FIND_NETWORK = -10;
    public static final int EASY_CONNECT_EVENT_FAILURE_CONFIGURATION = -4;
    public static final int EASY_CONNECT_EVENT_FAILURE_ENROLLEE_AUTHENTICATION = -11;
    public static final int EASY_CONNECT_EVENT_FAILURE_ENROLLEE_FAILED_TO_SCAN_NETWORK_CHANNEL = -14;
    public static final int EASY_CONNECT_EVENT_FAILURE_ENROLLEE_REJECTED_CONFIGURATION = -12;
    public static final int EASY_CONNECT_EVENT_FAILURE_GENERIC = -7;
    public static final int EASY_CONNECT_EVENT_FAILURE_INVALID_NETWORK = -9;
    public static final int EASY_CONNECT_EVENT_FAILURE_INVALID_URI = -1;
    public static final int EASY_CONNECT_EVENT_FAILURE_NOT_COMPATIBLE = -3;
    public static final int EASY_CONNECT_EVENT_FAILURE_NOT_SUPPORTED = -8;
    public static final int EASY_CONNECT_EVENT_FAILURE_TIMEOUT = -6;
    public static final int EASY_CONNECT_EVENT_FAILURE_URI_GENERATION = -13;
    public static final int EASY_CONNECT_EVENT_PROGRESS_AUTHENTICATION_SUCCESS = 0;
    public static final int EASY_CONNECT_EVENT_PROGRESS_CONFIGURATION_ACCEPTED = 3;
    public static final int EASY_CONNECT_EVENT_PROGRESS_CONFIGURATION_SENT_WAITING_RESPONSE = 2;
    public static final int EASY_CONNECT_EVENT_PROGRESS_RESPONSE_PENDING = 1;
    public static final int EASY_CONNECT_EVENT_SUCCESS_CONFIGURATION_APPLIED = 1;
    public static final int EASY_CONNECT_EVENT_SUCCESS_CONFIGURATION_SENT = 0;
    public EasyConnectStatusCallback() {}
    public abstract void onEnrolleeSuccess(int p0);
    public abstract void onConfiguratorSuccess(int p0);
    public void onFailure(int p0) {}
    public void onFailure(int p0, java.lang.String p1, android.util.SparseArray<int[]> p2, int[] p3) {}
    public abstract void onProgress(int p0);
    public void onBootstrapUriGenerated(android.net.Uri p0) {}
}
