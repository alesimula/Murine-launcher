package com.android.internal.org.bouncycastle.crypto;

public final class CryptoServicesRegistrar {
    private static final java.security.Permission CanSetDefaultProperty = null;
    private static final java.security.Permission CanSetThreadProperty = null;
    private static final java.security.Permission CanSetDefaultRandom = null;
    private static final java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.Object[]>> threadProperties = null;
    private static final java.util.Map<java.lang.String, java.lang.Object[]> globalProperties = null;
    private static final java.lang.Object cacheLock = null;
    private static java.security.SecureRandom defaultSecureRandom;
    private CryptoServicesRegistrar() {}
    public static java.security.SecureRandom getSecureRandom() { return null; }
    public static java.security.SecureRandom getSecureRandom(java.security.SecureRandom p0) { return null; }
    public static void setSecureRandom(java.security.SecureRandom p0) {}
    public static <T extends java.lang.Object> T getProperty(com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property p0) { return null; }
    private static java.lang.Object[] lookupProperty(com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property p0) { return null; }
    public static <T extends java.lang.Object> T[] getSizedProperty(com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property p0) { return null; }
    public static <T extends java.lang.Object> T getSizedProperty(com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property p0, int p1) { return null; }
    public static <T extends java.lang.Object> void setThreadProperty(com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property p0, T... p1) {}
    public static <T extends java.lang.Object> void setGlobalProperty(com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property p0, T... p1) {}
    private static <T extends java.lang.Object> void localSetThread(com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property p0, T[] p1) {}
    private static <T extends java.lang.Object> void localSetGlobalProperty(com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property p0, T... p1) {}
    public static <T extends java.lang.Object> T[] clearGlobalProperty(com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property p0) { return null; }
    public static <T extends java.lang.Object> T[] clearThreadProperty(com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property p0) { return null; }
    private static java.lang.Object[] localClearThreadProperty(com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property p0) { return null; }
    private static void checkPermission(java.security.Permission p0) {}
    private static com.android.internal.org.bouncycastle.crypto.params.DHParameters toDH(com.android.internal.org.bouncycastle.crypto.params.DSAParameters p0) { return null; }
    private static int chooseLowerBound(int p0) { return 0; }

    public static final class Property {
        public static final com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property EC_IMPLICITLY_CA = null;
        public static final com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property DH_DEFAULT_PARAMS = null;
        public static final com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property DSA_DEFAULT_PARAMS = null;
        private final java.lang.String name = null;
        private final java.lang.Class type = null;
        private Property(java.lang.String p0, java.lang.Class p1) {}
    }
}
