package android.gsi;

public class GsiInstallParams implements android.os.Parcelable {
    public java.lang.String installDir;
    public long gsiSize;
    public long userdataSize;
    public boolean wipeUserdata;
    public static final android.os.Parcelable.Creator<android.gsi.GsiInstallParams> CREATOR = null;
    public GsiInstallParams() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
