package android.hardware.cas;

public class SubSample implements android.os.Parcelable {
    public int numBytesOfClearData;
    public int numBytesOfEncryptedData;
    public static final android.os.Parcelable.Creator<android.hardware.cas.SubSample> CREATOR = null;
    public SubSample() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
