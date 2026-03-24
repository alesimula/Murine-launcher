package android.media;

public class AudioVibratorInfo implements android.os.Parcelable {
    public int id;
    public float resonantFrequency;
    public float qFactor;
    public float maxAmplitude;
    public static final android.os.Parcelable.Creator<android.media.AudioVibratorInfo> CREATOR = null;
    public AudioVibratorInfo() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
