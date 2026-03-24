package android.os;

public class CreateAppDataArgs implements android.os.Parcelable {
    public java.lang.String uuid;
    public java.lang.String packageName;
    public int userId;
    public int flags;
    public int appId;
    public java.lang.String seInfo;
    public int targetSdkVersion;
    public static final android.os.Parcelable.Creator<android.os.CreateAppDataArgs> CREATOR = null;
    public CreateAppDataArgs() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
