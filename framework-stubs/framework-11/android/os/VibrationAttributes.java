package android.os;

public final class VibrationAttributes implements android.os.Parcelable {
    private static final java.lang.String TAG = "VibrationAttributes";
    public static final int USAGE_CLASS_UNKNOWN = 0;
    public static final int USAGE_CLASS_ALARM = 1;
    public static final int USAGE_CLASS_FEEDBACK = 2;
    public static final int USAGE_CLASS_MASK = 15;
    public static final int USAGE_UNKNOWN = 0;
    public static final int USAGE_ALARM = 17;
    public static final int USAGE_RINGTONE = 33;
    public static final int USAGE_NOTIFICATION = 49;
    public static final int USAGE_COMMUNICATION_REQUEST = 65;
    public static final int USAGE_TOUCH = 18;
    public static final int USAGE_PHYSICAL_EMULATION = 34;
    public static final int USAGE_HARDWARE_FEEDBACK = 50;
    public static final int FLAG_BYPASS_INTERRUPTION_POLICY = 1;
    private static final long MAX_HAPTIC_FEEDBACK_DURATION = 5000L;
    private final int mUsage = 0;
    private final int mFlags = 0;
    private final android.media.AudioAttributes mAudioAttributes = null;
    public static final android.os.Parcelable.Creator<android.os.VibrationAttributes> CREATOR = null;
    private VibrationAttributes(int p0, int p1, android.media.AudioAttributes p2) {}
    public int getUsageClass() { return 0; }
    public int getUsage() { return 0; }
    public int getFlags() { return 0; }
    public boolean isFlagSet(int p0) { return false; }
    @java.lang.Deprecated
    public android.media.AudioAttributes getAudioAttributes() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private VibrationAttributes(android.os.Parcel p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public java.lang.String usageToString() { return null; }
    public java.lang.String usageToString(int p0) { return null; }

    public static final class Builder {
        private int mUsage;
        private int mFlags;
        private android.media.AudioAttributes mAudioAttributes;
        public Builder() {}
        public Builder(android.os.VibrationAttributes p0) {}
        public Builder(android.media.AudioAttributes p0, android.os.VibrationEffect p1) {}
        private void applyHapticFeedbackHeuristics(android.os.VibrationEffect p0) {}
        private void setUsage(android.media.AudioAttributes p0) {}
        private void setFlags(android.media.AudioAttributes p0) {}
        public android.os.VibrationAttributes build() { return null; }
        public android.os.VibrationAttributes.Builder setUsage(int p0) { return null; }
        public android.os.VibrationAttributes.Builder replaceFlags(int p0) { return null; }
        public android.os.VibrationAttributes.Builder setFlags(int p0, int p1) { return null; }
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
