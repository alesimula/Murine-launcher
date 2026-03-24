package android.content.pm;

public class SignedPackageParcel implements android.os.Parcelable {
    public java.lang.String packageName;
    public byte[] certificateDigest;
    public static final android.os.Parcelable.Creator<android.content.pm.SignedPackageParcel> CREATOR = null;
    public SignedPackageParcel() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
