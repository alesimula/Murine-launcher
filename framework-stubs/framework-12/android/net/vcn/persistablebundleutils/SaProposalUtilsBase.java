package android.net.vcn.persistablebundleutils;

abstract class SaProposalUtilsBase {
    static final java.lang.String ENCRYPT_ALGO_KEY = "ENCRYPT_ALGO_KEY";
    static final java.lang.String INTEGRITY_ALGO_KEY = "INTEGRITY_ALGO_KEY";
    static final java.lang.String DH_GROUP_KEY = "DH_GROUP_KEY";
    SaProposalUtilsBase() {}
    static android.os.PersistableBundle toPersistableBundle(android.net.ipsec.ike.SaProposal p0) { return null; }

    static class EncryptionAlgoKeyLenPair {
        private static final java.lang.String ALGO_KEY = "ALGO_KEY";
        private static final java.lang.String KEY_LEN_KEY = "KEY_LEN_KEY";
        public final int encryptionAlgo = 0;
        public final int keyLen = 0;
        EncryptionAlgoKeyLenPair(int p0, int p1) {}
        EncryptionAlgoKeyLenPair(android.os.PersistableBundle p0) {}
        public android.os.PersistableBundle toPersistableBundle() { return null; }
    }
}
