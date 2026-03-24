package com.android.internal.org.bouncycastle.jce.provider;

public class CertBlocklist {
    public final java.util.Set<java.math.BigInteger> serialBlocklist = null;
    public final java.util.Set<byte[]> pubkeyBlocklist = null;
    public CertBlocklist() {}
    public CertBlocklist(java.lang.String p0, java.lang.String p1) {}
    public boolean isPublicKeyBlockListed(java.security.PublicKey p0) { return false; }
    public boolean isSerialNumberBlockListed(java.math.BigInteger p0) { return false; }
}
