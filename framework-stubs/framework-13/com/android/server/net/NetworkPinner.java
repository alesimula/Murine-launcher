package com.android.server.net;

public class NetworkPinner extends android.net.ConnectivityManager.NetworkCallback {
    protected static final java.lang.Object sLock = null;
    protected static android.net.Network sNetwork;
    public NetworkPinner() { super(); }
    public static void pin(android.content.Context p0, android.net.NetworkRequest p1) {}
    public static void unpin() {}

    private static class Callback extends android.net.ConnectivityManager.NetworkCallback {
        public void onAvailable(android.net.Network p0) {}
        public void onLost(android.net.Network p0) {}
    }
}
