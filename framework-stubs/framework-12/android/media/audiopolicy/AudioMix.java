package android.media.audiopolicy;

@android.annotation.SystemApi
public class AudioMix {
    private android.media.audiopolicy.AudioMixingRule mRule;
    private android.media.AudioFormat mFormat;
    private int mRouteFlags;
    private int mMixType;
    int mMixState;
    int mCallbackFlags;
    java.lang.String mDeviceAddress;
    final int mDeviceSystemType = 0;
    public static final int CALLBACK_FLAG_NOTIFY_ACTIVITY = 1;
    private static final int CALLBACK_FLAGS_ALL = 1;
    public static final int ROUTE_FLAG_RENDER = 1;
    public static final int ROUTE_FLAG_LOOP_BACK = 2;
    public static final int ROUTE_FLAG_LOOP_BACK_RENDER = 3;
    private static final int ROUTE_FLAG_SUPPORTED = 3;
    public static final int MIX_TYPE_INVALID = -1;
    public static final int MIX_TYPE_PLAYERS = 0;
    public static final int MIX_TYPE_RECORDERS = 1;
    public static final int MIX_STATE_DISABLED = -1;
    public static final int MIX_STATE_IDLE = 0;
    public static final int MIX_STATE_MIXING = 1;
    private static final int PRIVILEDGED_CAPTURE_MAX_SAMPLE_RATE = 16000;
    private static final int PRIVILEDGED_CAPTURE_MAX_CHANNEL_NUMBER = 1;
    private static final int PRIVILEDGED_CAPTURE_MAX_BYTES_PER_SAMPLE = 2;
    private AudioMix(android.media.audiopolicy.AudioMixingRule p0, android.media.AudioFormat p1, int p2, int p3, int p4, java.lang.String p5) {}
    public int getMixState() { return 0; }
    public int getRouteFlags() { return 0; }
    public android.media.AudioFormat getFormat() { return null; }
    public android.media.audiopolicy.AudioMixingRule getRule() { return null; }
    public int getMixType() { return 0; }
    void setRegistration(java.lang.String p0) {}
    public java.lang.String getRegistration() { return null; }
    public boolean isAffectingUsage(int p0) { return false; }
    public boolean containsMatchAttributeRuleForUsage(int p0) { return false; }
    public boolean isRoutedToDevice(int p0, java.lang.String p1) { return false; }
    public static java.lang.String canBeUsedForPrivilegedMediaCapture(android.media.AudioFormat p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static class Builder {
        private android.media.audiopolicy.AudioMixingRule mRule;
        private android.media.AudioFormat mFormat;
        private int mRouteFlags;
        private int mCallbackFlags;
        private int mDeviceSystemType;
        private java.lang.String mDeviceAddress;
        Builder() {}
        public Builder(android.media.audiopolicy.AudioMixingRule p0) throws java.lang.IllegalArgumentException {}
        android.media.audiopolicy.AudioMix.Builder setMixingRule(android.media.audiopolicy.AudioMixingRule p0) throws java.lang.IllegalArgumentException { return null; }
        android.media.audiopolicy.AudioMix.Builder setCallbackFlags(int p0) throws java.lang.IllegalArgumentException { return null; }
        android.media.audiopolicy.AudioMix.Builder setDevice(int p0, java.lang.String p1) { return null; }
        public android.media.audiopolicy.AudioMix.Builder setFormat(android.media.AudioFormat p0) throws java.lang.IllegalArgumentException { return null; }
        public android.media.audiopolicy.AudioMix.Builder setRouteFlags(int p0) throws java.lang.IllegalArgumentException { return null; }
        public android.media.audiopolicy.AudioMix.Builder setDevice(android.media.AudioDeviceInfo p0) throws java.lang.IllegalArgumentException { return null; }
        public android.media.audiopolicy.AudioMix build() throws java.lang.IllegalArgumentException { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RouteFlags {
    }
}
