package android.net;

public abstract class SocketKeepalive implements java.lang.AutoCloseable {
    static final java.lang.String TAG = "SocketKeepalive";
    public static final int SUCCESS = 0;
    public static final int NO_KEEPALIVE = -1;
    public static final int DATA_RECEIVED = -2;
    public static final int BINDER_DIED = -10;
    public static final int ERROR_INVALID_NETWORK = -20;
    public static final int ERROR_INVALID_IP_ADDRESS = -21;
    public static final int ERROR_INVALID_PORT = -22;
    public static final int ERROR_INVALID_LENGTH = -23;
    public static final int ERROR_INVALID_INTERVAL = -24;
    public static final int ERROR_INVALID_SOCKET = -25;
    public static final int ERROR_SOCKET_NOT_IDLE = -26;
    public static final int ERROR_UNSUPPORTED = -30;
    public static final int ERROR_HARDWARE_UNSUPPORTED = -30;
    public static final int ERROR_HARDWARE_ERROR = -31;
    public static final int ERROR_INSUFFICIENT_RESOURCES = -32;
    public static final int MIN_INTERVAL_SEC = 10;
    public static final int MAX_INTERVAL_SEC = 3600;
    final android.net.IConnectivityManager mService = null;
    final android.net.Network mNetwork = null;
    final android.os.ParcelFileDescriptor mPfd = null;
    final java.util.concurrent.Executor mExecutor = null;
    final android.net.ISocketKeepaliveCallback mCallback = null;
    java.lang.Integer mSlot;
    SocketKeepalive(android.net.IConnectivityManager p0, android.net.Network p1, android.os.ParcelFileDescriptor p2, java.util.concurrent.Executor p3, android.net.SocketKeepalive.Callback p4) {}
    public final void start(int p0) {}
    abstract void startImpl(int p0);
    public final void stop() {}
    abstract void stopImpl();
    public final void close() {}

    public static class InvalidSocketException extends android.net.SocketKeepalive.ErrorCodeException {
        public InvalidSocketException(int p0, java.lang.Throwable p1) { super(0); }
        public InvalidSocketException(int p0) { super(0); }
    }

    public static class InvalidPacketException extends android.net.SocketKeepalive.ErrorCodeException {
        public InvalidPacketException(int p0) { super(0); }
    }

    public static class ErrorCodeException extends java.lang.Exception {
        public final int error = 0;
        public ErrorCodeException(int p0, java.lang.Throwable p1) { super(); }
        public ErrorCodeException(int p0) { super(); }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ErrorCode {
    }

    public static class Callback {
        public Callback() {}
        public void onStarted() {}
        public void onStopped() {}
        public void onError(int p0) {}
        public void onDataReceived() {}
    }
}
