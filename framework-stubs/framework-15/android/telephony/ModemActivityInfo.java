package android.telephony;

@android.annotation.SystemApi
public final class ModemActivityInfo implements android.os.Parcelable {
    public static final int TX_POWER_LEVEL_0 = 0;
    public static final int TX_POWER_LEVEL_1 = 1;
    public static final int TX_POWER_LEVEL_2 = 2;
    public static final int TX_POWER_LEVEL_3 = 3;
    public static final int TX_POWER_LEVEL_4 = 4;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.ModemActivityInfo> CREATOR = null;
    public static int getNumTxPowerLevels() { return 0; }
    public ModemActivityInfo(long p0, int p1, int p2, int[] p3, int p4) {}
    public ModemActivityInfo(long p0, long p1, long p2, int[] p3, long p4) {}
    public ModemActivityInfo(long p0, int p1, int p2, android.telephony.ActivityStatsTechSpecificInfo[] p3) {}
    public ModemActivityInfo(long p0, long p1, long p2, android.telephony.ActivityStatsTechSpecificInfo[] p3) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public long getTimestampMillis() { return 0L; }
    public void setTimestamp(long p0) {}
    public long getTransmitDurationMillisAtPowerLevel(int p0) { return 0L; }
    public long getTransmitDurationMillisAtPowerLevel(int p0, int p1) { return 0L; }
    public long getTransmitDurationMillisAtPowerLevel(int p0, int p1, int p2) { return 0L; }
    @android.annotation.NonNull
    public android.util.Range<java.lang.Integer> getTransmitPowerRange(int p0) { return null; }
    public int getSpecificInfoRat(int p0) { return 0; }
    public int getSpecificInfoFrequencyRange(int p0) { return 0; }
    public void setTransmitTimeMillis(int[] p0) {}
    public void setTransmitTimeMillis(int p0, int[] p1) {}
    public void setTransmitTimeMillis(int p0, int p1, int[] p2) {}
    @android.annotation.NonNull
    public int[] getTransmitTimeMillis() { return null; }
    public int[] getTransmitTimeMillis(int p0) { return null; }
    public int[] getTransmitTimeMillis(int p0, int p1) { return null; }
    public long getSleepTimeMillis() { return 0L; }
    public void setSleepTimeMillis(int p0) {}
    public void setSleepTimeMillis(long p0) {}
    @android.annotation.NonNull
    public android.telephony.ModemActivityInfo getDelta(android.telephony.ModemActivityInfo p0) { return null; }
    public long getIdleTimeMillis() { return 0L; }
    public void setIdleTimeMillis(int p0) {}
    public void setIdleTimeMillis(long p0) {}
    public long getReceiveTimeMillis() { return 0L; }
    public long getReceiveTimeMillis(int p0) { return 0L; }
    public long getReceiveTimeMillis(int p0, int p1) { return 0L; }
    public void setReceiveTimeMillis(int p0) {}
    public void setReceiveTimeMillis(long p0) {}
    public void setReceiveTimeMillis(int p0, long p1) {}
    public void setReceiveTimeMillis(int p0, int p1, long p2) {}
    public int getSpecificInfoLength() { return 0; }
    public boolean isValid() { return false; }
    public boolean isEmpty() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TxPowerLevel {
    }
}
