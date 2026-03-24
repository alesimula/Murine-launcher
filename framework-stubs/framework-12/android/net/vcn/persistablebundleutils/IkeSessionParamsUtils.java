package android.net.vcn.persistablebundleutils;

public final class IkeSessionParamsUtils {
    private static final java.lang.String SERVER_HOST_NAME_KEY = "SERVER_HOST_NAME_KEY";
    private static final java.lang.String SA_PROPOSALS_KEY = "SA_PROPOSALS_KEY";
    private static final java.lang.String LOCAL_ID_KEY = "LOCAL_ID_KEY";
    private static final java.lang.String REMOTE_ID_KEY = "REMOTE_ID_KEY";
    private static final java.lang.String LOCAL_AUTH_KEY = "LOCAL_AUTH_KEY";
    private static final java.lang.String REMOTE_AUTH_KEY = "REMOTE_AUTH_KEY";
    private static final java.lang.String CONFIG_REQUESTS_KEY = "CONFIG_REQUESTS_KEY";
    private static final java.lang.String RETRANS_TIMEOUTS_KEY = "RETRANS_TIMEOUTS_KEY";
    private static final java.lang.String HARD_LIFETIME_SEC_KEY = "HARD_LIFETIME_SEC_KEY";
    private static final java.lang.String SOFT_LIFETIME_SEC_KEY = "SOFT_LIFETIME_SEC_KEY";
    private static final java.lang.String DPD_DELAY_SEC_KEY = "DPD_DELAY_SEC_KEY";
    private static final java.lang.String NATT_KEEPALIVE_DELAY_SEC_KEY = "NATT_KEEPALIVE_DELAY_SEC_KEY";
    private static final java.lang.String IKE_OPTIONS_KEY = "IKE_OPTIONS_KEY";
    private static final java.util.Set<java.lang.Integer> IKE_OPTIONS = null;
    public IkeSessionParamsUtils() {}
    public static android.os.PersistableBundle toPersistableBundle(android.net.ipsec.ike.IkeSessionParams p0) { return null; }
    public static android.net.ipsec.ike.IkeSessionParams fromPersistableBundle(android.os.PersistableBundle p0) { return null; }

    private static final class AuthConfigUtils {
        private static final int IKE_AUTH_METHOD_PSK = 1;
        private static final int IKE_AUTH_METHOD_PUB_KEY_SIGNATURE = 2;
        private static final int IKE_AUTH_METHOD_EAP = 3;
        private static final java.lang.String AUTH_METHOD_KEY = "AUTH_METHOD_KEY";
        private AuthConfigUtils() {}
        public static android.os.PersistableBundle toPersistableBundle(android.net.ipsec.ike.IkeSessionParams.IkeAuthConfig p0) { return null; }
        private static android.os.PersistableBundle createPersistableBundle(int p0) { return null; }
        public static void setBuilderByReadingPersistableBundle(android.os.PersistableBundle p0, android.os.PersistableBundle p1, android.net.ipsec.ike.IkeSessionParams.Builder p2) {}
    }

    private static final class ConfigRequest {
        private static final int IPV4_P_CSCF_ADDRESS = 1;
        private static final int IPV6_P_CSCF_ADDRESS = 2;
        private static final java.lang.String TYPE_KEY = "type";
        private static final java.lang.String ADDRESS_KEY = "address";
        public final int type = 0;
        public final java.net.InetAddress address = null;
        ConfigRequest(android.net.ipsec.ike.IkeSessionParams.IkeConfigRequest p0) {}
        ConfigRequest(android.os.PersistableBundle p0) {}
        public android.os.PersistableBundle toPersistableBundle() { return null; }
    }

    private static class IkeAuthDigitalSignConfigUtils {
        private static final java.lang.String END_CERT_KEY = "END_CERT_KEY";
        private static final java.lang.String INTERMEDIATE_CERTS_KEY = "INTERMEDIATE_CERTS_KEY";
        private static final java.lang.String PRIVATE_KEY_KEY = "PRIVATE_KEY_KEY";
        private static final java.lang.String TRUST_CERT_KEY = "TRUST_CERT_KEY";
        private IkeAuthDigitalSignConfigUtils() {}
        public static android.os.PersistableBundle toPersistableBundle(android.net.ipsec.ike.IkeSessionParams.IkeAuthDigitalSignLocalConfig p0, android.os.PersistableBundle p1) { return null; }
        public static android.os.PersistableBundle toPersistableBundle(android.net.ipsec.ike.IkeSessionParams.IkeAuthDigitalSignRemoteConfig p0, android.os.PersistableBundle p1) { return null; }
        public static void setBuilderByReadingPersistableBundle(android.os.PersistableBundle p0, android.os.PersistableBundle p1, android.net.ipsec.ike.IkeSessionParams.Builder p2) {}
    }

    private static final class IkeAuthEapConfigUtils {
        private static final java.lang.String EAP_CONFIG_KEY = "EAP_CONFIG_KEY";
        private IkeAuthEapConfigUtils() {}
        public static android.os.PersistableBundle toPersistableBundle(android.net.ipsec.ike.IkeSessionParams.IkeAuthEapConfig p0, android.os.PersistableBundle p1) { return null; }
        public static void setBuilderByReadingPersistableBundle(android.os.PersistableBundle p0, android.os.PersistableBundle p1, android.net.ipsec.ike.IkeSessionParams.Builder p2) {}
    }

    private static final class IkeAuthPskConfigUtils {
        private static final java.lang.String PSK_KEY = "PSK_KEY";
        private IkeAuthPskConfigUtils() {}
        public static android.os.PersistableBundle toPersistableBundle(android.net.ipsec.ike.IkeSessionParams.IkeAuthPskConfig p0, android.os.PersistableBundle p1) { return null; }
        public static void setBuilderByReadingPersistableBundle(android.os.PersistableBundle p0, android.os.PersistableBundle p1, android.net.ipsec.ike.IkeSessionParams.Builder p2) {}
    }
}
