package android.os;

public final class VibrationAttributes implements android.os.Parcelable {
    public static final int USAGE_FILTER_MATCH_ALL = -1;
    public static final int USAGE_CLASS_UNKNOWN = 0;
    public static final int USAGE_CLASS_ALARM = 1;
    public static final int USAGE_CLASS_FEEDBACK = 2;
    public static final int USAGE_CLASS_MEDIA = 3;
    public static final int USAGE_CLASS_MASK = 15;
    public static final int USAGE_UNKNOWN = 0;
    public static final int USAGE_ALARM = 17;
    public static final int USAGE_RINGTONE = 33;
    public static final int USAGE_NOTIFICATION = 49;
    public static final int USAGE_COMMUNICATION_REQUEST = 65;
    public static final int USAGE_TOUCH = 18;
    public static final int USAGE_PHYSICAL_EMULATION = 34;
    public static final int USAGE_HARDWARE_FEEDBACK = 50;
    public static final int USAGE_ACCESSIBILITY = 66;
    @android.annotation.FlaggedApi("android.os.vibrator.vibration_attribute_ime_usage_api")
    public static final int USAGE_IME_FEEDBACK = 82;
    @android.annotation.FlaggedApi("android.os.vibrator.haptic_feedback_with_custom_usage")
    public static final int USAGE_GESTURE_INPUT = 98;
    public static final int USAGE_MEDIA = 19;
    public static final int FLAG_BYPASS_INTERRUPTION_POLICY = 1;
    public static final int FLAG_BYPASS_USER_VIBRATION_INTENSITY_OFF = 2;
    public static final int FLAG_INVALIDATE_SETTINGS_CACHE = 4;
    public static final int FLAG_PIPELINED_EFFECT = 8;
    public static final int FLAG_ALL_SUPPORTED = 15;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.os.VibrationAttributes> CREATOR = null;
    @android.annotation.NonNull
    public static android.os.VibrationAttributes createForUsage(int p0) { return null; }
    public int getUsageClass() { return 0; }
    public int getUsage() { return 0; }
    public int getOriginalAudioUsage() { return 0; }
    public int getFlags() { return 0; }
    public boolean isFlagSet(int p0) { return false; }
    public int getAudioUsage() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public java.lang.String usageToString() { return null; }
    public static java.lang.String usageToString(int p0) { return null; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.os.VibrationAttributes p0) {}
        public Builder(android.media.AudioAttributes p0) {}
        @android.annotation.NonNull
        public android.os.VibrationAttributes build() { return null; }
        @android.annotation.NonNull
        public android.os.VibrationAttributes.Builder setUsage(int p0) { return null; }
        @android.annotation.NonNull
        public android.os.VibrationAttributes.Builder setFlags(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.os.VibrationAttributes.Builder setFlags(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flag {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Usage {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UsageClass {
    }
}
