package android.net;

@android.annotation.SystemApi
public class NetworkProvider {
    public static final int ID_NONE = -1;
    public static final int ID_VPN = -2;
    public static final int FIRST_PROVIDER_ID = 1;
    public static final int CMD_REQUEST_NETWORK = 1;
    public static final int CMD_CANCEL_REQUEST = 2;
    private final android.os.Messenger mMessenger = null;
    private final java.lang.String mName = null;
    private final android.net.ConnectivityManager mCm = null;
    private int mProviderId;
    @android.annotation.SystemApi
    public NetworkProvider(android.content.Context p0, android.os.Looper p1, java.lang.String p2) {}
    public android.os.Messenger getMessenger() { return null; }
    public java.lang.String getName() { return null; }
    public int getProviderId() { return 0; }
    public void setProviderId(int p0) {}
    @android.annotation.SystemApi
    public void onNetworkRequested(android.net.NetworkRequest p0, int p1, int p2) {}
    @android.annotation.SystemApi
    public void onNetworkRequestWithdrawn(android.net.NetworkRequest p0) {}
    @android.annotation.SystemApi
    public void declareNetworkRequestUnfulfillable(android.net.NetworkRequest p0) {}
}
