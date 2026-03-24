package com.android.internal.telephony.gsm;

public class SsData {
    public com.android.internal.telephony.gsm.SsData.ServiceType serviceType;
    public com.android.internal.telephony.gsm.SsData.RequestType requestType;
    public com.android.internal.telephony.gsm.SsData.TeleserviceType teleserviceType;
    public int serviceClass;
    public int result;
    public int[] ssInfo;
    public com.android.internal.telephony.CallForwardInfo[] cfInfo;
    public SsData() {}
    public com.android.internal.telephony.gsm.SsData.ServiceType ServiceTypeFromRILInt(int p0) { return null; }
    public com.android.internal.telephony.gsm.SsData.RequestType RequestTypeFromRILInt(int p0) { return null; }
    public com.android.internal.telephony.gsm.SsData.TeleserviceType TeleserviceTypeFromRILInt(int p0) { return null; }
    public java.lang.String toString() { return null; }

    public static enum RequestType {
        SS_ACTIVATION,
        SS_DEACTIVATION,
        SS_INTERROGATION,
        SS_REGISTRATION,
        SS_ERASURE;
        public boolean isTypeInterrogation() { return false; }
    }

    public static enum ServiceType {
        SS_CFU,
        SS_CF_BUSY,
        SS_CF_NO_REPLY,
        SS_CF_NOT_REACHABLE,
        SS_CF_ALL,
        SS_CF_ALL_CONDITIONAL,
        SS_CLIP,
        SS_CLIR,
        SS_COLP,
        SS_COLR,
        SS_WAIT,
        SS_BAOC,
        SS_BAOIC,
        SS_BAOIC_EXC_HOME,
        SS_BAIC,
        SS_BAIC_ROAMING,
        SS_ALL_BARRING,
        SS_OUTGOING_BARRING,
        SS_INCOMING_BARRING;
        public boolean isTypeCF() { return false; }
        public boolean isTypeUnConditional() { return false; }
        public boolean isTypeCW() { return false; }
        public boolean isTypeClip() { return false; }
        public boolean isTypeClir() { return false; }
        public boolean isTypeBarring() { return false; }
    }

    public static enum TeleserviceType {
        SS_ALL_TELE_AND_BEARER_SERVICES,
        SS_ALL_TELESEVICES,
        SS_TELEPHONY,
        SS_ALL_DATA_TELESERVICES,
        SS_SMS_SERVICES,
        SS_ALL_TELESERVICES_EXCEPT_SMS;
    }
}
