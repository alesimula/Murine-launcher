package android.util;

public class NtpTrustedTime implements android.util.TrustedTime {
    private static final java.lang.String TAG = "NtpTrustedTime";
    private static final boolean LOGD = false;
    private static android.util.NtpTrustedTime sSingleton;
    private final android.content.Context mContext = null;
    private final java.util.function.Supplier<android.net.ConnectivityManager> mConnectivityManagerSupplier = null;
    private volatile android.util.NtpTrustedTime.TimeResult mTimeResult;
    private NtpTrustedTime(android.content.Context p0) {}
    public static synchronized android.util.NtpTrustedTime getInstance(android.content.Context p0) { return null; }
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
    private android.util.NtpTrustedTime.NtpConnectionInfo getNtpConnectionInfo() { return null; }

    private static class NtpConnectionInfo {
        private final java.lang.String mServer = null;
        private final int mTimeoutMillis = 0;
        NtpConnectionInfo(java.lang.String p0, int p1) {}
        public java.lang.String getServer() { return null; }
        int getTimeoutMillis() { return 0; }
    }

    public static class TimeResult {
        private final long mTimeMillis = 0L;
        private final long mElapsedRealtimeMillis = 0L;
        private final long mCertaintyMillis = 0L;
        public TimeResult(long p0, long p1, long p2) {}
        public long getTimeMillis() { return 0L; }
        public long getElapsedRealtimeMillis() { return 0L; }
        public long getCertaintyMillis() { return 0L; }
        public long currentTimeMillis() { return 0L; }
        public long getAgeMillis() { return 0L; }
        public java.lang.String toString() { return null; }
    }
}
