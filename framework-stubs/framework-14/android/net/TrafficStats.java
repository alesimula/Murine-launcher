package android.net;

public class TrafficStats {
    public static final int TAG_NETWORK_STACK_IMPERSONATION_RANGE_END = -113;
    public static final int TAG_NETWORK_STACK_IMPERSONATION_RANGE_START = -128;
    public static final int TAG_NETWORK_STACK_RANGE_END = -257;
    public static final int TAG_NETWORK_STACK_RANGE_START = -768;
    public static final int TAG_SYSTEM_IMPERSONATION_RANGE_END = -241;
    public static final int TAG_SYSTEM_IMPERSONATION_RANGE_START = -256;
    public static final int UNSUPPORTED = -1;
    public TrafficStats() {}
    public static synchronized void init(android.content.Context p0) {}
    public static void attachSocketTagger() {}
    public static void setThreadStatsTag(int p0) {}
    public static int getAndSetThreadStatsTag(int p0) { return 0; }
    public static void setThreadStatsTagBackup() {}
    public static void setThreadStatsTagRestore() {}
    public static void setThreadStatsTagApp() {}
    public static void setThreadStatsTagDownload() {}
    public static int getThreadStatsTag() { return 0; }
    public static void clearThreadStatsTag() {}
    public static void setThreadStatsUid(int p0) {}
    public static int getThreadStatsUid() { return 0; }
    public static void clearThreadStatsUid() {}
    public static void tagSocket(java.net.Socket p0) throws java.net.SocketException {}
    public static void untagSocket(java.net.Socket p0) throws java.net.SocketException {}
    public static void tagDatagramSocket(java.net.DatagramSocket p0) throws java.net.SocketException {}
    public static void untagDatagramSocket(java.net.DatagramSocket p0) throws java.net.SocketException {}
    public static void tagFileDescriptor(java.io.FileDescriptor p0) throws java.io.IOException {}
    public static void untagFileDescriptor(java.io.FileDescriptor p0) throws java.io.IOException {}
    public static void incrementOperationCount(int p0) {}
    public static void incrementOperationCount(int p0, int p1) {}
    public static long getMobileTxPackets() { return 0L; }
    public static long getMobileRxPackets() { return 0L; }
    public static long getMobileTxBytes() { return 0L; }
    public static long getMobileRxBytes() { return 0L; }
    public static long getTxPackets(java.lang.String p0) { return 0L; }
    public static long getRxPackets(java.lang.String p0) { return 0L; }
    public static long getTxBytes(java.lang.String p0) { return 0L; }
    public static long getRxBytes(java.lang.String p0) { return 0L; }
    public static long getTotalTxPackets() { return 0L; }
    public static long getTotalRxPackets() { return 0L; }
    public static long getTotalTxBytes() { return 0L; }
    public static long getTotalRxBytes() { return 0L; }
    public static long getUidTxBytes(int p0) { return 0L; }
    public static long getUidRxBytes(int p0) { return 0L; }
    public static long getUidTxPackets(int p0) { return 0L; }
    public static long getUidRxPackets(int p0) { return 0L; }
    @java.lang.Deprecated
    public static long getUidTcpTxBytes(int p0) { return 0L; }
    @java.lang.Deprecated
    public static long getUidTcpRxBytes(int p0) { return 0L; }
    @java.lang.Deprecated
    public static long getUidUdpTxBytes(int p0) { return 0L; }
    @java.lang.Deprecated
    public static long getUidUdpRxBytes(int p0) { return 0L; }
    @java.lang.Deprecated
    public static long getUidTcpTxSegments(int p0) { return 0L; }
    @java.lang.Deprecated
    public static long getUidTcpRxSegments(int p0) { return 0L; }
    @java.lang.Deprecated
    public static long getUidUdpTxPackets(int p0) { return 0L; }
    @java.lang.Deprecated
    public static long getUidUdpRxPackets(int p0) { return 0L; }
}
