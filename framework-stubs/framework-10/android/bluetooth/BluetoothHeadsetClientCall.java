package android.bluetooth;

public final class BluetoothHeadsetClientCall implements android.os.Parcelable {
    public static final int CALL_STATE_ACTIVE = 0;
    public static final int CALL_STATE_HELD = 1;
    public static final int CALL_STATE_DIALING = 2;
    public static final int CALL_STATE_ALERTING = 3;
    public static final int CALL_STATE_INCOMING = 4;
    public static final int CALL_STATE_WAITING = 5;
    public static final int CALL_STATE_HELD_BY_RESPONSE_AND_HOLD = 6;
    public static final int CALL_STATE_TERMINATED = 7;
    private final android.bluetooth.BluetoothDevice mDevice = null;
    private final int mId = 0;
    private int mState;
    private java.lang.String mNumber;
    private boolean mMultiParty;
    private final boolean mOutgoing = false;
    private final java.util.UUID mUUID = null;
    private final long mCreationElapsedMilli = 0L;
    private final boolean mInBandRing = false;
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothHeadsetClientCall> CREATOR = null;
    public BluetoothHeadsetClientCall(android.bluetooth.BluetoothDevice p0, int p1, int p2, java.lang.String p3, boolean p4, boolean p5, boolean p6) {}
    public BluetoothHeadsetClientCall(android.bluetooth.BluetoothDevice p0, int p1, java.util.UUID p2, int p3, java.lang.String p4, boolean p5, boolean p6, boolean p7) {}
    public void setState(int p0) {}
    public void setNumber(java.lang.String p0) {}
    public void setMultiParty(boolean p0) {}
    public android.bluetooth.BluetoothDevice getDevice() { return null; }
    @android.annotation.UnsupportedAppUsage
    public int getId() { return 0; }
    public java.util.UUID getUUID() { return null; }
    @android.annotation.UnsupportedAppUsage
    public int getState() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getNumber() { return null; }
    public long getCreationElapsedMilli() { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public boolean isMultiParty() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isOutgoing() { return false; }
    public boolean isInBandRing() { return false; }
    public java.lang.String toString() { return null; }
    public java.lang.String toString(boolean p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
