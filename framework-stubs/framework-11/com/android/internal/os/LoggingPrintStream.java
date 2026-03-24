package com.android.internal.os;

public abstract class LoggingPrintStream extends java.io.PrintStream {
    private final java.lang.StringBuilder builder = null;
    private java.nio.ByteBuffer encodedBytes;
    private java.nio.CharBuffer decodedChars;
    private java.nio.charset.CharsetDecoder decoder;
    private final java.util.Formatter formatter = null;
    protected LoggingPrintStream() { super((java.io.OutputStream)null); }
    protected abstract void log(java.lang.String p0);
    public synchronized void flush() {}
    private void flush(boolean p0) {}
    public void write(int p0) {}
    public void write(byte[] p0) {}
    public synchronized void write(byte[] p0, int p1, int p2) {}
    public boolean checkError() { return false; }
    protected void setError() {}
    public void close() {}
    public java.io.PrintStream format(java.lang.String p0, java.lang.Object... p1) { return null; }
    public java.io.PrintStream printf(java.lang.String p0, java.lang.Object... p1) { return null; }
    public java.io.PrintStream printf(java.util.Locale p0, java.lang.String p1, java.lang.Object... p2) { return null; }
    public synchronized java.io.PrintStream format(java.util.Locale p0, java.lang.String p1, java.lang.Object... p2) { return null; }
    public synchronized void print(char[] p0) {}
    public synchronized void print(char p0) {}
    public synchronized void print(double p0) {}
    public synchronized void print(float p0) {}
    public synchronized void print(int p0) {}
    public synchronized void print(long p0) {}
    public synchronized void print(java.lang.Object p0) {}
    public synchronized void print(java.lang.String p0) {}
    public synchronized void print(boolean p0) {}
    public synchronized void println() {}
    public synchronized void println(char[] p0) {}
    public synchronized void println(char p0) {}
    public synchronized void println(double p0) {}
    public synchronized void println(float p0) {}
    public synchronized void println(int p0) {}
    public synchronized void println(long p0) {}
    public synchronized void println(java.lang.Object p0) {}
    public synchronized void println(java.lang.String p0) {}
    public synchronized void println(boolean p0) {}
    public synchronized java.io.PrintStream append(char p0) { return null; }
    public synchronized java.io.PrintStream append(java.lang.CharSequence p0) { return null; }
    public synchronized java.io.PrintStream append(java.lang.CharSequence p0, int p1, int p2) { return null; }
}
