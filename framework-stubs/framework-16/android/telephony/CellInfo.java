package android.telephony;

public abstract class CellInfo implements android.os.Parcelable {
    public static final int UNAVAILABLE = 2147483647;
    public static final long UNAVAILABLE_LONG = 9223372036854775807L;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_GSM = 1;
    public static final int TYPE_CDMA = 2;
    public static final int TYPE_LTE = 3;
    public static final int TYPE_WCDMA = 4;
    public static final int TYPE_TDSCDMA = 5;
    public static final int TYPE_NR = 6;
    public static final int TIMESTAMP_TYPE_UNKNOWN = 0;
    public static final int TIMESTAMP_TYPE_ANTENNA = 1;
    public static final int TIMESTAMP_TYPE_MODEM = 2;
    public static final int TIMESTAMP_TYPE_OEM_RIL = 3;
    public static final int TIMESTAMP_TYPE_JAVA_RIL = 4;
    public static final int CONNECTION_NONE = 0;
    public static final int CONNECTION_PRIMARY_SERVING = 1;
    public static final int CONNECTION_SECONDARY_SERVING = 2;
    public static final int CONNECTION_UNKNOWN = 2147483647;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.CellInfo> CREATOR = null;
    protected CellInfo(int p0, boolean p1, long p2) {}
    protected CellInfo() {}
    protected CellInfo(android.telephony.CellInfo p0) {}
    public boolean isRegistered() { return false; }
    public void setRegistered(boolean p0) {}
    public long getTimestampMillis() { return 0L; }
    @java.lang.Deprecated
    public long getTimeStamp() { return 0L; }
    public void setTimeStamp(long p0) {}
    @android.annotation.NonNull
    public abstract android.telephony.CellIdentity getCellIdentity();
    @android.annotation.NonNull
    public abstract android.telephony.CellSignalStrength getCellSignalStrength();
    public android.telephony.CellInfo sanitizeLocationInfo() { return null; }
    public int getCellConnectionStatus() { return 0; }
    public void setCellConnectionStatus(int p0) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public abstract void writeToParcel(android.os.Parcel p0, int p1);
    protected void writeToParcel(android.os.Parcel p0, int p1, int p2) {}
    protected CellInfo(android.os.Parcel p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CellConnectionStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
