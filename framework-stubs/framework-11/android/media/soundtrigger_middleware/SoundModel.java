package android.media.soundtrigger_middleware;

public class SoundModel implements android.os.Parcelable {
    public int type;
    public java.lang.String uuid;
    public java.lang.String vendorUuid;
    public java.io.FileDescriptor data;
    public int dataSize;
    public static final android.os.Parcelable.Creator<android.media.soundtrigger_middleware.SoundModel> CREATOR = null;
    public SoundModel() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
