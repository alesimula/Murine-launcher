package android.companion.virtual;

public final class VirtualDeviceManager {
    public static final java.lang.String ACTION_VIRTUAL_DEVICE_REMOVED = "android.companion.virtual.action.VIRTUAL_DEVICE_REMOVED";
    public static final java.lang.String EXTRA_VIRTUAL_DEVICE_ID = "android.companion.virtual.extra.VIRTUAL_DEVICE_ID";
    @android.annotation.SystemApi
    public static final int LAUNCH_SUCCESS = 0;
    @android.annotation.SystemApi
    public static final int LAUNCH_FAILURE_PENDING_INTENT_CANCELED = 1;
    @android.annotation.SystemApi
    public static final int LAUNCH_FAILURE_NO_ACTIVITY = 2;
    public VirtualDeviceManager(android.companion.virtual.IVirtualDeviceManager p0, android.content.Context p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public android.companion.virtual.VirtualDeviceManager.VirtualDevice createVirtualDevice(int p0, android.companion.virtual.VirtualDeviceParams p1) { return null; }
    public java.util.List<android.companion.virtual.VirtualDevice> getVirtualDevices() { return null; }
    public int getDevicePolicy(int p0, int p1) { return 0; }
    public int getDeviceIdForDisplayId(int p0) { return 0; }
    public boolean isValidVirtualDeviceId(int p0) { return false; }
    public int getAudioPlaybackSessionId(int p0) { return 0; }
    public int getAudioRecordingSessionId(int p0) { return 0; }
    public void playSoundEffect(int p0, int p1) {}

    @android.annotation.SystemApi
    public static interface ActivityListener {
        public void onTopActivityChanged(int p0, android.content.ComponentName p1);
        default public void onTopActivityChanged(int p0, android.content.ComponentName p1, int p2) {}
        public void onDisplayEmpty(int p0);
    }

    @android.annotation.SystemApi
    public static interface IntentInterceptorCallback {
        public void onIntentIntercepted(android.content.Intent p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface PendingIntentLaunchStatus {
    }

    @android.annotation.SystemApi
    public static interface SoundEffectListener {
        public void onPlaySoundEffect(int p0);
    }

    @android.annotation.SystemApi
    public static class VirtualDevice implements java.lang.AutoCloseable {
        public int getDeviceId() { return 0; }
        public android.content.Context createContext() { return null; }
        public java.util.List<android.companion.virtual.sensor.VirtualSensor> getVirtualSensorList() { return null; }
        public void launchPendingIntent(int p0, android.app.PendingIntent p1, java.util.concurrent.Executor p2, java.util.function.IntConsumer p3) {}
        @java.lang.Deprecated
        public android.hardware.display.VirtualDisplay createVirtualDisplay(int p0, int p1, int p2, android.view.Surface p3, int p4, java.util.concurrent.Executor p5, android.hardware.display.VirtualDisplay.Callback p6) { return null; }
        public android.hardware.display.VirtualDisplay createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, java.util.concurrent.Executor p1, android.hardware.display.VirtualDisplay.Callback p2) { return null; }
        @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
        public void close() {}
        @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
        public android.hardware.input.VirtualDpad createVirtualDpad(android.hardware.input.VirtualDpadConfig p0) { return null; }
        @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
        public android.hardware.input.VirtualKeyboard createVirtualKeyboard(android.hardware.input.VirtualKeyboardConfig p0) { return null; }
        @java.lang.Deprecated
        @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
        public android.hardware.input.VirtualKeyboard createVirtualKeyboard(android.hardware.display.VirtualDisplay p0, java.lang.String p1, int p2, int p3) { return null; }
        @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
        public android.hardware.input.VirtualMouse createVirtualMouse(android.hardware.input.VirtualMouseConfig p0) { return null; }
        @java.lang.Deprecated
        @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
        public android.hardware.input.VirtualMouse createVirtualMouse(android.hardware.display.VirtualDisplay p0, java.lang.String p1, int p2, int p3) { return null; }
        @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
        public android.hardware.input.VirtualTouchscreen createVirtualTouchscreen(android.hardware.input.VirtualTouchscreenConfig p0) { return null; }
        @java.lang.Deprecated
        @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
        public android.hardware.input.VirtualTouchscreen createVirtualTouchscreen(android.hardware.display.VirtualDisplay p0, java.lang.String p1, int p2, int p3) { return null; }
        @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
        public android.hardware.input.VirtualNavigationTouchpad createVirtualNavigationTouchpad(android.hardware.input.VirtualNavigationTouchpadConfig p0) { return null; }
        @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
        public android.companion.virtual.audio.VirtualAudioDevice createVirtualAudioDevice(android.hardware.display.VirtualDisplay p0, java.util.concurrent.Executor p1, android.companion.virtual.audio.VirtualAudioDevice.AudioConfigurationChangeCallback p2) { return null; }
        @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
        public void setShowPointerIcon(boolean p0) {}
        public void addActivityListener(java.util.concurrent.Executor p0, android.companion.virtual.VirtualDeviceManager.ActivityListener p1) {}
        public void removeActivityListener(android.companion.virtual.VirtualDeviceManager.ActivityListener p0) {}
        public void addSoundEffectListener(java.util.concurrent.Executor p0, android.companion.virtual.VirtualDeviceManager.SoundEffectListener p1) {}
        public void removeSoundEffectListener(android.companion.virtual.VirtualDeviceManager.SoundEffectListener p0) {}
        @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
        public void registerIntentInterceptor(android.content.IntentFilter p0, java.util.concurrent.Executor p1, android.companion.virtual.VirtualDeviceManager.IntentInterceptorCallback p2) {}
        @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
        public void unregisterIntentInterceptor(android.companion.virtual.VirtualDeviceManager.IntentInterceptorCallback p0) {}
    }
}
