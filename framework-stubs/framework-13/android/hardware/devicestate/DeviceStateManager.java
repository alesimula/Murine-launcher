package android.hardware.devicestate;

public final class DeviceStateManager {
    public static final int INVALID_DEVICE_STATE = -1;
    public static final int MINIMUM_DEVICE_STATE = 0;
    public static final int MAXIMUM_DEVICE_STATE = 255;
    public static final java.lang.String ACTION_SHOW_REAR_DISPLAY_OVERLAY = "com.android.intent.action.SHOW_REAR_DISPLAY_OVERLAY";
    public static final java.lang.String EXTRA_ORIGINAL_DEVICE_BASE_STATE = "original_device_base_state";
    public DeviceStateManager() {}
    public int[] getSupportedStates() { return null; }
    @android.annotation.RequiresPermission(value="android.permission.CONTROL_DEVICE_STATE", conditional=true)
    public void requestState(android.hardware.devicestate.DeviceStateRequest p0, java.util.concurrent.Executor p1, android.hardware.devicestate.DeviceStateRequest.Callback p2) {}
    @android.annotation.RequiresPermission(value="android.permission.CONTROL_DEVICE_STATE", conditional=true)
    public void cancelStateRequest() {}
    @android.annotation.RequiresPermission("android.permission.CONTROL_DEVICE_STATE")
    public void requestBaseStateOverride(android.hardware.devicestate.DeviceStateRequest p0, java.util.concurrent.Executor p1, android.hardware.devicestate.DeviceStateRequest.Callback p2) {}
    @android.annotation.RequiresPermission("android.permission.CONTROL_DEVICE_STATE")
    public void cancelBaseStateOverride() {}
    public void registerCallback(java.util.concurrent.Executor p0, android.hardware.devicestate.DeviceStateManager.DeviceStateCallback p1) {}
    public void unregisterCallback(android.hardware.devicestate.DeviceStateManager.DeviceStateCallback p0) {}

    public static interface DeviceStateCallback {
        default public void onSupportedStatesChanged(int[] p0) {}
        default public void onBaseStateChanged(int p0) {}
        public void onStateChanged(int p0);
    }

    public static class FoldStateListener implements android.hardware.devicestate.DeviceStateManager.DeviceStateCallback {
        public FoldStateListener(android.content.Context p0) {}
        public FoldStateListener(android.content.Context p0, java.util.function.Consumer<java.lang.Boolean> p1) {}
        public final void onStateChanged(int p0) {}
        public java.lang.Boolean getFolded() { return null; }
    }
}
