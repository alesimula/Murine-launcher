package android.telephony;

public final class PhoneCapability implements android.os.Parcelable {
    public static final android.telephony.PhoneCapability DEFAULT_DSDS_CAPABILITY = null;
    public static final android.telephony.PhoneCapability DEFAULT_SSSS_CAPABILITY = null;
    public final int maxActiveVoiceCalls = 0;
    public final int maxActiveData = 0;
    public final int max5G = 0;
    public final boolean validationBeforeSwitchSupported = false;
    public final java.util.List<android.telephony.ModemInfo> logicalModemList = null;
    public static final android.os.Parcelable.Creator<android.telephony.PhoneCapability> CREATOR = null;
    public PhoneCapability(int p0, int p1, int p2, java.util.List<android.telephony.ModemInfo> p3, boolean p4) {}
    public java.lang.String toString() { return null; }
    private PhoneCapability(android.os.Parcel p0) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
