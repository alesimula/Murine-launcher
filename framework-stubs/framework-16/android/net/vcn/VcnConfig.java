package android.net.vcn;

public final class VcnConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.vcn.VcnConfig> CREATOR = null;
    VcnConfig() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.Set<android.net.vcn.VcnGatewayConnectionConfig> getGatewayConnectionConfigs() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.Integer> getRestrictedUnderlyingNetworkTransports() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(android.content.Context p0) {}
        @android.annotation.NonNull
        public android.net.vcn.VcnConfig.Builder addGatewayConnectionConfig(android.net.vcn.VcnGatewayConnectionConfig p0) { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnConfig build() { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnConfig.Builder setRestrictedUnderlyingNetworkTransports(java.util.Set<java.lang.Integer> p0) { return null; }
    }
}
