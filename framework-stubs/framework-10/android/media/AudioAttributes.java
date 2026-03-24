package android.media;

public final class AudioAttributes implements android.os.Parcelable {
    private static final java.lang.String TAG = "AudioAttributes";
    public static final int CONTENT_TYPE_UNKNOWN = 0;
    public static final int CONTENT_TYPE_SPEECH = 1;
    public static final int CONTENT_TYPE_MUSIC = 2;
    public static final int CONTENT_TYPE_MOVIE = 3;
    public static final int CONTENT_TYPE_SONIFICATION = 4;
    public static final int USAGE_UNKNOWN = 0;
    public static final int USAGE_MEDIA = 1;
    public static final int USAGE_VOICE_COMMUNICATION = 2;
    public static final int USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;
    public static final int USAGE_ALARM = 4;
    public static final int USAGE_NOTIFICATION = 5;
    public static final int USAGE_NOTIFICATION_RINGTONE = 6;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
    public static final int USAGE_NOTIFICATION_EVENT = 10;
    public static final int USAGE_ASSISTANCE_ACCESSIBILITY = 11;
    public static final int USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
    public static final int USAGE_ASSISTANCE_SONIFICATION = 13;
    public static final int USAGE_GAME = 14;
    public static final int USAGE_VIRTUAL_SOURCE = 15;
    public static final int USAGE_ASSISTANT = 16;
    public static final int SUPPRESSIBLE_NOTIFICATION = 1;
    public static final int SUPPRESSIBLE_CALL = 2;
    public static final int SUPPRESSIBLE_NEVER = 3;
    public static final int SUPPRESSIBLE_ALARM = 4;
    public static final int SUPPRESSIBLE_MEDIA = 5;
    public static final int SUPPRESSIBLE_SYSTEM = 6;
    public static final android.util.SparseIntArray SUPPRESSIBLE_USAGES = null;
    public static final int[] SDK_USAGES = null;
    public static final int FLAG_AUDIBILITY_ENFORCED = 1;
    public static final int FLAG_SECURE = 2;
    public static final int FLAG_SCO = 4;
    @android.annotation.SystemApi
    public static final int FLAG_BEACON = 8;
    public static final int FLAG_HW_AV_SYNC = 16;
    @android.annotation.SystemApi
    public static final int FLAG_HW_HOTWORD = 32;
    @android.annotation.SystemApi
    public static final int FLAG_BYPASS_INTERRUPTION_POLICY = 64;
    @android.annotation.SystemApi
    public static final int FLAG_BYPASS_MUTE = 128;
    public static final int FLAG_LOW_LATENCY = 256;
    public static final int FLAG_DEEP_BUFFER = 512;
    public static final int FLAG_NO_MEDIA_PROJECTION = 1024;
    public static final int FLAG_MUTE_HAPTIC = 2048;
    public static final int FLAG_NO_SYSTEM_CAPTURE = 4096;
    private static final int FLAG_ALL = 6143;
    private static final int FLAG_ALL_PUBLIC = 273;
    public static final int ALLOW_CAPTURE_BY_ALL = 1;
    public static final int ALLOW_CAPTURE_BY_SYSTEM = 2;
    public static final int ALLOW_CAPTURE_BY_NONE = 3;
    @android.annotation.UnsupportedAppUsage
    private int mUsage;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private int mContentType;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private int mSource;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private int mFlags;
    private java.util.HashSet<java.lang.String> mTags;
    @android.annotation.UnsupportedAppUsage
    private java.lang.String mFormattedTags;
    private android.os.Bundle mBundle;
    public static final int FLATTEN_TAGS = 1;
    private static final int ATTR_PARCEL_IS_NULL_BUNDLE = -1977;
    private static final int ATTR_PARCEL_IS_VALID_BUNDLE = 1980;
    private static final int ALL_PARCEL_FLAGS = 1;
    public static final android.os.Parcelable.Creator<android.media.AudioAttributes> CREATOR = null;
    private AudioAttributes() {}
    public int getContentType() { return 0; }
    public int getUsage() { return 0; }
    @android.annotation.SystemApi
    public int getCapturePreset() { return 0; }
    public int getFlags() { return 0; }
    @android.annotation.SystemApi
    public int getAllFlags() { return 0; }
    @android.annotation.SystemApi
    public android.os.Bundle getBundle() { return null; }
    public java.util.Set<java.lang.String> getTags() { return null; }
    public boolean areHapticChannelsMuted() { return false; }
    public int getAllowedCapturePolicy() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private AudioAttributes(android.os.Parcel p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToProto(android.util.proto.ProtoOutputStream p0, long p1) {}
    public java.lang.String usageToString() { return null; }
    public static java.lang.String usageToString(int p0) { return null; }
    public java.lang.String contentTypeToString() { return null; }
    private static int usageForStreamType(int p0) { return 0; }
    public int getVolumeControlStream() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static int toLegacyStreamType(android.media.AudioAttributes p0) { return 0; }
    private static int toVolumeStreamType(boolean p0, android.media.AudioAttributes p1) { return 0; }
    static int capturePolicyToFlags(int p0, int p1) { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CapturePolicy {
    }

    public static class Builder {
        private int mUsage;
        private int mContentType;
        private int mSource;
        private int mFlags;
        private boolean mMuteHapticChannels;
        private java.util.HashSet<java.lang.String> mTags;
        private android.os.Bundle mBundle;
        public Builder() {}
        public Builder(android.media.AudioAttributes p0) {}
        public android.media.AudioAttributes build() { return null; }
        public android.media.AudioAttributes.Builder setUsage(int p0) { return null; }
        public android.media.AudioAttributes.Builder setContentType(int p0) { return null; }
        public android.media.AudioAttributes.Builder setFlags(int p0) { return null; }
        public android.media.AudioAttributes.Builder setAllowedCapturePolicy(int p0) { return null; }
        public android.media.AudioAttributes.Builder replaceFlags(int p0) { return null; }
        @android.annotation.SystemApi
        public android.media.AudioAttributes.Builder addBundle(android.os.Bundle p0) { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.media.AudioAttributes.Builder addTag(java.lang.String p0) { return null; }
        public android.media.AudioAttributes.Builder setLegacyStreamType(int p0) { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.media.AudioAttributes.Builder setInternalLegacyStreamType(int p0) { return null; }
        @android.annotation.SystemApi
        public android.media.AudioAttributes.Builder setCapturePreset(int p0) { return null; }
        @android.annotation.SystemApi
        public android.media.AudioAttributes.Builder setInternalCapturePreset(int p0) { return null; }
        public android.media.AudioAttributes.Builder setHapticChannelsMuted(boolean p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttributeUsage {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttributeContentType {
    }
}
