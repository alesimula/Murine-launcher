package com.android.internal.org.bouncycastle.crypto.params;

public class DESedeParameters extends com.android.internal.org.bouncycastle.crypto.params.DESParameters {
    public static final int DES_EDE_KEY_LENGTH = 24;
    public DESedeParameters(byte[] p0) { super(null); }
    public static boolean isWeakKey(byte[] p0, int p1, int p2) { return false; }
    public static boolean isWeakKey(byte[] p0, int p1) { return false; }
    public static boolean isRealEDEKey(byte[] p0, int p1) { return false; }
    public static boolean isReal2Key(byte[] p0, int p1) { return false; }
    public static boolean isReal3Key(byte[] p0, int p1) { return false; }
}
