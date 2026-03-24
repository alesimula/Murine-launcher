package android.hardware.biometrics.common;

public class CommonProps implements android.os.Parcelable {
    public int sensorId;
    public byte sensorStrength;
    public int maxEnrollmentsPerUser;
    public android.hardware.biometrics.common.ComponentInfo[] componentInfo;
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.common.CommonProps> CREATOR = null;
    public CommonProps() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
