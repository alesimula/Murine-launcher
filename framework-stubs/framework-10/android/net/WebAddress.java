package android.net;

@android.annotation.SystemApi
public class WebAddress {
    @android.annotation.UnsupportedAppUsage
    private java.lang.String mScheme;
    @android.annotation.UnsupportedAppUsage
    private java.lang.String mHost;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private int mPort;
    @android.annotation.UnsupportedAppUsage
    private java.lang.String mPath;
    private java.lang.String mAuthInfo;
    static final int MATCH_GROUP_SCHEME = 1;
    static final int MATCH_GROUP_AUTHORITY = 2;
    static final int MATCH_GROUP_HOST = 3;
    static final int MATCH_GROUP_PORT = 4;
    static final int MATCH_GROUP_PATH = 5;
    static java.util.regex.Pattern sAddressPattern;
    public WebAddress(java.lang.String p0) throws android.net.ParseException {}
    public java.lang.String toString() { return null; }
    public void setScheme(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getScheme() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setHost(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getHost() { return null; }
    public void setPort(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public int getPort() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setPath(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getPath() { return null; }
    public void setAuthInfo(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getAuthInfo() { return null; }
}
