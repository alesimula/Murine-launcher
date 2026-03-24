package android.debug;

@android.annotation.SystemApi
public class AdbManager {
    private static final java.lang.String TAG = "AdbManager";
    public static final java.lang.String WIRELESS_DEBUG_STATE_CHANGED_ACTION = "com.android.server.adb.WIRELESS_DEBUG_STATUS";
    public static final java.lang.String WIRELESS_DEBUG_PAIRED_DEVICES_ACTION = "com.android.server.adb.WIRELESS_DEBUG_PAIRED_DEVICES";
    public static final java.lang.String WIRELESS_DEBUG_PAIRING_RESULT_ACTION = "com.android.server.adb.WIRELESS_DEBUG_PAIRING_RESULT";
    public static final java.lang.String WIRELESS_DEVICES_EXTRA = "devices_map";
    public static final java.lang.String WIRELESS_STATUS_EXTRA = "status";
    public static final java.lang.String WIRELESS_PAIR_DEVICE_EXTRA = "pair_device";
    public static final java.lang.String WIRELESS_PAIRING_CODE_EXTRA = "pairing_code";
    public static final java.lang.String WIRELESS_DEBUG_PORT_EXTRA = "adb_port";
    public static final int WIRELESS_STATUS_FAIL = 0;
    public static final int WIRELESS_STATUS_SUCCESS = 1;
    public static final int WIRELESS_STATUS_CANCELLED = 2;
    public static final int WIRELESS_STATUS_PAIRING_CODE = 3;
    public static final int WIRELESS_STATUS_CONNECTED = 4;
    public static final int WIRELESS_STATUS_DISCONNECTED = 5;
    private final android.content.Context mContext = null;
    private final android.debug.IAdbManager mService = null;
    public AdbManager(android.content.Context p0, android.debug.IAdbManager p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_DEBUGGING")
    public boolean isAdbWifiSupported() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_DEBUGGING")
    public boolean isAdbWifiQrSupported() { return false; }
}
