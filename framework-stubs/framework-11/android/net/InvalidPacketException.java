package android.net;

@android.annotation.SystemApi
public final class InvalidPacketException extends java.lang.Exception {
    private final int mError = 0;
    public static final int ERROR_INVALID_IP_ADDRESS = -21;
    public static final int ERROR_INVALID_PORT = -22;
    public static final int ERROR_INVALID_LENGTH = -23;
    public InvalidPacketException(int p0) { super(); }
    public int getError() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ErrorCode {
    }
}
