package android.hardware.radio.sim;

public class IccIo implements android.os.Parcelable {
    public int command;
    public int fileId;
    public java.lang.String path;
    public int p1;
    public int p2;
    public int p3;
    public java.lang.String data;
    public java.lang.String pin2;
    public java.lang.String aid;
    public static final android.os.Parcelable.Creator<android.hardware.radio.sim.IccIo> CREATOR = null;
    public IccIo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
