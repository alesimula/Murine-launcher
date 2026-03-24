package android.security.keystore;

public abstract class KeyProperties {
    public static final int AUTH_DEVICE_CREDENTIAL = 1;
    public static final int AUTH_BIOMETRIC_STRONG = 2;
    public static final int PURPOSE_ENCRYPT = 1;
    public static final int PURPOSE_DECRYPT = 2;
    public static final int PURPOSE_SIGN = 4;
    public static final int PURPOSE_VERIFY = 8;
    public static final int PURPOSE_WRAP_KEY = 32;
    public static final int PURPOSE_AGREE_KEY = 64;
    public static final int PURPOSE_ATTEST_KEY = 128;
    public static final java.lang.String KEY_ALGORITHM_RSA = "RSA";
    public static final java.lang.String KEY_ALGORITHM_EC = "EC";
    public static final java.lang.String KEY_ALGORITHM_AES = "AES";
    @java.lang.Deprecated
    public static final java.lang.String KEY_ALGORITHM_3DES = "DESede";
    public static final java.lang.String KEY_ALGORITHM_HMAC_SHA1 = "HmacSHA1";
    public static final java.lang.String KEY_ALGORITHM_HMAC_SHA224 = "HmacSHA224";
    public static final java.lang.String KEY_ALGORITHM_HMAC_SHA256 = "HmacSHA256";
    public static final java.lang.String KEY_ALGORITHM_HMAC_SHA384 = "HmacSHA384";
    public static final java.lang.String KEY_ALGORITHM_HMAC_SHA512 = "HmacSHA512";
    public static final java.lang.String BLOCK_MODE_ECB = "ECB";
    public static final java.lang.String BLOCK_MODE_CBC = "CBC";
    public static final java.lang.String BLOCK_MODE_CTR = "CTR";
    public static final java.lang.String BLOCK_MODE_GCM = "GCM";
    public static final java.lang.String ENCRYPTION_PADDING_NONE = "NoPadding";
    public static final java.lang.String ENCRYPTION_PADDING_PKCS7 = "PKCS7Padding";
    public static final java.lang.String ENCRYPTION_PADDING_RSA_PKCS1 = "PKCS1Padding";
    public static final java.lang.String ENCRYPTION_PADDING_RSA_OAEP = "OAEPPadding";
    public static final java.lang.String SIGNATURE_PADDING_RSA_PKCS1 = "PKCS1";
    public static final java.lang.String SIGNATURE_PADDING_RSA_PSS = "PSS";
    public static final java.lang.String DIGEST_NONE = "NONE";
    public static final java.lang.String DIGEST_MD5 = "MD5";
    public static final java.lang.String DIGEST_SHA1 = "SHA-1";
    public static final java.lang.String DIGEST_SHA224 = "SHA-224";
    public static final java.lang.String DIGEST_SHA256 = "SHA-256";
    public static final java.lang.String DIGEST_SHA384 = "SHA-384";
    public static final java.lang.String DIGEST_SHA512 = "SHA-512";
    public static final int ORIGIN_GENERATED = 1;
    public static final int ORIGIN_IMPORTED = 2;
    public static final int ORIGIN_UNKNOWN = 4;
    public static final int ORIGIN_SECURELY_IMPORTED = 8;
    public static final int SECURITY_LEVEL_UNKNOWN = -2;
    public static final int SECURITY_LEVEL_UNKNOWN_SECURE = -1;
    public static final int SECURITY_LEVEL_SOFTWARE = 0;
    public static final int SECURITY_LEVEL_TRUSTED_ENVIRONMENT = 1;
    public static final int SECURITY_LEVEL_STRONGBOX = 2;
    @android.annotation.SystemApi
    public static final int NAMESPACE_APPLICATION = -1;
    @android.annotation.SystemApi
    public static final int NAMESPACE_WIFI = 102;
    public static final int NAMESPACE_LOCKSETTINGS = 103;
    public static final int UNRESTRICTED_USAGE_COUNT = -1;
    public static int namespaceToLegacyUid(int p0) { return 0; }
    public static int legacyUidToNamespace(int p0) { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AuthEnum {
    }

    public static abstract class BlockMode {
        public static int toKeymaster(java.lang.String p0) { return 0; }
        public static java.lang.String fromKeymaster(int p0) { return null; }
        public static java.lang.String[] allFromKeymaster(java.util.Collection<java.lang.Integer> p0) { return null; }
        public static int[] allToKeymaster(java.lang.String[] p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BlockModeEnum {
    }

    public static abstract class Digest {
        public static int toKeymaster(java.lang.String p0) { return 0; }
        public static java.lang.String fromKeymaster(int p0) { return null; }
        public static java.lang.String fromKeymasterToSignatureAlgorithmDigest(int p0) { return null; }
        public static java.lang.String[] allFromKeymaster(java.util.Collection<java.lang.Integer> p0) { return null; }
        public static int[] allToKeymaster(java.lang.String[] p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DigestEnum {
    }

    public static abstract class EncryptionPadding {
        public static int toKeymaster(java.lang.String p0) { return 0; }
        public static java.lang.String fromKeymaster(int p0) { return null; }
        public static int[] allToKeymaster(java.lang.String[] p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EncryptionPaddingEnum {
    }

    public static abstract class KeyAlgorithm {
        public static int toKeymasterAsymmetricKeyAlgorithm(java.lang.String p0) { return 0; }
        public static java.lang.String fromKeymasterAsymmetricKeyAlgorithm(int p0) { return null; }
        public static int toKeymasterSecretKeyAlgorithm(java.lang.String p0) { return 0; }
        public static java.lang.String fromKeymasterSecretKeyAlgorithm(int p0, int p1) { return null; }
        public static int toKeymasterDigest(java.lang.String p0) { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface KeyAlgorithmEnum {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Namespace {
    }

    public static abstract class Origin {
        public static int fromKeymaster(int p0) { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OriginEnum {
    }

    public static abstract class Purpose {
        public static int toKeymaster(int p0) { return 0; }
        public static int fromKeymaster(int p0) { return 0; }
        public static int[] allToKeymaster(int p0) { return null; }
        public static int allFromKeymaster(java.util.Collection<java.lang.Integer> p0) { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PurposeEnum {
    }

    public static abstract class SecurityLevel {
        public static int toKeymaster(int p0) { return 0; }
        public static int fromKeymaster(int p0) { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SecurityLevelEnum {
    }

    public static abstract class SignaturePadding {
        public static int toKeymaster(java.lang.String p0) { return 0; }
        public static java.lang.String fromKeymaster(int p0) { return null; }
        public static int[] allToKeymaster(java.lang.String[] p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SignaturePaddingEnum {
    }
}
