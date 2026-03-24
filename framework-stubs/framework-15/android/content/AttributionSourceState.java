package android.content;

public class AttributionSourceState implements android.os.Parcelable {
    public int pid;
    public int uid;
    public int deviceId;
    public java.lang.String packageName;
    public java.lang.String attributionTag;
    public android.os.IBinder token;
    public java.lang.String[] renouncedPermissions;
    public android.content.AttributionSourceState[] next;
    public static final android.os.Parcelable.Creator<android.content.AttributionSourceState> CREATOR = null;
    public AttributionSourceState() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
