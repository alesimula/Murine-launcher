package android.media.tv;

public final class AdResponse implements android.os.Parcelable {
    public static final int RESPONSE_TYPE_PLAYING = 1;
    public static final int RESPONSE_TYPE_FINISHED = 2;
    public static final int RESPONSE_TYPE_STOPPED = 3;
    public static final int RESPONSE_TYPE_ERROR = 4;
    public static final int RESPONSE_TYPE_BUFFERING = 5;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.tv.AdResponse> CREATOR = null;
    public AdResponse(int p0, int p1, long p2) {}
    public int getId() { return 0; }
    public int getResponseType() { return 0; }
    public long getElapsedTimeMillis() { return 0L; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResponseType {
    }
}
