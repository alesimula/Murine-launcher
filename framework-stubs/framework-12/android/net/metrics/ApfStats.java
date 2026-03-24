package android.net.metrics;

@java.lang.Deprecated
@android.annotation.SystemApi
public final class ApfStats implements android.net.metrics.IpConnectivityLog.Event {
    public final long durationMs = 0L;
    public final int receivedRas = 0;
    public final int matchingRas = 0;
    public final int droppedRas = 0;
    public final int zeroLifetimeRas = 0;
    public final int parseErrors = 0;
    public final int programUpdates = 0;
    public final int programUpdatesAll = 0;
    public final int programUpdatesAllowingMulticast = 0;
    public final int maxProgramSize = 0;
    public static final android.os.Parcelable.Creator<android.net.metrics.ApfStats> CREATOR = null;
    private ApfStats(android.os.Parcel p0) {}
    private ApfStats(long p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }

    @android.annotation.SystemApi
    public static final class Builder {
        private long mDurationMs;
        private int mReceivedRas;
        private int mMatchingRas;
        private int mDroppedRas;
        private int mZeroLifetimeRas;
        private int mParseErrors;
        private int mProgramUpdates;
        private int mProgramUpdatesAll;
        private int mProgramUpdatesAllowingMulticast;
        private int mMaxProgramSize;
        public Builder() {}
        public android.net.metrics.ApfStats.Builder setDurationMs(long p0) { return null; }
        public android.net.metrics.ApfStats.Builder setReceivedRas(int p0) { return null; }
        public android.net.metrics.ApfStats.Builder setMatchingRas(int p0) { return null; }
        public android.net.metrics.ApfStats.Builder setDroppedRas(int p0) { return null; }
        public android.net.metrics.ApfStats.Builder setZeroLifetimeRas(int p0) { return null; }
        public android.net.metrics.ApfStats.Builder setParseErrors(int p0) { return null; }
        public android.net.metrics.ApfStats.Builder setProgramUpdates(int p0) { return null; }
        public android.net.metrics.ApfStats.Builder setProgramUpdatesAll(int p0) { return null; }
        public android.net.metrics.ApfStats.Builder setProgramUpdatesAllowingMulticast(int p0) { return null; }
        public android.net.metrics.ApfStats.Builder setMaxProgramSize(int p0) { return null; }
        public android.net.metrics.ApfStats build() { return null; }
    }
}
