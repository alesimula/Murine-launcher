package android.hardware.biometrics.fingerprint;

public class SensorProps implements android.os.Parcelable {
    public android.hardware.biometrics.common.CommonProps commonProps;
    public byte sensorType;
    public android.hardware.biometrics.fingerprint.SensorLocation[] sensorLocations;
    public boolean supportsNavigationGestures;
    public boolean supportsDetectInteraction;
    public boolean halHandlesDisplayTouches;
    public boolean halControlsIllumination;
    public android.hardware.biometrics.fingerprint.TouchDetectionParameters touchDetectionParameters;
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.fingerprint.SensorProps> CREATOR = null;
    public SensorProps() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
