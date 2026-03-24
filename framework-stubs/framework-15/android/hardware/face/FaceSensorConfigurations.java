package android.hardware.face;

public class FaceSensorConfigurations implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.face.FaceSensorConfigurations> CREATOR = null;
    public FaceSensorConfigurations(boolean p0) {}
    protected FaceSensorConfigurations(android.os.Parcel p0) {}
    public void addAidlConfigs(java.lang.String[] p0) {}
    public void addHidlConfigs(java.lang.String[] p0, android.content.Context p1) {}
    public boolean hasSensorConfigurations() { return false; }
    public boolean isSingleSensorConfigurationPresent() { return false; }
    @android.annotation.Nullable
    public boolean doesInstanceExist(java.lang.String p0) { return false; }
    @android.annotation.Nullable
    public java.lang.String getSensorNameNotForInstance(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public java.lang.String getSensorInstance() { return null; }
    public boolean getResetLockoutRequiresChallenge() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.Nullable
    public android.hardware.biometrics.face.SensorProps[] getSensorPropForInstance(java.lang.String p0) { return null; }
}
