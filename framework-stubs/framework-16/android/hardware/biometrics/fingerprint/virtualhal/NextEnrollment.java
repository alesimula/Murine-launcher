package android.hardware.biometrics.fingerprint.virtualhal;

public class NextEnrollment implements android.os.Parcelable {
    public int id;
    public android.hardware.biometrics.fingerprint.virtualhal.EnrollmentProgressStep[] progressSteps;
    public boolean result;
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.fingerprint.virtualhal.NextEnrollment> CREATOR = null;
    public NextEnrollment() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
