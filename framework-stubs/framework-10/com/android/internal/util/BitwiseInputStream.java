package com.android.internal.util;

public class BitwiseInputStream {
    private byte[] mBuf;
    private int mPos;
    private int mEnd;
    @android.annotation.UnsupportedAppUsage
    public BitwiseInputStream(byte[] p0) {}
    @android.annotation.UnsupportedAppUsage
    public int available() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int read(int p0) throws com.android.internal.util.BitwiseInputStream.AccessException { return 0; }
    @android.annotation.UnsupportedAppUsage
    public byte[] readByteArray(int p0) throws com.android.internal.util.BitwiseInputStream.AccessException { return null; }
    @android.annotation.UnsupportedAppUsage
    public void skip(int p0) throws com.android.internal.util.BitwiseInputStream.AccessException {}

    public static class AccessException extends java.lang.Exception {
        public AccessException(java.lang.String p0) { super(); }
    }
}
