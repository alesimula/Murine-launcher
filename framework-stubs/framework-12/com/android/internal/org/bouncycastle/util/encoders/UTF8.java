package com.android.internal.org.bouncycastle.util.encoders;

public class UTF8 {
    private static final byte C_ILL = 0;
    private static final byte C_CR1 = 1;
    private static final byte C_CR2 = 2;
    private static final byte C_CR3 = 3;
    private static final byte C_L2A = 4;
    private static final byte C_L3A = 5;
    private static final byte C_L3B = 6;
    private static final byte C_L3C = 7;
    private static final byte C_L4A = 8;
    private static final byte C_L4B = 9;
    private static final byte C_L4C = 10;
    private static final byte S_ERR = -2;
    private static final byte S_END = -1;
    private static final byte S_CS1 = 0;
    private static final byte S_CS2 = 16;
    private static final byte S_CS3 = 32;
    private static final byte S_P3A = 48;
    private static final byte S_P3B = 64;
    private static final byte S_P4A = 80;
    private static final byte S_P4B = 96;
    private static final short[] firstUnitTable = null;
    private static final byte[] transitionTable = null;
    public UTF8() {}
    private static void fill(byte[] p0, int p1, int p2, byte p3) {}
    public static int transcodeToUTF16(byte[] p0, char[] p1) { return 0; }
}
