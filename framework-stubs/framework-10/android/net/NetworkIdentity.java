package android.net;

public class NetworkIdentity implements java.lang.Comparable<android.net.NetworkIdentity> {
    private static final java.lang.String TAG = "NetworkIdentity";
    @java.lang.Deprecated
    public static final boolean COMBINE_SUBTYPE_ENABLED = true;
    public static final int SUBTYPE_COMBINED = -1;
    final int mType = 0;
    final int mSubType = 0;
    final java.lang.String mSubscriberId = null;
    final java.lang.String mNetworkId = null;
    final boolean mRoaming = false;
    final boolean mMetered = false;
    final boolean mDefaultNetwork = false;
    public NetworkIdentity(int p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5, boolean p6) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToProto(android.util.proto.ProtoOutputStream p0, long p1) {}
    public int getType() { return 0; }
    public int getSubType() { return 0; }
    public java.lang.String getSubscriberId() { return null; }
    public java.lang.String getNetworkId() { return null; }
    public boolean getRoaming() { return false; }
    public boolean getMetered() { return false; }
    public boolean getDefaultNetwork() { return false; }
    public static java.lang.String scrubSubscriberId(java.lang.String p0) { return null; }
    public static java.lang.String[] scrubSubscriberId(java.lang.String[] p0) { return null; }
    public static android.net.NetworkIdentity buildNetworkIdentity(android.content.Context p0, android.net.NetworkState p1, boolean p2) { return null; }
    public int compareTo(android.net.NetworkIdentity p0) { return 0; }
}
