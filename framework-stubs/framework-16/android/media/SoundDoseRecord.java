package android.media;

public class SoundDoseRecord implements android.os.Parcelable {
    public long timestamp;
    public int duration;
    public float value;
    public float averageMel;
    public static final android.os.Parcelable.Creator<android.media.SoundDoseRecord> CREATOR = null;
    public SoundDoseRecord() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
