package com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util;

public interface PBE {
    public static final int MD5 = 0;
    public static final int SHA1 = 1;
    public static final int SHA256 = 4;
    public static final int SHA224 = 7;
    public static final int SHA384 = 8;
    public static final int SHA512 = 9;
    public static final int PKCS5S1 = 0;
    public static final int PKCS5S2 = 1;
    public static final int PKCS12 = 2;
    public static final int OPENSSL = 3;
    public static final int PKCS5S1_UTF8 = 4;
    public static final int PKCS5S2_UTF8 = 5;

    public static class Util {
        public Util() {}
        private static com.android.internal.org.bouncycastle.crypto.PBEParametersGenerator makePBEGenerator(int p0, int p1) { return null; }
        public static com.android.internal.org.bouncycastle.crypto.CipherParameters makePBEParameters(byte[] p0, int p1, int p2, int p3, int p4, java.security.spec.AlgorithmParameterSpec p5, java.lang.String p6) throws java.security.InvalidAlgorithmParameterException { return null; }
        public static com.android.internal.org.bouncycastle.crypto.CipherParameters makePBEParameters(com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey p0, java.security.spec.AlgorithmParameterSpec p1, java.lang.String p2) { return null; }
        public static com.android.internal.org.bouncycastle.crypto.CipherParameters makePBEMacParameters(com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey p0, java.security.spec.AlgorithmParameterSpec p1) { return null; }
        public static com.android.internal.org.bouncycastle.crypto.CipherParameters makePBEMacParameters(javax.crypto.spec.PBEKeySpec p0, int p1, int p2, int p3) { return null; }
        public static com.android.internal.org.bouncycastle.crypto.CipherParameters makePBEParameters(javax.crypto.spec.PBEKeySpec p0, int p1, int p2, int p3, int p4) { return null; }
        public static com.android.internal.org.bouncycastle.crypto.CipherParameters makePBEMacParameters(javax.crypto.SecretKey p0, int p1, int p2, int p3, javax.crypto.spec.PBEParameterSpec p4) { return null; }
        public static java.security.spec.AlgorithmParameterSpec getParameterSpecFromPBEParameterSpec(javax.crypto.spec.PBEParameterSpec p0) { return null; }
        private static byte[] convertPassword(int p0, javax.crypto.spec.PBEKeySpec p1) { return null; }
    }
}
