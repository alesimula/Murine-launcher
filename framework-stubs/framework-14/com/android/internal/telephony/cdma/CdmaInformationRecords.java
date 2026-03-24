package com.android.internal.telephony.cdma;

public final class CdmaInformationRecords {
    public java.lang.Object record;
    public static final int RIL_CDMA_DISPLAY_INFO_REC = 0;
    public static final int RIL_CDMA_CALLED_PARTY_NUMBER_INFO_REC = 1;
    public static final int RIL_CDMA_CALLING_PARTY_NUMBER_INFO_REC = 2;
    public static final int RIL_CDMA_CONNECTED_NUMBER_INFO_REC = 3;
    public static final int RIL_CDMA_SIGNAL_INFO_REC = 4;
    public static final int RIL_CDMA_REDIRECTING_NUMBER_INFO_REC = 5;
    public static final int RIL_CDMA_LINE_CONTROL_INFO_REC = 6;
    public static final int RIL_CDMA_EXTENDED_DISPLAY_INFO_REC = 7;
    public static final int RIL_CDMA_T53_CLIR_INFO_REC = 8;
    public static final int RIL_CDMA_T53_RELEASE_INFO_REC = 9;
    public static final int RIL_CDMA_T53_AUDIO_CONTROL_INFO_REC = 10;
    public CdmaInformationRecords(com.android.internal.telephony.cdma.CdmaInformationRecords.CdmaDisplayInfoRec p0) {}
    public CdmaInformationRecords(com.android.internal.telephony.cdma.CdmaInformationRecords.CdmaNumberInfoRec p0) {}
    public CdmaInformationRecords(com.android.internal.telephony.cdma.CdmaInformationRecords.CdmaSignalInfoRec p0) {}
    public CdmaInformationRecords(com.android.internal.telephony.cdma.CdmaInformationRecords.CdmaRedirectingNumberInfoRec p0) {}
    public CdmaInformationRecords(com.android.internal.telephony.cdma.CdmaInformationRecords.CdmaLineControlInfoRec p0) {}
    public CdmaInformationRecords(com.android.internal.telephony.cdma.CdmaInformationRecords.CdmaT53ClirInfoRec p0) {}
    public CdmaInformationRecords(com.android.internal.telephony.cdma.CdmaInformationRecords.CdmaT53AudioControlInfoRec p0) {}
    public CdmaInformationRecords(android.os.Parcel p0) {}
    public static java.lang.String idToString(int p0) { return null; }

    public static class CdmaDisplayInfoRec {
        public int id;
        public java.lang.String alpha;
        public CdmaDisplayInfoRec(int p0, java.lang.String p1) {}
        public java.lang.String toString() { return null; }
    }

    public static class CdmaLineControlInfoRec {
        public byte lineCtrlPolarityIncluded;
        public byte lineCtrlToggle;
        public byte lineCtrlReverse;
        public byte lineCtrlPowerDenial;
        public CdmaLineControlInfoRec(int p0, int p1, int p2, int p3) {}
        public java.lang.String toString() { return null; }
    }

    public static class CdmaNumberInfoRec {
        public int id;
        public java.lang.String number;
        public byte numberType;
        public byte numberPlan;
        public byte pi;
        public byte si;
        public CdmaNumberInfoRec(int p0, java.lang.String p1, int p2, int p3, int p4, int p5) {}
        public java.lang.String toString() { return null; }
    }

    public static class CdmaRedirectingNumberInfoRec {
        public static final int REASON_UNKNOWN = 0;
        public static final int REASON_CALL_FORWARDING_BUSY = 1;
        public static final int REASON_CALL_FORWARDING_NO_REPLY = 2;
        public static final int REASON_CALLED_DTE_OUT_OF_ORDER = 9;
        public static final int REASON_CALL_FORWARDING_BY_THE_CALLED_DTE = 10;
        public static final int REASON_CALL_FORWARDING_UNCONDITIONAL = 15;
        public com.android.internal.telephony.cdma.CdmaInformationRecords.CdmaNumberInfoRec numberInfoRec;
        public int redirectingReason;
        public CdmaRedirectingNumberInfoRec(java.lang.String p0, int p1, int p2, int p3, int p4, int p5) {}
        public java.lang.String toString() { return null; }
    }

    public static class CdmaSignalInfoRec {
        public boolean isPresent;
        public int signalType;
        public int alertPitch;
        public int signal;
        public CdmaSignalInfoRec() {}
        public CdmaSignalInfoRec(int p0, int p1, int p2, int p3) {}
        public java.lang.String toString() { return null; }
    }

    public static class CdmaT53AudioControlInfoRec {
        public byte uplink;
        public byte downlink;
        public CdmaT53AudioControlInfoRec(int p0, int p1) {}
        public java.lang.String toString() { return null; }
    }

    public static class CdmaT53ClirInfoRec {
        public byte cause;
        public CdmaT53ClirInfoRec(int p0) {}
        public java.lang.String toString() { return null; }
    }
}
