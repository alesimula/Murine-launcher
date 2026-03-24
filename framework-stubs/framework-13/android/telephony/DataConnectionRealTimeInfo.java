package android.telephony;

public class DataConnectionRealTimeInfo implements android.os.Parcelable {
    public static final int DC_POWER_STATE_LOW = 1;
    public static final int DC_POWER_STATE_MEDIUM = 2;
    public static final int DC_POWER_STATE_HIGH = 3;
    public static final int DC_POWER_STATE_UNKNOWN = 2147483647;
    public static final android.os.Parcelable.Creator<android.telephony.DataConnectionRealTimeInfo> CREATOR = null;
    public DataConnectionRealTimeInfo(long p0, int p1) {}
    public DataConnectionRealTimeInfo() {}
    public long getTime() { return 0L; }
    public int getDcPowerState() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
}
