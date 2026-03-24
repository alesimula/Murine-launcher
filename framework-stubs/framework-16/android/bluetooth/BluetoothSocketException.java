package android.bluetooth;

public class BluetoothSocketException extends java.io.IOException {
    public static final int BLUETOOTH_OFF_FAILURE = 15;
    public static final int L2CAP_ACL_FAILURE = 2;
    public static final int L2CAP_CLIENT_SECURITY_FAILURE = 3;
    public static final int L2CAP_INSUFFICIENT_AUTHENTICATION = 4;
    public static final int L2CAP_INSUFFICIENT_AUTHORIZATION = 5;
    public static final int L2CAP_INSUFFICIENT_ENCRYPTION = 7;
    public static final int L2CAP_INSUFFICIENT_ENCRYPT_KEY_SIZE = 6;
    public static final int L2CAP_INVALID_PARAMETERS = 11;
    public static final int L2CAP_INVALID_SOURCE_CID = 8;
    public static final int L2CAP_NO_PSM_AVAILABLE = 13;
    public static final int L2CAP_NO_RESOURCES = 12;
    public static final int L2CAP_SOURCE_CID_ALREADY_ALLOCATED = 9;
    public static final int L2CAP_TIMEOUT = 14;
    public static final int L2CAP_UNACCEPTABLE_PARAMETERS = 10;
    public static final int L2CAP_UNKNOWN = 1;
    public static final int NULL_DEVICE = 19;
    public static final int RPC_FAILURE = 20;
    public static final int SOCKET_CLOSED = 17;
    public static final int SOCKET_CONNECTION_FAILURE = 18;
    public static final int SOCKET_MANAGER_FAILURE = 16;
    public static final int UNIX_FILE_SOCKET_CREATION_FAILURE = 21;
    public static final int UNSPECIFIED = 0;
    public BluetoothSocketException(int p0) { super(); }
    public BluetoothSocketException(int p0, java.lang.String p1) { super(); }
    public int getErrorCode() { return 0; }
}
