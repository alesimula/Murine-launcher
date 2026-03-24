package android.net.ipsec.ike;

public final class IkeSaProposal extends android.net.ipsec.ike.SaProposal {
    IkeSaProposal() { super(); }
    @android.annotation.NonNull
    public static java.util.Set<java.lang.Integer> getSupportedEncryptionAlgorithms() { return null; }
    @android.annotation.NonNull
    public static java.util.Set<java.lang.Integer> getSupportedIntegrityAlgorithms() { return null; }
    @android.annotation.NonNull
    public static java.util.Set<java.lang.Integer> getSupportedPseudorandomFunctions() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getPseudorandomFunctions() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSaProposal.Builder addEncryptionAlgorithm(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSaProposal.Builder addIntegrityAlgorithm(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSaProposal.Builder addDhGroup(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSaProposal.Builder addPseudorandomFunction(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSaProposal build() { return null; }
    }
}
