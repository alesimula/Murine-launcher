package android.net.wifi.p2p.nsd;

public class WifiP2pServiceRequest implements android.os.Parcelable {
    private int mProtocolType;
    private int mLength;
    private int mTransId;
    private java.lang.String mQuery;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.nsd.WifiP2pServiceRequest> CREATOR = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    protected WifiP2pServiceRequest(int p0, java.lang.String p1) {}
    private WifiP2pServiceRequest(int p0, int p1, int p2, java.lang.String p3) {}
    public int getTransactionId() { return 0; }
    public void setTransactionId(int p0) {}
    public java.lang.String getSupplicantQuery() { return null; }
    private void validateQuery(java.lang.String p0) {}
    public static android.net.wifi.p2p.nsd.WifiP2pServiceRequest newInstance(int p0, java.lang.String p1) { return null; }
    public static android.net.wifi.p2p.nsd.WifiP2pServiceRequest newInstance(int p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
