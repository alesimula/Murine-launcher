package android.content;

public class SyncStatusInfo implements android.os.Parcelable {
    private static final java.lang.String TAG = "Sync";
    static final int VERSION = 6;
    private static final int MAX_EVENT_COUNT = 10;
    private static final int SOURCE_COUNT = 6;
    @android.annotation.UnsupportedAppUsage
    public final int authorityId = 0;
    public long lastTodayResetTime;
    public final android.content.SyncStatusInfo.Stats totalStats = null;
    public final android.content.SyncStatusInfo.Stats todayStats = null;
    public final android.content.SyncStatusInfo.Stats yesterdayStats = null;
    @android.annotation.UnsupportedAppUsage
    public long lastSuccessTime;
    @android.annotation.UnsupportedAppUsage
    public int lastSuccessSource;
    @android.annotation.UnsupportedAppUsage
    public long lastFailureTime;
    @android.annotation.UnsupportedAppUsage
    public int lastFailureSource;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String lastFailureMesg;
    @android.annotation.UnsupportedAppUsage
    public long initialFailureTime;
    @android.annotation.UnsupportedAppUsage
    public boolean pending;
    @android.annotation.UnsupportedAppUsage
    public boolean initialize;
    public final long[] perSourceLastSuccessTimes = null;
    public final long[] perSourceLastFailureTimes = null;
    @android.annotation.UnsupportedAppUsage
    private java.util.ArrayList<java.lang.Long> periodicSyncTimes;
    private final java.util.ArrayList<java.lang.Long> mLastEventTimes = null;
    private final java.util.ArrayList<java.lang.String> mLastEvents = null;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.Parcelable.Creator<android.content.SyncStatusInfo> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public SyncStatusInfo(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public int getLastFailureMesgAsInt(int p0) { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public SyncStatusInfo(android.os.Parcel p0) {}
    public SyncStatusInfo(android.content.SyncStatusInfo p0) {}
    private static void copy(long[] p0, long[] p1) {}
    @android.annotation.UnsupportedAppUsage
    public void setPeriodicSyncTime(int p0, long p1) {}
    @android.annotation.UnsupportedAppUsage
    public long getPeriodicSyncTime(int p0) { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public void removePeriodicSyncTime(int p0) {}
    public void addEvent(java.lang.String p0) {}
    public int getEventCount() { return 0; }
    public long getEventTime(int p0) { return 0L; }
    public java.lang.String getEvent(int p0) { return null; }
    public void setLastSuccess(int p0, long p1) {}
    public void setLastFailure(int p0, long p1, java.lang.String p2) {}
    @android.annotation.UnsupportedAppUsage
    private void ensurePeriodicSyncTimeSize(int p0) {}
    public void maybeResetTodayStats(boolean p0, boolean p1) {}
    private static boolean areSameDates(long p0, long p1) { return false; }

    public static class Stats {
        public long totalElapsedTime;
        public int numSyncs;
        public int numSourcePoll;
        public int numSourceOther;
        public int numSourceLocal;
        public int numSourceUser;
        public int numSourcePeriodic;
        public int numSourceFeed;
        public int numFailures;
        public int numCancels;
        public Stats() {}
        public void copyTo(android.content.SyncStatusInfo.Stats p0) {}
        public void clear() {}
        public void writeToParcel(android.os.Parcel p0) {}
        public void readFromParcel(android.os.Parcel p0) {}
    }
}
