package com.android.internal.org.bouncycastle.crypto.params;

public class DESParameters extends com.android.internal.org.bouncycastle.crypto.params.KeyParameter {
    public static final int DES_KEY_LENGTH = 8;
    private static final int N_DES_WEAK_KEYS = 16;
    private static byte[] DES_weak_keys;
    public DESParameters(byte[] p0) { super((byte[])null); }
    public static boolean isWeakKey(byte[] p0, int p1) { return false; }
    public static void setOddParity(byte[] p0) {}
}
