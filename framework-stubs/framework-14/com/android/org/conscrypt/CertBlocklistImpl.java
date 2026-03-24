package com.android.org.conscrypt;

public final class CertBlocklistImpl implements com.android.org.conscrypt.CertBlocklist {
    public CertBlocklistImpl(java.util.Set<java.math.BigInteger> p0, java.util.Set<com.android.org.conscrypt.CertBlocklistImpl.ByteString> p1) {}
    public static com.android.org.conscrypt.CertBlocklist getDefault() { return null; }
    public boolean isPublicKeyBlockListed(java.security.PublicKey p0) { return false; }
    public boolean isSerialNumberBlockListed(java.math.BigInteger p0) { return false; }

    private static class ByteString {
        final byte[] bytes = null;
        public ByteString(byte[] p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
