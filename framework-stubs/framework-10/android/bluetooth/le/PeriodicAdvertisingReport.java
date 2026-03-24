package android.bluetooth.le;

public final class PeriodicAdvertisingReport implements android.os.Parcelable {
    public static final int DATA_COMPLETE = 0;
    public static final int DATA_INCOMPLETE_TRUNCATED = 2;
    private int mSyncHandle;
    private int mTxPower;
    private int mRssi;
    private int mDataStatus;
    private android.bluetooth.le.ScanRecord mData;
    private long mTimestampNanos;
    public static final android.os.Parcelable.Creator<android.bluetooth.le.PeriodicAdvertisingReport> CREATOR = null;
    public PeriodicAdvertisingReport(int p0, int p1, int p2, int p3, android.bluetooth.le.ScanRecord p4) {}
    private PeriodicAdvertisingReport(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getSyncHandle() { return 0; }
    public int getTxPower() { return 0; }
    public int getRssi() { return 0; }
    public int getDataStatus() { return 0; }
    public android.bluetooth.le.ScanRecord getData() { return null; }
    public long getTimestampNanos() { return 0L; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
}
