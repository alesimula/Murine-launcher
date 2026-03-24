package com.android.internal.org.bouncycastle.util.encoders;

public class Base64Encoder implements com.android.internal.org.bouncycastle.util.encoders.Encoder {
    protected final byte[] encodingTable = null;
    protected byte padding;
    protected final byte[] decodingTable = null;
    protected void initialiseDecodingTable() {}
    public Base64Encoder() {}
    public int encode(byte[] p0, int p1, int p2, byte[] p3, int p4) throws java.io.IOException { return 0; }
    public int encode(byte[] p0, int p1, int p2, java.io.OutputStream p3) throws java.io.IOException { return 0; }
    private boolean ignore(char p0) { return false; }
    public int decode(byte[] p0, int p1, int p2, java.io.OutputStream p3) throws java.io.IOException { return 0; }
    private int nextI(byte[] p0, int p1, int p2) { return 0; }
    public int decode(java.lang.String p0, java.io.OutputStream p1) throws java.io.IOException { return 0; }
    private int decodeLastBlock(java.io.OutputStream p0, char p1, char p2, char p3, char p4) throws java.io.IOException { return 0; }
    private int nextI(java.lang.String p0, int p1, int p2) { return 0; }
}
