package android.bluetooth;

public class UidTraffic implements java.lang.Cloneable, android.os.Parcelable {
    private final int mAppUid = 0;
    private long mRxBytes;
    private long mTxBytes;
    public static final android.os.Parcelable.Creator<android.bluetooth.UidTraffic> CREATOR = null;
    public UidTraffic(int p0) {}
    public UidTraffic(int p0, long p1, long p2) {}
    UidTraffic(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void setRxBytes(long p0) {}
    public void setTxBytes(long p0) {}
    public void addRxBytes(long p0) {}
    public void addTxBytes(long p0) {}
    public int getUid() { return 0; }
    public long getRxBytes() { return 0L; }
    public long getTxBytes() { return 0L; }
    public int describeContents() { return 0; }
    public android.bluetooth.UidTraffic clone() { return null; }
    public java.lang.String toString() { return null; }
}
