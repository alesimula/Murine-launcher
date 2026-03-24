package android.media.projection;

public final class MediaProjectionEvent implements android.os.Parcelable {
    public static final int PROJECTION_STARTED_DURING_CALL_AND_ACTIVE_POST_CALL = 0;
    public static final android.os.Parcelable.Creator<android.media.projection.MediaProjectionEvent> CREATOR = null;
    public MediaProjectionEvent(int p0, long p1) {}
    public int getEventType() { return 0; }
    public long getTimestampMillis() { return 0L; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EventType {
    }
}
