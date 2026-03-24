package android.ranging;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public final class RangingSession implements java.lang.AutoCloseable {
    RangingSession() {}
    public void addDeviceToRangingSession(android.ranging.RangingConfig p0) {}
    public void close() {}
    public void reconfigureRangingInterval(int p0) {}
    public void removeDeviceFromRangingSession(android.ranging.RangingDevice p0) {}
    @android.annotation.NonNull
    public android.os.CancellationSignal start(android.ranging.RangingPreference p0) { return null; }
    public void stop() {}

    public static interface Callback {
        public static final int REASON_LOCAL_REQUEST = 1;
        public static final int REASON_NO_PEERS_FOUND = 5;
        public static final int REASON_REMOTE_REQUEST = 2;
        public static final int REASON_SYSTEM_POLICY = 4;
        public static final int REASON_UNKNOWN = 0;
        public static final int REASON_UNSUPPORTED = 3;
        public void onClosed(int p0);
        public void onOpenFailed(int p0);
        public void onOpened();
        public void onResults(android.ranging.RangingDevice p0, android.ranging.RangingData p1);
        public void onStarted(android.ranging.RangingDevice p0, int p1);
        public void onStopped(android.ranging.RangingDevice p0, int p1);
    }
}
