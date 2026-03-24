package android.media;

public class RecordClientInfo implements android.os.Parcelable {
    public int riid;
    public int uid;
    public int session;
    public int source;
    public int portId;
    public boolean silenced;
    public static final android.os.Parcelable.Creator<android.media.RecordClientInfo> CREATOR = null;
    public RecordClientInfo() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
