package android.hardware.radio.modem;

public class HardwareConfig implements android.os.Parcelable {
    public int type;
    public java.lang.String uuid;
    public int state;
    public android.hardware.radio.modem.HardwareConfigModem[] modem;
    public android.hardware.radio.modem.HardwareConfigSim[] sim;
    public static final android.os.Parcelable.Creator<android.hardware.radio.modem.HardwareConfig> CREATOR = null;
    public static final int STATE_ENABLED = 0;
    public static final int STATE_STANDBY = 1;
    public static final int STATE_DISABLED = 2;
    public static final int TYPE_MODEM = 0;
    public static final int TYPE_SIM = 1;
    public HardwareConfig() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
