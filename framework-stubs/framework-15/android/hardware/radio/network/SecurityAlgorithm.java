package android.hardware.radio.network;

public @interface SecurityAlgorithm {
    public static final int A50 = 0;
    public static final int A51 = 1;
    public static final int A52 = 2;
    public static final int A53 = 3;
    public static final int A54 = 4;
    public static final int GEA0 = 14;
    public static final int GEA1 = 15;
    public static final int GEA2 = 16;
    public static final int GEA3 = 17;
    public static final int GEA4 = 18;
    public static final int GEA5 = 19;
    public static final int UEA0 = 29;
    public static final int UEA1 = 30;
    public static final int UEA2 = 31;
    public static final int EEA0 = 41;
    public static final int EEA1 = 42;
    public static final int EEA2 = 43;
    public static final int EEA3 = 44;
    public static final int NEA0 = 55;
    public static final int NEA1 = 56;
    public static final int NEA2 = 57;
    public static final int NEA3 = 58;
    public static final int SIP_NO_IPSEC_CONFIG = 66;
    public static final int IMS_NULL = 67;
    public static final int SIP_NULL = 68;
    public static final int AES_GCM = 69;
    public static final int AES_GMAC = 70;
    public static final int AES_CBC = 71;
    public static final int DES_EDE3_CBC = 72;
    public static final int AES_EDE3_CBC = 73;
    public static final int HMAC_SHA1_96 = 74;
    public static final int HMAC_MD5_96 = 75;
    public static final int RTP = 85;
    public static final int SRTP_NULL = 86;
    public static final int SRTP_AES_COUNTER = 87;
    public static final int SRTP_AES_F8 = 88;
    public static final int SRTP_HMAC_SHA1 = 89;
    public static final int ENCR_AES_GCM_16 = 99;
    public static final int ENCR_AES_CBC = 100;
    public static final int AUTH_HMAC_SHA2_256_128 = 101;
    public static final int UNKNOWN = 113;
    public static final int OTHER = 114;
    public static final int ORYX = 124;

    public static interface $ {
        public static java.lang.String toString(int p0) { return null; }
        public static java.lang.String arrayToString(java.lang.Object p0) { return null; }
    }
}
