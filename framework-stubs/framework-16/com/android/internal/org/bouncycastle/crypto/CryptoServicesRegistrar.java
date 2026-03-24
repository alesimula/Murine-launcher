package com.android.internal.org.bouncycastle.crypto;

public final class CryptoServicesRegistrar {
    public static java.security.SecureRandom getSecureRandom() { return null; }
    public static java.security.SecureRandom getSecureRandom(java.security.SecureRandom p0) { return null; }
    public static void setSecureRandom(java.security.SecureRandom p0) {}
    public static void setSecureRandomProvider(com.android.internal.org.bouncycastle.crypto.SecureRandomProvider p0) {}
    public static com.android.internal.org.bouncycastle.crypto.CryptoServicesConstraints getServicesConstraints() { return null; }
    public static void checkConstraints(com.android.internal.org.bouncycastle.crypto.CryptoServiceProperties p0) {}
    public static void setServicesConstraints(com.android.internal.org.bouncycastle.crypto.CryptoServicesConstraints p0) {}
    public static <T extends java.lang.Object> T getProperty(com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property p0) { return null; }
    public static <T extends java.lang.Object> T[] getSizedProperty(com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property p0) { return null; }
    public static <T extends java.lang.Object> T getSizedProperty(com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property p0, int p1) { return null; }
    public static <T extends java.lang.Object> void setThreadProperty(com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property p0, T... p1) {}
    public static <T extends java.lang.Object> void setGlobalProperty(com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property p0, T... p1) {}
    public static <T extends java.lang.Object> T[] clearGlobalProperty(com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property p0) { return null; }
    public static <T extends java.lang.Object> T[] clearThreadProperty(com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property p0) { return null; }

    public static final class Property {
        public static final com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property EC_IMPLICITLY_CA = null;
        public static final com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property DH_DEFAULT_PARAMS = null;
        public static final com.android.internal.org.bouncycastle.crypto.CryptoServicesRegistrar.Property DSA_DEFAULT_PARAMS = null;
    }

    private static class ThreadLocalSecureRandomProvider implements com.android.internal.org.bouncycastle.crypto.SecureRandomProvider {
        final java.lang.ThreadLocal<java.security.SecureRandom> defaultRandoms = null;
        public java.security.SecureRandom get() { return null; }
    }
}
