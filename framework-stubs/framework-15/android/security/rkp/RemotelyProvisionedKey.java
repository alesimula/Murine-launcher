package android.security.rkp;

public class RemotelyProvisionedKey implements android.os.Parcelable {
    public byte[] keyBlob;
    public byte[] encodedCertChain;
    public static final android.os.Parcelable.Creator<android.security.rkp.RemotelyProvisionedKey> CREATOR = null;
    public RemotelyProvisionedKey() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
