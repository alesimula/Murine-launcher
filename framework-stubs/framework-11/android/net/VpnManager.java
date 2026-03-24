package android.net;

public class VpnManager {
    public static final int TYPE_VPN_NONE = -1;
    public static final int TYPE_VPN_SERVICE = 1;
    public static final int TYPE_VPN_PLATFORM = 2;
    private final android.content.Context mContext = null;
    private final android.net.IConnectivityManager mService = null;
    private static android.content.Intent getIntentForConfirmation() { return null; }
    public VpnManager(android.content.Context p0, android.net.IConnectivityManager p1) {}
    public android.content.Intent provisionVpnProfile(android.net.PlatformVpnProfile p0) { return null; }
    public void deleteProvisionedVpnProfile() {}
    public void startProvisionedVpnProfile() {}
    public void stopProvisionedVpnProfile() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VpnType {
    }
}
