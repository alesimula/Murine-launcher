package android.hardware.biometrics.fingerprint;

public class SensorLocation implements android.os.Parcelable {
    @java.lang.Deprecated
    public int displayId;
    public int sensorLocationX;
    public int sensorLocationY;
    public int sensorRadius;
    public java.lang.String display;
    public byte sensorShape;
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.fingerprint.SensorLocation> CREATOR = null;
    public SensorLocation() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
