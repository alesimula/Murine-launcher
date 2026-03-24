package android.net.vcn;

public final class VcnCellUnderlyingNetworkTemplate extends android.net.vcn.VcnUnderlyingNetworkTemplate {
    VcnCellUnderlyingNetworkTemplate() { super(0, 0, 0, 0, 0, 0); }
    protected void validate() {}
    public static android.net.vcn.VcnCellUnderlyingNetworkTemplate fromPersistableBundle(android.os.PersistableBundle p0) { return null; }
    public android.os.PersistableBundle toPersistableBundle() { return null; }
    public java.util.Set<java.lang.String> getOperatorPlmnIds() { return null; }
    public java.util.Set<java.lang.Integer> getSimSpecificCarrierIds() { return null; }
    public int getRoaming() { return 0; }
    public int getOpportunistic() { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    void dumpTransportSpecificFields(com.android.internal.util.IndentingPrintWriter p0) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.net.vcn.VcnCellUnderlyingNetworkTemplate.Builder setMetered(int p0) { return null; }
        public android.net.vcn.VcnCellUnderlyingNetworkTemplate.Builder setOperatorPlmnIds(java.util.Set<java.lang.String> p0) { return null; }
        public android.net.vcn.VcnCellUnderlyingNetworkTemplate.Builder setSimSpecificCarrierIds(java.util.Set<java.lang.Integer> p0) { return null; }
        public android.net.vcn.VcnCellUnderlyingNetworkTemplate.Builder setRoaming(int p0) { return null; }
        public android.net.vcn.VcnCellUnderlyingNetworkTemplate.Builder setOpportunistic(int p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.net.vcn.VcnCellUnderlyingNetworkTemplate.Builder setMinUpstreamBandwidthKbps(int p0, int p1) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.net.vcn.VcnCellUnderlyingNetworkTemplate.Builder setMinDownstreamBandwidthKbps(int p0, int p1) { return null; }
        public android.net.vcn.VcnCellUnderlyingNetworkTemplate build() { return null; }
    }
}
