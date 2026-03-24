package android.content.pm;

public class PackageChangeEvent implements android.os.Parcelable {
    public java.lang.String packageName;
    public long version;
    public long lastUpdateTimeMillis;
    public boolean newInstalled;
    public boolean dataRemoved;
    public boolean isDeleted;
    public static final android.os.Parcelable.Creator<android.content.pm.PackageChangeEvent> CREATOR = null;
    public PackageChangeEvent() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
