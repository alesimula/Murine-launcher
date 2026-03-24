package android.net.metrics;

public final class DnsEvent {
    public final int netId = 0;
    public final long transports = 0L;
    public int eventCount;
    public int successCount;
    public byte[] eventTypes;
    public byte[] returnCodes;
    public int[] latenciesMs;
    public DnsEvent(int p0, long p1, int p2) {}
    boolean addResult(byte p0, byte p1, int p2) { return false; }
    public void resize(int p0) {}
    public java.lang.String toString() { return null; }
}
