package com.android.internal.telephony.nitz;

public interface TimeServiceHelper {
    public void suggestDeviceTime(android.app.timedetector.TelephonyTimeSuggestion p0);
    public void maybeSuggestDeviceTimeZone(android.app.timezonedetector.TelephonyTimeZoneSuggestion p0);
    public void dumpLogs(com.android.internal.telephony.IndentingPrintWriter p0);
    public void dumpState(java.io.PrintWriter p0);
}
