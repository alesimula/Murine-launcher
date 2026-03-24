package android.media.tv;

@android.annotation.SuppressLint("ParcelNotFinal")
public abstract class BroadcastInfoRequest implements android.os.Parcelable {
    public static final int REQUEST_OPTION_REPEAT = 0;
    public static final int REQUEST_OPTION_AUTO_UPDATE = 1;
    public static final android.os.Parcelable.Creator<android.media.tv.BroadcastInfoRequest> CREATOR = null;
    BroadcastInfoRequest(int p0, int p1, int p2) {}
    BroadcastInfoRequest(int p0, android.os.Parcel p1) {}
    public int getType() { return 0; }
    public int getRequestId() { return 0; }
    public int getOption() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequestOption {
    }
}
