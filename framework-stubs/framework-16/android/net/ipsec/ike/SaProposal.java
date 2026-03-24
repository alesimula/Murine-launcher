package android.net.ipsec.ike;

public abstract class SaProposal {
    public static final int DH_GROUP_1024_BIT_MODP = 2;
    public static final int DH_GROUP_1536_BIT_MODP = 5;
    public static final int DH_GROUP_2048_BIT_MODP = 14;
    public static final int DH_GROUP_3072_BIT_MODP = 15;
    public static final int DH_GROUP_4096_BIT_MODP = 16;
    public static final int DH_GROUP_CURVE_25519 = 31;
    public static final int DH_GROUP_NONE = 0;
    public static final int ENCRYPTION_ALGORITHM_3DES = 3;
    public static final int ENCRYPTION_ALGORITHM_AES_CBC = 12;
    public static final int ENCRYPTION_ALGORITHM_AES_CTR = 13;
    public static final int ENCRYPTION_ALGORITHM_AES_GCM_12 = 19;
    public static final int ENCRYPTION_ALGORITHM_AES_GCM_16 = 20;
    public static final int ENCRYPTION_ALGORITHM_AES_GCM_8 = 18;
    public static final int ENCRYPTION_ALGORITHM_CHACHA20_POLY1305 = 28;
    public static final int INTEGRITY_ALGORITHM_AES_CMAC_96 = 8;
    public static final int INTEGRITY_ALGORITHM_AES_XCBC_96 = 5;
    public static final int INTEGRITY_ALGORITHM_HMAC_SHA1_96 = 2;
    public static final int INTEGRITY_ALGORITHM_HMAC_SHA2_256_128 = 12;
    public static final int INTEGRITY_ALGORITHM_HMAC_SHA2_384_192 = 13;
    public static final int INTEGRITY_ALGORITHM_HMAC_SHA2_512_256 = 14;
    public static final int INTEGRITY_ALGORITHM_NONE = 0;
    public static final int KEY_LEN_AES_128 = 128;
    public static final int KEY_LEN_AES_192 = 192;
    public static final int KEY_LEN_AES_256 = 256;
    public static final int KEY_LEN_UNUSED = 0;
    public static final int PSEUDORANDOM_FUNCTION_AES128_CMAC = 8;
    public static final int PSEUDORANDOM_FUNCTION_AES128_XCBC = 4;
    public static final int PSEUDORANDOM_FUNCTION_HMAC_SHA1 = 2;
    public static final int PSEUDORANDOM_FUNCTION_SHA2_256 = 5;
    public static final int PSEUDORANDOM_FUNCTION_SHA2_384 = 6;
    public static final int PSEUDORANDOM_FUNCTION_SHA2_512 = 7;
    SaProposal() {}
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getDhGroups() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.util.Pair<java.lang.Integer, java.lang.Integer>> getEncryptionAlgorithms() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getIntegrityAlgorithms() { return null; }
    @android.annotation.NonNull
    public static java.util.Set<java.lang.Integer> getSupportedDhGroups() { return null; }
}
