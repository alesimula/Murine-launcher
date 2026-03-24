package android.hardware.devicestate;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.hardware.devicestate.feature.flags.device_state_property_api")
public final class DeviceStateManager {
    public static final int INVALID_DEVICE_STATE_IDENTIFIER = -1;
    public static final int MINIMUM_DEVICE_STATE_IDENTIFIER = 0;
    public static final int MAXIMUM_DEVICE_STATE_IDENTIFIER = 10000;
    public static final android.hardware.devicestate.DeviceState INVALID_DEVICE_STATE = null;
    public static final java.lang.String ACTION_SHOW_REAR_DISPLAY_OVERLAY = "com.android.intent.action.SHOW_REAR_DISPLAY_OVERLAY";
    public static final java.lang.String EXTRA_ORIGINAL_DEVICE_BASE_STATE = "original_device_base_state";
    public DeviceStateManager() {}
    @android.annotation.NonNull
    public java.util.List<android.hardware.devicestate.DeviceState> getSupportedDeviceStates() { return null; }
    @android.annotation.SuppressLint("RequiresPermission")
    @android.annotation.RequiresPermission(value="android.permission.CONTROL_DEVICE_STATE", conditional=true)
    public void requestState(android.hardware.devicestate.DeviceStateRequest p0, java.util.concurrent.Executor p1, android.hardware.devicestate.DeviceStateRequest.Callback p2) {}
    @android.annotation.SuppressLint("RequiresPermission")
    @android.annotation.RequiresPermission(value="android.permission.CONTROL_DEVICE_STATE", conditional=true)
    public void cancelStateRequest() {}
    @android.annotation.RequiresPermission("android.permission.CONTROL_DEVICE_STATE")
    public void requestBaseStateOverride(android.hardware.devicestate.DeviceStateRequest p0, java.util.concurrent.Executor p1, android.hardware.devicestate.DeviceStateRequest.Callback p2) {}
    @android.annotation.RequiresPermission("android.permission.CONTROL_DEVICE_STATE")
    public void cancelBaseStateOverride() {}
    public void registerCallback(java.util.concurrent.Executor p0, android.hardware.devicestate.DeviceStateManager.DeviceStateCallback p1) {}
    public void unregisterCallback(android.hardware.devicestate.DeviceStateManager.DeviceStateCallback p0) {}

    public static interface DeviceStateCallback {
        default public void onSupportedStatesChanged(java.util.List<android.hardware.devicestate.DeviceState> p0) {}
        public void onDeviceStateChanged(android.hardware.devicestate.DeviceState p0);
    }

    public static class FoldStateListener implements android.hardware.devicestate.DeviceStateManager.DeviceStateCallback {
        public FoldStateListener(android.content.Context p0) {}
        public FoldStateListener(android.content.Context p0, java.util.function.Consumer<java.lang.Boolean> p1) {}
        public final void onDeviceStateChanged(android.hardware.devicestate.DeviceState p0) {}
        @android.annotation.Nullable
        public java.lang.Boolean getFolded() { return null; }
    }
}
