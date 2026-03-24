package android.hardware.fingerprint;

public class FingerprintSensorConfigurations implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.fingerprint.FingerprintSensorConfigurations> CREATOR = null;
    public FingerprintSensorConfigurations(boolean p0) {}
    public void addAidlSensors(java.lang.String[] p0) {}
    public void addHidlSensors(java.lang.String[] p0, android.content.Context p1) {}
    protected FingerprintSensorConfigurations(android.os.Parcel p0) {}
    public boolean hasSensorConfigurations() { return false; }
    public boolean isSingleSensorConfigurationPresent() { return false; }
    @android.annotation.Nullable
    public boolean doesInstanceExist(java.lang.String p0) { return false; }
    @android.annotation.Nullable
    public java.lang.String getSensorNameNotForInstance(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public java.lang.String getSensorInstance() { return null; }
    public boolean getResetLockoutRequiresHardwareAuthToken() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.Nullable
    public android.hardware.biometrics.fingerprint.SensorProps[] getSensorPropForInstance(java.lang.String p0) { return null; }
}
