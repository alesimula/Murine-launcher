package android.telecom;

public class VideoProfile implements android.os.Parcelable {
    public static final int QUALITY_UNKNOWN = 0;
    public static final int QUALITY_HIGH = 1;
    public static final int QUALITY_MEDIUM = 2;
    public static final int QUALITY_LOW = 3;
    public static final int QUALITY_DEFAULT = 4;
    public static final int STATE_AUDIO_ONLY = 0;
    public static final int STATE_TX_ENABLED = 1;
    public static final int STATE_RX_ENABLED = 2;
    public static final int STATE_BIDIRECTIONAL = 3;
    public static final int STATE_PAUSED = 4;
    private final int mVideoState = 0;
    private final int mQuality = 0;
    public static final android.os.Parcelable.Creator<android.telecom.VideoProfile> CREATOR = null;
    public VideoProfile(int p0) {}
    public VideoProfile(int p0, int p1) {}
    public int getVideoState() { return 0; }
    public int getQuality() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public static java.lang.String videoStateToString(int p0) { return null; }
    public static boolean isAudioOnly(int p0) { return false; }
    public static boolean isVideo(int p0) { return false; }
    public static boolean isTransmissionEnabled(int p0) { return false; }
    public static boolean isReceptionEnabled(int p0) { return false; }
    public static boolean isBidirectional(int p0) { return false; }
    public static boolean isPaused(int p0) { return false; }
    private static boolean hasState(int p0, int p1) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VideoState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VideoQuality {
    }

    public static final class CameraCapabilities implements android.os.Parcelable {
        private final int mWidth = 0;
        private final int mHeight = 0;
        private final boolean mZoomSupported = false;
        private final float mMaxZoom = 0.0f;
        public static final android.os.Parcelable.Creator<android.telecom.VideoProfile.CameraCapabilities> CREATOR = null;
        public CameraCapabilities(int p0, int p1) {}
        public CameraCapabilities(int p0, int p1, boolean p2, float p3) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int getWidth() { return 0; }
        public int getHeight() { return 0; }
        public boolean isZoomSupported() { return false; }
        public float getMaxZoom() { return 0.0f; }
    }
}
