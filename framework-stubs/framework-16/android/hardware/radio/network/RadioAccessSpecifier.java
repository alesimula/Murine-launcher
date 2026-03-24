package android.hardware.radio.network;

public class RadioAccessSpecifier implements android.os.Parcelable {
    public int accessNetwork;
    public android.hardware.radio.network.RadioAccessSpecifierBands bands;
    public int[] channels;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.RadioAccessSpecifier> CREATOR = null;
    public RadioAccessSpecifier() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
