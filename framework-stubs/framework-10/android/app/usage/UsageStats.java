package android.app.usage;

public final class UsageStats implements android.os.Parcelable {
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public java.lang.String mPackageName;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public long mBeginTimeStamp;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public long mEndTimeStamp;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public long mLastTimeUsed;
    public long mLastTimeVisible;
    @android.annotation.UnsupportedAppUsage
    public long mTotalTimeInForeground;
    public long mTotalTimeVisible;
    public long mLastTimeForegroundServiceUsed;
    public long mTotalTimeForegroundServiceUsed;
    @android.annotation.UnsupportedAppUsage
    public int mLaunchCount;
    public int mAppLaunchCount;
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public int mLastEvent;
    public android.util.SparseIntArray mActivities;
    public android.util.ArrayMap<java.lang.String, java.lang.Integer> mForegroundServices;
    public android.util.ArrayMap<java.lang.String, android.util.ArrayMap<java.lang.String, java.lang.Integer>> mChooserCounts;
    public static final android.os.Parcelable.Creator<android.app.usage.UsageStats> CREATOR = null;
    public UsageStats() {}
    public UsageStats(android.app.usage.UsageStats p0) {}
    public android.app.usage.UsageStats getObfuscatedForInstantApp() { return null; }
    public java.lang.String getPackageName() { return null; }
    public long getFirstTimeStamp() { return 0L; }
    public long getLastTimeStamp() { return 0L; }
    public long getLastTimeUsed() { return 0L; }
    public long getLastTimeVisible() { return 0L; }
    public long getTotalTimeInForeground() { return 0L; }
    public long getTotalTimeVisible() { return 0L; }
    public long getLastTimeForegroundServiceUsed() { return 0L; }
    public long getTotalTimeForegroundServiceUsed() { return 0L; }
    @android.annotation.SystemApi
    public int getAppLaunchCount() { return 0; }
    private void mergeEventMap(android.util.SparseIntArray p0, android.util.SparseIntArray p1) {}
    private void mergeEventMap(android.util.ArrayMap<java.lang.String, java.lang.Integer> p0, android.util.ArrayMap<java.lang.String, java.lang.Integer> p1) {}
    public void add(android.app.usage.UsageStats p0) {}
    private boolean hasForegroundActivity() { return false; }
    private boolean hasVisibleActivity() { return false; }
    private boolean anyForegroundServiceStarted() { return false; }
    private void incrementTimeUsed(long p0) {}
    private void incrementTimeVisible(long p0) {}
    private void incrementServiceTimeUsed(long p0) {}
    private void updateActivity(java.lang.String p0, long p1, int p2, int p3) {}
    private void updateForegroundService(java.lang.String p0, long p1, int p2) {}
    public void update(java.lang.String p0, long p1, int p2, int p3) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private void writeSparseIntArray(android.os.Parcel p0, android.util.SparseIntArray p1) {}
    private android.os.Bundle eventMapToBundle(android.util.ArrayMap<java.lang.String, java.lang.Integer> p0) { return null; }
}
