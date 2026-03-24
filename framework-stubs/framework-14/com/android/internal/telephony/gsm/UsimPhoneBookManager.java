package com.android.internal.telephony.gsm;

public class UsimPhoneBookManager extends android.os.Handler implements com.android.internal.telephony.uicc.IccConstants {
    public UsimPhoneBookManager(com.android.internal.telephony.uicc.IccFileHandler p0, com.android.internal.telephony.uicc.AdnRecordCache p1) { super(); }
    public void reset() {}
    public java.util.ArrayList<com.android.internal.telephony.uicc.AdnRecord> loadEfFilesFromUsim() { return null; }
    public void invalidateCache() {}
    public void handleMessage(android.os.Message p0) {}

    private class File {
        File(com.android.internal.telephony.gsm.UsimPhoneBookManager p0, int p1, int p2, int p3, int p4) {}
        public int getParentTag() { return 0; }
        public int getEfid() { return 0; }
        public int getSfi() { return 0; }
        public int getIndex() { return 0; }
    }

    private class PbrRecord {
        PbrRecord(com.android.internal.telephony.gsm.UsimPhoneBookManager p0, byte[] p1) {}
        void parseTag(com.android.internal.telephony.gsm.SimTlv p0) {}
        void parseEfAndSFI(com.android.internal.telephony.gsm.SimTlv p0, int p1) {}
    }
}
