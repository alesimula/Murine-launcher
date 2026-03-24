package android.hardware.security.keymint;

public class AttestationKey implements android.os.Parcelable {
    public byte[] keyBlob;
    public android.hardware.security.keymint.KeyParameter[] attestKeyParams;
    public byte[] issuerSubjectName;
    public static final android.os.Parcelable.Creator<android.hardware.security.keymint.AttestationKey> CREATOR = null;
    public AttestationKey() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    private int describeContents(java.lang.Object p0) { return 0; }
}
