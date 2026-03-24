package android.companion.virtual;

@android.annotation.SystemApi
public final class VirtualDeviceManager {
    public static final int LAUNCH_SUCCESS = 0;
    public static final int LAUNCH_FAILURE_PENDING_INTENT_CANCELED = 1;
    public static final int LAUNCH_FAILURE_NO_ACTIVITY = 2;
    public VirtualDeviceManager(android.companion.virtual.IVirtualDeviceManager p0, android.content.Context p1) {}
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public android.companion.virtual.VirtualDeviceManager.VirtualDevice createVirtualDevice(int p0, android.companion.virtual.VirtualDeviceParams p1) { return null; }

    public static interface ActivityListener {
        public void onTopActivityChanged(int p0, android.content.ComponentName p1);
        public void onDisplayEmpty(int p0);
    }

    private static class ActivityListenerDelegate {
        ActivityListenerDelegate(android.companion.virtual.VirtualDeviceManager.ActivityListener p0, java.util.concurrent.Executor p1) {}
        public void onTopActivityChanged(int p0, android.content.ComponentName p1) {}
        public void onDisplayEmpty(int p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface PendingIntentLaunchStatus {
    }

    public static class VirtualDevice implements java.lang.AutoCloseable {
        public void launchPendingIntent(int p0, android.app.PendingIntent p1, java.util.concurrent.Executor p2, java.util.function.IntConsumer p3) {}
        public android.hardware.display.VirtualDisplay createVirtualDisplay(int p0, int p1, int p2, android.view.Surface p3, int p4, java.util.concurrent.Executor p5, android.hardware.display.VirtualDisplay.Callback p6) { return null; }
        @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
        public void close() {}
        @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
        public android.hardware.input.VirtualKeyboard createVirtualKeyboard(android.hardware.display.VirtualDisplay p0, java.lang.String p1, int p2, int p3) { return null; }
        @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
        public android.hardware.input.VirtualMouse createVirtualMouse(android.hardware.display.VirtualDisplay p0, java.lang.String p1, int p2, int p3) { return null; }
        @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
        public android.hardware.input.VirtualTouchscreen createVirtualTouchscreen(android.hardware.display.VirtualDisplay p0, java.lang.String p1, int p2, int p3) { return null; }
        @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
        public android.companion.virtual.audio.VirtualAudioDevice createVirtualAudioDevice(android.hardware.display.VirtualDisplay p0, java.util.concurrent.Executor p1, android.companion.virtual.audio.VirtualAudioDevice.AudioConfigurationChangeCallback p2) { return null; }
        @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
        public void setShowPointerIcon(boolean p0) {}
        public void addActivityListener(java.util.concurrent.Executor p0, android.companion.virtual.VirtualDeviceManager.ActivityListener p1) {}
        public void removeActivityListener(android.companion.virtual.VirtualDeviceManager.ActivityListener p0) {}
    }
}
