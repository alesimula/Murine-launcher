package android.net;

@android.annotation.SystemApi
public final class NetworkAgentConfig implements android.os.Parcelable {
    public boolean allowBypass;
    public boolean explicitlySelected;
    public boolean acceptUnvalidated;
    public boolean acceptPartialConnectivity;
    public boolean provisioningNotificationDisabled;
    public java.lang.String subscriberId;
    public boolean skip464xlat;
    public int legacyType;
    public transient boolean hasShownBroken;
    public java.lang.String legacyTypeName;
    private java.lang.String mLegacyExtraInfo;
    public static final android.os.Parcelable.Creator<android.net.NetworkAgentConfig> CREATOR = null;
    public boolean isExplicitlySelected() { return false; }
    public boolean isUnvalidatedConnectivityAcceptable() { return false; }
    public boolean isPartialConnectivityAcceptable() { return false; }
    public boolean isProvisioningNotificationEnabled() { return false; }
    public java.lang.String getSubscriberId() { return null; }
    public boolean isNat64DetectionEnabled() { return false; }
    public int getLegacyType() { return 0; }
    public java.lang.String getLegacyTypeName() { return null; }
    public java.lang.String getLegacyExtraInfo() { return null; }
    public NetworkAgentConfig() {}
    public NetworkAgentConfig(android.net.NetworkAgentConfig p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final android.net.NetworkAgentConfig mConfig = null;
        public Builder() {}
        public android.net.NetworkAgentConfig.Builder setExplicitlySelected(boolean p0) { return null; }
        public android.net.NetworkAgentConfig.Builder setUnvalidatedConnectivityAcceptable(boolean p0) { return null; }
        public android.net.NetworkAgentConfig.Builder setPartialConnectivityAcceptable(boolean p0) { return null; }
        public android.net.NetworkAgentConfig.Builder setSubscriberId(java.lang.String p0) { return null; }
        public android.net.NetworkAgentConfig.Builder disableNat64Detection() { return null; }
        public android.net.NetworkAgentConfig.Builder disableProvisioningNotification() { return null; }
        public android.net.NetworkAgentConfig.Builder setLegacyType(int p0) { return null; }
        public android.net.NetworkAgentConfig.Builder setLegacyTypeName(java.lang.String p0) { return null; }
        public android.net.NetworkAgentConfig.Builder setLegacyExtraInfo(java.lang.String p0) { return null; }
        public android.net.NetworkAgentConfig build() { return null; }
    }
}
