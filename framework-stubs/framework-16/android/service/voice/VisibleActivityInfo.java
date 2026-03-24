package android.service.voice;

public final class VisibleActivityInfo implements android.os.Parcelable {
    public static final int TYPE_ACTIVITY_ADDED = 1;
    public static final int TYPE_ACTIVITY_REMOVED = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.voice.VisibleActivityInfo> CREATOR = null;
    public VisibleActivityInfo(int p0, android.os.IBinder p1) {}
    @android.annotation.NonNull
    public android.service.voice.VoiceInteractionSession.ActivityId getActivityId() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    VisibleActivityInfo(android.os.Parcel p0) {}
}
