package android.net.wifi.p2p.nsd;

public class WifiP2pDnsSdServiceInfo extends android.net.wifi.p2p.nsd.WifiP2pServiceInfo {
    public static final int VERSION_1 = 1;
    public static final int DNS_TYPE_PTR = 12;
    public static final int DNS_TYPE_TXT = 16;
    private static final java.util.Map<java.lang.String, java.lang.String> sVmPacket = null;
    private WifiP2pDnsSdServiceInfo(java.util.List<java.lang.String> p0) { super(null); }
    public static android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceInfo newInstance(java.lang.String p0, java.lang.String p1, java.util.Map<java.lang.String, java.lang.String> p2) { return null; }
    private static java.lang.String createPtrServiceQuery(java.lang.String p0, java.lang.String p1) { return null; }
    private static java.lang.String createTxtServiceQuery(java.lang.String p0, java.lang.String p1, android.net.nsd.DnsSdTxtRecord p2) { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    static java.lang.String createRequest(java.lang.String p0, int p1, int p2) { return null; }
    private static java.lang.String compressDnsName(java.lang.String p0) { return null; }
}
