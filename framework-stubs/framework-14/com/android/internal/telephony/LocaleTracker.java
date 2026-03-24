package com.android.internal.telephony;

public class LocaleTracker extends android.os.Handler {
    public void handleMessage(android.os.Message p0) {}
    public LocaleTracker(com.android.internal.telephony.Phone p0, com.android.internal.telephony.NitzStateMachine p1, android.os.Looper p2) { super(); }
    public java.lang.String getCurrentCountry() { return null; }
    public void updateOperatorNumeric(java.lang.String p0) {}
    public static long getCellInfoDelayTime(int p0) { return 0L; }
    public boolean isTracking() { return false; }
    public java.lang.String getLastKnownCountryIso() { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public java.lang.String getCountryOverride() { return null; }
}
