package android.hardware.biometrics.fingerprint;

public class EnrollmentProgressStep implements android.os.Parcelable {
    public int durationMs;
    public android.hardware.biometrics.fingerprint.AcquiredInfoAndVendorCode[] acquiredInfoAndVendorCodes;
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.fingerprint.EnrollmentProgressStep> CREATOR = null;
    public EnrollmentProgressStep() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
