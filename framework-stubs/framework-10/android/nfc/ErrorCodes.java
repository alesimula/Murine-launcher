package android.nfc;

public class ErrorCodes {
    public static final int SUCCESS = 0;
    public static final int ERROR_IO = -1;
    public static final int ERROR_CANCELLED = -2;
    public static final int ERROR_TIMEOUT = -3;
    public static final int ERROR_BUSY = -4;
    public static final int ERROR_CONNECT = -5;
    public static final int ERROR_DISCONNECT = -5;
    public static final int ERROR_READ = -6;
    public static final int ERROR_WRITE = -7;
    public static final int ERROR_INVALID_PARAM = -8;
    public static final int ERROR_INSUFFICIENT_RESOURCES = -9;
    public static final int ERROR_SOCKET_CREATION = -10;
    public static final int ERROR_SOCKET_NOT_CONNECTED = -11;
    public static final int ERROR_BUFFER_TO_SMALL = -12;
    public static final int ERROR_SAP_USED = -13;
    public static final int ERROR_SERVICE_NAME_USED = -14;
    public static final int ERROR_SOCKET_OPTIONS = -15;
    public static final int ERROR_NFC_ON = -16;
    public static final int ERROR_NOT_INITIALIZED = -17;
    public static final int ERROR_SE_ALREADY_SELECTED = -18;
    public static final int ERROR_SE_CONNECTED = -19;
    public static final int ERROR_NO_SE_CONNECTED = -20;
    public static final int ERROR_NOT_SUPPORTED = -21;
    public ErrorCodes() {}
    @android.annotation.UnsupportedAppUsage
    public static boolean isError(int p0) { return false; }
    public static java.lang.String asString(int p0) { return null; }
}
