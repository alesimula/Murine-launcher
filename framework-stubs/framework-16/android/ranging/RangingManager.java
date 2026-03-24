package android.ranging;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public final class RangingManager {
    public static final int BLE_CS = 1;
    public static final int BLE_RSSI = 3;
    public static final int UWB = 0;
    public static final int WIFI_NAN_RTT = 2;
    RangingManager() {}
    @android.annotation.Nullable
    public android.ranging.RangingSession createRangingSession(java.util.concurrent.Executor p0, android.ranging.RangingSession.Callback p1) { return null; }
    @android.annotation.NonNull
    public void registerCapabilitiesCallback(java.util.concurrent.Executor p0, android.ranging.RangingManager.RangingCapabilitiesCallback p1) {}
    @android.annotation.NonNull
    public void unregisterCapabilitiesCallback(android.ranging.RangingManager.RangingCapabilitiesCallback p0) {}

    public static interface RangingCapabilitiesCallback {
        public void onRangingCapabilities(android.ranging.RangingCapabilities p0);
    }
}
