package android.hardware;

public class CameraFeatureCombinationStats implements android.os.Parcelable {
    public java.lang.String mCameraId;
    public int mUid;
    public long mFeatureCombination;
    public int mQueryType;
    public int mStatus;
    public static final android.os.Parcelable.Creator<android.hardware.CameraFeatureCombinationStats> CREATOR = null;
    public static final long CAMERA_FEATURE_UNKNOWN = 0L;
    public static final long CAMERA_FEATURE_60_FPS = 1L;
    public static final long CAMERA_FEATURE_STABILIZATION = 2L;
    public static final long CAMERA_FEATURE_HLG10 = 4L;
    public static final long CAMERA_FEATURE_JPEG = 8L;
    public static final long CAMERA_FEATURE_JPEG_R = 16L;
    public static final long CAMERA_FEATURE_4K = 32L;
    public CameraFeatureCombinationStats() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface QueryType {
        public static final byte QUERY_FEATURE_COMBINATION = 0;
        public static final byte QUERY_SESSION_CHARACTERISTICS = 1;
    }
}
