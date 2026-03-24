package com.android.internal.util;

public class LineBreakBufferedWriter extends java.io.PrintWriter {
    private char[] buffer;
    private int bufferIndex;
    private final int bufferSize = 0;
    private int lastNewline;
    private final java.lang.String lineSeparator = null;
    public LineBreakBufferedWriter(java.io.Writer p0, int p1) { super((java.io.Writer)null); }
    public LineBreakBufferedWriter(java.io.Writer p0, int p1, int p2) { super((java.io.Writer)null); }
    public void flush() {}
    public void write(int p0) {}
    public void println() {}
    public void write(char[] p0, int p1, int p2) {}
    public void write(java.lang.String p0, int p1, int p2) {}
    private void appendToBuffer(char[] p0, int p1, int p2) {}
    private void appendToBuffer(java.lang.String p0, int p1, int p2) {}
    private void ensureCapacity(int p0) {}
    private void removeFromBuffer(int p0) {}
    private void writeBuffer(int p0) {}
}
