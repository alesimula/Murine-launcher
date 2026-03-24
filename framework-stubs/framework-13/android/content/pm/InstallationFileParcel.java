package android.content.pm;

public class InstallationFileParcel implements android.os.Parcelable {
    public java.lang.String name;
    public int location;
    public long size;
    public byte[] metadata;
    public byte[] signature;
    public static final android.os.Parcelable.Creator<android.content.pm.InstallationFileParcel> CREATOR = null;
    public InstallationFileParcel() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
