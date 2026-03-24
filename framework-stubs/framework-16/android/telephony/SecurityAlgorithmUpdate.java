package android.telephony;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.security_algorithms_update_indications")
public final class SecurityAlgorithmUpdate implements android.os.Parcelable {
    public static final int CONNECTION_EVENT_CS_SIGNALLING_GSM = 0;
    public static final int CONNECTION_EVENT_PS_SIGNALLING_GPRS = 1;
    public static final int CONNECTION_EVENT_CS_SIGNALLING_3G = 2;
    public static final int CONNECTION_EVENT_PS_SIGNALLING_3G = 3;
    public static final int CONNECTION_EVENT_NAS_SIGNALLING_LTE = 4;
    public static final int CONNECTION_EVENT_AS_SIGNALLING_LTE = 5;
    public static final int CONNECTION_EVENT_VOLTE_SIP = 6;
    public static final int CONNECTION_EVENT_VOLTE_SIP_SOS = 7;
    public static final int CONNECTION_EVENT_VOLTE_RTP = 8;
    public static final int CONNECTION_EVENT_VOLTE_RTP_SOS = 9;
    public static final int CONNECTION_EVENT_NAS_SIGNALLING_5G = 10;
    public static final int CONNECTION_EVENT_AS_SIGNALLING_5G = 11;
    public static final int CONNECTION_EVENT_VONR_SIP = 12;
    public static final int CONNECTION_EVENT_VONR_SIP_SOS = 13;
    public static final int CONNECTION_EVENT_VONR_RTP = 14;
    public static final int CONNECTION_EVENT_VONR_RTP_SOS = 15;
    public static final int SECURITY_ALGORITHM_A50 = 0;
    public static final int SECURITY_ALGORITHM_A51 = 1;
    public static final int SECURITY_ALGORITHM_A52 = 2;
    public static final int SECURITY_ALGORITHM_A53 = 3;
    public static final int SECURITY_ALGORITHM_A54 = 4;
    public static final int SECURITY_ALGORITHM_GEA0 = 14;
    public static final int SECURITY_ALGORITHM_GEA1 = 15;
    public static final int SECURITY_ALGORITHM_GEA2 = 16;
    public static final int SECURITY_ALGORITHM_GEA3 = 17;
    public static final int SECURITY_ALGORITHM_GEA4 = 18;
    public static final int SECURITY_ALGORITHM_GEA5 = 19;
    public static final int SECURITY_ALGORITHM_UEA0 = 29;
    public static final int SECURITY_ALGORITHM_UEA1 = 30;
    public static final int SECURITY_ALGORITHM_UEA2 = 31;
    public static final int SECURITY_ALGORITHM_EEA0 = 41;
    public static final int SECURITY_ALGORITHM_EEA1 = 42;
    public static final int SECURITY_ALGORITHM_EEA2 = 43;
    public static final int SECURITY_ALGORITHM_EEA3 = 44;
    public static final int SECURITY_ALGORITHM_NEA0 = 55;
    public static final int SECURITY_ALGORITHM_NEA1 = 56;
    public static final int SECURITY_ALGORITHM_NEA2 = 57;
    public static final int SECURITY_ALGORITHM_NEA3 = 58;
    public static final int SECURITY_ALGORITHM_SIP_NO_IPSEC_CONFIG = 66;
    public static final int SECURITY_ALGORITHM_IMS_NULL = 67;
    public static final int SECURITY_ALGORITHM_SIP_NULL = 68;
    public static final int SECURITY_ALGORITHM_AES_GCM = 69;
    public static final int SECURITY_ALGORITHM_AES_GMAC = 70;
    public static final int SECURITY_ALGORITHM_AES_CBC = 71;
    public static final int SECURITY_ALGORITHM_DES_EDE3_CBC = 72;
    public static final int SECURITY_ALGORITHM_AES_EDE3_CBC = 73;
    public static final int SECURITY_ALGORITHM_HMAC_SHA1_96 = 74;
    public static final int SECURITY_ALGORITHM_HMAC_MD5_96 = 75;
    public static final int SECURITY_ALGORITHM_RTP = 85;
    public static final int SECURITY_ALGORITHM_SRTP_NULL = 86;
    public static final int SECURITY_ALGORITHM_SRTP_AES_COUNTER = 87;
    public static final int SECURITY_ALGORITHM_SRTP_AES_F8 = 88;
    public static final int SECURITY_ALGORITHM_SRTP_HMAC_SHA1 = 89;
    public static final int SECURITY_ALGORITHM_ENCR_AES_GCM_16 = 99;
    public static final int SECURITY_ALGORITHM_ENCR_AES_CBC = 100;
    public static final int SECURITY_ALGORITHM_AUTH_HMAC_SHA2_256_128 = 101;
    public static final int SECURITY_ALGORITHM_UNKNOWN = 113;
    public static final int SECURITY_ALGORITHM_OTHER = 114;
    public static final int SECURITY_ALGORITHM_ORYX = 124;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.SecurityAlgorithmUpdate> CREATOR = null;
    public SecurityAlgorithmUpdate(int p0, int p1, int p2, boolean p3) {}
    public int getConnectionEvent() { return 0; }
    public int getEncryption() { return 0; }
    public int getIntegrity() { return 0; }
    public boolean isUnprotectedEmergency() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConnectionEvent {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SecurityAlgorithm {
    }
}
