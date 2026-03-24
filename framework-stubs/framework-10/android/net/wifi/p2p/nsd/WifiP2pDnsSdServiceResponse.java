package android.net.wifi.p2p.nsd;

public class WifiP2pDnsSdServiceResponse extends android.net.wifi.p2p.nsd.WifiP2pServiceResponse {
    private java.lang.String mDnsQueryName;
    private java.lang.String mInstanceName;
    private int mDnsType;
    private int mVersion;
    private final java.util.HashMap<java.lang.String, java.lang.String> mTxtRecord = null;
    private static final java.util.Map<java.lang.Integer, java.lang.String> sVmpack = null;
    public java.lang.String getDnsQueryName() { return null; }
    public int getDnsType() { return 0; }
    public int getVersion() { return 0; }
    public java.lang.String getInstanceName() { return null; }
    public java.util.Map<java.lang.String, java.lang.String> getTxtRecord() { return null; }
    public java.lang.String toString() { return null; }
    protected WifiP2pDnsSdServiceResponse(int p0, int p1, android.net.wifi.p2p.WifiP2pDevice p2, byte[] p3) { super(0, 0, 0, null, null); }
    private boolean parse() { return false; }
    private java.lang.String readDnsName(java.io.DataInputStream p0) { return null; }
    private boolean readTxtData(java.io.DataInputStream p0) { return false; }
    static android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceResponse newInstance(int p0, int p1, android.net.wifi.p2p.WifiP2pDevice p2, byte[] p3) { return null; }
}
