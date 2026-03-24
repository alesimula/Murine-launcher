package android.app.usage;

public final class ConfigurationStats implements android.os.Parcelable {
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public android.content.res.Configuration mConfiguration;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public long mBeginTimeStamp;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public long mEndTimeStamp;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public long mLastTimeActive;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public long mTotalTimeActive;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public int mActivationCount;
    public static final android.os.Parcelable.Creator<android.app.usage.ConfigurationStats> CREATOR = null;
    public ConfigurationStats() {}
    public ConfigurationStats(android.app.usage.ConfigurationStats p0) {}
    public android.content.res.Configuration getConfiguration() { return null; }
    public long getFirstTimeStamp() { return 0L; }
    public long getLastTimeStamp() { return 0L; }
    public long getLastTimeActive() { return 0L; }
    public long getTotalTimeActive() { return 0L; }
    public int getActivationCount() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
