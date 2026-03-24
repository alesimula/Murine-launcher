package android.net.wifi.hotspot2;

public final class PasspointConfiguration implements android.os.Parcelable {
    private static final java.lang.String TAG = "PasspointConfiguration";
    private static final int CERTIFICATE_SHA256_BYTES = 32;
    private static final int MAX_URL_BYTES = 1023;
    private static final int NULL_VALUE = -1;
    private android.net.wifi.hotspot2.pps.HomeSp mHomeSp;
    private android.net.wifi.hotspot2.pps.Credential mCredential;
    private android.net.wifi.hotspot2.pps.Policy mPolicy;
    private android.net.wifi.hotspot2.pps.UpdateParameter mSubscriptionUpdate;
    private java.util.Map<java.lang.String, byte[]> mTrustRootCertList;
    private int mUpdateIdentifier;
    private int mCredentialPriority;
    private long mSubscriptionCreationTimeInMillis;
    private long mSubscriptionExpirationTimeInMillis;
    private java.lang.String mSubscriptionType;
    private long mUsageLimitUsageTimePeriodInMinutes;
    private long mUsageLimitStartTimeInMillis;
    private long mUsageLimitDataLimit;
    private long mUsageLimitTimeLimitInMinutes;
    private java.util.Map<java.lang.String, java.lang.String> mServiceFriendlyNames;
    public static final android.os.Parcelable.Creator<android.net.wifi.hotspot2.PasspointConfiguration> CREATOR = null;
    public void setHomeSp(android.net.wifi.hotspot2.pps.HomeSp p0) {}
    public android.net.wifi.hotspot2.pps.HomeSp getHomeSp() { return null; }
    public void setCredential(android.net.wifi.hotspot2.pps.Credential p0) {}
    public android.net.wifi.hotspot2.pps.Credential getCredential() { return null; }
    public void setPolicy(android.net.wifi.hotspot2.pps.Policy p0) {}
    public android.net.wifi.hotspot2.pps.Policy getPolicy() { return null; }
    public void setSubscriptionUpdate(android.net.wifi.hotspot2.pps.UpdateParameter p0) {}
    public android.net.wifi.hotspot2.pps.UpdateParameter getSubscriptionUpdate() { return null; }
    public void setTrustRootCertList(java.util.Map<java.lang.String, byte[]> p0) {}
    public java.util.Map<java.lang.String, byte[]> getTrustRootCertList() { return null; }
    public void setUpdateIdentifier(int p0) {}
    public int getUpdateIdentifier() { return 0; }
    public void setCredentialPriority(int p0) {}
    public int getCredentialPriority() { return 0; }
    public void setSubscriptionCreationTimeInMillis(long p0) {}
    public long getSubscriptionCreationTimeInMillis() { return 0L; }
    public void setSubscriptionExpirationTimeInMillis(long p0) {}
    public long getSubscriptionExpirationTimeInMillis() { return 0L; }
    public void setSubscriptionType(java.lang.String p0) {}
    public java.lang.String getSubscriptionType() { return null; }
    public void setUsageLimitUsageTimePeriodInMinutes(long p0) {}
    public long getUsageLimitUsageTimePeriodInMinutes() { return 0L; }
    public void setUsageLimitStartTimeInMillis(long p0) {}
    public long getUsageLimitStartTimeInMillis() { return 0L; }
    public void setUsageLimitDataLimit(long p0) {}
    public long getUsageLimitDataLimit() { return 0L; }
    public void setUsageLimitTimeLimitInMinutes(long p0) {}
    public long getUsageLimitTimeLimitInMinutes() { return 0L; }
    public void setServiceFriendlyNames(java.util.Map<java.lang.String, java.lang.String> p0) {}
    public java.util.Map<java.lang.String, java.lang.String> getServiceFriendlyNames() { return null; }
    public java.lang.String getServiceFriendlyName() { return null; }
    public PasspointConfiguration() {}
    public PasspointConfiguration(android.net.wifi.hotspot2.PasspointConfiguration p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean validate() { return false; }
    public boolean validateForR2() { return false; }
    private boolean validateForCommonR1andR2(boolean p0) { return false; }
    private static void writeTrustRootCerts(android.os.Parcel p0, java.util.Map<java.lang.String, byte[]> p1) {}
    private static boolean isTrustRootCertListEquals(java.util.Map<java.lang.String, byte[]> p0, java.util.Map<java.lang.String, byte[]> p1) { return false; }
}
