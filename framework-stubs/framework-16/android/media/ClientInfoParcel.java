package android.media;

public class ClientInfoParcel implements android.os.Parcelable {
    public int pid;
    public int uid;
    public long id;
    public java.lang.String name;
    public int importance;
    public static final android.os.Parcelable.Creator<android.media.ClientInfoParcel> CREATOR = null;
    public ClientInfoParcel() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
