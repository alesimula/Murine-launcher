package android.media;

public class MicrophoneInfoData implements android.os.Parcelable {
    public java.lang.String deviceId;
    public int portId;
    public int type;
    public java.lang.String address;
    public int deviceLocation;
    public int deviceGroup;
    public int indexInTheGroup;
    public float[] geometricLocation;
    public float[] orientation;
    public float[] frequencies;
    public float[] frequencyResponses;
    public int[] channelMapping;
    public float sensitivity;
    public float maxSpl;
    public float minSpl;
    public int directionality;
    public static final android.os.Parcelable.Creator<android.media.MicrophoneInfoData> CREATOR = null;
    public MicrophoneInfoData() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
