package com.android.internal.telephony;

public class CarrierActionAgent extends android.os.Handler {
    public static final int CARRIER_ACTION_SET_METERED_APNS_ENABLED = 0;
    public static final int CARRIER_ACTION_SET_RADIO_ENABLED = 1;
    public static final int CARRIER_ACTION_RESET = 2;
    public static final int CARRIER_ACTION_REPORT_DEFAULT_NETWORK_STATUS = 3;
    public static final int EVENT_APM_SETTINGS_CHANGED = 4;
    public static final int EVENT_MOBILE_DATA_SETTINGS_CHANGED = 5;
    public static final int EVENT_DATA_ROAMING_OFF = 6;
    public static final int EVENT_SIM_STATE_CHANGED = 7;
    public static final int EVENT_APN_SETTINGS_CHANGED = 8;
    public CarrierActionAgent(com.android.internal.telephony.Phone p0) { super(); }
    public void handleMessage(android.os.Message p0) {}
    public void carrierActionSetRadioEnabled(boolean p0) {}
    public void carrierActionSetMeteredApnsEnabled(boolean p0) {}
    public void carrierActionReportDefaultNetworkStatus(boolean p0) {}
    public void carrierActionReset() {}
    public void registerForCarrierAction(int p0, android.os.Handler p1, int p2, java.lang.Object p3, boolean p4) {}
    public void unregisterForCarrierAction(android.os.Handler p0, int p1) {}
    public android.database.ContentObserver getContentObserver() { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
}
