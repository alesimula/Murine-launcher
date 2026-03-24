package android.media;

public class MediaSyncEvent implements android.os.Parcelable {
    public static final int SYNC_EVENT_NONE = 0;
    public static final int SYNC_EVENT_PRESENTATION_COMPLETE = 1;
    @android.annotation.SystemApi
    public static final int SYNC_EVENT_SHARE_AUDIO_HISTORY = 100;
    public static final android.os.Parcelable.Creator<android.media.MediaSyncEvent> CREATOR = null;
    public static android.media.MediaSyncEvent createEvent(int p0) throws java.lang.IllegalArgumentException { return null; }
    public android.media.MediaSyncEvent setAudioSessionId(int p0) throws java.lang.IllegalArgumentException { return null; }
    public int getType() { return 0; }
    public int getAudioSessionId() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public static java.lang.String typeToString(int p0) { return null; }
}
