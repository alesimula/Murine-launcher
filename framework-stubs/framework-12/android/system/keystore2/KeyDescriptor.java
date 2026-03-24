package android.system.keystore2;

public class KeyDescriptor implements android.os.Parcelable {
    public int domain;
    public long nspace;
    public java.lang.String alias;
    public byte[] blob;
    public static final android.os.Parcelable.Creator<android.system.keystore2.KeyDescriptor> CREATOR = null;
    public KeyDescriptor() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
