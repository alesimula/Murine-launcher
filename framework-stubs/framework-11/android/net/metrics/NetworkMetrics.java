package android.net.metrics;

public class NetworkMetrics {
    private static final int INITIAL_DNS_BATCH_SIZE = 100;
    private static final int CONNECT_LATENCY_MAXIMUM_RECORDS = 20000;
    public final int netId = 0;
    public final long transports = 0L;
    public final android.net.metrics.ConnectStats connectMetrics = null;
    public final android.net.metrics.DnsEvent dnsMetrics = null;
    public final android.net.metrics.NetworkMetrics.Summary summary = null;
    public android.net.metrics.NetworkMetrics.Summary pendingSummary;
    public NetworkMetrics(int p0, long p1, com.android.internal.util.TokenBucket p2) {}
    public android.net.metrics.NetworkMetrics.Summary getPendingStats() { return null; }
    public void addDnsResult(int p0, int p1, int p2) {}
    public void addConnectResult(int p0, int p1, java.lang.String p2) {}
    public void addTcpStatsResult(int p0, int p1, int p2, int p3) {}

    static class Metrics {
        public double sum;
        public double max;
        public int count;
        Metrics() {}
        void merge(android.net.metrics.NetworkMetrics.Metrics p0) {}
        void count(double p0) {}
        void count(double p0, int p1) {}
        double average() { return 0.0; }
    }

    public static class Summary {
        public final int netId = 0;
        public final long transports = 0L;
        public final android.net.metrics.NetworkMetrics.Metrics dnsLatencies = null;
        public final android.net.metrics.NetworkMetrics.Metrics dnsErrorRate = null;
        public final android.net.metrics.NetworkMetrics.Metrics connectLatencies = null;
        public final android.net.metrics.NetworkMetrics.Metrics connectErrorRate = null;
        public final android.net.metrics.NetworkMetrics.Metrics tcpLossRate = null;
        public final android.net.metrics.NetworkMetrics.Metrics roundTripTimeUs = null;
        public final android.net.metrics.NetworkMetrics.Metrics sentAckTimeDiffenceMs = null;
        public Summary(int p0, long p1) {}
        void merge(android.net.metrics.NetworkMetrics.Summary p0) {}
        public java.lang.String toString() { return null; }
    }
}
