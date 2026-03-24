package android.net.vcn.persistablebundleutils;

public final class TunnelConnectionParamsUtils {
    private static final int EXPECTED_BUNDLE_KEY_CNT = 1;
    private static final java.lang.String PARAMS_TYPE_IKE = "IKE";
    public TunnelConnectionParamsUtils() {}
    public static android.os.PersistableBundle toPersistableBundle(android.net.ipsec.ike.IkeTunnelConnectionParams p0) { return null; }
    public static android.net.ipsec.ike.IkeTunnelConnectionParams fromPersistableBundle(android.os.PersistableBundle p0) { return null; }

    private static final class IkeTunnelConnectionParamsUtils {
        private static final java.lang.String IKE_PARAMS_KEY = "IKE_PARAMS_KEY";
        private static final java.lang.String CHILD_PARAMS_KEY = "CHILD_PARAMS_KEY";
        private IkeTunnelConnectionParamsUtils() {}
        public static android.os.PersistableBundle serializeIkeParams(android.net.ipsec.ike.IkeTunnelConnectionParams p0) { return null; }
        public static android.net.ipsec.ike.IkeTunnelConnectionParams deserializeIkeParams(android.os.PersistableBundle p0) { return null; }
    }
}
