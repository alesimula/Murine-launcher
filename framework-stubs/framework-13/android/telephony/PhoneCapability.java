package android.telephony;

@android.annotation.SystemApi
public final class PhoneCapability implements android.os.Parcelable {
    public static final android.telephony.PhoneCapability DEFAULT_DSDS_CAPABILITY = null;
    public static final android.telephony.PhoneCapability DEFAULT_SSSS_CAPABILITY = null;
    @android.annotation.SystemApi
    public static final int DEVICE_NR_CAPABILITY_NSA = 1;
    @android.annotation.SystemApi
    public static final int DEVICE_NR_CAPABILITY_SA = 2;
    public static final android.os.Parcelable.Creator<android.telephony.PhoneCapability> CREATOR = null;
    public PhoneCapability(int p0, int p1, java.util.List<android.telephony.ModemInfo> p2, boolean p3, int[] p4) {}
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.SystemApi
    public int getMaxActiveVoiceSubscriptions() { return 0; }
    @android.annotation.SystemApi
    public int getMaxActiveDataSubscriptions() { return 0; }
    public boolean isNetworkValidationBeforeSwitchSupported() { return false; }
    public java.util.List<android.telephony.ModemInfo> getLogicalModemList() { return null; }
    @android.annotation.SystemApi
    public int[] getDeviceNrCapabilities() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceNrCapability {
    }
}
