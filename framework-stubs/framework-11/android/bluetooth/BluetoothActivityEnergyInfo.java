package android.bluetooth;

public final class BluetoothActivityEnergyInfo implements android.os.Parcelable {
    private final long mTimestamp = 0L;
    private int mBluetoothStackState;
    private long mControllerTxTimeMs;
    private long mControllerRxTimeMs;
    private long mControllerIdleTimeMs;
    private long mControllerEnergyUsed;
    private android.bluetooth.UidTraffic[] mUidTraffic;
    public static final int BT_STACK_STATE_INVALID = 0;
    public static final int BT_STACK_STATE_STATE_ACTIVE = 1;
    public static final int BT_STACK_STATE_STATE_SCANNING = 2;
    public static final int BT_STACK_STATE_STATE_IDLE = 3;
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothActivityEnergyInfo> CREATOR = null;
    public BluetoothActivityEnergyInfo(long p0, int p1, long p2, long p3, long p4, long p5) {}
    BluetoothActivityEnergyInfo(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public int getBluetoothStackState() { return 0; }
    public long getControllerTxTimeMillis() { return 0L; }
    public long getControllerRxTimeMillis() { return 0L; }
    public long getControllerIdleTimeMillis() { return 0L; }
    public long getControllerEnergyUsed() { return 0L; }
    public long getTimeStamp() { return 0L; }
    public android.bluetooth.UidTraffic[] getUidTraffic() { return null; }
    public void setUidTraffic(android.bluetooth.UidTraffic[] p0) {}
    public boolean isValid() { return false; }
}
