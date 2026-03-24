package android.net.nsd;

public final class NsdServiceInfo implements android.os.Parcelable {
    private static final java.lang.String TAG = "NsdServiceInfo";
    private java.lang.String mServiceName;
    private java.lang.String mServiceType;
    private final android.util.ArrayMap<java.lang.String, byte[]> mTxtRecord = null;
    private java.net.InetAddress mHost;
    private int mPort;
    public static final android.os.Parcelable.Creator<android.net.nsd.NsdServiceInfo> CREATOR = null;
    public NsdServiceInfo() {}
    public NsdServiceInfo(java.lang.String p0, java.lang.String p1) {}
    public java.lang.String getServiceName() { return null; }
    public void setServiceName(java.lang.String p0) {}
    public java.lang.String getServiceType() { return null; }
    public void setServiceType(java.lang.String p0) {}
    public java.net.InetAddress getHost() { return null; }
    public void setHost(java.net.InetAddress p0) {}
    public int getPort() { return 0; }
    public void setPort(int p0) {}
    public void setTxtRecords(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setAttribute(java.lang.String p0, byte[] p1) {}
    public void setAttribute(java.lang.String p0, java.lang.String p1) {}
    public void removeAttribute(java.lang.String p0) {}
    public java.util.Map<java.lang.String, byte[]> getAttributes() { return null; }
    private int getTxtRecordSize() { return 0; }
    public byte[] getTxtRecord() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
