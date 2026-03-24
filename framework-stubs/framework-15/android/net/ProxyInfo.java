package android.net;

public class ProxyInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.ProxyInfo> CREATOR = null;
    public ProxyInfo(android.net.ProxyInfo p0) {}
    public static android.net.ProxyInfo buildDirectProxy(java.lang.String p0, int p1) { return null; }
    public static android.net.ProxyInfo buildDirectProxy(java.lang.String p0, int p1, java.util.List<java.lang.String> p2) { return null; }
    public static android.net.ProxyInfo buildPacProxy(android.net.Uri p0) { return null; }
    @android.annotation.NonNull
    public static android.net.ProxyInfo buildPacProxy(android.net.Uri p0, int p1) { return null; }
    public int describeContents() { return 0; }
    public java.lang.String[] getExclusionList() { return null; }
    public java.lang.String getHost() { return null; }
    public android.net.Uri getPacFileUrl() { return null; }
    public int getPort() { return 0; }
    public boolean isValid() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
