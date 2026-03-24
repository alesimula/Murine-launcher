package android.media.tv;

@android.annotation.FlaggedApi("android.media.tv.flags.tiaf_v_apis")
public final class SignalingDataInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.tv.SignalingDataInfo> CREATOR = null;
    public static final int LLS_NO_GROUP_ID = -1;
    public static final java.lang.String CONTENT_ENCODING_UTF_8 = "UTF-8";
    public static final java.lang.String CONTENT_ENCODING_BASE64 = "Base64";
    public SignalingDataInfo(java.lang.String p0, java.lang.String p1, int p2, int p3) {}
    public SignalingDataInfo(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String p4) {}
    @android.annotation.NonNull
    public java.lang.String getTable() { return null; }
    @android.annotation.NonNull
    public java.lang.String getSignalingDataType() { return null; }
    public int getVersion() { return 0; }
    public int getGroup() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getEncoding() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    SignalingDataInfo(android.os.Parcel p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ContentEncoding {
    }
}
