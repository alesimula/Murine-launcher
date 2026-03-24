package com.android.internal.telephony;

public interface NitzStateMachine {
    public void handleCountryDetected(java.lang.String p0);
    public void handleNetworkAvailable();
    public void handleNetworkUnavailable();
    public void handleCountryUnavailable();
    public void handleNitzReceived(com.android.internal.telephony.NitzSignal p0);
    public void handleAirplaneModeChanged(boolean p0);
    public void dumpState(java.io.PrintWriter p0);
    public void dumpLogs(java.io.FileDescriptor p0, com.android.internal.telephony.IndentingPrintWriter p1, java.lang.String[] p2);

    public static interface DeviceState {
        public int getNitzUpdateSpacingMillis();
        public int getNitzUpdateDiffMillis();
        public int getNitzNetworkDisconnectRetentionMillis();
        public boolean getIgnoreNitz();
        public long elapsedRealtimeMillis();
        public long currentTimeMillis();
    }

    public static class DeviceStateImpl implements com.android.internal.telephony.NitzStateMachine.DeviceState {
        public DeviceStateImpl(com.android.internal.telephony.Phone p0) {}
        public int getNitzUpdateSpacingMillis() { return 0; }
        public int getNitzUpdateDiffMillis() { return 0; }
        public int getNitzNetworkDisconnectRetentionMillis() { return 0; }
        public boolean getIgnoreNitz() { return false; }
        public long elapsedRealtimeMillis() { return 0L; }
        public long currentTimeMillis() { return 0L; }
    }
}
