package com.android.internal.telephony.gsm;

public class SmsCbHeader {
    public static final int PDU_HEADER_LENGTH = 6;
    public static final int FORMAT_GSM = 1;
    public static final int FORMAT_UMTS = 2;
    public static final int FORMAT_ETWS_PRIMARY = 3;
    public SmsCbHeader(byte[] p0) throws java.lang.IllegalArgumentException {}
    public int getGeographicalScope() { return 0; }
    public int getSerialNumber() { return 0; }
    public int getServiceCategory() { return 0; }
    public int getDataCodingScheme() { return 0; }
    public com.android.internal.telephony.gsm.SmsCbHeader.DataCodingScheme getDataCodingSchemeStructedData() { return null; }
    public int getPageIndex() { return 0; }
    public int getNumberOfPages() { return 0; }
    public android.telephony.SmsCbEtwsInfo getEtwsInfo() { return null; }
    public android.telephony.SmsCbCmasInfo getCmasInfo() { return null; }
    public boolean isEmergencyMessage() { return false; }
    public boolean isEtwsPrimaryNotification() { return false; }
    public boolean isUmtsFormat() { return false; }
    public java.lang.String toString() { return null; }

    public static final class DataCodingScheme {
        public final int encoding = 0;
        public final java.lang.String language = null;
        public final boolean hasLanguageIndicator = false;
        public DataCodingScheme(int p0) {}
    }
}
