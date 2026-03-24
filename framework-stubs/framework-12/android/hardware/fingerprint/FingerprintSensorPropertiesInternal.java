package android.hardware.fingerprint;

public class FingerprintSensorPropertiesInternal extends android.hardware.biometrics.SensorPropertiesInternal {
    public final int sensorType = 0;
    public final int sensorLocationX = 0;
    public final int sensorLocationY = 0;
    public final int sensorRadius = 0;
    public static final android.os.Parcelable.Creator<android.hardware.fingerprint.FingerprintSensorPropertiesInternal> CREATOR = null;
    public FingerprintSensorPropertiesInternal(int p0, int p1, int p2, java.util.List<android.hardware.biometrics.ComponentInfoInternal> p3, int p4, boolean p5, int p6, int p7, int p8) { super((android.os.Parcel)null); }
    public FingerprintSensorPropertiesInternal(int p0, int p1, int p2, java.util.List<android.hardware.biometrics.ComponentInfoInternal> p3, int p4, boolean p5) { super((android.os.Parcel)null); }
    protected FingerprintSensorPropertiesInternal(android.os.Parcel p0) { super((android.os.Parcel)null); }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean isAnyUdfpsType() { return false; }
    public boolean isAnySidefpsType() { return false; }
    public java.lang.String toString() { return null; }
}
