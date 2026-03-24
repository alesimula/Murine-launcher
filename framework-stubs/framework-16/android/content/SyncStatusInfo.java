package android.content;

public class SyncStatusInfo implements android.os.Parcelable {
    static final int VERSION = 6;
    public final int authorityId = 0;
    public long lastTodayResetTime;
    public final android.content.SyncStatusInfo.Stats totalStats = null;
    public final android.content.SyncStatusInfo.Stats todayStats = null;
    public final android.content.SyncStatusInfo.Stats yesterdayStats = null;
    public long lastSuccessTime;
    public int lastSuccessSource;
    public long lastFailureTime;
    public int lastFailureSource;
    public java.lang.String lastFailureMesg;
    public long initialFailureTime;
    public boolean pending;
    public boolean initialize;
    public final long[] perSourceLastSuccessTimes = null;
    public final long[] perSourceLastFailureTimes = null;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.SyncStatusInfo> CREATOR = null;
    public SyncStatusInfo(int p0) {}
    public int getLastFailureMesgAsInt(int p0) { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public SyncStatusInfo(android.os.Parcel p0) {}
    public SyncStatusInfo(android.content.SyncStatusInfo p0) {}
    public SyncStatusInfo(int p0, android.content.SyncStatusInfo p1) {}
    public int getPeriodicSyncTimesSize() { return 0; }
    public void addPeriodicSyncTime(long p0) {}
    public void setPeriodicSyncTime(int p0, long p1) {}
    public long getPeriodicSyncTime(int p0) { return 0L; }
    public void removePeriodicSyncTime(int p0) {}
    public void populateLastEventsInformation(java.util.ArrayList<android.util.Pair<java.lang.Long, java.lang.String>> p0) {}
    public void addEvent(java.lang.String p0) {}
    public int getEventCount() { return 0; }
    public long getEventTime(int p0) { return 0L; }
    public java.lang.String getEvent(int p0) { return null; }
    public void setLastSuccess(int p0, long p1) {}
    public void setLastFailure(int p0, long p1, java.lang.String p2) {}
    public void maybeResetTodayStats(boolean p0, boolean p1) {}

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
