package com.android.internal.org.bouncycastle.crypto.digests;

public class OpenSSLDigest implements com.android.internal.org.bouncycastle.crypto.ExtendedDigest {
    public OpenSSLDigest(java.lang.String p0, int p1) {}
    public java.lang.String getAlgorithmName() { return null; }
    public int getDigestSize() { return 0; }
    public int getByteLength() { return 0; }
    public void reset() {}
    public void update(byte p0) {}
    public void update(byte[] p0, int p1, int p2) {}
    public int doFinal(byte[] p0, int p1) { return 0; }

    public static class MD5 extends com.android.internal.org.bouncycastle.crypto.digests.OpenSSLDigest {
        public MD5() { super(null, 0); }
    }

    public static class SHA1 extends com.android.internal.org.bouncycastle.crypto.digests.OpenSSLDigest {
        public SHA1() { super(null, 0); }
    }

    public static class SHA224 extends com.android.internal.org.bouncycastle.crypto.digests.OpenSSLDigest {
        public SHA224() { super(null, 0); }
    }

    public static class SHA256 extends com.android.internal.org.bouncycastle.crypto.digests.OpenSSLDigest {
        public SHA256() { super(null, 0); }
    }

    public static class SHA384 extends com.android.internal.org.bouncycastle.crypto.digests.OpenSSLDigest {
        public SHA384() { super(null, 0); }
    }

    public static class SHA512 extends com.android.internal.org.bouncycastle.crypto.digests.OpenSSLDigest {
        public SHA512() { super(null, 0); }
    }
}
