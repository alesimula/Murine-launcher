package com.android.internal.security;

public abstract class VerityUtils {
    public static final java.lang.String FSVERITY_SIGNATURE_FILE_EXTENSION = ".fsv_sig";
    public VerityUtils() {}
    public static boolean isFsVeritySupported() { return false; }
    public static boolean isFsveritySignatureFile(java.io.File p0) { return false; }
    public static java.lang.String getFsveritySignatureFilePath(java.lang.String p0) { return null; }
    public static void setUpFsverity(java.lang.String p0) throws java.io.IOException {}
    public static void setUpFsverity(int p0) throws java.io.IOException {}
    public static boolean hasFsverity(java.lang.String p0) { return false; }
    public static boolean verifyPkcs7DetachedSignature(byte[] p0, byte[] p1, java.io.InputStream p2) { return false; }
    public static byte[] getFsverityDigest(java.lang.String p0) { return null; }
    public static byte[] toFormattedDigest(byte[] p0) { return null; }
}
