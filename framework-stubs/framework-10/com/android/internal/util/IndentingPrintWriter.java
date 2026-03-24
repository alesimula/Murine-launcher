package com.android.internal.util;

public class IndentingPrintWriter extends java.io.PrintWriter {
    private final java.lang.String mSingleIndent = null;
    private final int mWrapLength = 0;
    private java.lang.StringBuilder mIndentBuilder;
    private char[] mCurrentIndent;
    private int mCurrentLength;
    private boolean mEmptyLine;
    private char[] mSingleChar;
    @android.annotation.UnsupportedAppUsage
    public IndentingPrintWriter(java.io.Writer p0, java.lang.String p1) { super((java.io.Writer)null); }
    public IndentingPrintWriter(java.io.Writer p0, java.lang.String p1, int p2) { super((java.io.Writer)null); }
    public com.android.internal.util.IndentingPrintWriter setIndent(java.lang.String p0) { return null; }
    public com.android.internal.util.IndentingPrintWriter setIndent(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public com.android.internal.util.IndentingPrintWriter increaseIndent() { return null; }
    @android.annotation.UnsupportedAppUsage
    public com.android.internal.util.IndentingPrintWriter decreaseIndent() { return null; }
    public com.android.internal.util.IndentingPrintWriter printPair(java.lang.String p0, java.lang.Object p1) { return null; }
    public com.android.internal.util.IndentingPrintWriter printPair(java.lang.String p0, java.lang.Object[] p1) { return null; }
    public com.android.internal.util.IndentingPrintWriter printHexPair(java.lang.String p0, int p1) { return null; }
    public void println() {}
    public void write(int p0) {}
    public void write(java.lang.String p0, int p1, int p2) {}
    public void write(char[] p0, int p1, int p2) {}
    private void maybeWriteIndent() {}
}
