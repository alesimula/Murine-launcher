package android.media.projection;

public final class MediaProjectionConfig implements android.os.Parcelable {
    public static final int CAPTURE_REGION_USER_CHOICE = 0;
    public static final int CAPTURE_REGION_FIXED_DISPLAY = 1;
    public static final android.os.Parcelable.Creator<android.media.projection.MediaProjectionConfig> CREATOR = null;
    public static android.media.projection.MediaProjectionConfig createConfigForDefaultDisplay() { return null; }
    public static android.media.projection.MediaProjectionConfig createConfigForUserChoice() { return null; }
    public java.lang.String toString() { return null; }
    public int getDisplayToCapture() { return 0; }
    public int getRegionToCapture() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    MediaProjectionConfig(android.os.Parcel p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CaptureRegion {
    }
}
