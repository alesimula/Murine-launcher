package android.util;

public final class LocalLog {
    private final java.util.Deque<java.lang.String> mLog = null;
    private final int mMaxLines = 0;
    @android.annotation.UnsupportedAppUsage
    public LocalLog(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void log(java.lang.String p0) {}
    private synchronized void append(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public synchronized void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public synchronized void dump(java.io.PrintWriter p0) {}
    public synchronized void reverseDump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public synchronized void reverseDump(java.io.PrintWriter p0) {}
    @android.annotation.UnsupportedAppUsage
    public android.util.LocalLog.ReadOnlyLocalLog readOnlyLocalLog() { return null; }

    public static class ReadOnlyLocalLog {
        private final android.util.LocalLog mLog = null;
        ReadOnlyLocalLog(android.util.LocalLog p0) {}
        @android.annotation.UnsupportedAppUsage
        public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
        public void dump(java.io.PrintWriter p0) {}
        public void reverseDump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
        public void reverseDump(java.io.PrintWriter p0) {}
    }
}
