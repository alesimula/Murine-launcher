package com.android.internal.org.bouncycastle.util.encoders;

public interface Encoder {
    public int getEncodedLength(int p0);
    public int getMaxDecodedLength(int p0);
    public int encode(byte[] p0, int p1, int p2, java.io.OutputStream p3) throws java.io.IOException;
    public int decode(byte[] p0, int p1, int p2, java.io.OutputStream p3) throws java.io.IOException;
    public int decode(java.lang.String p0, java.io.OutputStream p1) throws java.io.IOException;
}
