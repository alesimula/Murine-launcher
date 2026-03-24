package android.app.usage;

public final class EventStats implements android.os.Parcelable {
    public int mEventType;
    public long mBeginTimeStamp;
    public long mEndTimeStamp;
    public long mLastEventTime;
    public long mTotalTime;
    public int mCount;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.usage.EventStats> CREATOR = null;
    public EventStats() {}
    public EventStats(android.app.usage.EventStats p0) {}
    public int getEventType() { return 0; }
    public long getFirstTimeStamp() { return 0L; }
    public long getLastTimeStamp() { return 0L; }
    public long getLastEventTime() { return 0L; }
    public int getCount() { return 0; }
    public long getTotalTime() { return 0L; }
    public void add(android.app.usage.EventStats p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
