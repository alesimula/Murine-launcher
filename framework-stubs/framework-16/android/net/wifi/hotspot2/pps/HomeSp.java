package android.net.wifi.hotspot2.pps;

public final class HomeSp implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.hotspot2.pps.HomeSp> CREATOR = null;
    public HomeSp() {}
    public HomeSp(android.net.wifi.hotspot2.pps.HomeSp p0) {}
    public int describeContents() { return 0; }
    public java.lang.String getFqdn() { return null; }
    public java.lang.String getFriendlyName() { return null; }
    @android.annotation.Nullable
    public long[] getMatchAllOis() { return null; }
    @android.annotation.Nullable
    public long[] getMatchAnyOis() { return null; }
    @android.annotation.NonNull
    public java.util.Collection<java.lang.String> getOtherHomePartnersList() { return null; }
    public long[] getRoamingConsortiumOis() { return null; }
    public void setFqdn(java.lang.String p0) {}
    public void setFriendlyName(java.lang.String p0) {}
    public void setMatchAllOis(long[] p0) {}
    public void setMatchAnyOis(long[] p0) {}
    public void setOtherHomePartnersList(java.util.Collection<java.lang.String> p0) {}
    public void setRoamingConsortiumOis(long[] p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
