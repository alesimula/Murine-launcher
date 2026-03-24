package com.android.internal.util;

public class BitwiseOutputStream {
    private byte[] mBuf;
    private int mPos;
    private int mEnd;
    @android.annotation.UnsupportedAppUsage
    public BitwiseOutputStream(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public byte[] toByteArray() { return null; }
    private void possExpand(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void write(int p0, int p1) throws com.android.internal.util.BitwiseOutputStream.AccessException {}
    @android.annotation.UnsupportedAppUsage
    public void writeByteArray(int p0, byte[] p1) throws com.android.internal.util.BitwiseOutputStream.AccessException {}
    public void skip(int p0) {}

    public static class AccessException extends java.lang.Exception {
        public AccessException(java.lang.String p0) { super(); }
    }
}
