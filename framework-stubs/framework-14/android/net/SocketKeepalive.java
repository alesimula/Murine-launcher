package android.net;

public abstract class SocketKeepalive implements java.lang.AutoCloseable {
    public static final int ERROR_HARDWARE_ERROR = -31;
    public static final int ERROR_INSUFFICIENT_RESOURCES = -32;
    public static final int ERROR_INVALID_INTERVAL = -24;
    public static final int ERROR_INVALID_IP_ADDRESS = -21;
    public static final int ERROR_INVALID_LENGTH = -23;
    public static final int ERROR_INVALID_NETWORK = -20;
    public static final int ERROR_INVALID_PORT = -22;
    public static final int ERROR_INVALID_SOCKET = -25;
    public static final int ERROR_NO_SUCH_SLOT = -33;
    public static final int ERROR_SOCKET_NOT_IDLE = -26;
    public static final int ERROR_UNSUPPORTED = -30;
    public static final int FLAG_AUTOMATIC_ON_OFF = 1;
    public static final int SUCCESS = 0;
    SocketKeepalive() {}
    public final void start(int p0) {}
    public final void start(int p0, int p1, android.net.Network p2) {}
    public final void stop() {}
    public final void close() {}

    public static class Callback {
        public Callback() {}
        public void onStarted() {}
        public void onStopped() {}
        public void onError(int p0) {}
        public void onDataReceived() {}
    }
}
