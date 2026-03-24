package com.android.internal.telephony.d2d;

public class Communicator implements com.android.internal.telephony.d2d.TransportProtocol.Callback {
    public static final int MESSAGE_CALL_RADIO_ACCESS_TYPE = 1;
    public static final int MESSAGE_CALL_AUDIO_CODEC = 2;
    public static final int MESSAGE_DEVICE_BATTERY_STATE = 3;
    public static final int MESSAGE_DEVICE_NETWORK_COVERAGE = 4;
    public static final int RADIO_ACCESS_TYPE_LTE = 1;
    public static final int RADIO_ACCESS_TYPE_IWLAN = 2;
    public static final int RADIO_ACCESS_TYPE_NR = 3;
    public static final int AUDIO_CODEC_EVS = 1;
    public static final int AUDIO_CODEC_AMR_WB = 2;
    public static final int AUDIO_CODEC_AMR_NB = 3;
    public static final int BATTERY_STATE_LOW = 1;
    public static final int BATTERY_STATE_GOOD = 2;
    public static final int BATTERY_STATE_CHARGING = 3;
    public static final int COVERAGE_POOR = 1;
    public static final int COVERAGE_GOOD = 2;
    public Communicator(java.util.List<com.android.internal.telephony.d2d.TransportProtocol> p0, com.android.internal.telephony.d2d.Communicator.Callback p1) {}
    public com.android.internal.telephony.d2d.TransportProtocol getActiveTransport() { return null; }
    public void onStateChanged(java.lang.String p0, int p1) {}
    public void onNegotiationSuccess(com.android.internal.telephony.d2d.TransportProtocol p0) {}
    public void onNegotiationFailed(com.android.internal.telephony.d2d.TransportProtocol p0) {}
    public void onMessagesReceived(java.util.Set<com.android.internal.telephony.d2d.Communicator.Message> p0) {}
    public void sendMessages(java.util.Set<com.android.internal.telephony.d2d.Communicator.Message> p0) {}
    public static java.lang.String messageToString(int p0) { return null; }
    public static java.lang.String valueToString(int p0, int p1) { return null; }
    public void setTransportActive(java.lang.String p0) {}
    public java.util.List<com.android.internal.telephony.d2d.TransportProtocol> getTransportProtocols() { return null; }

    public static interface Callback {
        public void onMessagesReceived(java.util.Set<com.android.internal.telephony.d2d.Communicator.Message> p0);
        public void onD2DAvailabilitychanged(boolean p0);
    }

    public static class Message {
        public Message(int p0, int p1) {}
        public int getType() { return 0; }
        public int getValue() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
