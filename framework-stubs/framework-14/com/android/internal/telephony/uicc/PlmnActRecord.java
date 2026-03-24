package com.android.internal.telephony.uicc;

public class PlmnActRecord implements android.os.Parcelable {
    public static final int ACCESS_TECH_UTRAN = 32768;
    public static final int ACCESS_TECH_EUTRAN = 16384;
    public static final int ACCESS_TECH_GSM = 128;
    public static final int ACCESS_TECH_GSM_COMPACT = 64;
    public static final int ACCESS_TECH_CDMA2000_HRPD = 32;
    public static final int ACCESS_TECH_CDMA2000_1XRTT = 16;
    public static final int ACCESS_TECH_RESERVED = 16143;
    public static final int ENCODED_LENGTH = 5;
    public final java.lang.String plmn = null;
    public final int accessTechs = 0;
    public static final android.os.Parcelable.Creator<com.android.internal.telephony.uicc.PlmnActRecord> CREATOR = null;
    public PlmnActRecord(java.lang.String p0, int p1) {}
    public PlmnActRecord(byte[] p0, int p1) {}
    public byte[] getBytes() { return null; }
    public java.lang.String toString() { return null; }
    public static com.android.internal.telephony.uicc.PlmnActRecord[] getRecords(byte[] p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AccessTech {
    }
}
