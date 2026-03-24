package com.android.internal.telephony;

public class EventLogTags {
    public static final int PDP_BAD_DNS_ADDRESS = 50100;
    public static final int PDP_RADIO_RESET_COUNTDOWN_TRIGGERED = 50101;
    public static final int PDP_RADIO_RESET = 50102;
    public static final int PDP_CONTEXT_RESET = 50103;
    public static final int PDP_REREGISTER_NETWORK = 50104;
    public static final int PDP_SETUP_FAIL = 50105;
    public static final int CALL_DROP = 50106;
    public static final int DATA_NETWORK_REGISTRATION_FAIL = 50107;
    public static final int DATA_NETWORK_STATUS_ON_RADIO_OFF = 50108;
    public static final int PDP_NETWORK_DROP = 50109;
    public static final int CDMA_DATA_SETUP_FAILED = 50110;
    public static final int CDMA_DATA_DROP = 50111;
    public static final int GSM_RAT_SWITCHED = 50112;
    public static final int GSM_DATA_STATE_CHANGE = 50113;
    public static final int GSM_SERVICE_STATE_CHANGE = 50114;
    public static final int CDMA_DATA_STATE_CHANGE = 50115;
    public static final int CDMA_SERVICE_STATE_CHANGE = 50116;
    public static final int BAD_IP_ADDRESS = 50117;
    public static final int DATA_STALL_RECOVERY_GET_DATA_CALL_LIST = 50118;
    public static final int DATA_STALL_RECOVERY_CLEANUP = 50119;
    public static final int DATA_STALL_RECOVERY_REREGISTER = 50120;
    public static final int DATA_STALL_RECOVERY_RADIO_RESTART = 50121;
    public static final int DATA_STALL_RECOVERY_RADIO_RESTART_WITH_PROP = 50122;
    public static final int GSM_RAT_SWITCHED_NEW = 50123;
    public static final int EXP_DET_SMS_DENIED_BY_USER = 50125;
    public static final int EXP_DET_SMS_SENT_BY_USER = 50128;
    public static void writePdpBadDnsAddress(java.lang.String p0) {}
    public static void writePdpRadioResetCountdownTriggered(int p0) {}
    public static void writePdpRadioReset(int p0) {}
    public static void writePdpContextReset(int p0) {}
    public static void writePdpReregisterNetwork(int p0) {}
    public static void writePdpSetupFail(int p0, int p1, int p2) {}
    public static void writeCallDrop(int p0, int p1, int p2) {}
    public static void writeDataNetworkRegistrationFail(int p0, int p1) {}
    public static void writeDataNetworkStatusOnRadioOff(java.lang.String p0, int p1) {}
    public static void writePdpNetworkDrop(int p0, int p1) {}
    public static void writeCdmaDataSetupFailed(int p0, int p1, int p2) {}
    public static void writeCdmaDataDrop(int p0, int p1) {}
    public static void writeGsmRatSwitched(int p0, int p1, int p2) {}
    public static void writeGsmDataStateChange(java.lang.String p0, java.lang.String p1) {}
    public static void writeGsmServiceStateChange(int p0, int p1, int p2, int p3) {}
    public static void writeCdmaDataStateChange(java.lang.String p0, java.lang.String p1) {}
    public static void writeCdmaServiceStateChange(int p0, int p1, int p2, int p3) {}
    public static void writeBadIpAddress(java.lang.String p0) {}
    public static void writeDataStallRecoveryGetDataCallList(int p0) {}
    public static void writeDataStallRecoveryCleanup(int p0) {}
    public static void writeDataStallRecoveryReregister(int p0) {}
    public static void writeDataStallRecoveryRadioRestart(int p0) {}
    public static void writeDataStallRecoveryRadioRestartWithProp(int p0) {}
    public static void writeGsmRatSwitchedNew(int p0, int p1, int p2) {}
    public static void writeExpDetSmsDeniedByUser(java.lang.String p0) {}
    public static void writeExpDetSmsSentByUser(java.lang.String p0) {}
}
