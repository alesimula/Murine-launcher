package android.net;

public class NetworkStatsHistory implements android.os.Parcelable {
    private static final int VERSION_INIT = 1;
    private static final int VERSION_ADD_PACKETS = 2;
    private static final int VERSION_ADD_ACTIVE = 3;
    public static final int FIELD_ACTIVE_TIME = 1;
    public static final int FIELD_RX_BYTES = 2;
    public static final int FIELD_RX_PACKETS = 4;
    public static final int FIELD_TX_BYTES = 8;
    public static final int FIELD_TX_PACKETS = 16;
    public static final int FIELD_OPERATIONS = 32;
    public static final int FIELD_ALL = -1;
    private long bucketDuration;
    private int bucketCount;
    private long[] bucketStart;
    private long[] activeTime;
    private long[] rxBytes;
    private long[] rxPackets;
    private long[] txBytes;
    private long[] txPackets;
    private long[] operations;
    private long totalBytes;
    public static final android.os.Parcelable.Creator<android.net.NetworkStatsHistory> CREATOR = null;
    public NetworkStatsHistory(long p0) {}
    public NetworkStatsHistory(long p0, int p1) {}
    public NetworkStatsHistory(long p0, int p1, int p2) {}
    public NetworkStatsHistory(android.net.NetworkStatsHistory p0, long p1) {}
    public NetworkStatsHistory(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public NetworkStatsHistory(java.io.DataInputStream p0) throws java.io.IOException {}
    public void writeToStream(java.io.DataOutputStream p0) throws java.io.IOException {}
    public int describeContents() { return 0; }
    public int size() { return 0; }
    public long getBucketDuration() { return 0L; }
    public long getStart() { return 0L; }
    public long getEnd() { return 0L; }
    public long getTotalBytes() { return 0L; }
    public int getIndexBefore(long p0) { return 0; }
    public int getIndexAfter(long p0) { return 0; }
    public android.net.NetworkStatsHistory.Entry getValues(int p0, android.net.NetworkStatsHistory.Entry p1) { return null; }
    public void setValues(int p0, android.net.NetworkStatsHistory.Entry p1) {}
    @java.lang.Deprecated
    public void recordData(long p0, long p1, long p2, long p3) {}
    public void recordData(long p0, long p1, android.net.NetworkStats.Entry p2) {}
    public void recordEntireHistory(android.net.NetworkStatsHistory p0) {}
    public void recordHistory(android.net.NetworkStatsHistory p0, long p1, long p2) {}
    private void ensureBuckets(long p0, long p1) {}
    private void insertBucket(int p0, long p1) {}
    public void clear() {}
    @java.lang.Deprecated
    public void removeBucketsBefore(long p0) {}
    public android.net.NetworkStatsHistory.Entry getValues(long p0, long p1, android.net.NetworkStatsHistory.Entry p2) { return null; }
    public android.net.NetworkStatsHistory.Entry getValues(long p0, long p1, long p2, android.net.NetworkStatsHistory.Entry p3) { return null; }
    @java.lang.Deprecated
    public void generateRandom(long p0, long p1, long p2) {}
    @java.lang.Deprecated
    public void generateRandom(long p0, long p1, long p2, long p3, long p4, long p5, long p6, java.util.Random p7) {}
    public static long randomLong(java.util.Random p0, long p1, long p2) { return 0L; }
    public boolean intersects(long p0, long p1) { return false; }
    public void dump(com.android.internal.util.IndentingPrintWriter p0, boolean p1) {}
    public void dumpCheckin(java.io.PrintWriter p0) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    private static void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1, long[] p2, int p3) {}
    public java.lang.String toString() { return null; }
    private static long getLong(long[] p0, int p1, long p2) { return 0L; }
    private static void setLong(long[] p0, int p1, long p2) {}
    private static void addLong(long[] p0, int p1, long p2) {}
    public int estimateResizeBuckets(long p0) { return 0; }

    public static class DataStreamUtils {
        public DataStreamUtils() {}
        @java.lang.Deprecated
        public static long[] readFullLongArray(java.io.DataInputStream p0) throws java.io.IOException { return null; }
        public static long readVarLong(java.io.DataInputStream p0) throws java.io.IOException { return 0L; }
        public static void writeVarLong(java.io.DataOutputStream p0, long p1) throws java.io.IOException {}
        public static long[] readVarLongArray(java.io.DataInputStream p0) throws java.io.IOException { return null; }
        public static void writeVarLongArray(java.io.DataOutputStream p0, long[] p1, int p2) throws java.io.IOException {}
    }

    public static class Entry {
        public static final long UNKNOWN = -1L;
        public long bucketDuration;
        public long bucketStart;
        public long activeTime;
        public long rxBytes;
        public long rxPackets;
        public long txBytes;
        public long txPackets;
        public long operations;
        public Entry() {}
    }

    public static class ParcelUtils {
        public ParcelUtils() {}
        public static long[] readLongArray(android.os.Parcel p0) { return null; }
        public static void writeLongArray(android.os.Parcel p0, long[] p1, int p2) {}
    }
}
