package android.telephony.gba;

@android.annotation.SystemApi
public class TlsParams {
    public static final int PROTOCOL_VERSION_TLS_1_2 = 771;
    public static final int PROTOCOL_VERSION_TLS_1_3 = 772;
    public static final int TLS_NULL_WITH_NULL_NULL = 0;
    public static final int TLS_RSA_WITH_NULL_MD5 = 1;
    public static final int TLS_RSA_WITH_NULL_SHA = 2;
    public static final int TLS_RSA_WITH_RC4_128_MD5 = 4;
    public static final int TLS_RSA_WITH_RC4_128_SHA = 5;
    public static final int TLS_RSA_WITH_3DES_EDE_CBC_SHA = 10;
    public static final int TLS_DH_DSS_WITH_3DES_EDE_CBC_SHA = 13;
    public static final int TLS_DH_RSA_WITH_3DES_EDE_CBC_SHA = 16;
    public static final int TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = 19;
    public static final int TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = 22;
    public static final int TLS_DH_ANON_WITH_RC4_128_MD5 = 24;
    public static final int TLS_DH_ANON_WITH_3DES_EDE_CBC_SHA = 27;
    public static final int TLS_RSA_WITH_AES_128_CBC_SHA = 47;
    public static final int TLS_DH_DSS_WITH_AES_128_CBC_SHA = 48;
    public static final int TLS_DH_RSA_WITH_AES_128_CBC_SHA = 49;
    public static final int TLS_DHE_DSS_WITH_AES_128_CBC_SHA = 50;
    public static final int TLS_DHE_RSA_WITH_AES_128_CBC_SHA = 51;
    public static final int TLS_DH_ANON_WITH_AES_128_CBC_SHA = 52;
    public static final int TLS_RSA_WITH_AES_256_CBC_SHA = 53;
    public static final int TLS_DH_DSS_WITH_AES_256_CBC_SHA = 54;
    public static final int TLS_DH_RSA_WITH_AES_256_CBC_SHA = 55;
    public static final int TLS_DHE_DSS_WITH_AES_256_CBC_SHA = 56;
    public static final int TLS_DHE_RSA_WITH_AES_256_CBC_SHA = 57;
    public static final int TLS_DH_ANON_WITH_AES_256_CBC_SHA = 58;
    public static final int TLS_RSA_WITH_NULL_SHA256 = 59;
    public static final int TLS_RSA_WITH_AES_128_CBC_SHA256 = 60;
    public static final int TLS_RSA_WITH_AES_256_CBC_SHA256 = 61;
    public static final int TLS_DH_DSS_WITH_AES_128_CBC_SHA256 = 62;
    public static final int TLS_DH_RSA_WITH_AES_128_CBC_SHA256 = 63;
    public static final int TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = 64;
    public static final int TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = 103;
    public static final int TLS_DH_DSS_WITH_AES_256_CBC_SHA256 = 104;
    public static final int TLS_DH_RSA_WITH_AES_256_CBC_SHA256 = 105;
    public static final int TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = 106;
    public static final int TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = 107;
    public static final int TLS_DH_ANON_WITH_AES_128_CBC_SHA256 = 108;
    public static final int TLS_DH_ANON_WITH_AES_256_CBC_SHA256 = 109;
    public static final int TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = 158;
    public static final int TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = 159;
    public static final int TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 = 170;
    public static final int TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 = 171;
    public static final int TLS_AES_128_GCM_SHA256 = 4865;
    public static final int TLS_AES_256_GCM_SHA384 = 4866;
    public static final int TLS_CHACHA20_POLY1305_SHA256 = 4867;
    public static final int TLS_AES_128_CCM_SHA256 = 4868;
    public static final int TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = 49195;
    public static final int TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = 49196;
    public static final int TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = 49199;
    public static final int TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = 49200;
    public static final int TLS_DHE_RSA_WITH_AES_128_CCM = 49310;
    public static final int TLS_DHE_RSA_WITH_AES_256_CCM = 49311;
    public static final int TLS_DHE_PSK_WITH_AES_128_CCM = 49318;
    public static final int TLS_DHE_PSK_WITH_AES_256_CCM = 49319;
    public static final int TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = 52392;
    public static final int TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = 52393;
    public static final int TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = 52394;
    public static final int TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 = 52396;
    public static final int TLS_DHE_PSK_WITH_CHACHA20_POLY1305_SHA256 = 52397;
    public static final int TLS_ECDHE_PSK_WITH_AES_128_GCM_SHA256 = 53249;
    public static final int TLS_ECDHE_PSK_WITH_AES_256_GCM_SHA384 = 53250;
    public static final int TLS_ECDHE_PSK_WITH_AES_128_CCM_SHA256 = 53253;
    public static final int GROUP_SECP256R1 = 23;
    public static final int GROUP_SECP384R1 = 24;
    public static final int GROUP_X25519 = 29;
    public static final int GROUP_X448 = 30;
    public static final int SIG_RSA_PKCS1_SHA1 = 513;
    public static final int SIG_ECDSA_SHA1 = 515;
    public static final int SIG_RSA_PKCS1_SHA256 = 1025;
    public static final int SIG_ECDSA_SECP256R1_SHA256 = 1027;
    public static final int SIG_RSA_PKCS1_SHA256_LEGACY = 1056;
    public static final int SIG_RSA_PKCS1_SHA384 = 1281;
    public static final int SIG_ECDSA_SECP384R1_SHA384 = 1283;
    public static final int SIG_RSA_PKCS1_SHA384_LEGACY = 1312;
    public static final int SIG_RSA_PKCS1_SHA512 = 1537;
    public static final int SIG_ECDSA_SECP521R1_SHA512 = 1539;
    public static final int SIG_RSA_PKCS1_SHA512_LEGACY = 1568;
    public static final int SIG_RSA_PSS_RSAE_SHA256 = 2052;
    public static final int SIG_RSA_PSS_RSAE_SHA384 = 2053;
    public static final int SIG_RSA_PSS_RSAE_SHA512 = 2054;
    public static final int SIG_ECDSA_BRAINPOOLP256R1TLS13_SHA256 = 2074;
    public static final int SIG_ECDSA_BRAINPOOLP384R1TLS13_SHA384 = 2075;
    public static final int SIG_ECDSA_BRAINPOOLP512R1TLS13_SHA512 = 2076;
    public static boolean isTlsCipherSuiteSupported(int p0) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TlsCipherSuite {
    }
}
