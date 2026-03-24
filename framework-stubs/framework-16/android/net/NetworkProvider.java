package android.net;

public class NetworkProvider {
    public static final int ID_NONE = -1;
    public NetworkProvider(android.content.Context p0, android.os.Looper p1, java.lang.String p2) {}
    public void declareNetworkRequestUnfulfillable(android.net.NetworkRequest p0) {}
    public int getProviderId() { return 0; }
    public void onNetworkRequestWithdrawn(android.net.NetworkRequest p0) {}
    public void onNetworkRequested(android.net.NetworkRequest p0, int p1, int p2) {}
    public void registerNetworkOffer(android.net.NetworkScore p0, android.net.NetworkCapabilities p1, java.util.concurrent.Executor p2, android.net.NetworkProvider.NetworkOfferCallback p3) {}
    public void unregisterNetworkOffer(android.net.NetworkProvider.NetworkOfferCallback p0) {}

    public static interface NetworkOfferCallback {
        public void onNetworkNeeded(android.net.NetworkRequest p0);
        public void onNetworkUnneeded(android.net.NetworkRequest p0);
    }
}
