package android.media;

public final class AudioHalVersionInfo implements android.os.Parcelable, java.lang.Comparable<android.media.AudioHalVersionInfo> {
    public static final int AUDIO_HAL_TYPE_HIDL = 0;
    public static final int AUDIO_HAL_TYPE_AIDL = 1;
    @android.annotation.NonNull
    public static final android.media.AudioHalVersionInfo AIDL_1_0 = null;
    @android.annotation.NonNull
    public static final android.media.AudioHalVersionInfo HIDL_7_1 = null;
    @android.annotation.NonNull
    public static final android.media.AudioHalVersionInfo HIDL_7_0 = null;
    @android.annotation.NonNull
    public static final android.media.AudioHalVersionInfo HIDL_6_0 = null;
    @android.annotation.NonNull
    public static final android.media.AudioHalVersionInfo HIDL_5_0 = null;
    @android.annotation.NonNull
    public static final android.media.AudioHalVersionInfo HIDL_4_0 = null;
    @android.annotation.NonNull
    public static final android.media.AudioHalVersionInfo HIDL_2_0 = null;
    @android.annotation.NonNull
    public static final java.util.List<android.media.AudioHalVersionInfo> VERSIONS = null;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.AudioHalVersionInfo> CREATOR = null;
    public int getHalType() { return 0; }
    public int getMajorVersion() { return 0; }
    public int getMinorVersion() { return 0; }
    public java.lang.String toString() { return null; }
    public int compareTo(android.media.AudioHalVersionInfo p0) { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioHalType {
    }
}
