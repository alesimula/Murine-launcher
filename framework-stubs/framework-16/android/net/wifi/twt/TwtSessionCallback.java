package android.net.wifi.twt;

@android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
public interface TwtSessionCallback {
    public static final int TWT_ERROR_CODE_AP_NOT_SUPPORTED = 1;
    public static final int TWT_ERROR_CODE_AP_OUI_BLOCKLISTED = 2;
    public static final int TWT_ERROR_CODE_AP_REJECTED = 3;
    public static final int TWT_ERROR_CODE_FAIL = 0;
    public static final int TWT_ERROR_CODE_INVALID_PARAMS = 4;
    public static final int TWT_ERROR_CODE_MAX_SESSIONS_REACHED = 5;
    public static final int TWT_ERROR_CODE_NOT_AVAILABLE = 6;
    public static final int TWT_ERROR_CODE_NOT_SUPPORTED = 7;
    public static final int TWT_ERROR_CODE_TIMEOUT = 8;
    public static final int TWT_REASON_CODE_INTERNALLY_INITIATED = 2;
    public static final int TWT_REASON_CODE_LOCALLY_REQUESTED = 1;
    public static final int TWT_REASON_CODE_PEER_INITIATED = 3;
    public static final int TWT_REASON_CODE_UNKNOWN = 0;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public void onCreate(android.net.wifi.twt.TwtSession p0);
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public void onFailure(int p0);
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public void onTeardown(int p0);
}
