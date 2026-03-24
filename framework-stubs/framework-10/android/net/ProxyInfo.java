package android.net;

public class ProxyInfo implements android.os.Parcelable {
    private final java.lang.String mHost = null;
    private final int mPort = 0;
    private final java.lang.String mExclusionList = null;
    private final java.lang.String[] mParsedExclusionList = null;
    private final android.net.Uri mPacFileUrl = null;
    public static final java.lang.String LOCAL_EXCL_LIST = "";
    public static final int LOCAL_PORT = -1;
    public static final java.lang.String LOCAL_HOST = "localhost";
    public static final android.os.Parcelable.Creator<android.net.ProxyInfo> CREATOR = null;
    public static android.net.ProxyInfo buildDirectProxy(java.lang.String p0, int p1) { return null; }
    public static android.net.ProxyInfo buildDirectProxy(java.lang.String p0, int p1, java.util.List<java.lang.String> p2) { return null; }
    public static android.net.ProxyInfo buildPacProxy(android.net.Uri p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public ProxyInfo(java.lang.String p0, int p1, java.lang.String p2) {}
    public ProxyInfo(android.net.Uri p0) {}
    public ProxyInfo(java.lang.String p0) {}
    public ProxyInfo(android.net.Uri p0, int p1) {}
    private static java.lang.String[] parseExclusionList(java.lang.String p0) { return null; }
    private ProxyInfo(java.lang.String p0, int p1, java.lang.String p2, java.lang.String[] p3) {}
    public ProxyInfo(android.net.ProxyInfo p0) {}
    public java.net.InetSocketAddress getSocketAddress() { return null; }
    public android.net.Uri getPacFileUrl() { return null; }
    public java.lang.String getHost() { return null; }
    public int getPort() { return 0; }
    public java.lang.String[] getExclusionList() { return null; }
    public java.lang.String getExclusionListAsString() { return null; }
    public boolean isValid() { return false; }
    public java.net.Proxy makeProxy() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
