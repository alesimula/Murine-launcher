package com.android.internal.telephony;

public class CallStateException extends java.lang.Exception {
    public static final int ERROR_INVALID = -1;
    public static final int ERROR_OUT_OF_SERVICE = 1;
    public static final int ERROR_POWER_OFF = 2;
    public static final int ERROR_ALREADY_DIALING = 3;
    public static final int ERROR_CALL_RINGING = 4;
    public static final int ERROR_CALLING_DISABLED = 5;
    public static final int ERROR_TOO_MANY_CALLS = 6;
    public static final int ERROR_OTASP_PROVISIONING_IN_PROCESS = 7;
    public static final int ERROR_FDN_BLOCKED = 8;
    public CallStateException() { super(); }
    public CallStateException(java.lang.String p0) { super(); }
    public CallStateException(int p0, java.lang.String p1) { super(); }
    public int getError() { return 0; }
}
