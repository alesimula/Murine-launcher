package android.hardware.biometrics.face.virtualhal;

public class EnrollmentProgressStep implements android.os.Parcelable {
    public int durationMs;
    public android.hardware.biometrics.face.virtualhal.AcquiredInfoAndVendorCode[] acquiredInfoAndVendorCodes;
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.face.virtualhal.EnrollmentProgressStep> CREATOR = null;
    public EnrollmentProgressStep() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
