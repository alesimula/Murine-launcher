package android.net.wifi.p2p.nsd;

public class WifiP2pServiceResponse implements android.os.Parcelable {
    private static int MAX_BUF_SIZE;
    protected int mServiceType;
    protected int mStatus;
    protected int mTransId;
    protected android.net.wifi.p2p.WifiP2pDevice mDevice;
    protected byte[] mData;
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.nsd.WifiP2pServiceResponse> CREATOR = null;
    protected WifiP2pServiceResponse(int p0, int p1, int p2, android.net.wifi.p2p.WifiP2pDevice p3, byte[] p4) {}
    public int getServiceType() { return 0; }
    public int getStatus() { return 0; }
    public int getTransactionId() { return 0; }
    public byte[] getRawData() { return null; }
    public android.net.wifi.p2p.WifiP2pDevice getSrcDevice() { return null; }
    public void setSrcDevice(android.net.wifi.p2p.WifiP2pDevice p0) {}
    public static java.util.List<android.net.wifi.p2p.nsd.WifiP2pServiceResponse> newInstance(java.lang.String p0, byte[] p1) { return null; }
    private static byte[] hexStr2Bin(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    private boolean equals(java.lang.Object p0, java.lang.Object p1) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Status {
        public static final int SUCCESS = 0;
        public static final int SERVICE_PROTOCOL_NOT_AVAILABLE = 1;
        public static final int REQUESTED_INFORMATION_NOT_AVAILABLE = 2;
        public static final int BAD_REQUEST = 3;
        public static java.lang.String toString(int p0) { return null; }
        private Status() {}
    }
}
