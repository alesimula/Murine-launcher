package android.hardware.radio.network;

public @interface ConnectionEvent {
    public static final int CS_SIGNALLING_GSM = 0;
    public static final int PS_SIGNALLING_GPRS = 1;
    public static final int CS_SIGNALLING_3G = 2;
    public static final int PS_SIGNALLING_3G = 3;
    public static final int NAS_SIGNALLING_LTE = 4;
    public static final int AS_SIGNALLING_LTE = 5;
    public static final int VOLTE_SIP = 6;
    public static final int VOLTE_SIP_SOS = 7;
    public static final int VOLTE_RTP = 8;
    public static final int VOLTE_RTP_SOS = 9;
    public static final int NAS_SIGNALLING_5G = 10;
    public static final int AS_SIGNALLING_5G = 11;
    public static final int VONR_SIP = 12;
    public static final int VONR_SIP_SOS = 13;
    public static final int VONR_RTP = 14;
    public static final int VONR_RTP_SOS = 15;

    public static interface $ {
        public static java.lang.String toString(int p0) { return null; }
        public static java.lang.String arrayToString(java.lang.Object p0) { return null; }
    }
}
