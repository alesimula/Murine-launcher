package android.media;

public final class AudioAttributes implements android.os.Parcelable {
    public static final int CONTENT_TYPE_UNKNOWN = 0;
    public static final int CONTENT_TYPE_SPEECH = 1;
    public static final int CONTENT_TYPE_MUSIC = 2;
    public static final int CONTENT_TYPE_MOVIE = 3;
    public static final int CONTENT_TYPE_SONIFICATION = 4;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.ACCESS_ULTRASOUND")
    public static final int CONTENT_TYPE_ULTRASOUND = 1997;
    public static final int USAGE_UNKNOWN = 0;
    public static final int USAGE_MEDIA = 1;
    public static final int USAGE_VOICE_COMMUNICATION = 2;
    public static final int USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;
    public static final int USAGE_ALARM = 4;
    public static final int USAGE_NOTIFICATION = 5;
    public static final int USAGE_NOTIFICATION_RINGTONE = 6;
    @java.lang.Deprecated
    public static final int USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
    @java.lang.Deprecated
    public static final int USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
    @java.lang.Deprecated
    public static final int USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
    public static final int USAGE_NOTIFICATION_EVENT = 10;
    public static final int USAGE_ASSISTANCE_ACCESSIBILITY = 11;
    public static final int USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
    public static final int USAGE_ASSISTANCE_SONIFICATION = 13;
    public static final int USAGE_GAME = 14;
    public static final int USAGE_VIRTUAL_SOURCE = 15;
    public static final int USAGE_ASSISTANT = 16;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.MODIFY_PHONE_STATE", "android.permission.MODIFY_AUDIO_ROUTING"})
    public static final int USAGE_CALL_ASSISTANT = 17;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public static final int USAGE_EMERGENCY = 1000;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public static final int USAGE_SAFETY = 1001;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public static final int USAGE_VEHICLE_STATUS = 1002;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public static final int USAGE_ANNOUNCEMENT = 1003;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.media.audio.speaker_cleanup_usage")
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public static final int USAGE_SPEAKER_CLEANUP = 1004;
    public static final int SUPPRESSIBLE_NOTIFICATION = 1;
    public static final int SUPPRESSIBLE_CALL = 2;
    public static final int SUPPRESSIBLE_NEVER = 3;
    public static final int SUPPRESSIBLE_ALARM = 4;
    public static final int SUPPRESSIBLE_MEDIA = 5;
    public static final int SUPPRESSIBLE_SYSTEM = 6;
    public static final android.util.SparseIntArray SUPPRESSIBLE_USAGES = null;
    public static final android.util.IntArray SDK_USAGES = null;
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
    public static final int FLAG_CAPTURE_PRIVATE = 8192;
    public static final int FLAG_CONTENT_SPATIALIZED = 16384;
    public static final int FLAG_NEVER_SPATIALIZE = 32768;
    public static final int FLAG_CALL_REDIRECTION = 65536;
    public static final int ALLOW_CAPTURE_BY_ALL = 1;
    public static final int ALLOW_CAPTURE_BY_SYSTEM = 2;
    public static final int ALLOW_CAPTURE_BY_NONE = 3;
    public static final int SPATIALIZATION_BEHAVIOR_AUTO = 0;
    public static final int SPATIALIZATION_BEHAVIOR_NEVER = 1;
    public static final int FLATTEN_TAGS = 1;
    @android.annotation.SuppressLint("UnflaggedApi")
    public static final long VALUE_TEST_ID_NONE = -9223372036854775808L;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.AudioAttributes> CREATOR = null;
    public static int[] getSdkUsages() { return null; }
    public int getContentType() { return 0; }
    public int getUsage() { return 0; }
    @android.annotation.SystemApi
    public int getSystemUsage() { return 0; }
    @android.annotation.SystemApi
    public int getCapturePreset() { return 0; }
    public int getFlags() { return 0; }
    @android.annotation.SystemApi
    public int getAllFlags() { return 0; }
    @android.annotation.SystemApi
    public android.os.Bundle getBundle() { return null; }
    public java.util.Set<java.lang.String> getTags() { return null; }
    public boolean areHapticChannelsMuted() { return false; }
    public boolean isContentSpatialized() { return false; }
    @android.annotation.SuppressLint("UnflaggedApi")
    public long getTestId() { return 0L; }
    public int getSpatializationBehavior() { return 0; }
    public int getAllowedCapturePolicy() { return 0; }
    public boolean isForCallRedirection() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public java.lang.String usageToString() { return null; }
    @android.annotation.NonNull
    public static java.lang.String usageToString(int p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.String usageToXsdString(int p0) { return null; }
    public static int xsdStringToUsage(java.lang.String p0) { return 0; }
    public java.lang.String contentTypeToString() { return null; }
    @android.annotation.SystemApi
    public static boolean isSystemUsage(int p0) { return false; }
    public static boolean isSdkUsage(int p0) { return false; }
    public static boolean isHiddenUsage(int p0) { return false; }
    public static boolean isSdkContentType(int p0) { return false; }
    public int getVolumeControlStream() { return 0; }
    public static int toLegacyStreamType(android.media.AudioAttributes p0) { return 0; }
    public static int capturePolicyToFlags(int p0, int p1) { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttrInternalContentType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttributeContentType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttributeSdkUsage {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttributeSystemUsage {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttributeUsage {
    }

    public static class Builder {
        public Builder() {}
        public Builder(android.media.AudioAttributes p0) {}
        public android.media.AudioAttributes build() { return null; }
        public android.media.AudioAttributes.Builder setUsage(int p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
        @android.annotation.NonNull
        public android.media.AudioAttributes.Builder setSystemUsage(int p0) { return null; }
        public android.media.AudioAttributes.Builder setContentType(int p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.NonNull
        public android.media.AudioAttributes.Builder setInternalContentType(int p0) { return null; }
        public android.media.AudioAttributes.Builder setFlags(int p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.CAPTURE_AUDIO_HOTWORD")
        @android.annotation.NonNull
        public android.media.AudioAttributes.Builder setHotwordModeEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioAttributes.Builder setAllowedCapturePolicy(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioAttributes.Builder setIsContentSpatialized(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioAttributes.Builder setSpatializationBehavior(int p0) { return null; }
        public android.media.AudioAttributes.Builder replaceFlags(int p0) { return null; }
        @android.annotation.SystemApi
        public android.media.AudioAttributes.Builder addBundle(android.os.Bundle p0) { return null; }
        public android.media.AudioAttributes.Builder addTag(java.lang.String p0) { return null; }
        public android.media.AudioAttributes.Builder replaceTags(java.util.HashSet<java.lang.String> p0) { return null; }
        public android.media.AudioAttributes.Builder setLegacyStreamType(int p0) { return null; }
        public android.media.AudioAttributes.Builder setInternalLegacyStreamType(int p0) { return null; }
        @android.annotation.SystemApi
        public android.media.AudioAttributes.Builder setCapturePreset(int p0) { return null; }
        @android.annotation.SystemApi
        public android.media.AudioAttributes.Builder setInternalCapturePreset(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioAttributes.Builder setHapticChannelsMuted(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioAttributes.Builder setPrivacySensitive(boolean p0) { return null; }
        public android.media.AudioAttributes.Builder setForCallRedirection() { return null; }
        @android.annotation.SuppressLint("UnflaggedApi")
        @android.annotation.NonNull
        public android.media.AudioAttributes.Builder setTestId(long p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CapturePolicy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SpatializationBehavior {
    }
}
