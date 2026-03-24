package android.net;

public class NetworkIdentity implements java.lang.Comparable<android.net.NetworkIdentity> {
    private static final java.lang.String TAG = "NetworkIdentity";
    public static final int SUBTYPE_COMBINED = -1;
    public static final int OEM_NONE = 0;
    public static final int OEM_PAID = 1;
    public static final int OEM_PRIVATE = 2;
    final int mType = 0;
    final int mSubType = 0;
    final java.lang.String mSubscriberId = null;
    final java.lang.String mNetworkId = null;
    final boolean mRoaming = false;
    final boolean mMetered = false;
    final boolean mDefaultNetwork = false;
    final int mOemManaged = 0;
    public NetworkIdentity(int p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5, boolean p6, int p7) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public int getType() { return 0; }
    public int getSubType() { return 0; }
    public java.lang.String getSubscriberId() { return null; }
    public java.lang.String getNetworkId() { return null; }
    public boolean getRoaming() { return false; }
    public boolean getMetered() { return false; }
    public boolean getDefaultNetwork() { return false; }
    public int getOemManaged() { return 0; }
    public static android.net.NetworkIdentity buildNetworkIdentity(android.content.Context p0, android.net.NetworkStateSnapshot p1, boolean p2, int p3) { return null; }
    public static int getOemBitfield(android.net.NetworkCapabilities p0) { return 0; }
    public int compareTo(android.net.NetworkIdentity p0) { return 0; }
}
