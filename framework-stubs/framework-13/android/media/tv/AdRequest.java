package android.media.tv;

public final class AdRequest implements android.os.Parcelable {
    public static final int REQUEST_TYPE_START = 1;
    public static final int REQUEST_TYPE_STOP = 2;
    public static final android.os.Parcelable.Creator<android.media.tv.AdRequest> CREATOR = null;
    public AdRequest(int p0, int p1, android.os.ParcelFileDescriptor p2, long p3, long p4, long p5, java.lang.String p6, android.os.Bundle p7) {}
    public int getId() { return 0; }
    public int getRequestType() { return 0; }
    public android.os.ParcelFileDescriptor getFileDescriptor() { return null; }
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
