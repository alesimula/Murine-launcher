package com.android.internal.alsa;

public class AlsaCardsParser {
    private static final java.lang.String TAG = "AlsaCardsParser";
    protected static final boolean DEBUG = false;
    private static final java.lang.String kAlsaFolderPath = "/proc/asound";
    private static final java.lang.String kCardsFilePath = "/proc/asound/cards";
    private static final java.lang.String kDeviceAddressPrefix = "/dev/bus/usb/";
    private static com.android.internal.alsa.LineTokenizer mTokenizer;
    private java.util.ArrayList<com.android.internal.alsa.AlsaCardsParser.AlsaCardRecord> mCardRecords;
    public static final int SCANSTATUS_NOTSCANNED = -1;
    public static final int SCANSTATUS_SUCCESS = 0;
    public static final int SCANSTATUS_FAIL = 1;
    public static final int SCANSTATUS_EMPTY = 2;
    private int mScanStatus;
    public AlsaCardsParser() {}
    public int scan() { return 0; }
    public int getScanStatus() { return 0; }
    public com.android.internal.alsa.AlsaCardsParser.AlsaCardRecord findCardNumFor(java.lang.String p0) { return null; }
    private void Log(java.lang.String p0) {}

    public class AlsaCardRecord {
        private static final java.lang.String TAG = "AlsaCardRecord";
        private static final java.lang.String kUsbCardKeyStr = "at usb-";
        int mCardNum;
        java.lang.String mField1;
        java.lang.String mCardName;
        java.lang.String mCardDescription;
        private java.lang.String mUsbDeviceAddress;
        public AlsaCardRecord(com.android.internal.alsa.AlsaCardsParser p0) {}
        public int getCardNum() { return 0; }
        public java.lang.String getCardName() { return null; }
        public java.lang.String getCardDescription() { return null; }
        public void setDeviceAddress(java.lang.String p0) {}
        private boolean parse(java.lang.String p0, int p1) { return false; }
        boolean isUsb() { return false; }
        public java.lang.String textFormat() { return null; }
        public void log(int p0) {}
    }
}
