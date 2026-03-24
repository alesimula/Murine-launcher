package android.security.identity;

public class AuthKeyParcel implements android.os.Parcelable {
    public byte[] x509cert;
    public static final android.os.Parcelable.Creator<android.security.identity.AuthKeyParcel> CREATOR = null;
    public AuthKeyParcel() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
