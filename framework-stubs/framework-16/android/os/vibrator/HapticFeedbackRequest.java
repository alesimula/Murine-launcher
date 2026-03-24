package android.os.vibrator;

@android.annotation.FlaggedApi("android.os.vibrator.haptic_feedback_with_custom_usage")
public final class HapticFeedbackRequest {
    public int getFeedbackConstant() { return 0; }
    public int getUsage() { return 0; }
    public int getFlags() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(int p0) {}
        public Builder(android.os.vibrator.HapticFeedbackRequest p0) {}
        @android.annotation.NonNull
        public android.os.vibrator.HapticFeedbackRequest.Builder setUsage(int p0) { return null; }
        @android.annotation.NonNull
        public android.os.vibrator.HapticFeedbackRequest.Builder setFlags(int p0) { return null; }
        @android.annotation.NonNull
        public android.os.vibrator.HapticFeedbackRequest build() { return null; }
    }
}
