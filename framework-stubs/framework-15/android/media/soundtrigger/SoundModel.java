package android.media.soundtrigger;

public class SoundModel implements android.os.Parcelable {
    public int type;
    public java.lang.String uuid;
    public java.lang.String vendorUuid;
    public android.os.ParcelFileDescriptor data;
    public int dataSize;
    public static final android.os.Parcelable.Creator<android.media.soundtrigger.SoundModel> CREATOR = null;
    public SoundModel() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
}
