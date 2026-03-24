package com.android.internal.org.bouncycastle.crypto.engines;

public final class TwofishEngine implements com.android.internal.org.bouncycastle.crypto.BlockCipher {
    private static final byte[][] P = null;
    private static final int P_00 = 1;
    private static final int P_01 = 0;
    private static final int P_02 = 0;
    private static final int P_03 = 1;
    private static final int P_04 = 1;
    private static final int P_10 = 0;
    private static final int P_11 = 0;
    private static final int P_12 = 1;
    private static final int P_13 = 1;
    private static final int P_14 = 0;
    private static final int P_20 = 1;
    private static final int P_21 = 1;
    private static final int P_22 = 0;
    private static final int P_23 = 0;
    private static final int P_24 = 0;
    private static final int P_30 = 0;
    private static final int P_31 = 1;
    private static final int P_32 = 1;
    private static final int P_33 = 0;
    private static final int P_34 = 1;
    private static final int GF256_FDBK = 361;
    private static final int GF256_FDBK_2 = 180;
    private static final int GF256_FDBK_4 = 90;
    private static final int RS_GF_FDBK = 333;
    private static final int ROUNDS = 16;
    private static final int MAX_ROUNDS = 16;
    private static final int BLOCK_SIZE = 16;
    private static final int MAX_KEY_BITS = 256;
    private static final int INPUT_WHITEN = 0;
    private static final int OUTPUT_WHITEN = 4;
    private static final int ROUND_SUBKEYS = 8;
    private static final int TOTAL_SUBKEYS = 40;
    private static final int SK_STEP = 33686018;
    private static final int SK_BUMP = 16843009;
    private static final int SK_ROTL = 9;
    private boolean encrypting;
    private int[] gMDS0;
    private int[] gMDS1;
    private int[] gMDS2;
    private int[] gMDS3;
    private int[] gSubKeys;
    private int[] gSBox;
    private int k64Cnt;
    private byte[] workingKey;
    public TwofishEngine() {}
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    public java.lang.String getAlgorithmName() { return null; }
    public int processBlock(byte[] p0, int p1, byte[] p2, int p3) { return 0; }
    public void reset() {}
    public int getBlockSize() { return 0; }
    private void setKey(byte[] p0) {}
    private void encryptBlock(byte[] p0, int p1, byte[] p2, int p3) {}
    private void decryptBlock(byte[] p0, int p1, byte[] p2, int p3) {}
    private int F32(int p0, int[] p1) { return 0; }
    private int RS_MDS_Encode(int p0, int p1) { return 0; }
    private int RS_rem(int p0) { return 0; }
    private int LFSR1(int p0) { return 0; }
    private int LFSR2(int p0) { return 0; }
    private int Mx_X(int p0) { return 0; }
    private int Mx_Y(int p0) { return 0; }
    private int b0(int p0) { return 0; }
    private int b1(int p0) { return 0; }
    private int b2(int p0) { return 0; }
    private int b3(int p0) { return 0; }
    private int Fe32_0(int p0) { return 0; }
    private int Fe32_3(int p0) { return 0; }
    private int BytesTo32Bits(byte[] p0, int p1) { return 0; }
    private void Bits32ToBytes(int p0, byte[] p1, int p2) {}
}
