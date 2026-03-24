package com.android.internal.telephony;

public class RadioCapability {
    public static final int RC_PHASE_CONFIGURED = 0;
    public static final int RC_PHASE_START = 1;
    public static final int RC_PHASE_APPLY = 2;
    public static final int RC_PHASE_UNSOL_RSP = 3;
    public static final int RC_PHASE_FINISH = 4;
    public static final int RC_STATUS_NONE = 0;
    public static final int RC_STATUS_SUCCESS = 1;
    public static final int RC_STATUS_FAIL = 2;
    public RadioCapability(int p0, int p1, int p2, int p3, java.lang.String p4, int p5) {}
    public int getPhoneId() { return 0; }
    public int getVersion() { return 0; }
    public int getSession() { return 0; }
    public int getPhase() { return 0; }
    public int getRadioAccessFamily() { return 0; }
    public java.lang.String getLogicalModemUuid() { return null; }
    public int getStatus() { return 0; }
    public java.lang.String toString() { return null; }
}
