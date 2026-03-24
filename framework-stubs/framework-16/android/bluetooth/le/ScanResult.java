package android.bluetooth.le;

public final class ScanResult implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.le.ScanResult> CREATOR = null;
    public static final int DATA_COMPLETE = 0;
    public static final int DATA_TRUNCATED = 2;
    public static final int PERIODIC_INTERVAL_NOT_PRESENT = 0;
    public static final int PHY_UNUSED = 0;
    public static final int SID_NOT_PRESENT = 255;
    public static final int TX_POWER_NOT_PRESENT = 127;
    @java.lang.Deprecated
    public ScanResult(android.bluetooth.BluetoothDevice p0, android.bluetooth.le.ScanRecord p1, int p2, long p3) {}
    public ScanResult(android.bluetooth.BluetoothDevice p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, android.bluetooth.le.ScanRecord p8, long p9) {}
    public int describeContents() { return 0; }
    public int getAdvertisingSid() { return 0; }
    public int getDataStatus() { return 0; }
    public android.bluetooth.BluetoothDevice getDevice() { return null; }
    public int getPeriodicAdvertisingInterval() { return 0; }
    public int getPrimaryPhy() { return 0; }
    public int getRssi() { return 0; }
    @android.annotation.Nullable
    public android.bluetooth.le.ScanRecord getScanRecord() { return null; }
    public int getSecondaryPhy() { return 0; }
    public long getTimestampNanos() { return 0L; }
    public int getTxPower() { return 0; }
    public boolean isConnectable() { return false; }
    public boolean isLegacy() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
