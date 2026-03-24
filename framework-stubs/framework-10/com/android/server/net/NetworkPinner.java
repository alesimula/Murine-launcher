package com.android.server.net;

public class NetworkPinner extends android.net.ConnectivityManager.NetworkCallback {
    private static final java.lang.String TAG = null;
    protected static final java.lang.Object sLock = null;
    private static android.net.ConnectivityManager sCM;
    private static com.android.server.net.NetworkPinner.Callback sCallback;
    protected static android.net.Network sNetwork;
    public NetworkPinner() { super(); }
    private static void maybeInitConnectivityManager(android.content.Context p0) {}
    public static void pin(android.content.Context p0, android.net.NetworkRequest p1) {}
    public static void unpin() {}

    private static class Callback extends android.net.ConnectivityManager.NetworkCallback {
        private Callback() { super(); }
        public void onAvailable(android.net.Network p0) {}
        public void onLost(android.net.Network p0) {}
    }
}
