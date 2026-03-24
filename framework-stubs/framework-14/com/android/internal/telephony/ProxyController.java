package com.android.internal.telephony;

public class ProxyController {
    static final java.lang.String LOG_TAG = "ProxyController";
    static final int EVENT_START_RC_RESPONSE = 2;
    public static final int EVENT_FINISH_RC_RESPONSE = 4;
    public static final int EVENT_TIMEOUT = 5;
    public static final int EVENT_MULTI_SIM_CONFIG_CHANGED = 6;
    android.os.PowerManager.WakeLock mWakeLock;
    public final android.os.Handler mHandler = null;
    public static com.android.internal.telephony.ProxyController getInstance(android.content.Context p0) { return null; }
    public static com.android.internal.telephony.ProxyController getInstance() { return null; }
    public int getRadioAccessFamily(int p0) { return 0; }
    public boolean setRadioCapability(android.telephony.RadioAccessFamily[] p0) { return false; }
    public com.android.internal.telephony.SmsController getSmsController() { return null; }
    void onFinishRadioCapabilityResponse(android.os.Message p0) {}
    public boolean isWakeLockHeld() { return false; }
    public int getMaxRafSupported() { return 0; }
    public int getMinRafSupported() { return 0; }
}
