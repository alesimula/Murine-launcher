package android.net;

public class TrafficStats {
    public static final int UNSUPPORTED = -1;
    @java.lang.Deprecated
    public static final long KB_IN_BYTES = 1024L;
    @java.lang.Deprecated
    public static final long MB_IN_BYTES = 1048576L;
    @java.lang.Deprecated
    public static final long GB_IN_BYTES = 1073741824L;
    @java.lang.Deprecated
    public static final long TB_IN_BYTES = 1099511627776L;
    @java.lang.Deprecated
    public static final long PB_IN_BYTES = 1125899906842624L;
    public static final int UID_REMOVED = -4;
    public static final int UID_TETHERING = -5;
    @android.annotation.SystemApi
    public static final int TAG_NETWORK_STACK_RANGE_START = -768;
    @android.annotation.SystemApi
    public static final int TAG_NETWORK_STACK_RANGE_END = -257;
    @android.annotation.SystemApi
    public static final int TAG_SYSTEM_IMPERSONATION_RANGE_START = -256;
    @android.annotation.SystemApi
    public static final int TAG_SYSTEM_IMPERSONATION_RANGE_END = -241;
    @android.annotation.SystemApi
    public static final int TAG_NETWORK_STACK_IMPERSONATION_RANGE_START = -128;
    @android.annotation.SystemApi
    public static final int TAG_NETWORK_STACK_IMPERSONATION_RANGE_END = -113;
    public static final int TAG_SYSTEM_DOWNLOAD = -255;
    public static final int TAG_SYSTEM_MEDIA = -254;
    public static final int TAG_SYSTEM_BACKUP = -253;
    public static final int TAG_SYSTEM_RESTORE = -252;
    public static final int TAG_SYSTEM_APP = -251;
    public static final int TAG_SYSTEM_PROBE = -190;
    private static android.net.INetworkStatsService sStatsService;
    private static android.net.NetworkStats sActiveProfilingStart;
    private static java.lang.Object sProfilingLock;
    private static final java.lang.String LOOPBACK_IFACE = "lo";
    public static final int TYPE_RX_BYTES = 0;
    public static final int TYPE_RX_PACKETS = 1;
    public static final int TYPE_TX_BYTES = 2;
    public static final int TYPE_TX_PACKETS = 3;
    public static final int TYPE_TCP_RX_PACKETS = 4;
    public static final int TYPE_TCP_TX_PACKETS = 5;
    public TrafficStats() {}
    private static synchronized android.net.INetworkStatsService getStatsService() { return null; }
    public static void setThreadStatsTag(int p0) {}
    public static int getAndSetThreadStatsTag(int p0) { return 0; }
    @android.annotation.SystemApi
    public static void setThreadStatsTagBackup() {}
    @android.annotation.SystemApi
    public static void setThreadStatsTagRestore() {}
    @android.annotation.SystemApi
    public static void setThreadStatsTagApp() {}
    public static int getThreadStatsTag() { return 0; }
    public static void clearThreadStatsTag() {}
    @android.annotation.SuppressLint("RequiresPermission")
    public static void setThreadStatsUid(int p0) {}
    public static int getThreadStatsUid() { return 0; }
    @java.lang.Deprecated
    public static void setThreadStatsUidSelf() {}
    @android.annotation.SuppressLint("RequiresPermission")
    public static void clearThreadStatsUid() {}
    public static void tagSocket(java.net.Socket p0) throws java.net.SocketException {}
    public static void untagSocket(java.net.Socket p0) throws java.net.SocketException {}
    public static void tagDatagramSocket(java.net.DatagramSocket p0) throws java.net.SocketException {}
    public static void untagDatagramSocket(java.net.DatagramSocket p0) throws java.net.SocketException {}
    public static void tagFileDescriptor(java.io.FileDescriptor p0) throws java.io.IOException {}
    public static void untagFileDescriptor(java.io.FileDescriptor p0) throws java.io.IOException {}
    public static void startDataProfiling(android.content.Context p0) {}
    public static android.net.NetworkStats stopDataProfiling(android.content.Context p0) { return null; }
    public static void incrementOperationCount(int p0) {}
    public static void incrementOperationCount(int p0, int p1) {}
    public static void closeQuietly(android.net.INetworkStatsSession p0) {}
    private static long addIfSupported(long p0) { return 0L; }
    public static long getMobileTxPackets() { return 0L; }
    public static long getMobileRxPackets() { return 0L; }
    public static long getMobileTxBytes() { return 0L; }
    public static long getMobileRxBytes() { return 0L; }
    public static long getMobileTcpRxPackets() { return 0L; }
    public static long getMobileTcpTxPackets() { return 0L; }
    public static long getTxPackets(java.lang.String p0) { return 0L; }
    public static long getRxPackets(java.lang.String p0) { return 0L; }
    public static long getTxBytes(java.lang.String p0) { return 0L; }
    public static long getRxBytes(java.lang.String p0) { return 0L; }
    public static long getLoopbackTxPackets() { return 0L; }
    public static long getLoopbackRxPackets() { return 0L; }
    public static long getLoopbackTxBytes() { return 0L; }
    public static long getLoopbackRxBytes() { return 0L; }
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
    private static android.net.NetworkStats getDataLayerSnapshotForUid(android.content.Context p0) { return null; }
    private static java.lang.String[] getMobileIfaces() { return null; }
}
