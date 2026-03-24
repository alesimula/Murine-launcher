package android.util;

public interface TrustedTime {
    @android.annotation.UnsupportedAppUsage
    public boolean forceRefresh();
    @android.annotation.UnsupportedAppUsage
    public boolean hasCache();
    @android.annotation.UnsupportedAppUsage
    public long getCacheAge();
    public long getCacheCertainty();
    @android.annotation.UnsupportedAppUsage
    public long currentTimeMillis();
}
