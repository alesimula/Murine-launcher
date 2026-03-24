package android.hardware.radio.network;

public class SignalThresholdInfo implements android.os.Parcelable {
    public int signalMeasurement;
    public int hysteresisMs;
    public int hysteresisDb;
    public int[] thresholds;
    public boolean isEnabled;
    public int ran;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.SignalThresholdInfo> CREATOR = null;
    public static final int SIGNAL_MEASUREMENT_TYPE_RSSI = 1;
    public static final int SIGNAL_MEASUREMENT_TYPE_RSCP = 2;
    public static final int SIGNAL_MEASUREMENT_TYPE_RSRP = 3;
    public static final int SIGNAL_MEASUREMENT_TYPE_RSRQ = 4;
    public static final int SIGNAL_MEASUREMENT_TYPE_RSSNR = 5;
    public static final int SIGNAL_MEASUREMENT_TYPE_SSRSRP = 6;
    public static final int SIGNAL_MEASUREMENT_TYPE_SSRSRQ = 7;
    public static final int SIGNAL_MEASUREMENT_TYPE_SSSINR = 8;
    public SignalThresholdInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
