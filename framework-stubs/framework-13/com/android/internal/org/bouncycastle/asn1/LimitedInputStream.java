package com.android.internal.org.bouncycastle.asn1;

abstract class LimitedInputStream extends java.io.InputStream {
    protected final java.io.InputStream _in = null;
    LimitedInputStream(java.io.InputStream p0, int p1) { super(); }
    int getLimit() { return 0; }
    protected void setParentEofDetect(boolean p0) {}
}
