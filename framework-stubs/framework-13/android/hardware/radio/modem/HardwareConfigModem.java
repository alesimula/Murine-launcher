package android.hardware.radio.modem;

public class HardwareConfigModem implements android.os.Parcelable {
    public int rilModel;
    public int rat;
    public int maxVoiceCalls;
    public int maxDataCalls;
    public int maxStandby;
    public static final android.os.Parcelable.Creator<android.hardware.radio.modem.HardwareConfigModem> CREATOR = null;
    public HardwareConfigModem() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
