package android.telephony;

public class ModemActivityInfo implements android.os.Parcelable {
    public static final int TX_POWER_LEVELS = 5;
    private long mTimestamp;
    private int mSleepTimeMs;
    private int mIdleTimeMs;
    private int[] mTxTimeMs;
    private int mRxTimeMs;
    private int mEnergyUsed;
    public static final android.os.Parcelable.Creator<android.telephony.ModemActivityInfo> CREATOR = null;
    public ModemActivityInfo(long p0, int p1, int p2, int[] p3, int p4, int p5) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public long getTimestamp() { return 0L; }
    public void setTimestamp(long p0) {}
    public int[] getTxTimeMillis() { return null; }
    public void setTxTimeMillis(int[] p0) {}
    public int getSleepTimeMillis() { return 0; }
    public void setSleepTimeMillis(int p0) {}
    public int getIdleTimeMillis() { return 0; }
    public void setIdleTimeMillis(int p0) {}
    public int getRxTimeMillis() { return 0; }
    public void setRxTimeMillis(int p0) {}
    public int getEnergyUsed() { return 0; }
    public void setEnergyUsed(int p0) {}
    public boolean isValid() { return false; }
    private boolean isEmpty() { return false; }
}
