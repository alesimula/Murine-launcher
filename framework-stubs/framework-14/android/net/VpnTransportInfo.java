package android.net;

public final class VpnTransportInfo implements android.net.TransportInfo, android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.VpnTransportInfo> CREATOR = null;
    @java.lang.Deprecated
    public VpnTransportInfo(int p0, java.lang.String p1) {}
    public VpnTransportInfo(int p0, java.lang.String p1, boolean p2, boolean p3) {}
    public long getApplicableRedactions() { return 0L; }
    @android.annotation.NonNull
    public android.net.VpnTransportInfo makeCopy(long p0) { return null; }
    public boolean isBypassable() { return false; }
    public boolean areLongLivedTcpConnectionsExpensive() { return false; }
    @android.annotation.Nullable
    public java.lang.String getSessionId() { return null; }
    public int getType() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
