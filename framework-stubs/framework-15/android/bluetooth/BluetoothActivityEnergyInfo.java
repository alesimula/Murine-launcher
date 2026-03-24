package android.bluetooth;

public final class BluetoothActivityEnergyInfo implements android.os.Parcelable {
    public static final int BT_STACK_STATE_INVALID = 0;
    public static final int BT_STACK_STATE_STATE_ACTIVE = 1;
    public static final int BT_STACK_STATE_STATE_IDLE = 3;
    public static final int BT_STACK_STATE_STATE_SCANNING = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothActivityEnergyInfo> CREATOR = null;
    BluetoothActivityEnergyInfo() {}
    public int describeContents() { return 0; }
    public int getBluetoothStackState() { return 0; }
    public long getControllerEnergyUsed() { return 0L; }
    public long getControllerIdleTimeMillis() { return 0L; }
    public long getControllerRxTimeMillis() { return 0L; }
    public long getControllerTxTimeMillis() { return 0L; }
    public long getTimestampMillis() { return 0L; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.UidTraffic> getUidTraffic() { return null; }
    public boolean isValid() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
