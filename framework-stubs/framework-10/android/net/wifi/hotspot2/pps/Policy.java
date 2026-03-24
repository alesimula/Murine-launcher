package android.net.wifi.hotspot2.pps;

public final class Policy implements android.os.Parcelable {
    private static final java.lang.String TAG = "Policy";
    private static final int MAX_EXCLUSION_SSIDS = 128;
    private static final int MAX_SSID_BYTES = 32;
    private static final int MAX_PORT_STRING_BYTES = 64;
    private static final int NULL_VALUE = -1;
    private long mMinHomeDownlinkBandwidth;
    private long mMinHomeUplinkBandwidth;
    private long mMinRoamingDownlinkBandwidth;
    private long mMinRoamingUplinkBandwidth;
    private java.lang.String[] mExcludedSsidList;
    private java.util.Map<java.lang.Integer, java.lang.String> mRequiredProtoPortMap;
    private int mMaximumBssLoadValue;
    private java.util.List<android.net.wifi.hotspot2.pps.Policy.RoamingPartner> mPreferredRoamingPartnerList;
    private android.net.wifi.hotspot2.pps.UpdateParameter mPolicyUpdate;
    public static final android.os.Parcelable.Creator<android.net.wifi.hotspot2.pps.Policy> CREATOR = null;
    public void setMinHomeDownlinkBandwidth(long p0) {}
    public long getMinHomeDownlinkBandwidth() { return 0L; }
    public void setMinHomeUplinkBandwidth(long p0) {}
    public long getMinHomeUplinkBandwidth() { return 0L; }
    public void setMinRoamingDownlinkBandwidth(long p0) {}
    public long getMinRoamingDownlinkBandwidth() { return 0L; }
    public void setMinRoamingUplinkBandwidth(long p0) {}
    public long getMinRoamingUplinkBandwidth() { return 0L; }
    public void setExcludedSsidList(java.lang.String[] p0) {}
    public java.lang.String[] getExcludedSsidList() { return null; }
    public void setRequiredProtoPortMap(java.util.Map<java.lang.Integer, java.lang.String> p0) {}
    public java.util.Map<java.lang.Integer, java.lang.String> getRequiredProtoPortMap() { return null; }
    public void setMaximumBssLoadValue(int p0) {}
    public int getMaximumBssLoadValue() { return 0; }
    public void setPreferredRoamingPartnerList(java.util.List<android.net.wifi.hotspot2.pps.Policy.RoamingPartner> p0) {}
    public java.util.List<android.net.wifi.hotspot2.pps.Policy.RoamingPartner> getPreferredRoamingPartnerList() { return null; }
    public void setPolicyUpdate(android.net.wifi.hotspot2.pps.UpdateParameter p0) {}
    public android.net.wifi.hotspot2.pps.UpdateParameter getPolicyUpdate() { return null; }
    public Policy() {}
    public Policy(android.net.wifi.hotspot2.pps.Policy p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean validate() { return false; }
    private static void writeProtoPortMap(android.os.Parcel p0, java.util.Map<java.lang.Integer, java.lang.String> p1) {}
    private static void writeRoamingPartnerList(android.os.Parcel p0, int p1, java.util.List<android.net.wifi.hotspot2.pps.Policy.RoamingPartner> p2) {}

    public static final class RoamingPartner implements android.os.Parcelable {
        private java.lang.String mFqdn;
        private boolean mFqdnExactMatch;
        private int mPriority;
        private java.lang.String mCountries;
        public static final android.os.Parcelable.Creator<android.net.wifi.hotspot2.pps.Policy.RoamingPartner> CREATOR = null;
        public void setFqdn(java.lang.String p0) {}
        public java.lang.String getFqdn() { return null; }
        public void setFqdnExactMatch(boolean p0) {}
        public boolean getFqdnExactMatch() { return false; }
        public void setPriority(int p0) {}
        public int getPriority() { return 0; }
        public void setCountries(java.lang.String p0) {}
        public java.lang.String getCountries() { return null; }
        public RoamingPartner() {}
        public RoamingPartner(android.net.wifi.hotspot2.pps.Policy.RoamingPartner p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public boolean validate() { return false; }
    }
}
