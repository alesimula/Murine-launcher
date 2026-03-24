package com.android.internal.telephony.satellite;

public class SatelliteSessionController extends com.android.internal.telephony.StateMachine {
    public static final java.lang.String SATELLITE_STAY_AT_LISTENING_FROM_SENDING_MILLIS = "satellite_stay_at_listening_from_sending_millis";
    public static final long DEFAULT_SATELLITE_STAY_AT_LISTENING_FROM_SENDING_MILLIS = 180000L;
    public static final java.lang.String SATELLITE_STAY_AT_LISTENING_FROM_RECEIVING_MILLIS = "satellite_stay_at_listening_from_receiving_millis";
    public static final long DEFAULT_SATELLITE_STAY_AT_LISTENING_FROM_RECEIVING_MILLIS = 30000L;
    public static final long DEMO_MODE_SATELLITE_STAY_AT_LISTENING_MILLIS = 3000L;
    protected java.util.concurrent.atomic.AtomicBoolean mIsSendingTriggeredDuringTransferringState;
    final boolean mIsSatelliteSupported = false;
    public static com.android.internal.telephony.satellite.SatelliteSessionController getInstance() { return null; }
    public static com.android.internal.telephony.satellite.SatelliteSessionController make(android.content.Context p0, android.os.Looper p1, boolean p2) { return null; }
    protected SatelliteSessionController(android.content.Context p0, android.os.Looper p1, boolean p2, com.android.internal.telephony.satellite.SatelliteModemInterface p3, long p4, long p5) { super((java.lang.String)null); }
    public void onDatagramTransferStateChanged(int p0, int p1) {}
    public void onSatelliteEnabledStateChanged(boolean p0) {}
    public void registerForSatelliteModemStateChanged(android.telephony.satellite.ISatelliteStateCallback p0) {}
    public void unregisterForSatelliteModemStateChanged(android.telephony.satellite.ISatelliteStateCallback p0) {}
    boolean setSatelliteListeningTimeoutDuration(long p0) { return false; }
    boolean setSatelliteGatewayServicePackageName(java.lang.String p0) { return false; }
    public void setDemoMode(boolean p0) {}
    protected java.lang.String getWhatToString(int p0) { return null; }

    private static class DatagramTransferState {
        public int sendState;
        public int receiveState;
        DatagramTransferState(int p0, int p1) {}
    }

    private class IdleState extends com.android.internal.telephony.State {
        public void enter() {}
        public boolean processMessage(android.os.Message p0) { return false; }
        public void exit() {}
    }

    private class ListeningState extends com.android.internal.telephony.State {
        public void enter() {}
        public void exit() {}
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    private class PowerOffState extends com.android.internal.telephony.State {
        public void enter() {}
        public void exit() {}
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    private class SatelliteGatewayServiceConnection implements android.content.ServiceConnection {
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
        public void onBindingDied(android.content.ComponentName p0) {}
    }

    private class TransferringState extends com.android.internal.telephony.State {
        public void enter() {}
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    private class UnavailableState extends com.android.internal.telephony.State {
        public void enter() {}
        public boolean processMessage(android.os.Message p0) { return false; }
    }
}
