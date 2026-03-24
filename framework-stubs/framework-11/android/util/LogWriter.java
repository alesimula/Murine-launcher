package android.util;

public class LogWriter extends java.io.Writer {
    private final int mPriority = 0;
    private final java.lang.String mTag = null;
    private final int mBuffer = 0;
    private java.lang.StringBuilder mBuilder;
    public LogWriter(int p0, java.lang.String p1) { super(); }
    public LogWriter(int p0, java.lang.String p1, int p2) { super(); }
    public void close() {}
    public void flush() {}
    public void write(char[] p0, int p1, int p2) {}
    private void flushBuilder() {}
}
