package android.net.vcn;

public final class VcnConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.vcn.VcnConfig> CREATOR = null;
    public VcnConfig(android.os.PersistableBundle p0) {}
    @android.annotation.NonNull
    public java.lang.String getProvisioningPackageName() { return null; }
    @android.annotation.NonNull
    public java.util.Set<android.net.vcn.VcnGatewayConnectionConfig> getGatewayConnectionConfigs() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.Integer> getRestrictedUnderlyingNetworkTransports() { return null; }
    public boolean isTestModeProfile() { return false; }
    @android.annotation.NonNull
    public android.os.PersistableBundle toPersistableBundle() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(android.content.Context p0) {}
        @android.annotation.NonNull
        public android.net.vcn.VcnConfig.Builder addGatewayConnectionConfig(android.net.vcn.VcnGatewayConnectionConfig p0) { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnConfig.Builder setRestrictedUnderlyingNetworkTransports(java.util.Set<java.lang.Integer> p0) { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnConfig.Builder setIsTestModeProfile() { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnConfig build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    public static @interface VcnUnderlyingNetworkTransport {
    }
}
