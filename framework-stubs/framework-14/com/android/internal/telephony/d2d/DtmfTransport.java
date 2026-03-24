package com.android.internal.telephony.d2d;

public class DtmfTransport implements com.android.internal.telephony.d2d.TransportProtocol {
    public static final java.lang.String DMTF_PROTOCOL_VERSION = "A";
    public static final char DTMF_MESSAGE_START = 'A';
    public static final char DTMF_MESSAGE_DELIMITER = 'D';
    public static final java.lang.String DMTF_PROBE_MESSAGE = "AAD";
    public static final java.lang.String DTMF_MESSAGE_RAT = "A";
    public static final java.lang.String DTMF_MESSAGE_RAT_LTE = "A";
    public static final java.lang.String DTMF_MESSAGE_RAT_IWLAN = "B";
    public static final java.lang.String DTMF_MESSAGE_RAT_NR = "C";
    public static final java.lang.String DTMF_MESSAGE_CODEC = "B";
    public static final java.lang.String DTMF_MESSAGE_CODEC_EVS = "A";
    public static final java.lang.String DTMF_MESSAGE_CODEC_AMR_WB = "B";
    public static final java.lang.String DTMF_MESSAGE_CODEC_AMR_NB = "C";
    public static final java.lang.String DTMF_MESSAGE_BATERY = "C";
    public static final java.lang.String DTMF_MESSAGE_BATTERY_LOW = "A";
    public static final java.lang.String DTMF_MESSAGE_BATTERY_GOOD = "B";
    public static final java.lang.String DTMF_MESSAGE_BATTERY_CHARGING = "C";
    public static final java.lang.String DTMF_MESSAGE_SERVICE = "AA";
    public static final java.lang.String DTMF_MESSAGE_SERVICE_GOOD = "A";
    public static final java.lang.String DTMF_MESSAGE_SERVICE_POOR = "B";
    public static final com.android.internal.telephony.BiMap<android.util.Pair<java.lang.String, java.lang.String>, com.android.internal.telephony.d2d.Communicator.Message> DTMF_TO_MESSAGE = null;
    public static final int STATE_IDLE = 0;
    public static final int STATE_NEGOTIATING = 1;
    public static final int STATE_NEGOTIATED = 2;
    public static final int STATE_NEGOTIATION_FAILED = 3;
    public static final int RECEIVE_STATE_IDLE = 0;
    public static final int RECEIVE_STATE_MESSAGE_TYPE = 1;
    public static final int RECEIVE_STATE_MESSAGE_VALUE = 2;
    public DtmfTransport(com.android.internal.telephony.d2d.DtmfAdapter p0, com.android.internal.telephony.d2d.Timeouts.Adapter p1, java.util.concurrent.ScheduledExecutorService p2) {}
    public void setCallback(com.android.internal.telephony.d2d.TransportProtocol.Callback p0) {}
    public void startNegotiation() {}
    public void sendMessages(java.util.Set<com.android.internal.telephony.d2d.Communicator.Message> p0) {}
    public int getTransportState() { return 0; }
    public void onDtmfReceived(char p0) {}
    public char[] getMessageDigits(com.android.internal.telephony.d2d.Communicator.Message p0) { return null; }
    public com.android.internal.telephony.d2d.Communicator.Message extractMessage(java.lang.String p0, java.lang.String p1) { return null; }
    public void forceNegotiated() {}
    public void forceNotNegotiated() {}
}
