package android.net.wifi.hotspot2.pps;

public final class HomeSp implements android.os.Parcelable {
    private static final java.lang.String TAG = "HomeSp";
    private static final int MAX_SSID_BYTES = 32;
    private static final int NULL_VALUE = -1;
    private java.lang.String mFqdn;
    private java.lang.String mFriendlyName;
    private java.lang.String mIconUrl;
    private java.util.Map<java.lang.String, java.lang.Long> mHomeNetworkIds;
    private long[] mMatchAllOis;
    private long[] mMatchAnyOis;
    private java.lang.String[] mOtherHomePartners;
    private long[] mRoamingConsortiumOis;
    public static final android.os.Parcelable.Creator<android.net.wifi.hotspot2.pps.HomeSp> CREATOR = null;
    public void setFqdn(java.lang.String p0) {}
    public java.lang.String getFqdn() { return null; }
    public void setFriendlyName(java.lang.String p0) {}
    public java.lang.String getFriendlyName() { return null; }
    public void setIconUrl(java.lang.String p0) {}
    public java.lang.String getIconUrl() { return null; }
    public void setHomeNetworkIds(java.util.Map<java.lang.String, java.lang.Long> p0) {}
    public java.util.Map<java.lang.String, java.lang.Long> getHomeNetworkIds() { return null; }
    public void setMatchAllOis(long[] p0) {}
    public long[] getMatchAllOis() { return null; }
    public void setMatchAnyOis(long[] p0) {}
    public long[] getMatchAnyOis() { return null; }
    public void setOtherHomePartners(java.lang.String[] p0) {}
    public java.lang.String[] getOtherHomePartners() { return null; }
    public void setRoamingConsortiumOis(long[] p0) {}
    public long[] getRoamingConsortiumOis() { return null; }
    public HomeSp() {}
    public HomeSp(android.net.wifi.hotspot2.pps.HomeSp p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean validate() { return false; }
    private static void writeHomeNetworkIds(android.os.Parcel p0, java.util.Map<java.lang.String, java.lang.Long> p1) {}
}
