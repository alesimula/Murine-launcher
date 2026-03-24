package android.net;

public final class NetworkStatsHistory implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.NetworkStatsHistory> CREATOR = null;
    NetworkStatsHistory() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.net.NetworkStatsHistory.Entry> getEntries() { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(long p0, int p1) {}
        @android.annotation.NonNull
        public android.net.NetworkStatsHistory.Builder addEntry(android.net.NetworkStatsHistory.Entry p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkStatsHistory build() { return null; }
    }

    public static final class Entry {
        public Entry(long p0, long p1, long p2, long p3, long p4, long p5, long p6) {}
        public long getBucketStart() { return 0L; }
        public long getActiveTime() { return 0L; }
        public long getRxBytes() { return 0L; }
        public long getRxPackets() { return 0L; }
        public long getTxBytes() { return 0L; }
        public long getTxPackets() { return 0L; }
        public long getOperations() { return 0L; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
