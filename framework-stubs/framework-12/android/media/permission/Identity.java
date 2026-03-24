package android.media.permission;

public class Identity implements android.os.Parcelable {
    public int uid;
    public int pid;
    public java.lang.String packageName;
    public java.lang.String attributionTag;
    public static final android.os.Parcelable.Creator<android.media.permission.Identity> CREATOR = null;
    public Identity() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
