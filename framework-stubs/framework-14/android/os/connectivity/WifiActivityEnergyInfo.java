package android.os.connectivity;

@android.annotation.SystemApi
public final class WifiActivityEnergyInfo implements android.os.Parcelable {
    public static final int STACK_STATE_INVALID = 0;
    public static final int STACK_STATE_STATE_ACTIVE = 1;
    public static final int STACK_STATE_STATE_SCANNING = 2;
    public static final int STACK_STATE_STATE_IDLE = 3;
    public static final android.os.Parcelable.Creator<android.os.connectivity.WifiActivityEnergyInfo> CREATOR = null;
    public WifiActivityEnergyInfo(long p0, int p1, long p2, long p3, long p4, long p5) {}
    public WifiActivityEnergyInfo(long p0, int p1, long p2, long p3, long p4, long p5, long p6) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public long getTimeSinceBootMillis() { return 0L; }
    public int getStackState() { return 0; }
    public long getControllerTxDurationMillis() { return 0L; }
    public long getControllerRxDurationMillis() { return 0L; }
    public long getControllerScanDurationMillis() { return 0L; }
    public long getControllerIdleDurationMillis() { return 0L; }
    public long getControllerEnergyUsedMicroJoules() { return 0L; }
    public boolean isValid() { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StackState {
    }
}
