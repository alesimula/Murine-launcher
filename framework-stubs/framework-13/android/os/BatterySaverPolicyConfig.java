package android.os;

@android.annotation.SystemApi
public final class BatterySaverPolicyConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.BatterySaverPolicyConfig> CREATOR = null;
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
