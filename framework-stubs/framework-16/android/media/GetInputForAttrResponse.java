package android.media;

public class GetInputForAttrResponse implements android.os.Parcelable {
    public int input;
    public int selectedDeviceId;
    public int portId;
    public int virtualDeviceId;
    public android.media.audio.common.AudioConfigBase config;
    public int source;
    public static final android.os.Parcelable.Creator<android.media.GetInputForAttrResponse> CREATOR = null;
    public GetInputForAttrResponse() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
