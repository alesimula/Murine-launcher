package android.net;

public final class NattSocketKeepalive extends android.net.SocketKeepalive {
    public static final int NATT_PORT = 4500;
    private final java.net.InetAddress mSource = null;
    private final java.net.InetAddress mDestination = null;
    private final int mResourceId = 0;
    NattSocketKeepalive(android.net.IConnectivityManager p0, android.net.Network p1, android.os.ParcelFileDescriptor p2, int p3, java.net.InetAddress p4, java.net.InetAddress p5, java.util.concurrent.Executor p6, android.net.SocketKeepalive.Callback p7) { super(null, null, null, null, null); }
    void startImpl(int p0) {}
    void stopImpl() {}
}
