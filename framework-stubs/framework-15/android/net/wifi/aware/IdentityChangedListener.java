package android.net.wifi.aware;

public class IdentityChangedListener {
    public static final int CLUSTER_CHANGE_EVENT_JOINED = 1;
    public static final int CLUSTER_CHANGE_EVENT_STARTED = 0;
    public IdentityChangedListener() {}
    public void onClusterIdChanged(int p0, android.net.MacAddress p1) {}
    public void onIdentityChanged(byte[] p0) {}
}
