package android.media;

public class ClientConfigParcel implements android.os.Parcelable {
    public android.media.ClientInfoParcel clientInfo;
    public int codecType;
    public boolean isEncoder;
    public int width;
    public int height;
    public long timeStamp;
    public long id;
    public static final android.os.Parcelable.Creator<android.media.ClientConfigParcel> CREATOR = null;
    public ClientConfigParcel() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
