package com.android.internal.util;

public class BitwiseInputStream {
    private byte[] mBuf;
    private int mPos;
    private int mEnd;
    public BitwiseInputStream(byte[] p0) {}
    public int available() { return 0; }
    public int read(int p0) throws com.android.internal.util.BitwiseInputStream.AccessException { return 0; }
    public byte[] readByteArray(int p0) throws com.android.internal.util.BitwiseInputStream.AccessException { return null; }
    public void skip(int p0) throws com.android.internal.util.BitwiseInputStream.AccessException {}

    public static class AccessException extends java.lang.Exception {
        public AccessException(java.lang.String p0) { super(); }
    }
}
