package android.hardware.fingerprint;

public final class Fingerprint extends android.hardware.biometrics.BiometricAuthenticator.Identifier {
    private int mGroupId;
    public static final android.os.Parcelable.Creator<android.hardware.fingerprint.Fingerprint> CREATOR = null;
    public Fingerprint(java.lang.CharSequence p0, int p1, int p2, long p3) { super(); }
    private Fingerprint(android.os.Parcel p0) { super(); }
    public int getGroupId() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
