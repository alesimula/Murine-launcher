package android.net.vcn.persistablebundleutils;

public final class TunnelModeChildSessionParamsUtils {
    public TunnelModeChildSessionParamsUtils() {}
    public static android.os.PersistableBundle toPersistableBundle(android.net.ipsec.ike.TunnelModeChildSessionParams p0) { return null; }
    public static android.net.ipsec.ike.TunnelModeChildSessionParams fromPersistableBundle(android.os.PersistableBundle p0) { return null; }

    private static class ConfigRequest {
        public final int type = 0;
        public final int ip6PrefixLen = 0;
        public final java.net.InetAddress address = null;
        ConfigRequest(android.net.ipsec.ike.TunnelModeChildSessionParams.TunnelModeChildConfigRequest p0) {}
        ConfigRequest(android.os.PersistableBundle p0) {}
        public android.os.PersistableBundle toPersistableBundle() { return null; }
    }
}
