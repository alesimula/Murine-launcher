package android.hardware.biometrics;

public class SensorPropertiesInternal implements android.os.Parcelable {
    public final int sensorId = 0;
    public final int sensorStrength = 0;
    public final int maxEnrollmentsPerUser = 0;
    @android.annotation.NonNull
    public final java.util.List<android.hardware.biometrics.ComponentInfoInternal> componentInfo = null;
    public final boolean resetLockoutRequiresHardwareAuthToken = false;
    public final boolean resetLockoutRequiresChallenge = false;
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.SensorPropertiesInternal> CREATOR = null;
    public static android.hardware.biometrics.SensorPropertiesInternal from(android.hardware.biometrics.SensorPropertiesInternal p0) { return null; }
    public SensorPropertiesInternal(int p0, int p1, int p2, java.util.List<android.hardware.biometrics.ComponentInfoInternal> p3, boolean p4, boolean p5) {}
    protected SensorPropertiesInternal(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}
