package android.media;

public class GetOutputForAttrResponse implements android.os.Parcelable {
    public int output;
    public int stream;
    public int[] selectedDeviceIds;
    public int portId;
    public int[] secondaryOutputs;
    public boolean isSpatialized;
    public android.media.audio.common.AudioConfigBase configBase;
    public boolean isBitPerfect;
    public android.media.audio.common.AudioAttributes attr;
    public static final android.os.Parcelable.Creator<android.media.GetOutputForAttrResponse> CREATOR = null;
    public GetOutputForAttrResponse() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
