package android.net.vcn.persistablebundleutils;

public final class TunnelModeChildSessionParamsUtils {
    private static final java.lang.String TAG = null;
    private static final java.lang.String INBOUND_TS_KEY = "INBOUND_TS_KEY";
    private static final java.lang.String OUTBOUND_TS_KEY = "OUTBOUND_TS_KEY";
    private static final java.lang.String SA_PROPOSALS_KEY = "SA_PROPOSALS_KEY";
    private static final java.lang.String HARD_LIFETIME_SEC_KEY = "HARD_LIFETIME_SEC_KEY";
    private static final java.lang.String SOFT_LIFETIME_SEC_KEY = "SOFT_LIFETIME_SEC_KEY";
    private static final java.lang.String CONFIG_REQUESTS_KEY = "CONFIG_REQUESTS_KEY";
    public TunnelModeChildSessionParamsUtils() {}
    public static android.os.PersistableBundle toPersistableBundle(android.net.ipsec.ike.TunnelModeChildSessionParams p0) { return null; }
    private static java.util.List<android.net.ipsec.ike.IkeTrafficSelector> getTsFromPersistableBundle(android.os.PersistableBundle p0, java.lang.String p1) { return null; }
    public static android.net.ipsec.ike.TunnelModeChildSessionParams fromPersistableBundle(android.os.PersistableBundle p0) { return null; }

    private static class ConfigRequest {
        private static final int TYPE_IPV4_ADDRESS = 1;
        private static final int TYPE_IPV6_ADDRESS = 2;
        private static final int TYPE_IPV4_DNS = 3;
        private static final int TYPE_IPV6_DNS = 4;
        private static final int TYPE_IPV4_DHCP = 5;
        private static final int TYPE_IPV4_NETMASK = 6;
        private static final java.lang.String TYPE_KEY = "type";
        private static final java.lang.String VALUE_KEY = "address";
        private static final java.lang.String IP6_PREFIX_LEN = "ip6PrefixLen";
        private static final int PREFIX_LEN_UNUSED = -1;
        public final int type = 0;
        public final int ip6PrefixLen = 0;
        public final java.net.InetAddress address = null;
        ConfigRequest(android.net.ipsec.ike.TunnelModeChildSessionParams.TunnelModeChildConfigRequest p0) {}
        ConfigRequest(android.os.PersistableBundle p0) {}
        public android.os.PersistableBundle toPersistableBundle() { return null; }
    }
}
