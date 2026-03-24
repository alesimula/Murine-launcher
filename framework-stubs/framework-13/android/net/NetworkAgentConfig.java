package android.net;

public final class NetworkAgentConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.NetworkAgentConfig> CREATOR = null;
    NetworkAgentConfig() {}
    public boolean isExplicitlySelected() { return false; }
    public boolean isBypassableVpn() { return false; }
    public boolean isUnvalidatedConnectivityAcceptable() { return false; }
    public boolean isPartialConnectivityAcceptable() { return false; }
    @android.annotation.Nullable
    public java.lang.String getSubscriberId() { return null; }
    public int getLegacyType() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getLegacyTypeName() { return null; }
    public boolean isVpnValidationRequired() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.NetworkAgentConfig.Builder setExplicitlySelected(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkAgentConfig.Builder setUnvalidatedConnectivityAcceptable(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkAgentConfig.Builder setPartialConnectivityAcceptable(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkAgentConfig.Builder setSubscriberId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkAgentConfig.Builder setNat64DetectionEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkAgentConfig.Builder setProvisioningNotificationEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkAgentConfig.Builder setLegacyType(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkAgentConfig.Builder setLegacySubType(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkAgentConfig.Builder setLegacyTypeName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkAgentConfig.Builder setLegacySubTypeName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkAgentConfig.Builder setLegacyExtraInfo(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkAgentConfig.Builder setVpnRequiresValidation(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkAgentConfig.Builder setBypassableVpn(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkAgentConfig.Builder setLocalRoutesExcludedForVpn(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkAgentConfig build() { return null; }
    }
}
