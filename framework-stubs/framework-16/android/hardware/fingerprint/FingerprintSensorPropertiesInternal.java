package android.hardware.fingerprint;

public class FingerprintSensorPropertiesInternal extends android.hardware.biometrics.SensorPropertiesInternal {
    public final int sensorType = 0;
    public final boolean halControlsIllumination = false;
    public static final android.os.Parcelable.Creator<android.hardware.fingerprint.FingerprintSensorPropertiesInternal> CREATOR = null;
    public FingerprintSensorPropertiesInternal(int p0, int p1, int p2, java.util.List<android.hardware.biometrics.ComponentInfoInternal> p3, int p4, boolean p5, boolean p6, java.util.List<android.hardware.biometrics.SensorLocationInternal> p7) { super((android.os.Parcel)null); }
    public FingerprintSensorPropertiesInternal(int p0, int p1, int p2, java.util.List<android.hardware.biometrics.ComponentInfoInternal> p3, int p4, boolean p5) { super((android.os.Parcel)null); }
    protected FingerprintSensorPropertiesInternal(android.os.Parcel p0) { super((android.os.Parcel)null); }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean isAnyUdfpsType() { return false; }
    public boolean isUltrasonicUdfps() { return false; }
    public boolean isOpticalUdfps() { return false; }
    public boolean isAnySidefpsType() { return false; }
    @android.annotation.NonNull
    public android.hardware.biometrics.SensorLocationInternal getLocation() { return null; }
    @android.annotation.Nullable
    public android.hardware.biometrics.SensorLocationInternal getLocation(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.hardware.biometrics.SensorLocationInternal> getAllLocations() { return null; }
    public java.lang.String toString() { return null; }
}
