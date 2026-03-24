package android.security.identity;

public class GetEntriesResultParcel implements android.os.Parcelable {
    public android.security.identity.ResultNamespaceParcel[] resultNamespaces;
    public byte[] deviceNameSpaces;
    public byte[] mac;
    public byte[] staticAuthenticationData;
    public byte[] signature;
    public static final android.os.Parcelable.Creator<android.security.identity.GetEntriesResultParcel> CREATOR = null;
    public GetEntriesResultParcel() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
