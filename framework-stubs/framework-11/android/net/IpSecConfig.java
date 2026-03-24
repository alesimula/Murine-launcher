package android.net;

public final class IpSecConfig implements android.os.Parcelable {
    private static final java.lang.String TAG = "IpSecConfig";
    private int mMode;
    private java.lang.String mSourceAddress;
    private java.lang.String mDestinationAddress;
    private android.net.Network mNetwork;
    private int mSpiResourceId;
    private android.net.IpSecAlgorithm mEncryption;
    private android.net.IpSecAlgorithm mAuthentication;
    private android.net.IpSecAlgorithm mAuthenticatedEncryption;
    private int mEncapType;
    private int mEncapSocketResourceId;
    private int mEncapRemotePort;
    private int mNattKeepaliveInterval;
    private int mMarkValue;
    private int mMarkMask;
    private int mXfrmInterfaceId;
    public static final android.os.Parcelable.Creator<android.net.IpSecConfig> CREATOR = null;
    public void setMode(int p0) {}
    public void setSourceAddress(java.lang.String p0) {}
    public void setDestinationAddress(java.lang.String p0) {}
    public void setSpiResourceId(int p0) {}
    public void setEncryption(android.net.IpSecAlgorithm p0) {}
    public void setAuthentication(android.net.IpSecAlgorithm p0) {}
    public void setAuthenticatedEncryption(android.net.IpSecAlgorithm p0) {}
    public void setNetwork(android.net.Network p0) {}
    public void setEncapType(int p0) {}
    public void setEncapSocketResourceId(int p0) {}
    public void setEncapRemotePort(int p0) {}
    public void setNattKeepaliveInterval(int p0) {}
    public void setMarkValue(int p0) {}
    public void setMarkMask(int p0) {}
    public void setXfrmInterfaceId(int p0) {}
    public int getMode() { return 0; }
    public java.lang.String getSourceAddress() { return null; }
    public int getSpiResourceId() { return 0; }
    public java.lang.String getDestinationAddress() { return null; }
    public android.net.IpSecAlgorithm getEncryption() { return null; }
    public android.net.IpSecAlgorithm getAuthentication() { return null; }
    public android.net.IpSecAlgorithm getAuthenticatedEncryption() { return null; }
    public android.net.Network getNetwork() { return null; }
    public int getEncapType() { return 0; }
    public int getEncapSocketResourceId() { return 0; }
    public int getEncapRemotePort() { return 0; }
    public int getNattKeepaliveInterval() { return 0; }
    public int getMarkValue() { return 0; }
    public int getMarkMask() { return 0; }
    public int getXfrmInterfaceId() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public IpSecConfig() {}
    public IpSecConfig(android.net.IpSecConfig p0) {}
    private IpSecConfig(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
}
