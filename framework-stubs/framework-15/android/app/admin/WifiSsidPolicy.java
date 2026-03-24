package android.app.admin;

public final class WifiSsidPolicy implements android.os.Parcelable {
    public static final int WIFI_SSID_POLICY_TYPE_ALLOWLIST = 0;
    public static final int WIFI_SSID_POLICY_TYPE_DENYLIST = 1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.admin.WifiSsidPolicy> CREATOR = null;
    public WifiSsidPolicy(int p0, java.util.Set<android.net.wifi.WifiSsid> p1) {}
    @android.annotation.NonNull
    public java.util.Set<android.net.wifi.WifiSsid> getSsids() { return null; }
    public int getPolicyType() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WifiSsidPolicyType {
    }
}
