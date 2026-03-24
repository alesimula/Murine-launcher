package android.hardware.radio.network;

public class BarringTypeSpecificInfo implements android.os.Parcelable {
    public int factor;
    public int timeSeconds;
    public boolean isBarred;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.BarringTypeSpecificInfo> CREATOR = null;
    public BarringTypeSpecificInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
