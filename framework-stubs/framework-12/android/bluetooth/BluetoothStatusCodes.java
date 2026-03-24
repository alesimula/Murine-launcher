package android.bluetooth;

public final class BluetoothStatusCodes {
    public static final int SUCCESS = 0;
    public static final int ERROR_BLUETOOTH_NOT_ENABLED = 1;
    public static final int ERROR_BLUETOOTH_NOT_ALLOWED = 2;
    public static final int ERROR_DEVICE_NOT_BONDED = 3;
    public static final int ERROR_DEVICE_NOT_CONNECTED = 4;
    public static final int ERROR_MISSING_BLUETOOTH_ADVERTISE_PERMISSION = 5;
    public static final int ERROR_MISSING_BLUETOOTH_CONNECT_PERMISSION = 6;
    public static final int ERROR_MISSING_BLUETOOTH_SCAN_PERMISSION = 7;
    @android.annotation.SystemApi
    public static final int ERROR_ANOTHER_ACTIVE_OOB_REQUEST = 1000;
    public static final int ERROR_DISCONNECT_REASON_LOCAL_REQUEST = 1100;
    public static final int ERROR_DISCONNECT_REASON_REMOTE_REQUEST = 1101;
    public static final int ERROR_DISCONNECT_REASON_LOCAL = 1102;
    public static final int ERROR_DISCONNECT_REASON_REMOTE = 1103;
    public static final int ERROR_DISCONNECT_REASON_TIMEOUT = 1104;
    public static final int ERROR_DISCONNECT_REASON_SECURITY = 1105;
    public static final int ERROR_DISCONNECT_REASON_SYSTEM_POLICY = 1106;
    public static final int ERROR_DISCONNECT_REASON_RESOURCE_LIMIT_REACHED = 1107;
    public static final int ERROR_DISCONNECT_REASON_CONNECTION_ALREADY_EXISTS = 1108;
    public static final int ERROR_DISCONNECT_REASON_BAD_PARAMETERS = 1109;
    public static final int ERROR_UNKNOWN = 2147483647;
    private BluetoothStatusCodes() {}
}
