package android.hardware.devicestate;

public final class DeviceStateManagerGlobal {
    @android.annotation.Nullable
    public static android.hardware.devicestate.DeviceStateManagerGlobal getInstance() { return null; }
    public DeviceStateManagerGlobal(android.hardware.devicestate.IDeviceStateManager p0) {}
    public java.util.List<android.hardware.devicestate.DeviceState> getSupportedDeviceStates() { return null; }
    @android.annotation.RequiresPermission(value="android.permission.CONTROL_DEVICE_STATE", conditional=true)
    public void requestState(android.hardware.devicestate.DeviceStateRequest p0, java.util.concurrent.Executor p1, android.hardware.devicestate.DeviceStateRequest.Callback p2) {}
    @android.annotation.RequiresPermission(value="android.permission.CONTROL_DEVICE_STATE", conditional=true)
    public void cancelStateRequest() {}
    @android.annotation.RequiresPermission("android.permission.CONTROL_DEVICE_STATE")
    public void requestBaseStateOverride(android.hardware.devicestate.DeviceStateRequest p0, java.util.concurrent.Executor p1, android.hardware.devicestate.DeviceStateRequest.Callback p2) {}
    @android.annotation.RequiresPermission("android.permission.CONTROL_DEVICE_STATE")
    public void cancelBaseStateOverride() {}
    public void registerDeviceStateCallback(android.hardware.devicestate.DeviceStateManager.DeviceStateCallback p0, java.util.concurrent.Executor p1) {}
    public void unregisterDeviceStateCallback(android.hardware.devicestate.DeviceStateManager.DeviceStateCallback p0) {}
    public void onStateRequestOverlayDismissed(boolean p0) {}

    private static final class DeviceStateCallbackWrapper {
        DeviceStateCallbackWrapper(android.hardware.devicestate.DeviceStateManager.DeviceStateCallback p0, java.util.concurrent.Executor p1) {}
        void notifySupportedDeviceStatesChanged(java.util.List<android.hardware.devicestate.DeviceState> p0) {}
        void notifyDeviceStateChanged(android.hardware.devicestate.DeviceState p0) {}
    }

    private final class DeviceStateManagerCallback extends android.hardware.devicestate.IDeviceStateManagerCallback.Stub {
        public void onDeviceStateInfoChanged(android.hardware.devicestate.DeviceStateInfo p0) {}
        public void onRequestActive(android.os.IBinder p0) {}
        public void onRequestCanceled(android.os.IBinder p0) {}
    }

    private static final class DeviceStateRequestWrapper {
        DeviceStateRequestWrapper(android.hardware.devicestate.DeviceStateRequest p0, android.hardware.devicestate.DeviceStateRequest.Callback p1, java.util.concurrent.Executor p2) {}
        void notifyRequestActive() {}
        void notifyRequestCanceled() {}
    }
}
