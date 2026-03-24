package android.util;

public abstract class NtpTrustedTime implements android.util.TrustedTime {
    public static final java.lang.String NTP_SETTING_SERVER_NAME_DELIMITER = "|";
    protected NtpTrustedTime() {}
    public static synchronized android.util.NtpTrustedTime getInstance(android.content.Context p0) { return null; }
    public void setServerConfigForTests(android.util.NtpTrustedTime.NtpConfig p0) {}
    public boolean forceRefresh() { return false; }
    public boolean forceRefresh(android.net.Network p0) { return false; }
    @android.annotation.Nullable
    public abstract android.util.NtpTrustedTime.NtpConfig getNtpConfigInternal();
    @android.annotation.Nullable
    public abstract android.net.Network getDefaultNetwork();
    public abstract boolean isNetworkConnected(android.net.Network p0);
    @android.annotation.Nullable
    public abstract android.util.NtpTrustedTime.TimeResult queryNtpServer(android.net.Network p0, java.net.URI p1, java.time.Duration p2);
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
    @android.annotation.Nullable
    public android.util.NtpTrustedTime.TimeResult getCachedTimeResult() { return null; }
    public void setCachedTimeResult(android.util.NtpTrustedTime.TimeResult p0) {}
    public void clearCachedTimeResult() {}
    @android.annotation.NonNull
    public static java.net.URI parseNtpUriStrict(java.lang.String p0) throws java.net.URISyntaxException { return null; }
    @android.annotation.Nullable
    public static java.util.List<java.net.URI> parseNtpServerSetting(java.lang.String p0) { return null; }
    public void dump(java.io.PrintWriter p0) {}

    public static final class NtpConfig {
        public NtpConfig(java.util.List<java.net.URI> p0, java.time.Duration p1) throws java.lang.IllegalArgumentException {}
        @android.annotation.NonNull
        public java.util.List<java.net.URI> getServerUris() { return null; }
        @android.annotation.NonNull
        public java.time.Duration getTimeout() { return null; }
        public java.lang.String toString() { return null; }
    }

    private static final class NtpTrustedTimeImpl extends android.util.NtpTrustedTime {
        @android.annotation.Nullable
        public android.util.NtpTrustedTime.NtpConfig getNtpConfigInternal() { return null; }
        public android.net.Network getDefaultNetwork() { return null; }
        public boolean isNetworkConnected(android.net.Network p0) { return false; }
        @android.annotation.Nullable
        public android.util.NtpTrustedTime.TimeResult queryNtpServer(android.net.Network p0, java.net.URI p1, java.time.Duration p2) { return null; }
    }

    public static class TimeResult {
        public TimeResult(long p0, long p1, int p2, java.net.InetSocketAddress p3) {}
        public long getTimeMillis() { return 0L; }
        public long getElapsedRealtimeMillis() { return 0L; }
        public int getUncertaintyMillis() { return 0; }
        public long currentTimeMillis() { return 0L; }
        public long getAgeMillis() { return 0L; }
        public long getAgeMillis(long p0) { return 0L; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
