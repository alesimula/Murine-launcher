package android.net.vcn;

public final class VcnCellUnderlyingNetworkTemplate extends android.net.vcn.VcnUnderlyingNetworkTemplate {
    VcnCellUnderlyingNetworkTemplate() { super(0, 0, 0, 0, 0, 0); }
    protected void validate() {}
    @android.annotation.NonNull
    public static android.net.vcn.VcnCellUnderlyingNetworkTemplate fromPersistableBundle(android.os.PersistableBundle p0) { return null; }
    @android.annotation.NonNull
    public android.os.PersistableBundle toPersistableBundle() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getOperatorPlmnIds() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.Integer> getSimSpecificCarrierIds() { return null; }
    public int getRoaming() { return 0; }
    public int getOpportunistic() { return 0; }
    public int getCbs() { return 0; }
    public int getDun() { return 0; }
    public int getIms() { return 0; }
    public int getInternet() { return 0; }
    public int getMms() { return 0; }
    public int getRcs() { return 0; }
    public java.util.Map<java.lang.Integer, java.lang.Integer> getCapabilitiesMatchCriteria() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    void dumpTransportSpecificFields(com.android.internal.util.IndentingPrintWriter p0) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        @android.annotation.NonNull
        public android.net.vcn.VcnCellUnderlyingNetworkTemplate.Builder setMetered(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnCellUnderlyingNetworkTemplate.Builder setOperatorPlmnIds(java.util.Set<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnCellUnderlyingNetworkTemplate.Builder setSimSpecificCarrierIds(java.util.Set<java.lang.Integer> p0) { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnCellUnderlyingNetworkTemplate.Builder setRoaming(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnCellUnderlyingNetworkTemplate.Builder setOpportunistic(int p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.net.vcn.VcnCellUnderlyingNetworkTemplate.Builder setMinUpstreamBandwidthKbps(int p0, int p1) { return null; }
        @android.annotation.NonNull
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.net.vcn.VcnCellUnderlyingNetworkTemplate.Builder setMinDownstreamBandwidthKbps(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnCellUnderlyingNetworkTemplate.Builder setCbs(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnCellUnderlyingNetworkTemplate.Builder setDun(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnCellUnderlyingNetworkTemplate.Builder setIms(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnCellUnderlyingNetworkTemplate.Builder setInternet(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnCellUnderlyingNetworkTemplate.Builder setMms(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnCellUnderlyingNetworkTemplate.Builder setRcs(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnCellUnderlyingNetworkTemplate build() { return null; }
    }
}
