package android.util;

public class NtpTrustedTime implements android.util.TrustedTime {
    private static final java.lang.String TAG = "NtpTrustedTime";
    private static final boolean LOGD = false;
    private static android.util.NtpTrustedTime sSingleton;
    private static android.content.Context sContext;
    private final java.lang.String mServer = null;
    private final long mTimeout = 0L;
    private android.net.ConnectivityManager mCM;
    private boolean mHasCache;
    private long mCachedNtpTime;
    private long mCachedNtpElapsedRealtime;
    private long mCachedNtpCertainty;
    private NtpTrustedTime(java.lang.String p0, long p1) {}
    @android.annotation.UnsupportedAppUsage
    public static synchronized android.util.NtpTrustedTime getInstance(android.content.Context p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public boolean forceRefresh() { return false; }
    public boolean forceRefresh(android.net.Network p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean hasCache() { return false; }
    public long getCacheAge() { return 0L; }
    public long getCacheCertainty() { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long currentTimeMillis() { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long getCachedNtpTime() { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long getCachedNtpTimeReference() { return 0L; }
}
