package android.hardware.radio.network;

public class TdscdmaSignalStrength implements android.os.Parcelable {
    public int signalStrength;
    public int bitErrorRate;
    public int rscp;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.TdscdmaSignalStrength> CREATOR = null;
    public TdscdmaSignalStrength() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
