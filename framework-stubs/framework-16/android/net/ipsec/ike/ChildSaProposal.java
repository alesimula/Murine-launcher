package android.net.ipsec.ike;

public final class ChildSaProposal extends android.net.ipsec.ike.SaProposal {
    ChildSaProposal() { super(); }
    @android.annotation.NonNull
    public static java.util.Set<java.lang.Integer> getSupportedEncryptionAlgorithms() { return null; }
    @android.annotation.NonNull
    public static java.util.Set<java.lang.Integer> getSupportedIntegrityAlgorithms() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.ipsec.ike.ChildSaProposal.Builder addDhGroup(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.ChildSaProposal.Builder addEncryptionAlgorithm(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.ChildSaProposal.Builder addIntegrityAlgorithm(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.ChildSaProposal build() { return null; }
    }
}
