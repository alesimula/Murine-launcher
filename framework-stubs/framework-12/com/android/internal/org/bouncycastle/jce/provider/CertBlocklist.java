package com.android.internal.org.bouncycastle.jce.provider;

public class CertBlocklist {
    private static final java.util.logging.Logger logger = null;
    public final java.util.Set<java.math.BigInteger> serialBlocklist = null;
    public final java.util.Set<byte[]> pubkeyBlocklist = null;
    public CertBlocklist() {}
    public CertBlocklist(java.lang.String p0, java.lang.String p1) {}
    private static boolean isHex(java.lang.String p0) { return false; }
    private static boolean isPubkeyHash(java.lang.String p0) { return false; }
    private static java.lang.String readBlocklist(java.lang.String p0) { return null; }
    private static java.lang.String readFileAsString(java.lang.String p0) throws java.io.IOException { return null; }
    private static java.io.ByteArrayOutputStream readFileAsBytes(java.lang.String p0) throws java.io.IOException { return null; }
    private static void closeQuietly(java.io.Closeable p0) {}
    private static java.util.Set<java.math.BigInteger> readSerialBlockList(java.lang.String p0) { return null; }
    private static java.util.Set<byte[]> readPublicKeyBlockList(java.lang.String p0) { return null; }
    public boolean isPublicKeyBlockListed(java.security.PublicKey p0) { return false; }
    public boolean isSerialNumberBlockListed(java.math.BigInteger p0) { return false; }
}
