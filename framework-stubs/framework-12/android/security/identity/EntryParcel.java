package android.security.identity;

public class EntryParcel implements android.os.Parcelable {
    public java.lang.String name;
    public byte[] value;
    public int[] accessControlProfileIds;
    public static final android.os.Parcelable.Creator<android.security.identity.EntryParcel> CREATOR = null;
    public EntryParcel() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
