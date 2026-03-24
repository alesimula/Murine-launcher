package android.hardware.biometrics.face;

public class EnrollmentFrame implements android.os.Parcelable {
    public android.hardware.biometrics.face.Cell cell;
    public byte stage;
    public android.hardware.biometrics.face.BaseFrame data;
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.face.EnrollmentFrame> CREATOR = null;
    public EnrollmentFrame() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
