package android.media;

public final class AudioAttributes implements android.os.Parcelable {
    public static final int ALLOW_CAPTURE_BY_ALL = 1;
    public static final int ALLOW_CAPTURE_BY_NONE = 3;
    public static final int ALLOW_CAPTURE_BY_SYSTEM = 2;
    public static final int CONTENT_TYPE_MOVIE = 3;
    public static final int CONTENT_TYPE_MUSIC = 2;
    public static final int CONTENT_TYPE_SONIFICATION = 4;
    public static final int CONTENT_TYPE_SPEECH = 1;
    public static final int CONTENT_TYPE_UNKNOWN = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.AudioAttributes> CREATOR = null;
    public static final int FLAG_AUDIBILITY_ENFORCED = 1;
    public static final int FLAG_HW_AV_SYNC = 16;
    @java.lang.Deprecated
    public static final int FLAG_LOW_LATENCY = 256;
    public static final int SPATIALIZATION_BEHAVIOR_AUTO = 0;
    public static final int SPATIALIZATION_BEHAVIOR_NEVER = 1;
    public static final int USAGE_ALARM = 4;
    public static final int USAGE_ASSISTANCE_ACCESSIBILITY = 11;
    public static final int USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
    public static final int USAGE_ASSISTANCE_SONIFICATION = 13;
    public static final int USAGE_ASSISTANT = 16;
    public static final int USAGE_GAME = 14;
    public static final int USAGE_MEDIA = 1;
    public static final int USAGE_NOTIFICATION = 5;
    @java.lang.Deprecated
    public static final int USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
    @java.lang.Deprecated
    public static final int USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
    @java.lang.Deprecated
    public static final int USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
    public static final int USAGE_NOTIFICATION_EVENT = 10;
    public static final int USAGE_NOTIFICATION_RINGTONE = 6;
    public static final int USAGE_UNKNOWN = 0;
    public static final int USAGE_VOICE_COMMUNICATION = 2;
    public static final int USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;
    AudioAttributes() {}
    public int getContentType() { return 0; }
    public int getUsage() { return 0; }
    public int getFlags() { return 0; }
    public boolean areHapticChannelsMuted() { return false; }
    public boolean isContentSpatialized() { return false; }
    public int getSpatializationBehavior() { return 0; }
    public int getAllowedCapturePolicy() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int getVolumeControlStream() { return 0; }

    public static class Builder {
        public Builder() {}
        public Builder(android.media.AudioAttributes p0) {}
        public android.media.AudioAttributes build() { return null; }
        public android.media.AudioAttributes.Builder setUsage(int p0) { return null; }
        public android.media.AudioAttributes.Builder setContentType(int p0) { return null; }
        public android.media.AudioAttributes.Builder setFlags(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioAttributes.Builder setAllowedCapturePolicy(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioAttributes.Builder setIsContentSpatialized(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioAttributes.Builder setSpatializationBehavior(int p0) { return null; }
        public android.media.AudioAttributes.Builder setLegacyStreamType(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioAttributes.Builder setHapticChannelsMuted(boolean p0) { return null; }
    }
}
