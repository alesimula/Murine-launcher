package android.telephony;

@android.annotation.SystemApi
public final class ModemActivityInfo implements android.os.Parcelable {
    private static final int TX_POWER_LEVELS = 5;
    public static final int TX_POWER_LEVEL_0 = 0;
    public static final int TX_POWER_LEVEL_1 = 1;
    public static final int TX_POWER_LEVEL_2 = 2;
    public static final int TX_POWER_LEVEL_3 = 3;
    public static final int TX_POWER_LEVEL_4 = 4;
    private static final android.util.Range<java.lang.Integer>[] TX_POWER_RANGES = null;
    private long mTimestamp;
    private int mSleepTimeMs;
    private int mIdleTimeMs;
    private int[] mTxTimeMs;
    private int mRxTimeMs;
    public static final android.os.Parcelable.Creator<android.telephony.ModemActivityInfo> CREATOR = null;
    public static int getNumTxPowerLevels() { return 0; }
    public ModemActivityInfo(long p0, int p1, int p2, int[] p3, int p4) {}
    public ModemActivityInfo(long p0, long p1, long p2, int[] p3, long p4) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public long getTimestampMillis() { return 0L; }
    public void setTimestamp(long p0) {}
    public long getTransmitDurationMillisAtPowerLevel(int p0) { return 0L; }
    public android.util.Range<java.lang.Integer> getTransmitPowerRange(int p0) { return null; }
    public void setTransmitTimeMillis(int[] p0) {}
    public int[] getTransmitTimeMillis() { return null; }
    public long getSleepTimeMillis() { return 0L; }
    public void setSleepTimeMillis(int p0) {}
    public void setSleepTimeMillis(long p0) {}
    public android.telephony.ModemActivityInfo getDelta(android.telephony.ModemActivityInfo p0) { return null; }
    public long getIdleTimeMillis() { return 0L; }
    public void setIdleTimeMillis(int p0) {}
    public void setIdleTimeMillis(long p0) {}
    public long getReceiveTimeMillis() { return 0L; }
    public void setReceiveTimeMillis(int p0) {}
    public void setReceiveTimeMillis(long p0) {}
    public boolean isValid() { return false; }
    public boolean isEmpty() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TxPowerLevel {
    }
}
