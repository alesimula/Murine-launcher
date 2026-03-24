package android.hardware.biometrics.face;

public class EnrollmentStageConfig implements android.os.Parcelable {
    public byte stage;
    public java.util.List<android.hardware.biometrics.face.Cell> cells;
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.face.EnrollmentStageConfig> CREATOR = null;
    public EnrollmentStageConfig() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
