package android.net.wifi;

public class WifiNetworkScoreCache extends android.net.INetworkScoreCache.Stub {
    public static final int INVALID_NETWORK_SCORE = -128;
    public WifiNetworkScoreCache(android.content.Context p0) { super(); }
    public WifiNetworkScoreCache(android.content.Context p0, android.net.wifi.WifiNetworkScoreCache.CacheListener p1) { super(); }
    public WifiNetworkScoreCache(android.content.Context p0, android.net.wifi.WifiNetworkScoreCache.CacheListener p1, int p2) { super(); }
    public final void updateScores(java.util.List<android.net.ScoredNetwork> p0) {}
    public final void clearScores() {}
    public boolean isScoredNetwork(android.net.wifi.ScanResult p0) { return false; }
    public boolean hasScoreCurve(android.net.wifi.ScanResult p0) { return false; }
    public int getNetworkScore(android.net.wifi.ScanResult p0) { return 0; }
    public boolean getMeteredHint(android.net.wifi.ScanResult p0) { return false; }
    public int getNetworkScore(android.net.wifi.ScanResult p0, boolean p1) { return 0; }
    @android.annotation.Nullable
    public android.net.ScoredNetwork getScoredNetwork(android.net.wifi.ScanResult p0) { return null; }
    @android.annotation.Nullable
    public android.net.ScoredNetwork getScoredNetwork(android.net.NetworkKey p0) { return null; }
    protected final void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public void registerListener(android.net.wifi.WifiNetworkScoreCache.CacheListener p0) {}
    public void unregisterListener() {}

    public static abstract class CacheListener {
        public CacheListener(android.os.Handler p0) {}
        void post(java.util.List<android.net.ScoredNetwork> p0) {}
        public abstract void networkCacheUpdated(java.util.List<android.net.ScoredNetwork> p0);
    }
}
