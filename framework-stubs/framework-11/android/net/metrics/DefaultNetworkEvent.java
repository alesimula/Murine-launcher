package android.net.metrics;

public class DefaultNetworkEvent {
    public final long creationTimeMs = 0L;
    public int netId;
    public int transports;
    public int previousTransports;
    public boolean ipv4;
    public boolean ipv6;
    public int initialScore;
    public int finalScore;
    public long durationMs;
    public long validatedMs;
    public DefaultNetworkEvent(long p0) {}
    public void updateDuration(long p0) {}
    public java.lang.String toString() { return null; }
    private java.lang.String ipSupport() { return null; }
}
