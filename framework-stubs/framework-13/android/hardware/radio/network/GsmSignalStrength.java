package android.hardware.radio.network;

public class GsmSignalStrength implements android.os.Parcelable {
    public int signalStrength;
    public int bitErrorRate;
    public int timingAdvance;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.GsmSignalStrength> CREATOR = null;
    public GsmSignalStrength() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
