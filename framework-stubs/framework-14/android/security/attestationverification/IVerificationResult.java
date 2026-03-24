package android.security.attestationverification;

public class IVerificationResult implements android.os.Parcelable {
    public int resultCode;
    public android.security.attestationverification.VerificationToken token;
    public static final android.os.Parcelable.Creator<android.security.attestationverification.IVerificationResult> CREATOR = null;
    public IVerificationResult() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
