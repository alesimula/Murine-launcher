package android.os;

public final class WakeLockStats implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.WakeLockStats> CREATOR = null;
    public WakeLockStats(java.util.List<android.os.WakeLockStats.WakeLock> p0) {}
    public java.util.List<android.os.WakeLockStats.WakeLock> getWakeLocks() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }

    public static class WakeLock {
        public final int uid = 0;
        public final java.lang.String name = null;
        public final int timesAcquired = 0;
        public final long totalTimeHeldMs = 0L;
        public final long timeHeldMs = 0L;
        public WakeLock(int p0, java.lang.String p1, int p2, long p3, long p4) {}
        public java.lang.String toString() { return null; }
    }
}
