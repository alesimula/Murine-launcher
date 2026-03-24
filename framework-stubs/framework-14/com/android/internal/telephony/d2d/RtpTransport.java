package com.android.internal.telephony.d2d;

public class RtpTransport implements com.android.internal.telephony.d2d.TransportProtocol, com.android.internal.telephony.d2d.RtpAdapter.Callback {
    public static android.net.Uri DEVICE_STATE_RTP_HEADER_EXTENSION;
    public static android.net.Uri CALL_STATE_RTP_HEADER_EXTENSION;
    public static int DEVICE_STATE_LOCAL_IDENTIFIER;
    public static int CALL_STATE_LOCAL_IDENTIFIER;
    public static android.telephony.ims.RtpHeaderExtensionType DEVICE_STATE_RTP_HEADER_EXTENSION_TYPE;
    public static android.telephony.ims.RtpHeaderExtensionType CALL_STATE_RTP_HEADER_EXTENSION_TYPE;
    public static final int RTP_PARAMETER_BIT_OFFSET = 4;
    public static final byte RTP_CALL_STATE_MSG_RADIO_ACCESS_TYPE_BITS = 1;
    public static final byte RTP_CALL_STATE_MSG_CODEC_BITS = 2;
    public static final byte RTP_DEVICE_STATE_MSG_BATTERY_BITS = 1;
    public static final byte RTP_DEVICE_STATE_MSG_NETWORK_COVERAGE_BITS = 2;
    public static final byte RTP_RAT_VALUE_LTE_BITS = 16;
    public static final byte RTP_RAT_VALUE_WLAN_BITS = 32;
    public static final byte RTP_RAT_VALUE_NR_BITS = 48;
    public static final byte RTP_CODEC_VALUE_EVS_BITS = 16;
    public static final byte RTP_CODEC_VALUE_AMR_WB_BITS = 32;
    public static final byte RTP_CODEC_VALUE_AMR_NB_BITS = 48;
    public static final byte RTP_BATTERY_STATE_LOW_BITS = 0;
    public static final byte RTP_BATTERY_STATE_GOOD_BITS = 16;
    public static final byte RTP_BATTERY_STATE_CHARGING_BITS = 48;
    public static final byte RTP_NETWORK_COVERAGE_POOR_BITS = 0;
    public static final byte RTP_NETWORK_COVERAGE_GOOD_BITS = 16;
    public static final int PROTOCOL_STATUS_NEGOTIATION_REQUIRED = 1;
    public static final int PROTOCOL_STATUS_NEGOTIATION_WAITING_ON_PACKET = 2;
    public static final int PROTOCOL_STATUS_NEGOTIATION_COMPLETE = 3;
    public static final int PROTOCOL_STATUS_NEGOTIATION_FAILED = 4;
    public RtpTransport(com.android.internal.telephony.d2d.RtpAdapter p0, com.android.internal.telephony.d2d.Timeouts.Adapter p1, android.os.Handler p2, boolean p3) {}
    public void setCallback(com.android.internal.telephony.d2d.TransportProtocol.Callback p0) {}
    public void startNegotiation() {}
    public void sendMessages(java.util.Set<com.android.internal.telephony.d2d.Communicator.Message> p0) {}
    public void forceNegotiated() {}
    public void forceNotNegotiated() {}
    public void onRtpHeaderExtensionsReceived(java.util.Set<android.telephony.ims.RtpHeaderExtension> p0) {}
    public android.telephony.ims.RtpHeaderExtension generateRtpHeaderExtension(com.android.internal.telephony.d2d.Communicator.Message p0) { return null; }
}
