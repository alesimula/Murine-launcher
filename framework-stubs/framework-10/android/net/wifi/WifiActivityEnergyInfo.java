package android.net.wifi;

public final class WifiActivityEnergyInfo implements android.os.Parcelable {
    public long mTimestamp;
    public int mStackState;
    public long mControllerTxTimeMs;
    public long[] mControllerTxTimePerLevelMs;
    public long mControllerRxTimeMs;
    public long mControllerScanTimeMs;
    public long mControllerIdleTimeMs;
    public long mControllerEnergyUsed;
    public static final int STACK_STATE_INVALID = 0;
    public static final int STACK_STATE_STATE_ACTIVE = 1;
    public static final int STACK_STATE_STATE_SCANNING = 2;
    public static final int STACK_STATE_STATE_IDLE = 3;
    public static final android.os.Parcelable.Creator<android.net.wifi.WifiActivityEnergyInfo> CREATOR = null;
    public WifiActivityEnergyInfo(long p0, int p1, long p2, long[] p3, long p4, long p5, long p6, long p7) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public int getStackState() { return 0; }
    public long getControllerTxTimeMillis() { return 0L; }
    public long getControllerTxTimeMillisAtLevel(int p0) { return 0L; }
    public long getControllerRxTimeMillis() { return 0L; }
    public long getControllerScanTimeMillis() { return 0L; }
    public long getControllerIdleTimeMillis() { return 0L; }
    public long getControllerEnergyUsed() { return 0L; }
    public long getTimeStamp() { return 0L; }
    public boolean isValid() { return false; }
}
