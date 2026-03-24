package com.android.internal.telephony.imsphone;

public class ImsRttTextHandler extends android.os.Handler {
    public static final int MAX_CODEPOINTS_PER_SECOND = 30;
    public static final int MAX_BUFFERING_DELAY_MILLIS = 200;
    public static final int MAX_BUFFERED_CHARACTER_COUNT = 5;
    public void handleMessage(android.os.Message p0) {}
    public ImsRttTextHandler(android.os.Looper p0, com.android.internal.telephony.imsphone.ImsRttTextHandler.NetworkWriter p1) { super(); }
    public void sendToInCall(java.lang.String p0) {}
    public void initialize(android.telecom.Connection.RttTextStream p0) {}
    public void tearDown() {}
    public void setReadNotifier(java.util.concurrent.CountDownLatch p0) {}
    public java.lang.StringBuffer getBufferedTextToIncall() { return null; }
    public void setRttTextStream(android.telecom.Connection.RttTextStream p0) {}
    public int getSendToIncall() { return 0; }
    public java.lang.String getNetworkBufferText() { return null; }

    private class InCallReaderThread extends java.lang.Thread {
        public InCallReaderThread(com.android.internal.telephony.imsphone.ImsRttTextHandler p0, android.telecom.Connection.RttTextStream p1) { super(); }
        public void run() {}
    }

    public static interface NetworkWriter {
        public void write(java.lang.String p0);
    }
}
