package com.android.internal.alsa;

public class AlsaCardsParser {
    protected static final boolean DEBUG = false;
    public static final int SCANSTATUS_NOTSCANNED = -1;
    public static final int SCANSTATUS_SUCCESS = 0;
    public static final int SCANSTATUS_FAIL = 1;
    public static final int SCANSTATUS_EMPTY = 2;
    public AlsaCardsParser() {}
    public int scan() { return 0; }
    public int getScanStatus() { return 0; }
    public com.android.internal.alsa.AlsaCardsParser.AlsaCardRecord findCardNumFor(java.lang.String p0) { return null; }

    public class AlsaCardRecord {
        int mCardNum;
        java.lang.String mField1;
        java.lang.String mCardName;
        java.lang.String mCardDescription;
        public AlsaCardRecord(com.android.internal.alsa.AlsaCardsParser p0) {}
        public int getCardNum() { return 0; }
        public java.lang.String getCardName() { return null; }
        public java.lang.String getCardDescription() { return null; }
        public void setDeviceAddress(java.lang.String p0) {}
        boolean isUsb() { return false; }
        public java.lang.String textFormat() { return null; }
        public void log(int p0) {}
    }
}
