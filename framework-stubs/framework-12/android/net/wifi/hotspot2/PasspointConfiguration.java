package android.net.wifi.hotspot2;

public final class PasspointConfiguration implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.hotspot2.PasspointConfiguration> CREATOR = null;
    public PasspointConfiguration() {}
    public PasspointConfiguration(android.net.wifi.hotspot2.PasspointConfiguration p0) {}
    public void setHomeSp(android.net.wifi.hotspot2.pps.HomeSp p0) {}
    public android.net.wifi.hotspot2.pps.HomeSp getHomeSp() { return null; }
    public void setCredential(android.net.wifi.hotspot2.pps.Credential p0) {}
    public android.net.wifi.hotspot2.pps.Credential getCredential() { return null; }
    public long getSubscriptionExpirationTimeMillis() { return 0L; }
    public boolean isAutojoinEnabled() { return false; }
    public int getMeteredOverride() { return 0; }
    public boolean isMacRandomizationEnabled() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean isOsuProvisioned() { return false; }
    @android.annotation.NonNull
    public java.lang.String getUniqueId() { return null; }
    public void setDecoratedIdentityPrefix(java.lang.String p0) {}
    @android.annotation.Nullable
    public java.lang.String getDecoratedIdentityPrefix() { return null; }
}
