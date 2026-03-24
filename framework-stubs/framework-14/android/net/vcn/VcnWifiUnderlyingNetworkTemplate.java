package android.net.vcn;

public final class VcnWifiUnderlyingNetworkTemplate extends android.net.vcn.VcnUnderlyingNetworkTemplate {
    VcnWifiUnderlyingNetworkTemplate() { super(0, 0, 0, 0, 0, 0); }
    protected void validate() {}
    public static android.net.vcn.VcnWifiUnderlyingNetworkTemplate fromPersistableBundle(android.os.PersistableBundle p0) { return null; }
    public android.os.PersistableBundle toPersistableBundle() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    void dumpTransportSpecificFields(com.android.internal.util.IndentingPrintWriter p0) {}
    public java.util.Set<java.lang.String> getSsids() { return null; }
    public java.util.Map<java.lang.Integer, java.lang.Integer> getCapabilitiesMatchCriteria() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.net.vcn.VcnWifiUnderlyingNetworkTemplate.Builder setMetered(int p0) { return null; }
        public android.net.vcn.VcnWifiUnderlyingNetworkTemplate.Builder setSsids(java.util.Set<java.lang.String> p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.net.vcn.VcnWifiUnderlyingNetworkTemplate.Builder setMinUpstreamBandwidthKbps(int p0, int p1) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.net.vcn.VcnWifiUnderlyingNetworkTemplate.Builder setMinDownstreamBandwidthKbps(int p0, int p1) { return null; }
        public android.net.vcn.VcnWifiUnderlyingNetworkTemplate build() { return null; }
    }
}
