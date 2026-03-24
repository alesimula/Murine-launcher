package android.net;

public final class InvalidPacketException extends java.lang.Exception {
    public static final int ERROR_INVALID_IP_ADDRESS = -21;
    public static final int ERROR_INVALID_LENGTH = -23;
    public static final int ERROR_INVALID_PORT = -22;
    public InvalidPacketException(int p0) { super(); }
    public int getError() { return 0; }
}
