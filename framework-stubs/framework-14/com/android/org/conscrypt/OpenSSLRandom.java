package com.android.org.conscrypt;

public final class OpenSSLRandom extends java.security.SecureRandomSpi implements java.io.Serializable {
    public OpenSSLRandom() { super(); }
    protected void engineSetSeed(byte[] p0) {}
    protected void engineNextBytes(byte[] p0) {}
    protected byte[] engineGenerateSeed(int p0) { return null; }
}
