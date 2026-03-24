package android.media.tv;

@android.annotation.SystemApi
public final class TunedInfo implements android.os.Parcelable {
    static final java.lang.String TAG = "TunedInfo";
    public static final int APP_TAG_SELF = 0;
    public static final int APP_TYPE_SELF = 1;
    public static final int APP_TYPE_SYSTEM = 2;
    public static final int APP_TYPE_NON_SYSTEM = 3;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.tv.TunedInfo> CREATOR = null;
    public TunedInfo(java.lang.String p0, android.net.Uri p1, boolean p2, boolean p3, boolean p4, int p5, int p6) {}
    @android.annotation.NonNull
    public java.lang.String getInputId() { return null; }
    @android.annotation.Nullable
    public android.net.Uri getChannelUri() { return null; }
    public boolean isRecordingSession() { return false; }
    public boolean isVisible() { return false; }
    public boolean isMainSession() { return false; }
    public int getAppTag() { return 0; }
    public int getAppType() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AppType {
    }
}
