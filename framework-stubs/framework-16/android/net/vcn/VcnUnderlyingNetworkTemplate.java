package android.net.vcn;

public abstract class VcnUnderlyingNetworkTemplate {
    public static final int MATCH_ANY = 0;
    public static final int MATCH_FORBIDDEN = 2;
    public static final int MATCH_REQUIRED = 1;
    VcnUnderlyingNetworkTemplate() {}
    public int getMetered() { return 0; }
    public int getMinEntryDownstreamBandwidthKbps() { return 0; }
    public int getMinEntryUpstreamBandwidthKbps() { return 0; }
    public int getMinExitDownstreamBandwidthKbps() { return 0; }
    public int getMinExitUpstreamBandwidthKbps() { return 0; }
}
