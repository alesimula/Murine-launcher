package android.net;

public final class ConnectivityThread extends android.os.HandlerThread {
    private ConnectivityThread() { super((java.lang.String)null); }
    private static android.net.ConnectivityThread createInstance() { return null; }
    public static android.net.ConnectivityThread get() { return null; }
    public static android.os.Looper getInstanceLooper() { return null; }

    private static class Singleton {
        private static final android.net.ConnectivityThread INSTANCE = null;
        private Singleton() {}
    }
}
