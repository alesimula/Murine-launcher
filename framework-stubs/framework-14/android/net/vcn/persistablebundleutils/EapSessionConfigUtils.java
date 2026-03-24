package android.net.vcn.persistablebundleutils;

public final class EapSessionConfigUtils {
    public EapSessionConfigUtils() {}
    public static android.os.PersistableBundle toPersistableBundle(android.net.eap.EapSessionConfig p0) { return null; }
    public static android.net.eap.EapSessionConfig fromPersistableBundle(android.os.PersistableBundle p0) { return null; }

    private static class EapAkaConfigUtils extends android.net.vcn.persistablebundleutils.EapSessionConfigUtils.EapUiccConfigUtils {
        public static android.os.PersistableBundle toPersistableBundle(android.net.eap.EapSessionConfig.EapAkaConfig p0) { return null; }
        public static void setBuilderByReadingPersistableBundle(android.os.PersistableBundle p0, android.net.eap.EapSessionConfig.Builder p1) {}
    }

    private static final class EapAkaPrimeConfigUtils extends android.net.vcn.persistablebundleutils.EapSessionConfigUtils.EapAkaConfigUtils {
        public static android.os.PersistableBundle toPersistableBundle(android.net.eap.EapSessionConfig.EapAkaPrimeConfig p0) { return null; }
        public static void setBuilderByReadingPersistableBundle(android.os.PersistableBundle p0, android.net.eap.EapSessionConfig.Builder p1) {}
    }

    private static class EapMethodConfigUtils {
        public static android.os.PersistableBundle toPersistableBundle(android.net.eap.EapSessionConfig.EapMethodConfig p0) { return null; }
    }

    private static final class EapMsChapV2ConfigUtils extends android.net.vcn.persistablebundleutils.EapSessionConfigUtils.EapMethodConfigUtils {
        public static android.os.PersistableBundle toPersistableBundle(android.net.eap.EapSessionConfig.EapMsChapV2Config p0) { return null; }
        public static void setBuilderByReadingPersistableBundle(android.os.PersistableBundle p0, android.net.eap.EapSessionConfig.Builder p1) {}
    }

    private static final class EapSimConfigUtils extends android.net.vcn.persistablebundleutils.EapSessionConfigUtils.EapUiccConfigUtils {
        public static android.os.PersistableBundle toPersistableBundle(android.net.eap.EapSessionConfig.EapSimConfig p0) { return null; }
        public static void setBuilderByReadingPersistableBundle(android.os.PersistableBundle p0, android.net.eap.EapSessionConfig.Builder p1) {}
    }

    private static final class EapTtlsConfigUtils extends android.net.vcn.persistablebundleutils.EapSessionConfigUtils.EapMethodConfigUtils {
        public static android.os.PersistableBundle toPersistableBundle(android.net.eap.EapSessionConfig.EapTtlsConfig p0) { return null; }
        public static void setBuilderByReadingPersistableBundle(android.os.PersistableBundle p0, android.net.eap.EapSessionConfig.Builder p1) {}
    }

    private static class EapUiccConfigUtils extends android.net.vcn.persistablebundleutils.EapSessionConfigUtils.EapMethodConfigUtils {
        static final java.lang.String SUB_ID_KEY = "SUB_ID_KEY";
        static final java.lang.String APP_TYPE_KEY = "APP_TYPE_KEY";
        protected static android.os.PersistableBundle toPersistableBundle(android.net.eap.EapSessionConfig.EapUiccConfig p0) { return null; }
    }
}
