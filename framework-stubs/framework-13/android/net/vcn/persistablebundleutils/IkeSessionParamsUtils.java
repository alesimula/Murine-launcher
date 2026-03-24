package android.net.vcn.persistablebundleutils;

public final class IkeSessionParamsUtils {
    public static final int IKE_OPTION_AUTOMATIC_ADDRESS_FAMILY_SELECTION = 6;
    public static final int IKE_OPTION_AUTOMATIC_NATT_KEEPALIVES = 7;
    public IkeSessionParamsUtils() {}
    public static boolean isIkeOptionValid(int p0) { return false; }
    public static android.os.PersistableBundle toPersistableBundle(android.net.ipsec.ike.IkeSessionParams p0) { return null; }
    public static android.net.ipsec.ike.IkeSessionParams fromPersistableBundle(android.os.PersistableBundle p0) { return null; }

    private static final class AuthConfigUtils {
        public static android.os.PersistableBundle toPersistableBundle(android.net.ipsec.ike.IkeSessionParams.IkeAuthConfig p0) { return null; }
        public static void setBuilderByReadingPersistableBundle(android.os.PersistableBundle p0, android.os.PersistableBundle p1, android.net.ipsec.ike.IkeSessionParams.Builder p2) {}
    }

    private static final class ConfigRequest {
        public final int type = 0;
        public final java.net.InetAddress address = null;
        ConfigRequest(android.net.ipsec.ike.IkeSessionParams.IkeConfigRequest p0) {}
        ConfigRequest(android.os.PersistableBundle p0) {}
        public android.os.PersistableBundle toPersistableBundle() { return null; }
    }

    private static class IkeAuthDigitalSignConfigUtils {
        public static android.os.PersistableBundle toPersistableBundle(android.net.ipsec.ike.IkeSessionParams.IkeAuthDigitalSignLocalConfig p0, android.os.PersistableBundle p1) { return null; }
        public static android.os.PersistableBundle toPersistableBundle(android.net.ipsec.ike.IkeSessionParams.IkeAuthDigitalSignRemoteConfig p0, android.os.PersistableBundle p1) { return null; }
        public static void setBuilderByReadingPersistableBundle(android.os.PersistableBundle p0, android.os.PersistableBundle p1, android.net.ipsec.ike.IkeSessionParams.Builder p2) {}
    }

    private static final class IkeAuthEapConfigUtils {
        public static android.os.PersistableBundle toPersistableBundle(android.net.ipsec.ike.IkeSessionParams.IkeAuthEapConfig p0, android.os.PersistableBundle p1) { return null; }
        public static void setBuilderByReadingPersistableBundle(android.os.PersistableBundle p0, android.os.PersistableBundle p1, android.net.ipsec.ike.IkeSessionParams.Builder p2) {}
    }

    private static final class IkeAuthPskConfigUtils {
        public static android.os.PersistableBundle toPersistableBundle(android.net.ipsec.ike.IkeSessionParams.IkeAuthPskConfig p0, android.os.PersistableBundle p1) { return null; }
        public static void setBuilderByReadingPersistableBundle(android.os.PersistableBundle p0, android.os.PersistableBundle p1, android.net.ipsec.ike.IkeSessionParams.Builder p2) {}
    }
}
