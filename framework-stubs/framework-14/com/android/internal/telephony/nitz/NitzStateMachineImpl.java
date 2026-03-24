package com.android.internal.telephony.nitz;

public final class NitzStateMachineImpl implements com.android.internal.telephony.NitzStateMachine {
    static final java.lang.String LOG_TAG = "NitzStateMachineImpl";
    static final boolean DBG = true;
    public static com.android.internal.telephony.nitz.NitzStateMachineImpl createInstance(com.android.internal.telephony.Phone p0) { return null; }
    public NitzStateMachineImpl(int p0, com.android.internal.telephony.NitzStateMachine.DeviceState p1, com.android.internal.telephony.nitz.NitzStateMachineImpl.NitzSignalInputFilterPredicate p2, com.android.internal.telephony.nitz.NitzStateMachineImpl.TimeZoneSuggester p3, com.android.internal.telephony.nitz.TimeServiceHelper p4) {}
    public void handleNetworkAvailable() {}
    public void handleNetworkUnavailable() {}
    public void handleCountryDetected(java.lang.String p0) {}
    public void handleCountryUnavailable() {}
    public void handleNitzReceived(com.android.internal.telephony.NitzSignal p0) {}
    public void handleAirplaneModeChanged(boolean p0) {}
    public void dumpState(java.io.PrintWriter p0) {}
    public void dumpLogs(java.io.FileDescriptor p0, com.android.internal.telephony.IndentingPrintWriter p1, java.lang.String[] p2) {}
    public com.android.internal.telephony.NitzData getLatestNitzData() { return null; }
    public com.android.internal.telephony.NitzData getLastNitzDataCleared() { return null; }

    @java.lang.FunctionalInterface
    public static interface NitzSignalInputFilterPredicate {
        public boolean mustProcessNitzSignal(com.android.internal.telephony.NitzSignal p0, com.android.internal.telephony.NitzSignal p1);
    }

    public static interface TimeZoneSuggester {
        public android.app.timezonedetector.TelephonyTimeZoneSuggestion getTimeZoneSuggestion(int p0, java.lang.String p1, com.android.internal.telephony.NitzSignal p2);
    }
}
