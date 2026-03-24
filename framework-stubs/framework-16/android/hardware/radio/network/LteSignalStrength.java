package android.hardware.radio.network;

public class LteSignalStrength implements android.os.Parcelable {
    public int signalStrength;
    public int rsrp;
    public int rsrq;
    public int rssnr;
    public int cqi;
    public int timingAdvance;
    public int cqiTableIndex;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.LteSignalStrength> CREATOR = null;
    public LteSignalStrength() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
