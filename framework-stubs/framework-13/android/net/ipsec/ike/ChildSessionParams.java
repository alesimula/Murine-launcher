package android.net.ipsec.ike;

public abstract class ChildSessionParams {
    ChildSessionParams() {}
    @android.annotation.NonNull
    public java.util.List<android.net.ipsec.ike.IkeTrafficSelector> getInboundTrafficSelectors() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.ipsec.ike.IkeTrafficSelector> getOutboundTrafficSelectors() { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.util.List<android.net.ipsec.ike.ChildSaProposal> getSaProposals() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.ipsec.ike.ChildSaProposal> getChildSaProposals() { return null; }
    public int getHardLifetimeSeconds() { return 0; }
    public int getSoftLifetimeSeconds() { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
}
