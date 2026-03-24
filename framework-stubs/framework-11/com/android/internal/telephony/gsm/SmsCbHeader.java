package com.android.internal.telephony.gsm;

public class SmsCbHeader {
    private static final java.lang.String[] LANGUAGE_CODES_GROUP_0 = null;
    private static final java.lang.String[] LANGUAGE_CODES_GROUP_2 = null;
    public static final int PDU_HEADER_LENGTH = 6;
    public static final int FORMAT_GSM = 1;
    public static final int FORMAT_UMTS = 2;
    public static final int FORMAT_ETWS_PRIMARY = 3;
    private static final int MESSAGE_TYPE_CBS_MESSAGE = 1;
    private static final int PDU_LENGTH_GSM = 88;
    private static final int PDU_LENGTH_ETWS = 56;
    private final int mGeographicalScope = 0;
    private final int mSerialNumber = 0;
    private final int mMessageIdentifier = 0;
    private final int mDataCodingScheme = 0;
    private final int mPageIndex = 0;
    private final int mNrOfPages = 0;
    private final int mFormat = 0;
    private com.android.internal.telephony.gsm.SmsCbHeader.DataCodingScheme mDataCodingSchemeStructedData;
    private final android.telephony.SmsCbEtwsInfo mEtwsInfo = null;
    private final android.telephony.SmsCbCmasInfo mCmasInfo = null;
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
    private boolean isEtwsMessage() { return false; }
    public boolean isEtwsPrimaryNotification() { return false; }
    public boolean isUmtsFormat() { return false; }
    private boolean isCmasMessage() { return false; }
    private boolean isEtwsPopupAlert() { return false; }
    private boolean isEtwsEmergencyUserAlert() { return false; }
    private int getEtwsWarningType() { return 0; }
    private int getCmasMessageClass() { return 0; }
    private int getCmasSeverity() { return 0; }
    private int getCmasUrgency() { return 0; }
    private int getCmasCertainty() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class DataCodingScheme {
        public final int encoding = 0;
        public final java.lang.String language = null;
        public final boolean hasLanguageIndicator = false;
        public DataCodingScheme(int p0) {}
    }
}
