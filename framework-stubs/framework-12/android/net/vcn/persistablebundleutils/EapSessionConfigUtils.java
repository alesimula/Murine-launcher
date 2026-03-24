package android.net.vcn.persistablebundleutils;

public final class EapSessionConfigUtils {
    private static final java.lang.String EAP_ID_KEY = "EAP_ID_KEY";
    private static final java.lang.String EAP_SIM_CONFIG_KEY = "EAP_SIM_CONFIG_KEY";
    private static final java.lang.String EAP_TTLS_CONFIG_KEY = "EAP_TTLS_CONFIG_KEY";
    private static final java.lang.String EAP_AKA_CONFIG_KEY = "EAP_AKA_CONFIG_KEY";
    private static final java.lang.String EAP_MSCHAP_V2_CONFIG_KEY = "EAP_MSCHAP_V2_CONFIG_KEY";
    private static final java.lang.String EAP_AKA_PRIME_CONFIG_KEY = "EAP_AKA_PRIME_CONFIG_KEY";
    public EapSessionConfigUtils() {}
    public static android.os.PersistableBundle toPersistableBundle(android.net.eap.EapSessionConfig p0) { return null; }
    public static android.net.eap.EapSessionConfig fromPersistableBundle(android.os.PersistableBundle p0) { return null; }

    private static class EapAkaConfigUtils extends android.net.vcn.persistablebundleutils.EapSessionConfigUtils.EapUiccConfigUtils {
        private EapAkaConfigUtils() { super(); }
        public static android.os.PersistableBundle toPersistableBundle(android.net.eap.EapSessionConfig.EapAkaConfig p0) { return null; }
        public static void setBuilderByReadingPersistableBundle(android.os.PersistableBundle p0, android.net.eap.EapSessionConfig.Builder p1) {}
    }

    private static final class EapAkaPrimeConfigUtils extends android.net.vcn.persistablebundleutils.EapSessionConfigUtils.EapAkaConfigUtils {
        private static final java.lang.String NETWORK_NAME_KEY = "NETWORK_NAME_KEY";
        private static final java.lang.String ALL_MISMATCHED_NETWORK_KEY = "ALL_MISMATCHED_NETWORK_KEY";
        private EapAkaPrimeConfigUtils() { super(); }
        public static android.os.PersistableBundle toPersistableBundle(android.net.eap.EapSessionConfig.EapAkaPrimeConfig p0) { return null; }
        public static void setBuilderByReadingPersistableBundle(android.os.PersistableBundle p0, android.net.eap.EapSessionConfig.Builder p1) {}
    }

    private static class EapMethodConfigUtils {
        private static final java.lang.String METHOD_TYPE = "METHOD_TYPE";
        private EapMethodConfigUtils() {}
        public static android.os.PersistableBundle toPersistableBundle(android.net.eap.EapSessionConfig.EapMethodConfig p0) { return null; }
    }

    private static final class EapMsChapV2ConfigUtils extends android.net.vcn.persistablebundleutils.EapSessionConfigUtils.EapMethodConfigUtils {
        private static final java.lang.String USERNAME_KEY = "USERNAME_KEY";
        private static final java.lang.String PASSWORD_KEY = "PASSWORD_KEY";
        private EapMsChapV2ConfigUtils() { super(); }
        public static android.os.PersistableBundle toPersistableBundle(android.net.eap.EapSessionConfig.EapMsChapV2Config p0) { return null; }
        public static void setBuilderByReadingPersistableBundle(android.os.PersistableBundle p0, android.net.eap.EapSessionConfig.Builder p1) {}
    }

    private static final class EapSimConfigUtils extends android.net.vcn.persistablebundleutils.EapSessionConfigUtils.EapUiccConfigUtils {
        private EapSimConfigUtils() { super(); }
        public static android.os.PersistableBundle toPersistableBundle(android.net.eap.EapSessionConfig.EapSimConfig p0) { return null; }
        public static void setBuilderByReadingPersistableBundle(android.os.PersistableBundle p0, android.net.eap.EapSessionConfig.Builder p1) {}
    }

    private static final class EapTtlsConfigUtils extends android.net.vcn.persistablebundleutils.EapSessionConfigUtils.EapMethodConfigUtils {
        private static final java.lang.String TRUST_CERT_KEY = "TRUST_CERT_KEY";
        private static final java.lang.String EAP_SESSION_CONFIG_KEY = "EAP_SESSION_CONFIG_KEY";
        private EapTtlsConfigUtils() { super(); }
        public static android.os.PersistableBundle toPersistableBundle(android.net.eap.EapSessionConfig.EapTtlsConfig p0) { return null; }
        public static void setBuilderByReadingPersistableBundle(android.os.PersistableBundle p0, android.net.eap.EapSessionConfig.Builder p1) {}
    }

    private static class EapUiccConfigUtils extends android.net.vcn.persistablebundleutils.EapSessionConfigUtils.EapMethodConfigUtils {
        static final java.lang.String SUB_ID_KEY = "SUB_ID_KEY";
        static final java.lang.String APP_TYPE_KEY = "APP_TYPE_KEY";
        private EapUiccConfigUtils() { super(); }
        protected static android.os.PersistableBundle toPersistableBundle(android.net.eap.EapSessionConfig.EapUiccConfig p0) { return null; }
    }
}
