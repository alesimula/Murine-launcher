package android.util;

public class NtpTrustedTime implements android.util.TrustedTime {
    public static synchronized android.util.NtpTrustedTime getInstance(android.content.Context p0) { return null; }
    public void setServerConfigForTests(java.lang.String p0, java.lang.Integer p1, java.time.Duration p2) {}
    public boolean forceRefresh() { return false; }
    @java.lang.Deprecated
    public boolean hasCache() { return false; }
    @java.lang.Deprecated
    public long getCacheAge() { return 0L; }
    @java.lang.Deprecated
    public long currentTimeMillis() { return 0L; }
    @java.lang.Deprecated
    public long getCachedNtpTime() { return 0L; }
    @java.lang.Deprecated
    public long getCachedNtpTimeReference() { return 0L; }
    public android.util.NtpTrustedTime.TimeResult getCachedTimeResult() { return null; }
    public void clearCachedTimeResult() {}
    public void dump(java.io.PrintWriter p0) {}

    private static class NtpConnectionInfo {
        NtpConnectionInfo(java.lang.String p0, int p1, int p2) {}
        public java.lang.String getServer() { return null; }
        public int getPort() { return 0; }
        int getTimeoutMillis() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class TimeResult {
        public TimeResult(long p0, long p1, long p2) {}
        public long getTimeMillis() { return 0L; }
        public long getElapsedRealtimeMillis() { return 0L; }
        public long getCertaintyMillis() { return 0L; }
        public long currentTimeMillis() { return 0L; }
        public long getAgeMillis() { return 0L; }
        public long getAgeMillis(long p0) { return 0L; }
        public java.lang.String toString() { return null; }
    }
}
