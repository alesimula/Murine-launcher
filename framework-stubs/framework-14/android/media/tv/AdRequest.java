package android.media.tv;

public final class AdRequest implements android.os.Parcelable {
    public static final int REQUEST_TYPE_START = 1;
    public static final int REQUEST_TYPE_STOP = 2;
    public static final android.os.Parcelable.Creator<android.media.tv.AdRequest> CREATOR = null;
    public static final java.lang.String KEY_VIDEO_METADATA = "key_video_metadata";
    public static final java.lang.String KEY_AUDIO_METADATA = "key_audio_metadata";
    public AdRequest(int p0, int p1, android.os.ParcelFileDescriptor p2, long p3, long p4, long p5, java.lang.String p6, android.os.Bundle p7) {}
    public AdRequest(int p0, int p1, android.net.Uri p2, long p3, long p4, long p5, android.os.Bundle p6) {}
    public int getId() { return 0; }
    public int getRequestType() { return 0; }
    public android.os.ParcelFileDescriptor getFileDescriptor() { return null; }
    public android.net.Uri getUri() { return null; }
    public long getStartTimeMillis() { return 0L; }
    public long getStopTimeMillis() { return 0L; }
    public long getEchoIntervalMillis() { return 0L; }
    public java.lang.String getMediaFileType() { return null; }
    public android.os.Bundle getMetadata() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequestType {
    }
}
