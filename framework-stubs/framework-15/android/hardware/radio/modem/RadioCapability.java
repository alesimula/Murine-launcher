package android.hardware.radio.modem;

public class RadioCapability implements android.os.Parcelable {
    public int session;
    public int phase;
    public int raf;
    public java.lang.String logicalModemUuid;
    public int status;
    public static final android.os.Parcelable.Creator<android.hardware.radio.modem.RadioCapability> CREATOR = null;
    public static final int PHASE_CONFIGURED = 0;
    public static final int PHASE_START = 1;
    public static final int PHASE_APPLY = 2;
    public static final int PHASE_UNSOL_RSP = 3;
    public static final int PHASE_FINISH = 4;
    public static final int STATUS_NONE = 0;
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_FAIL = 2;
    public RadioCapability() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
