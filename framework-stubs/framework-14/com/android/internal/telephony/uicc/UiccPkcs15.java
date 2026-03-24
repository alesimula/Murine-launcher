package com.android.internal.telephony.uicc;

public class UiccPkcs15 extends android.os.Handler {
    public static final java.lang.String AC_OID = "060A2A864886FC6B81480101";
    public UiccPkcs15(com.android.internal.telephony.uicc.UiccProfile p0, android.os.Message p1) { super(); }
    public void handleMessage(android.os.Message p0) {}
    public java.util.List<java.lang.String> getRules() { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    private class FileHandler extends android.os.Handler {
        final java.lang.String mPkcs15Path = null;
        protected static final int EVENT_SELECT_FILE_DONE = 101;
        protected static final int EVENT_READ_BINARY_DONE = 102;
        public FileHandler(com.android.internal.telephony.uicc.UiccPkcs15 p0, java.lang.String p1) { super(); }
        public boolean loadFile(java.lang.String p0, android.os.Message p1) { return false; }
        public void handleMessage(android.os.Message p0) {}
    }

    private class Pkcs15Selector extends android.os.Handler {
        public Pkcs15Selector(com.android.internal.telephony.uicc.UiccPkcs15 p0, android.os.Message p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
