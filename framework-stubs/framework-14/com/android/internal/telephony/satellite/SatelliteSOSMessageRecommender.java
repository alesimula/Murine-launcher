package com.android.internal.telephony.satellite;

public class SatelliteSOSMessageRecommender extends android.os.Handler {
    public static final java.lang.String EMERGENCY_CALL_TO_SOS_MSG_HYSTERESIS_TIMEOUT_MILLIS = "emergency_call_to_sos_msg_hysteresis_timeout_millis";
    public static final long DEFAULT_EMERGENCY_CALL_TO_SOS_MSG_HYSTERESIS_TIMEOUT_MILLIS = 20000L;
    protected static final int EVENT_CELLULAR_SERVICE_STATE_CHANGED = 2;
    protected static final int EVENT_TIME_OUT = 4;
    protected int mCountOfTimerStarted;
    public SatelliteSOSMessageRecommender(android.os.Looper p0) { super(); }
    protected SatelliteSOSMessageRecommender(android.os.Looper p0, com.android.internal.telephony.satellite.SatelliteController p1, com.android.ims.ImsManager p2, long p3) { super(); }
    public void handleMessage(android.os.Message p0) {}
    public void onEmergencyCallStarted(android.telecom.Connection p0, com.android.internal.telephony.Phone p1) {}
    public void onEmergencyCallConnectionStateChanged(java.lang.String p0, int p1) {}
}
