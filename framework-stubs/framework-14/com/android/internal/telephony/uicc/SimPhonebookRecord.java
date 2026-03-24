package com.android.internal.telephony.uicc;

public class SimPhonebookRecord {
    public SimPhonebookRecord(int p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, java.lang.String[] p4) {}
    public SimPhonebookRecord(android.hardware.radio.V1_6.PhonebookRecordInfo p0) {}
    public SimPhonebookRecord() {}
    public android.hardware.radio.V1_6.PhonebookRecordInfo toPhonebookRecordInfo() { return null; }
    public android.hardware.radio.sim.PhonebookRecordInfo toPhonebookRecordInfoAidl() { return null; }
    public int getRecordId() { return 0; }
    public java.lang.String getAlphaTag() { return null; }
    public java.lang.String getNumber() { return null; }
    public java.lang.String[] getEmails() { return null; }
    public java.lang.String[] getAdditionalNumbers() { return null; }
    public boolean isEmpty() { return false; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        public com.android.internal.telephony.uicc.SimPhonebookRecord build() { return null; }
        public com.android.internal.telephony.uicc.SimPhonebookRecord.Builder setRecordId(int p0) { return null; }
        public com.android.internal.telephony.uicc.SimPhonebookRecord.Builder setAlphaTag(java.lang.String p0) { return null; }
        public com.android.internal.telephony.uicc.SimPhonebookRecord.Builder setNumber(java.lang.String p0) { return null; }
        public com.android.internal.telephony.uicc.SimPhonebookRecord.Builder setEmails(java.lang.String[] p0) { return null; }
        public com.android.internal.telephony.uicc.SimPhonebookRecord.Builder setAdditionalNumbers(java.lang.String[] p0) { return null; }
    }
}
