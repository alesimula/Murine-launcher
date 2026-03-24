package com.android.internal.telephony;

public class DeviceStateMonitor extends android.os.Handler {
    protected static final boolean DBG = false;
    protected static final java.lang.String TAG = null;
    static final int EVENT_RIL_CONNECTED = 0;
    static final int EVENT_AUTOMOTIVE_PROJECTION_STATE_CHANGED = 1;
    static final int EVENT_SCREEN_STATE_CHANGED = 2;
    static final int EVENT_POWER_SAVE_MODE_CHANGED = 3;
    static final int EVENT_CHARGING_STATE_CHANGED = 4;
    static final int EVENT_TETHERING_STATE_CHANGED = 5;
    static final int EVENT_RADIO_AVAILABLE = 6;
    static final int EVENT_WIFI_CONNECTION_CHANGED = 7;
    static final int EVENT_UPDATE_ALWAYS_REPORT_SIGNAL_STRENGTH = 8;
    static final int EVENT_RADIO_ON = 9;
    static final int EVENT_RADIO_OFF_OR_NOT_AVAILABLE = 10;
    static final int CELL_INFO_INTERVAL_SHORT_MS = 2000;
    static final int CELL_INFO_INTERVAL_LONG_MS = 10000;
    public DeviceStateMonitor(com.android.internal.telephony.Phone p0) { super(); }
    public int computeCellInfoMinInterval() { return 0; }
    public boolean shouldEnableHighPowerConsumptionIndications() { return false; }
    public void setAlwaysReportSignalStrength(boolean p0) {}
    public void handleMessage(android.os.Message p0) {}
    public void registerForPhysicalChannelConfigNotifChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForPhysicalChannelConfigNotifChanged(android.os.Handler p0) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
}
