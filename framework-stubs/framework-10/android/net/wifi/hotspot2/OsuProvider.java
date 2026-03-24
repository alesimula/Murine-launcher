package android.net.wifi.hotspot2;

@android.annotation.SystemApi
public final class OsuProvider implements android.os.Parcelable {
    public static final int METHOD_OMA_DM = 0;
    public static final int METHOD_SOAP_XML_SPP = 1;
    private android.net.wifi.WifiSsid mOsuSsid;
    private final java.util.Map<java.lang.String, java.lang.String> mFriendlyNames = null;
    private final java.lang.String mServiceDescription = null;
    private final android.net.Uri mServerUri = null;
    private final java.lang.String mNetworkAccessIdentifier = null;
    private final java.util.List<java.lang.Integer> mMethodList = null;
    private final android.graphics.drawable.Icon mIcon = null;
    public static final android.os.Parcelable.Creator<android.net.wifi.hotspot2.OsuProvider> CREATOR = null;
    public OsuProvider(android.net.wifi.WifiSsid p0, java.util.Map<java.lang.String, java.lang.String> p1, java.lang.String p2, android.net.Uri p3, java.lang.String p4, java.util.List<java.lang.Integer> p5, android.graphics.drawable.Icon p6) {}
    public OsuProvider(android.net.wifi.hotspot2.OsuProvider p0) {}
    public android.net.wifi.WifiSsid getOsuSsid() { return null; }
    public void setOsuSsid(android.net.wifi.WifiSsid p0) {}
    public java.lang.String getFriendlyName() { return null; }
    public java.util.Map<java.lang.String, java.lang.String> getFriendlyNameList() { return null; }
    public java.lang.String getServiceDescription() { return null; }
    public android.net.Uri getServerUri() { return null; }
    public java.lang.String getNetworkAccessIdentifier() { return null; }
    public java.util.List<java.lang.Integer> getMethodList() { return null; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}
