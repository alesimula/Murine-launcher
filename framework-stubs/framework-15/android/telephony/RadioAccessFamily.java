package android.telephony;

public class RadioAccessFamily implements android.os.Parcelable {
    public static final int RAF_UNKNOWN = 0;
    public static final int RAF_GSM = 32768;
    public static final int RAF_GPRS = 1;
    public static final int RAF_EDGE = 2;
    public static final int RAF_IS95A = 8;
    public static final int RAF_IS95B = 8;
    public static final int RAF_1xRTT = 64;
    public static final int RAF_EVDO_0 = 16;
    public static final int RAF_EVDO_A = 32;
    public static final int RAF_EVDO_B = 2048;
    public static final int RAF_EHRPD = 8192;
    public static final int RAF_HSUPA = 256;
    public static final int RAF_HSDPA = 128;
    public static final int RAF_HSPA = 512;
    public static final int RAF_HSPAP = 16384;
    public static final int RAF_UMTS = 4;
    public static final int RAF_TD_SCDMA = 65536;
    public static final int RAF_LTE = 4096;
    public static final int RAF_LTE_CA = 262144;
    public static final int RAF_NR = 524288;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.RadioAccessFamily> CREATOR = null;
    public RadioAccessFamily(int p0, int p1) {}
    public int getPhoneId() { return 0; }
    public int getRadioAccessFamily() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static int getRafFromNetworkType(int p0) { return 0; }
    public static int getNetworkTypeFromRaf(int p0) { return 0; }
    public static int singleRafTypeFromString(java.lang.String p0) { return 0; }
    public static int rafTypeFromString(java.lang.String p0) { return 0; }
    public static int compare(long p0, long p1) { return 0; }
}
