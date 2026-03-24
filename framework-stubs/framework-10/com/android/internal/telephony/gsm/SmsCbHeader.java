package com.android.internal.telephony.gsm;

public class SmsCbHeader {
    static final int PDU_HEADER_LENGTH = 6;
    static final int FORMAT_GSM = 1;
    static final int FORMAT_UMTS = 2;
    static final int FORMAT_ETWS_PRIMARY = 3;
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
    private final android.telephony.SmsCbEtwsInfo mEtwsInfo = null;
    private final android.telephony.SmsCbCmasInfo mCmasInfo = null;
    public SmsCbHeader(byte[] p0) throws java.lang.IllegalArgumentException {}
    int getGeographicalScope() { return 0; }
    int getSerialNumber() { return 0; }
    int getServiceCategory() { return 0; }
    int getDataCodingScheme() { return 0; }
    int getPageIndex() { return 0; }
    int getNumberOfPages() { return 0; }
    android.telephony.SmsCbEtwsInfo getEtwsInfo() { return null; }
    android.telephony.SmsCbCmasInfo getCmasInfo() { return null; }
    boolean isEmergencyMessage() { return false; }
    private boolean isEtwsMessage() { return false; }
    boolean isEtwsPrimaryNotification() { return false; }
    boolean isUmtsFormat() { return false; }
    private boolean isCmasMessage() { return false; }
    private boolean isEtwsPopupAlert() { return false; }
    private boolean isEtwsEmergencyUserAlert() { return false; }
    private int getEtwsWarningType() { return 0; }
    private int getCmasMessageClass() { return 0; }
    private int getCmasSeverity() { return 0; }
    private int getCmasUrgency() { return 0; }
    private int getCmasCertainty() { return 0; }
    public java.lang.String toString() { return null; }
}
