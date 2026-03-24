package android.telephony.ims;

@android.annotation.SystemApi
public final class ImsSsData implements android.os.Parcelable {
    private static final java.lang.String TAG = null;
    public static final int SS_CFU = 0;
    public static final int SS_CF_BUSY = 1;
    public static final int SS_CF_NO_REPLY = 2;
    public static final int SS_CF_NOT_REACHABLE = 3;
    public static final int SS_CF_ALL = 4;
    public static final int SS_CF_ALL_CONDITIONAL = 5;
    public static final int SS_CFUT = 6;
    public static final int SS_CLIP = 7;
    public static final int SS_CLIR = 8;
    public static final int SS_COLP = 9;
    public static final int SS_COLR = 10;
    public static final int SS_CNAP = 11;
    public static final int SS_WAIT = 12;
    public static final int SS_BAOC = 13;
    public static final int SS_BAOIC = 14;
    public static final int SS_BAOIC_EXC_HOME = 15;
    public static final int SS_BAIC = 16;
    public static final int SS_BAIC_ROAMING = 17;
    public static final int SS_ALL_BARRING = 18;
    public static final int SS_OUTGOING_BARRING = 19;
    public static final int SS_INCOMING_BARRING = 20;
    public static final int SS_INCOMING_BARRING_DN = 21;
    public static final int SS_INCOMING_BARRING_ANONYMOUS = 22;
    public static final int SS_ACTIVATION = 0;
    public static final int SS_DEACTIVATION = 1;
    public static final int SS_INTERROGATION = 2;
    public static final int SS_REGISTRATION = 3;
    public static final int SS_ERASURE = 4;
    public static final int SS_ALL_TELE_AND_BEARER_SERVICES = 0;
    public static final int SS_ALL_TELESEVICES = 1;
    public static final int SS_TELEPHONY = 2;
    public static final int SS_ALL_DATA_TELESERVICES = 3;
    public static final int SS_SMS_SERVICES = 4;
    public static final int SS_ALL_TELESERVICES_EXCEPT_SMS = 5;
    public static final int SERVICE_CLASS_NONE = 0;
    public static final int SERVICE_CLASS_VOICE = 1;
    public static final int SERVICE_CLASS_DATA = 2;
    public static final int SERVICE_CLASS_FAX = 4;
    public static final int SERVICE_CLASS_SMS = 8;
    public static final int SERVICE_CLASS_DATA_CIRCUIT_SYNC = 16;
    public static final int SERVICE_CLASS_DATA_CIRCUIT_ASYNC = 32;
    public static final int SERVICE_CLASS_DATA_PACKET_ACCESS = 64;
    public static final int SERVICE_CLASS_DATA_PAD = 128;
    public static final int RESULT_SUCCESS = 0;
    public final int serviceType = 0;
    public final int requestType = 0;
    public final int teleserviceType = 0;
    public final int serviceClass = 0;
    public final int result = 0;
    private int[] mSsInfo;
    private java.util.List<android.telephony.ims.ImsCallForwardInfo> mCfInfo;
    private java.util.List<android.telephony.ims.ImsSsInfo> mImsSsInfo;
    public static final android.os.Parcelable.Creator<android.telephony.ims.ImsSsData> CREATOR = null;
    public ImsSsData(int p0, int p1, int p2, int p3, int p4) {}
    private ImsSsData(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean isTypeCF() { return false; }
    public boolean isTypeCf() { return false; }
    public boolean isTypeUnConditional() { return false; }
    public boolean isTypeCW() { return false; }
    public boolean isTypeCw() { return false; }
    public boolean isTypeClip() { return false; }
    public boolean isTypeColr() { return false; }
    public boolean isTypeColp() { return false; }
    public boolean isTypeClir() { return false; }
    public boolean isTypeIcb() { return false; }
    public boolean isTypeBarring() { return false; }
    public boolean isTypeInterrogation() { return false; }
    public int getRequestType() { return 0; }
    public int getServiceType() { return 0; }
    public int getTeleserviceType() { return 0; }
    public int getServiceClass() { return 0; }
    public int getResult() { return 0; }
    public void setSuppServiceInfo(int[] p0) {}
    public void setImsSpecificSuppServiceInfo(android.telephony.ims.ImsSsInfo[] p0) {}
    public void setCallForwardingInfo(android.telephony.ims.ImsCallForwardInfo[] p0) {}
    public int[] getSuppServiceInfoCompat() { return null; }
    public java.util.List<android.telephony.ims.ImsSsInfo> getSuppServiceInfo() { return null; }
    public java.util.List<android.telephony.ims.ImsCallForwardInfo> getCallForwardInfo() { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private android.telephony.ims.ImsSsData mImsSsData;
        public Builder(int p0, int p1, int p2, int p3, int p4) {}
        public android.telephony.ims.ImsSsData.Builder setSuppServiceInfo(java.util.List<android.telephony.ims.ImsSsInfo> p0) { return null; }
        public android.telephony.ims.ImsSsData.Builder setCallForwardingInfo(java.util.List<android.telephony.ims.ImsCallForwardInfo> p0) { return null; }
        public android.telephony.ims.ImsSsData build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequestType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ServiceClassFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ServiceType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TeleserviceType {
    }
}
