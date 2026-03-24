package com.android.org.conscrypt;

public class OpenSSLMessageDigestJDK extends java.security.MessageDigestSpi implements java.lang.Cloneable {
    protected synchronized void engineReset() {}
    protected int engineGetDigestLength() { return 0; }
    protected synchronized void engineUpdate(byte p0) {}
    protected synchronized void engineUpdate(byte[] p0, int p1, int p2) {}
    protected synchronized void engineUpdate(java.nio.ByteBuffer p0) {}
    protected synchronized byte[] engineDigest() { return null; }
    public java.lang.Object clone() { return null; }

    public static final class MD5 extends com.android.org.conscrypt.OpenSSLMessageDigestJDK {
        public MD5() throws java.security.NoSuchAlgorithmException { super(); }
    }

    public static final class SHA1 extends com.android.org.conscrypt.OpenSSLMessageDigestJDK {
        public SHA1() throws java.security.NoSuchAlgorithmException { super(); }
    }

    public static final class SHA224 extends com.android.org.conscrypt.OpenSSLMessageDigestJDK {
        public SHA224() throws java.security.NoSuchAlgorithmException { super(); }
    }

    public static final class SHA256 extends com.android.org.conscrypt.OpenSSLMessageDigestJDK {
        public SHA256() throws java.security.NoSuchAlgorithmException { super(); }
    }

    public static final class SHA384 extends com.android.org.conscrypt.OpenSSLMessageDigestJDK {
        public SHA384() throws java.security.NoSuchAlgorithmException { super(); }
    }

    public static final class SHA512 extends com.android.org.conscrypt.OpenSSLMessageDigestJDK {
        public SHA512() throws java.security.NoSuchAlgorithmException { super(); }
    }
}
