package android.net.ipsec.ike;

public final class IkeSessionParams {
    public static final int IKE_OPTION_ACCEPT_ANY_REMOTE_ID = 0;
    public static final int IKE_OPTION_EAP_ONLY_AUTH = 1;
    public static final int IKE_OPTION_FORCE_PORT_4500 = 3;
    public static final int IKE_OPTION_MOBIKE = 2;
    private IkeSessionParams() {}
    @android.annotation.NonNull
    public java.lang.String getServerHostname() { return null; }
    @android.annotation.Nullable
    public android.net.Network getNetwork() { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.util.List<android.net.ipsec.ike.IkeSaProposal> getSaProposals() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.ipsec.ike.IkeSaProposal> getIkeSaProposals() { return null; }
    @android.annotation.NonNull
    public android.net.ipsec.ike.IkeIdentification getLocalIdentification() { return null; }
    @android.annotation.NonNull
    public android.net.ipsec.ike.IkeIdentification getRemoteIdentification() { return null; }
    @android.annotation.NonNull
    public android.net.ipsec.ike.IkeSessionParams.IkeAuthConfig getLocalAuthConfig() { return null; }
    @android.annotation.NonNull
    public android.net.ipsec.ike.IkeSessionParams.IkeAuthConfig getRemoteAuthConfig() { return null; }
    public int getHardLifetimeSeconds() { return 0; }
    public int getSoftLifetimeSeconds() { return 0; }
    public int getDpdDelaySeconds() { return 0; }
    public int getNattKeepAliveDelaySeconds() { return 0; }
    public int getDscp() { return 0; }
    @android.annotation.NonNull
    public int[] getRetransmissionTimeoutsMillis() { return null; }
    @android.annotation.Nullable
    public android.net.ipsec.ike.ike3gpp.Ike3gppExtension getIke3gppExtension() { return null; }
    public boolean hasIkeOption(int p0) { return false; }
    @android.annotation.NonNull
    public java.util.List<android.net.ipsec.ike.IkeSessionParams.IkeConfigRequest> getConfigurationRequests() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }

    public static final class Builder {
        @java.lang.Deprecated
        public Builder(android.content.Context p0) {}
        public Builder() {}
        public Builder(android.net.ipsec.ike.IkeSessionParams p0) {}
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionParams.Builder setServerHostname(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionParams.Builder setNetwork(android.net.Network p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionParams.Builder setLocalIdentification(android.net.ipsec.ike.IkeIdentification p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionParams.Builder setRemoteIdentification(android.net.ipsec.ike.IkeIdentification p0) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionParams.Builder addSaProposal(android.net.ipsec.ike.IkeSaProposal p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionParams.Builder addIkeSaProposal(android.net.ipsec.ike.IkeSaProposal p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionParams.Builder setAuthPsk(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionParams.Builder setAuthEap(java.security.cert.X509Certificate p0, android.net.eap.EapSessionConfig p1) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionParams.Builder setAuthDigitalSignature(java.security.cert.X509Certificate p0, java.security.cert.X509Certificate p1, java.security.PrivateKey p2) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionParams.Builder setAuthDigitalSignature(java.security.cert.X509Certificate p0, java.security.cert.X509Certificate p1, java.util.List<java.security.cert.X509Certificate> p2, java.security.PrivateKey p3) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionParams.Builder addPcscfServerRequest(java.net.InetAddress p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionParams.Builder addPcscfServerRequest(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionParams.Builder setLifetimeSeconds(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionParams.Builder setDpdDelaySeconds(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionParams.Builder setNattKeepAliveDelaySeconds(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionParams.Builder setDscp(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionParams.Builder setRetransmissionTimeoutsMillis(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionParams.Builder setIke3gppExtension(android.net.ipsec.ike.ike3gpp.Ike3gppExtension p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionParams.Builder addIkeOption(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionParams.Builder removeIkeOption(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionParams build() { return null; }
    }

    public static interface ConfigRequestIpv4PcscfServer extends android.net.ipsec.ike.IkeSessionParams.IkeConfigRequest {
        @android.annotation.Nullable
        public java.net.Inet4Address getAddress();
    }

    public static interface ConfigRequestIpv6PcscfServer extends android.net.ipsec.ike.IkeSessionParams.IkeConfigRequest {
        @android.annotation.Nullable
        public java.net.Inet6Address getAddress();
    }

    public static abstract class IkeAuthConfig {
        IkeAuthConfig() {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    public static class IkeAuthDigitalSignLocalConfig extends android.net.ipsec.ike.IkeSessionParams.IkeAuthConfig {
        IkeAuthDigitalSignLocalConfig() { super(); }
        @android.annotation.NonNull
        public java.security.cert.X509Certificate getClientEndCertificate() { return null; }
        @android.annotation.NonNull
        public java.util.List<java.security.cert.X509Certificate> getIntermediateCertificates() { return null; }
        @android.annotation.NonNull
        public java.security.PrivateKey getPrivateKey() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    public static class IkeAuthDigitalSignRemoteConfig extends android.net.ipsec.ike.IkeSessionParams.IkeAuthConfig {
        IkeAuthDigitalSignRemoteConfig() { super(); }
        @android.annotation.Nullable
        public java.security.cert.X509Certificate getRemoteCaCert() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    public static class IkeAuthEapConfig extends android.net.ipsec.ike.IkeSessionParams.IkeAuthConfig {
        IkeAuthEapConfig() { super(); }
        @android.annotation.NonNull
        public android.net.eap.EapSessionConfig getEapConfig() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    public static class IkeAuthPskConfig extends android.net.ipsec.ike.IkeSessionParams.IkeAuthConfig {
        IkeAuthPskConfig() { super(); }
        @android.annotation.NonNull
        public byte[] getPsk() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    public static interface IkeConfigRequest {
    }
}
