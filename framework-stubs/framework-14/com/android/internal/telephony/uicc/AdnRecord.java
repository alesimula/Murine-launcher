package com.android.internal.telephony.uicc;

public class AdnRecord implements android.os.Parcelable {
    static final java.lang.String LOG_TAG = "AdnRecord";
    java.lang.String mAlphaTag;
    java.lang.String mNumber;
    java.lang.String[] mEmails;
    java.lang.String[] mAdditionalNumbers;
    int mExtRecord;
    int mEfid;
    int mRecordNumber;
    static final int FOOTER_SIZE_BYTES = 14;
    static final int MAX_NUMBER_SIZE_BYTES = 11;
    static final int EXT_RECORD_LENGTH_BYTES = 13;
    static final int EXT_RECORD_TYPE_ADDITIONAL_DATA = 2;
    static final int EXT_RECORD_TYPE_MASK = 3;
    static final int MAX_EXT_CALLED_PARTY_LENGTH = 10;
    static final int ADN_BCD_NUMBER_LENGTH = 0;
    static final int ADN_TON_AND_NPI = 1;
    static final int ADN_DIALING_NUMBER_START = 2;
    static final int ADN_DIALING_NUMBER_END = 11;
    static final int ADN_CAPABILITY_ID = 12;
    static final int ADN_EXTENSION_ID = 13;
    public static final android.os.Parcelable.Creator<com.android.internal.telephony.uicc.AdnRecord> CREATOR = null;
    public static int getMaxAlphaTagBytes(int p0) { return 0; }
    public static byte[] encodeAlphaTag(java.lang.String p0) { return null; }
    public static java.lang.String decodeAlphaTag(byte[] p0, int p1, int p2) { return null; }
    public static int getMaxPhoneNumberDigits() { return 0; }
    public AdnRecord(byte[] p0) {}
    public AdnRecord(int p0, int p1, byte[] p2) {}
    public AdnRecord(java.lang.String p0, java.lang.String p1) {}
    public AdnRecord(java.lang.String p0, java.lang.String p1, java.lang.String[] p2) {}
    public AdnRecord(java.lang.String p0, java.lang.String p1, java.lang.String[] p2, java.lang.String[] p3) {}
    public AdnRecord(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String[] p4) {}
    public AdnRecord(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String[] p4, java.lang.String[] p5) {}
    public AdnRecord(int p0, int p1, java.lang.String p2, java.lang.String p3) {}
    public java.lang.String getAlphaTag() { return null; }
    public int getEfid() { return 0; }
    public int getRecId() { return 0; }
    public void setRecId(int p0) {}
    public java.lang.String getNumber() { return null; }
    public void setNumber(java.lang.String p0) {}
    public java.lang.String[] getEmails() { return null; }
    public void setEmails(java.lang.String[] p0) {}
    public java.lang.String[] getAdditionalNumbers() { return null; }
    public void setAdditionalNumbers(java.lang.String[] p0) {}
    public java.lang.String toString() { return null; }
    public boolean isEmpty() { return false; }
    public boolean hasExtendedRecord() { return false; }
    public boolean isEqual(com.android.internal.telephony.uicc.AdnRecord p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public byte[] buildAdnString(int p0) { return null; }
    public void appendExtRecord(byte[] p0) {}
}
