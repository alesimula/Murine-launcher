package android.hardware.radio.sim;

public class SimApdu implements android.os.Parcelable {
    public int sessionId;
    public int cla;
    public int instruction;
    public int p1;
    public int p2;
    public int p3;
    public java.lang.String data;
    public boolean isEs10;
    public static final android.os.Parcelable.Creator<android.hardware.radio.sim.SimApdu> CREATOR = null;
    public SimApdu() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
