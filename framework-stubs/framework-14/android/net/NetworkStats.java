package android.net;

public final class NetworkStats implements android.os.Parcelable, java.lang.Iterable<android.net.NetworkStats.Entry> {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.NetworkStats> CREATOR = null;
    public static final int DEFAULT_NETWORK_ALL = -1;
    public static final int DEFAULT_NETWORK_NO = 0;
    public static final int DEFAULT_NETWORK_YES = 1;
    public static final java.lang.String IFACE_VT = "vt_data0";
    public static final int METERED_ALL = -1;
    public static final int METERED_NO = 0;
    public static final int METERED_YES = 1;
    public static final int ROAMING_ALL = -1;
    public static final int ROAMING_NO = 0;
    public static final int ROAMING_YES = 1;
    public static final int SET_ALL = -1;
    public static final int SET_DEFAULT = 0;
    public static final int SET_FOREGROUND = 1;
    public static final int TAG_NONE = 0;
    public static final int UID_ALL = -1;
    public static final int UID_TETHERING = -5;
    public NetworkStats(long p0, int p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public android.net.NetworkStats clone() { return null; }
    @android.annotation.NonNull
    public java.util.Iterator<android.net.NetworkStats.Entry> iterator() { return null; }
    @android.annotation.NonNull
    public android.net.NetworkStats addEntry(android.net.NetworkStats.Entry p0) { return null; }
    @android.annotation.NonNull
    public android.net.NetworkStats add(android.net.NetworkStats p0) { return null; }
    @android.annotation.NonNull
    public android.net.NetworkStats subtract(android.net.NetworkStats p0) { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }

    public static class Entry {
        public Entry(java.lang.String p0, int p1, int p2, int p3, int p4, int p5, int p6, long p7, long p8, long p9, long p10, long p11) {}
        public int getUid() { return 0; }
        public int getSet() { return 0; }
        public int getTag() { return 0; }
        public int getMetered() { return 0; }
        public int getRoaming() { return 0; }
        public int getDefaultNetwork() { return 0; }
        public long getRxBytes() { return 0L; }
        public long getRxPackets() { return 0L; }
        public long getTxBytes() { return 0L; }
        public long getTxPackets() { return 0L; }
        public long getOperations() { return 0L; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
