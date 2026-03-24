package android.telephony;

public final class ModemActivityInfo implements android.os.Parcelable {
    public static final int TX_POWER_LEVELS = 5;
    public static final int TX_POWER_LEVEL_0 = 0;
    public static final int TX_POWER_LEVEL_1 = 1;
    public static final int TX_POWER_LEVEL_2 = 2;
    public static final int TX_POWER_LEVEL_3 = 3;
    public static final int TX_POWER_LEVEL_4 = 4;
    private static final android.util.Range<java.lang.Integer>[] TX_POWER_RANGES = null;
    private long mTimestamp;
    private int mSleepTimeMs;
    private int mIdleTimeMs;
    private java.util.List<android.telephony.ModemActivityInfo.TransmitPower> mTransmitPowerInfo;
    private int mRxTimeMs;
    public static final android.os.Parcelable.Creator<android.telephony.ModemActivityInfo> CREATOR = null;
    public ModemActivityInfo(long p0, int p1, int p2, int[] p3, int p4) {}
    private void populateTransmitPowerRange(int[] p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public long getTimestamp() { return 0L; }
    public void setTimestamp(long p0) {}
    public java.util.List<android.telephony.ModemActivityInfo.TransmitPower> getTransmitPowerInfo() { return null; }
    public void setTransmitTimeMillis(int[] p0) {}
    public int[] getTransmitTimeMillis() { return null; }
    public int getSleepTimeMillis() { return 0; }
    public void setSleepTimeMillis(int p0) {}
    public int getIdleTimeMillis() { return 0; }
    public void setIdleTimeMillis(int p0) {}
    public int getReceiveTimeMillis() { return 0; }
    public void setReceiveTimeMillis(int p0) {}
    public boolean isValid() { return false; }
    private boolean isEmpty() { return false; }

    public class TransmitPower {
        private int mTimeInMillis;
        private android.util.Range<java.lang.Integer> mPowerRangeInDbm;
        public TransmitPower(android.util.Range<java.lang.Integer> p0, int p1) {}
        public int getTimeInMillis() { return 0; }
        public android.util.Range<java.lang.Integer> getPowerRangeInDbm() { return null; }
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TxPowerLevel {
    }
}
