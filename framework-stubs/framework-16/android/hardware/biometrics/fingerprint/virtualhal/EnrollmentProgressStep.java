package android.hardware.biometrics.fingerprint.virtualhal;

public class EnrollmentProgressStep implements android.os.Parcelable {
    public int durationMs;
    public android.hardware.biometrics.fingerprint.virtualhal.AcquiredInfoAndVendorCode[] acquiredInfoAndVendorCodes;
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.fingerprint.virtualhal.EnrollmentProgressStep> CREATOR = null;
    public EnrollmentProgressStep() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
