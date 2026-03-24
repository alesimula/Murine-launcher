package android.service.contentcapture;

@android.annotation.SystemApi
public final class ActivityEvent implements android.os.Parcelable {
    public static final int TYPE_ACTIVITY_RESUMED = 1;
    public static final int TYPE_ACTIVITY_PAUSED = 2;
    public static final int TYPE_ACTIVITY_STOPPED = 23;
    public static final int TYPE_ACTIVITY_DESTROYED = 24;
    public static final int TYPE_ACTIVITY_STARTED = 10000;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.contentcapture.ActivityEvent> CREATOR = null;
    public ActivityEvent(android.app.assist.ActivityId p0, android.content.ComponentName p1, int p2) {}
    @android.annotation.NonNull
    public android.app.assist.ActivityId getActivityId() { return null; }
    @android.annotation.NonNull
    public android.content.ComponentName getComponentName() { return null; }
    public int getEventType() { return 0; }
    public static java.lang.String getTypeAsString(int p0) { return null; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ActivityEventType {
    }
}
