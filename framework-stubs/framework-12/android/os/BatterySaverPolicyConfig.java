package android.os;

@android.annotation.SystemApi
public final class BatterySaverPolicyConfig implements android.os.Parcelable {
    private final float mAdjustBrightnessFactor = 0.0f;
    private final boolean mAdvertiseIsEnabled = false;
    private final boolean mDeferFullBackup = false;
    private final boolean mDeferKeyValueBackup = false;
    private final java.util.Map<java.lang.String, java.lang.String> mDeviceSpecificSettings = null;
    private final boolean mDisableAnimation = false;
    private final boolean mDisableAod = false;
    private final boolean mDisableLaunchBoost = false;
    private final boolean mDisableOptionalSensors = false;
    private final boolean mDisableVibration = false;
    private final boolean mEnableAdjustBrightness = false;
    private final boolean mEnableDataSaver = false;
    private final boolean mEnableFirewall = false;
    private final boolean mEnableNightMode = false;
    private final boolean mEnableQuickDoze = false;
    private final boolean mForceAllAppsStandby = false;
    private final boolean mForceBackgroundCheck = false;
    private final int mLocationMode = 0;
    private final int mSoundTriggerMode = 0;
    public static final android.os.Parcelable.Creator<android.os.BatterySaverPolicyConfig> CREATOR = null;
    private BatterySaverPolicyConfig(android.os.BatterySaverPolicyConfig.Builder p0) {}
    private BatterySaverPolicyConfig(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public float getAdjustBrightnessFactor() { return 0.0f; }
    public boolean getAdvertiseIsEnabled() { return false; }
    public boolean getDeferFullBackup() { return false; }
    public boolean getDeferKeyValueBackup() { return false; }
    public java.util.Map<java.lang.String, java.lang.String> getDeviceSpecificSettings() { return null; }
    public boolean getDisableAnimation() { return false; }
    public boolean getDisableAod() { return false; }
    public boolean getDisableLaunchBoost() { return false; }
    public boolean getDisableOptionalSensors() { return false; }
    public int getSoundTriggerMode() { return 0; }
    @java.lang.Deprecated
    public boolean getDisableSoundTrigger() { return false; }
    public boolean getDisableVibration() { return false; }
    public boolean getEnableAdjustBrightness() { return false; }
    public boolean getEnableDataSaver() { return false; }
    public boolean getEnableFirewall() { return false; }
    public boolean getEnableNightMode() { return false; }
    public boolean getEnableQuickDoze() { return false; }
    public boolean getForceAllAppsStandby() { return false; }
    public boolean getForceBackgroundCheck() { return false; }
    public int getLocationMode() { return 0; }

    public static final class Builder {
        private float mAdjustBrightnessFactor;
        private boolean mAdvertiseIsEnabled;
        private boolean mDeferFullBackup;
        private boolean mDeferKeyValueBackup;
        private final android.util.ArrayMap<java.lang.String, java.lang.String> mDeviceSpecificSettings = null;
        private boolean mDisableAnimation;
        private boolean mDisableAod;
        private boolean mDisableLaunchBoost;
        private boolean mDisableOptionalSensors;
        private boolean mDisableVibration;
        private boolean mEnableAdjustBrightness;
        private boolean mEnableDataSaver;
        private boolean mEnableFirewall;
        private boolean mEnableNightMode;
        private boolean mEnableQuickDoze;
        private boolean mForceAllAppsStandby;
        private boolean mForceBackgroundCheck;
        private int mLocationMode;
        private int mSoundTriggerMode;
        public Builder() {}
        public Builder(android.os.BatterySaverPolicyConfig p0) {}
        public android.os.BatterySaverPolicyConfig.Builder setAdjustBrightnessFactor(float p0) { return null; }
        public android.os.BatterySaverPolicyConfig.Builder setAdvertiseIsEnabled(boolean p0) { return null; }
        public android.os.BatterySaverPolicyConfig.Builder setDeferFullBackup(boolean p0) { return null; }
        public android.os.BatterySaverPolicyConfig.Builder setDeferKeyValueBackup(boolean p0) { return null; }
        public android.os.BatterySaverPolicyConfig.Builder addDeviceSpecificSetting(java.lang.String p0, java.lang.String p1) { return null; }
        public android.os.BatterySaverPolicyConfig.Builder setDisableAnimation(boolean p0) { return null; }
        public android.os.BatterySaverPolicyConfig.Builder setDisableAod(boolean p0) { return null; }
        public android.os.BatterySaverPolicyConfig.Builder setDisableLaunchBoost(boolean p0) { return null; }
        public android.os.BatterySaverPolicyConfig.Builder setDisableOptionalSensors(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.os.BatterySaverPolicyConfig.Builder setDisableSoundTrigger(boolean p0) { return null; }
        public android.os.BatterySaverPolicyConfig.Builder setSoundTriggerMode(int p0) { return null; }
        public android.os.BatterySaverPolicyConfig.Builder setDisableVibration(boolean p0) { return null; }
        public android.os.BatterySaverPolicyConfig.Builder setEnableAdjustBrightness(boolean p0) { return null; }
        public android.os.BatterySaverPolicyConfig.Builder setEnableDataSaver(boolean p0) { return null; }
        public android.os.BatterySaverPolicyConfig.Builder setEnableFirewall(boolean p0) { return null; }
        public android.os.BatterySaverPolicyConfig.Builder setEnableNightMode(boolean p0) { return null; }
        public android.os.BatterySaverPolicyConfig.Builder setEnableQuickDoze(boolean p0) { return null; }
        public android.os.BatterySaverPolicyConfig.Builder setForceAllAppsStandby(boolean p0) { return null; }
        public android.os.BatterySaverPolicyConfig.Builder setForceBackgroundCheck(boolean p0) { return null; }
        public android.os.BatterySaverPolicyConfig.Builder setLocationMode(int p0) { return null; }
        public android.os.BatterySaverPolicyConfig build() { return null; }
    }
}
