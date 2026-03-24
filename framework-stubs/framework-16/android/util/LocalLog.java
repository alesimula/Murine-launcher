package android.util;

public final class LocalLog {
    public LocalLog(int p0) {}
    public LocalLog(int p0, boolean p1) {}
    public void log(java.lang.String p0) {}
    public synchronized void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public synchronized void dump(java.io.PrintWriter p0) {}
    public synchronized void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public synchronized void reverseDump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public synchronized void reverseDump(java.io.PrintWriter p0) {}
    public synchronized void clear() {}
    public android.util.LocalLog.ReadOnlyLocalLog readOnlyLocalLog() { return null; }

    public static class ReadOnlyLocalLog {
        ReadOnlyLocalLog(android.util.LocalLog p0) {}
        public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
        public void dump(java.io.PrintWriter p0) {}
        public void reverseDump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
        public void reverseDump(java.io.PrintWriter p0) {}
    }
}
