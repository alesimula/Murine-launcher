package com.android.internal.telephony;

public class HardwareConfig {
    static final java.lang.String LOG_TAG = "HardwareConfig";
    public static final int DEV_HARDWARE_TYPE_MODEM = 0;
    public static final int DEV_HARDWARE_TYPE_SIM = 1;
    public static final int DEV_MODEM_RIL_MODEL_SINGLE = 0;
    public static final int DEV_MODEM_RIL_MODEL_MULTIPLE = 1;
    public static final int DEV_HARDWARE_STATE_ENABLED = 0;
    public static final int DEV_HARDWARE_STATE_STANDBY = 1;
    public static final int DEV_HARDWARE_STATE_DISABLED = 2;
    public int type;
    public java.lang.String uuid;
    public int state;
    public int rilModel;
    public java.util.BitSet rat;
    public int maxActiveVoiceCall;
    public int maxActiveDataCall;
    public int maxStandby;
    public java.lang.String modemUuid;
    public HardwareConfig(int p0) {}
    public HardwareConfig(java.lang.String p0) {}
    public void assignModem(java.lang.String p0, int p1, int p2, int p3, int p4, int p5, int p6) {}
    public void assignSim(java.lang.String p0, int p1, java.lang.String p2) {}
    public java.lang.String toString() { return null; }
    public int compareTo(com.android.internal.telephony.HardwareConfig p0) { return 0; }
}
