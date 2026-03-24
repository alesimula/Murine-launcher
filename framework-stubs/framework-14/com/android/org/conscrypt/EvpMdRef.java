package com.android.org.conscrypt;

final class EvpMdRef {
    static final java.lang.String MGF1_ALGORITHM_NAME = "MGF1";
    static final java.lang.String MGF1_OID = "1.2.840.113549.1.1.8";
    static java.lang.String getJcaDigestAlgorithmStandardName(java.lang.String p0) { return null; }
    static long getEVP_MDByJcaDigestAlgorithmStandardName(java.lang.String p0) throws java.security.NoSuchAlgorithmException { return 0L; }
    static int getDigestSizeBytesByJcaDigestAlgorithmStandardName(java.lang.String p0) throws java.security.NoSuchAlgorithmException { return 0; }
    static java.lang.String getJcaDigestAlgorithmStandardNameFromEVP_MD(long p0) { return null; }

    static final class MD5 {
        static final java.lang.String JCA_NAME = "MD5";
        static final java.lang.String OID = "1.2.840.113549.2.5";
        static final long EVP_MD = Long.valueOf(0L);
        static final int SIZE_BYTES = Integer.valueOf(0);
    }

    static final class SHA1 {
        static final java.lang.String JCA_NAME = "SHA-1";
        static final java.lang.String OID = "1.3.14.3.2.26";
        static final long EVP_MD = Long.valueOf(0L);
        static final int SIZE_BYTES = Integer.valueOf(0);
    }

    static final class SHA224 {
        static final java.lang.String JCA_NAME = "SHA-224";
        static final java.lang.String OID = "2.16.840.1.101.3.4.2.4";
        static final long EVP_MD = Long.valueOf(0L);
        static final int SIZE_BYTES = Integer.valueOf(0);
    }

    static final class SHA256 {
        static final java.lang.String JCA_NAME = "SHA-256";
        static final java.lang.String OID = "2.16.840.1.101.3.4.2.1";
        static final long EVP_MD = Long.valueOf(0L);
        static final int SIZE_BYTES = Integer.valueOf(0);
    }

    static final class SHA384 {
        static final java.lang.String JCA_NAME = "SHA-384";
        static final java.lang.String OID = "2.16.840.1.101.3.4.2.2";
        static final long EVP_MD = Long.valueOf(0L);
        static final int SIZE_BYTES = Integer.valueOf(0);
    }

    static final class SHA512 {
        static final java.lang.String JCA_NAME = "SHA-512";
        static final java.lang.String OID = "2.16.840.1.101.3.4.2.3";
        static final long EVP_MD = Long.valueOf(0L);
        static final int SIZE_BYTES = Integer.valueOf(0);
    }
}
