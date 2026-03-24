package com.android.internal.telephony.cdma;

public class EriManager {
    public static final int ERI_FROM_XML = 0;
    static final int ERI_FROM_FILE_SYSTEM = 1;
    static final int ERI_FROM_MODEM = 2;
    public EriManager(com.android.internal.telephony.Phone p0, int p1) {}
    public void dispose() {}
    public void loadEriFile() {}
    public int getEriFileVersion() { return 0; }
    public int getEriNumberOfEntries() { return 0; }
    public int getEriFileType() { return 0; }
    public boolean isEriFileLoaded() { return false; }
    public int getCdmaEriIconIndex(int p0, int p1) { return 0; }
    public int getCdmaEriIconMode(int p0, int p1) { return 0; }
    public java.lang.String getCdmaEriText(int p0, int p1) { return null; }

    class EriDisplayInformation {
        int mEriIconIndex;
        int mEriIconMode;
        java.lang.String mEriIconText;
        EriDisplayInformation(com.android.internal.telephony.cdma.EriManager p0, int p1, int p2, java.lang.String p3) {}
        public java.lang.String toString() { return null; }
    }

    class EriFile {
        int mVersionNumber;
        int mNumberOfEriEntries;
        int mEriFileType;
        java.lang.String[] mCallPromptId;
        java.util.HashMap<java.lang.Integer, com.android.internal.telephony.cdma.EriInfo> mRoamIndTable;
        EriFile(com.android.internal.telephony.cdma.EriManager p0) {}
    }
}
