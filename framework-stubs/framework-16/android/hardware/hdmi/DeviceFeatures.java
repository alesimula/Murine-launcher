package android.hardware.hdmi;

public class DeviceFeatures {
    public static final int FEATURE_NOT_SUPPORTED = 0;
    public static final int FEATURE_SUPPORTED = 1;
    public static final int FEATURE_SUPPORT_UNKNOWN = 2;
    @android.annotation.NonNull
    public static final android.hardware.hdmi.DeviceFeatures ALL_FEATURES_SUPPORT_UNKNOWN = null;
    @android.annotation.NonNull
    public static final android.hardware.hdmi.DeviceFeatures NO_FEATURES_SUPPORTED = null;
    public android.hardware.hdmi.DeviceFeatures.Builder toBuilder() { return null; }
    @android.annotation.NonNull
    public static android.hardware.hdmi.DeviceFeatures fromOperand(byte[] p0) { return null; }
    @android.annotation.NonNull
    public byte[] toOperand() { return null; }
    @android.hardware.hdmi.DeviceFeatures.FeatureSupportStatus
    public int getRecordTvScreenSupport() { return 0; }
    @android.hardware.hdmi.DeviceFeatures.FeatureSupportStatus
    public int getSetOsdStringSupport() { return 0; }
    @android.hardware.hdmi.DeviceFeatures.FeatureSupportStatus
    public int getDeckControlSupport() { return 0; }
    @android.hardware.hdmi.DeviceFeatures.FeatureSupportStatus
    public int getSetAudioRateSupport() { return 0; }
    @android.hardware.hdmi.DeviceFeatures.FeatureSupportStatus
    public int getArcTxSupport() { return 0; }
    @android.hardware.hdmi.DeviceFeatures.FeatureSupportStatus
    public int getArcRxSupport() { return 0; }
    @android.hardware.hdmi.DeviceFeatures.FeatureSupportStatus
    public int getSetAudioVolumeLevelSupport() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public android.hardware.hdmi.DeviceFeatures build() { return null; }
        @android.annotation.NonNull
        public android.hardware.hdmi.DeviceFeatures.Builder setRecordTvScreenSupport(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.hdmi.DeviceFeatures.Builder setSetOsdStringSupport(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.hdmi.DeviceFeatures.Builder setDeckControlSupport(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.hdmi.DeviceFeatures.Builder setSetAudioRateSupport(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.hdmi.DeviceFeatures.Builder setArcTxSupport(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.hdmi.DeviceFeatures.Builder setArcRxSupport(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.hdmi.DeviceFeatures.Builder setSetAudioVolumeLevelSupport(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.hdmi.DeviceFeatures.Builder update(android.hardware.hdmi.DeviceFeatures p0) { return null; }
    }

    public static @interface FeatureSupportStatus {
    }
}
