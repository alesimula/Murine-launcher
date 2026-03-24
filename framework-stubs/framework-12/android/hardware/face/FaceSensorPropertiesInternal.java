package android.hardware.face;

public class FaceSensorPropertiesInternal extends android.hardware.biometrics.SensorPropertiesInternal {
    public final int sensorType = 0;
    public final boolean supportsFaceDetection = false;
    public final boolean supportsSelfIllumination = false;
    public static final android.os.Parcelable.Creator<android.hardware.face.FaceSensorPropertiesInternal> CREATOR = null;
    public FaceSensorPropertiesInternal(int p0, int p1, int p2, java.util.List<android.hardware.biometrics.ComponentInfoInternal> p3, int p4, boolean p5, boolean p6, boolean p7) { super((android.os.Parcel)null); }
    protected FaceSensorPropertiesInternal(android.os.Parcel p0) { super((android.os.Parcel)null); }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}
