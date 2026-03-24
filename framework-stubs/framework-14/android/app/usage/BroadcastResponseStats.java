package android.app.usage;

@android.annotation.SystemApi
public final class BroadcastResponseStats implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.usage.BroadcastResponseStats> CREATOR = null;
    public BroadcastResponseStats(java.lang.String p0, long p1) {}
    public java.lang.String getPackageName() { return null; }
    public long getId() { return 0L; }
    public int getBroadcastsDispatchedCount() { return 0; }
    public int getNotificationsPostedCount() { return 0; }
    public int getNotificationsUpdatedCount() { return 0; }
    public int getNotificationsCancelledCount() { return 0; }
    public void incrementBroadcastsDispatchedCount(int p0) {}
    public void incrementNotificationsPostedCount(int p0) {}
    public void incrementNotificationsUpdatedCount(int p0) {}
    public void incrementNotificationsCancelledCount(int p0) {}
    public void addCounts(android.app.usage.BroadcastResponseStats p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
