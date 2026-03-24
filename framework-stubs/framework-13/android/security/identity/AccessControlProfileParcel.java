package android.security.identity;

public class AccessControlProfileParcel implements android.os.Parcelable {
    public int id;
    public byte[] readerCertificate;
    public boolean userAuthenticationRequired;
    public long userAuthenticationTimeoutMillis;
    public static final android.os.Parcelable.Creator<android.security.identity.AccessControlProfileParcel> CREATOR = null;
    public AccessControlProfileParcel() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
