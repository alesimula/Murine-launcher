package android.util;

public interface TrustedTime {
    @java.lang.Deprecated
    public boolean forceRefresh();
    @java.lang.Deprecated
    public boolean hasCache();
    @java.lang.Deprecated
    public long getCacheAge();
    @java.lang.Deprecated
    public long currentTimeMillis();
}
