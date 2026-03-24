package android.telephony;

public class SignalThresholdInfo implements android.os.Parcelable {
    public static final int SIGNAL_RSSI = 1;
    public static final int SIGNAL_RSCP = 2;
    public static final int SIGNAL_RSRP = 3;
    public static final int SIGNAL_RSRQ = 4;
    public static final int SIGNAL_RSSNR = 5;
    public static final int SIGNAL_SSRSRP = 6;
    public static final int SIGNAL_SSRSRQ = 7;
    public static final int SIGNAL_SSSINR = 8;
    private int mSignalMeasurement;
    private int mHysteresisMs;
    private int mHysteresisDb;
    private int[] mThresholds;
    private boolean mIsEnabled;
    public static final int HYSTERESIS_MS_DISABLED = 0;
    public static final int HYSTERESIS_DB_DISABLED = 0;
    public static final android.os.Parcelable.Creator<android.telephony.SignalThresholdInfo> CREATOR = null;
    public SignalThresholdInfo(int p0, int p1, int p2, int[] p3, boolean p4) {}
    public int getSignalMeasurement() { return 0; }
    public int getHysteresisMs() { return 0; }
    public int getHysteresisDb() { return 0; }
    public boolean isEnabled() { return false; }
    public int[] getThresholds() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private SignalThresholdInfo(android.os.Parcel p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SignalMeasurementType {
    }
}
