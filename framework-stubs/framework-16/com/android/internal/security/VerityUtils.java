package com.android.internal.security;

public abstract class VerityUtils {
    public VerityUtils() {}
    public static boolean isFsVeritySupported() { return false; }
    public static void setUpFsverity(java.lang.String p0) throws java.io.IOException {}
    public static void setUpFsverity(int p0) throws java.io.IOException {}
    public static boolean hasFsverity(java.lang.String p0) { return false; }
    public static boolean verifyPkcs7DetachedSignature(byte[] p0, byte[] p1, java.io.InputStream p2) { return false; }
    @android.annotation.Nullable
    public static byte[] getFsverityDigest(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public static byte[] generateFsVerityDigest(long p0, android.os.incremental.V4Signature.HashingInfo p1) throws java.security.DigestException, java.security.NoSuchAlgorithmException { return null; }
    public static byte[] toFormattedDigest(byte[] p0) { return null; }
}
