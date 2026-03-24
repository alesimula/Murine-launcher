package com.google.android.mms.pdu;

public class PduBody {
    private java.util.Vector<com.google.android.mms.pdu.PduPart> mParts;
    private java.util.Map<java.lang.String, com.google.android.mms.pdu.PduPart> mPartMapByContentId;
    private java.util.Map<java.lang.String, com.google.android.mms.pdu.PduPart> mPartMapByContentLocation;
    private java.util.Map<java.lang.String, com.google.android.mms.pdu.PduPart> mPartMapByName;
    private java.util.Map<java.lang.String, com.google.android.mms.pdu.PduPart> mPartMapByFileName;
    public PduBody() {}
    private void putPartToMaps(com.google.android.mms.pdu.PduPart p0) {}
    public boolean addPart(com.google.android.mms.pdu.PduPart p0) { return false; }
    public void addPart(int p0, com.google.android.mms.pdu.PduPart p1) {}
    public com.google.android.mms.pdu.PduPart removePart(int p0) { return null; }
    public void removeAll() {}
    public com.google.android.mms.pdu.PduPart getPart(int p0) { return null; }
    public int getPartIndex(com.google.android.mms.pdu.PduPart p0) { return 0; }
    public int getPartsNum() { return 0; }
    public com.google.android.mms.pdu.PduPart getPartByContentId(java.lang.String p0) { return null; }
    public com.google.android.mms.pdu.PduPart getPartByContentLocation(java.lang.String p0) { return null; }
    public com.google.android.mms.pdu.PduPart getPartByName(java.lang.String p0) { return null; }
    public com.google.android.mms.pdu.PduPart getPartByFileName(java.lang.String p0) { return null; }
}
