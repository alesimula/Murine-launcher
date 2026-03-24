package com.android.internal.util;

public class FastPrintWriter extends java.io.PrintWriter {
    public FastPrintWriter(java.io.OutputStream p0) { super((java.io.Writer)null); }
    public FastPrintWriter(java.io.OutputStream p0, boolean p1) { super((java.io.Writer)null); }
    public FastPrintWriter(java.io.OutputStream p0, boolean p1, int p2) { super((java.io.Writer)null); }
    public FastPrintWriter(java.io.Writer p0) { super((java.io.Writer)null); }
    public FastPrintWriter(java.io.Writer p0, boolean p1) { super((java.io.Writer)null); }
    public FastPrintWriter(java.io.Writer p0, boolean p1, int p2) { super((java.io.Writer)null); }
    public FastPrintWriter(android.util.Printer p0) { super((java.io.Writer)null); }
    public FastPrintWriter(android.util.Printer p0, int p1) { super((java.io.Writer)null); }
    public boolean checkError() { return false; }
    protected void clearError() {}
    protected void setError() {}
    public void flush() {}
    public void close() {}
    public void print(char[] p0) {}
    public void print(char p0) {}
    public void print(java.lang.String p0) {}
    public void print(int p0) {}
    public void print(long p0) {}
    public void println() {}
    public void println(int p0) {}
    public void println(long p0) {}
    public void println(char[] p0) {}
    public void println(char p0) {}
    public void write(char[] p0, int p1, int p2) {}
    public void write(int p0) {}
    public void write(java.lang.String p0) {}
    public void write(java.lang.String p0, int p1, int p2) {}
    public java.io.PrintWriter append(java.lang.CharSequence p0, int p1, int p2) { return null; }

    private static class DummyWriter extends java.io.Writer {
        public void close() throws java.io.IOException {}
        public void flush() throws java.io.IOException {}
        public void write(char[] p0, int p1, int p2) throws java.io.IOException {}
    }
}
