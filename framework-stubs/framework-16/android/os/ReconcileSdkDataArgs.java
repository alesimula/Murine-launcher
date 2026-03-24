package android.os;

public class ReconcileSdkDataArgs implements android.os.Parcelable {
    public java.lang.String uuid;
    public java.lang.String packageName;
    public java.util.List<java.lang.String> subDirNames;
    public int userId;
    public int appId;
    public int previousAppId;
    public java.lang.String seInfo;
    public int flags;
    public static final android.os.Parcelable.Creator<android.os.ReconcileSdkDataArgs> CREATOR = null;
    public ReconcileSdkDataArgs() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
