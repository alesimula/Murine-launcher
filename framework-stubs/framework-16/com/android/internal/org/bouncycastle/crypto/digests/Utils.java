package com.android.internal.org.bouncycastle.crypto.digests;

class Utils {
    Utils() {}
    static com.android.internal.org.bouncycastle.crypto.CryptoServiceProperties getDefaultProperties(com.android.internal.org.bouncycastle.crypto.Digest p0, com.android.internal.org.bouncycastle.crypto.CryptoServicePurpose p1) { return null; }
    static com.android.internal.org.bouncycastle.crypto.CryptoServiceProperties getDefaultProperties(com.android.internal.org.bouncycastle.crypto.Digest p0, int p1, com.android.internal.org.bouncycastle.crypto.CryptoServicePurpose p2) { return null; }

    private static class DefaultProperties implements com.android.internal.org.bouncycastle.crypto.CryptoServiceProperties {
        public DefaultProperties(int p0, java.lang.String p1, com.android.internal.org.bouncycastle.crypto.CryptoServicePurpose p2) {}
        public int bitsOfSecurity() { return 0; }
        public java.lang.String getServiceName() { return null; }
        public com.android.internal.org.bouncycastle.crypto.CryptoServicePurpose getPurpose() { return null; }
        public java.lang.Object getParams() { return null; }
    }

    private static class DefaultPropertiesWithPRF implements com.android.internal.org.bouncycastle.crypto.CryptoServiceProperties {
        public DefaultPropertiesWithPRF(int p0, int p1, java.lang.String p2, com.android.internal.org.bouncycastle.crypto.CryptoServicePurpose p3) {}
        public int bitsOfSecurity() { return 0; }
        public java.lang.String getServiceName() { return null; }
        public com.android.internal.org.bouncycastle.crypto.CryptoServicePurpose getPurpose() { return null; }
        public java.lang.Object getParams() { return null; }
    }
}
