package android.companion.virtual;

public class VirtualDeviceInternal {
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    VirtualDeviceInternal(android.companion.virtual.IVirtualDeviceManager p0, android.content.Context p1, int p2, android.companion.virtual.VirtualDeviceParams p3) throws android.os.RemoteException {}
    @android.annotation.RequiresPermission("android.permission.ACCESS_COMPUTER_CONTROL")
    VirtualDeviceInternal(android.companion.virtual.IVirtualDeviceManager p0, android.content.Context p1, android.companion.virtual.VirtualDeviceParams p2) throws android.os.RemoteException {}
    VirtualDeviceInternal(android.content.Context p0, android.companion.virtual.IVirtualDevice p1) {}
    int getDeviceId() { return 0; }
    @android.annotation.Nullable
    java.lang.String getPersistentDeviceId() { return null; }
    @android.annotation.NonNull
    android.content.Context createContext() { return null; }
    @android.annotation.NonNull
    java.util.List<android.companion.virtual.sensor.VirtualSensor> getVirtualSensorList() { return null; }
    void goToSleep() {}
    void wakeUp() {}
    void launchPendingIntent(int p0, android.app.PendingIntent p1, java.util.concurrent.Executor p2, java.util.function.IntConsumer p3) {}
    @android.annotation.Nullable
    android.hardware.display.VirtualDisplay createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, java.util.concurrent.Executor p1, android.hardware.display.VirtualDisplay.Callback p2) { return null; }
    void close() {}
    void setDevicePolicy(int p0, int p1) {}
    void addActivityPolicyExemption(android.companion.virtual.ActivityPolicyExemption p0) {}
    void removeActivityPolicyExemption(android.companion.virtual.ActivityPolicyExemption p0) {}
    void setDevicePolicyForDisplay(int p0, int p1, int p2) {}
    @android.annotation.NonNull
    android.hardware.input.VirtualDpad createVirtualDpad(android.hardware.input.VirtualDpadConfig p0) { return null; }
    @android.annotation.NonNull
    android.hardware.input.VirtualKeyboard createVirtualKeyboard(android.hardware.input.VirtualKeyboardConfig p0) { return null; }
    @android.annotation.NonNull
    android.hardware.input.VirtualMouse createVirtualMouse(android.hardware.input.VirtualMouseConfig p0) { return null; }
    @android.annotation.NonNull
    android.hardware.input.VirtualTouchscreen createVirtualTouchscreen(android.hardware.input.VirtualTouchscreenConfig p0) { return null; }
    @android.annotation.NonNull
    android.hardware.input.VirtualStylus createVirtualStylus(android.hardware.input.VirtualStylusConfig p0) { return null; }
    @android.annotation.NonNull
    android.hardware.input.VirtualRotaryEncoder createVirtualRotaryEncoder(android.hardware.input.VirtualRotaryEncoderConfig p0) { return null; }
    @android.annotation.NonNull
    android.hardware.input.VirtualNavigationTouchpad createVirtualNavigationTouchpad(android.hardware.input.VirtualNavigationTouchpadConfig p0) { return null; }
    @android.annotation.NonNull
    android.companion.virtual.audio.VirtualAudioDevice createVirtualAudioDevice(android.hardware.display.VirtualDisplay p0, java.util.concurrent.Executor p1, android.companion.virtual.audio.VirtualAudioDevice.AudioConfigurationChangeCallback p2) { return null; }
    @android.annotation.NonNull
    android.companion.virtual.camera.VirtualCamera createVirtualCamera(android.companion.virtual.camera.VirtualCameraConfig p0) { return null; }
    void setShowPointerIcon(boolean p0) {}
    void setDisplayImePolicy(int p0, int p1) {}
    void addActivityListener(java.util.concurrent.Executor p0, android.companion.virtual.VirtualDeviceManager.ActivityListener p1) {}
    void removeActivityListener(android.companion.virtual.VirtualDeviceManager.ActivityListener p0) {}
    void addSoundEffectListener(java.util.concurrent.Executor p0, android.companion.virtual.VirtualDeviceManager.SoundEffectListener p1) {}
    void removeSoundEffectListener(android.companion.virtual.VirtualDeviceManager.SoundEffectListener p0) {}
    void registerIntentInterceptor(android.content.IntentFilter p0, java.util.concurrent.Executor p1, android.companion.virtual.VirtualDeviceManager.IntentInterceptorCallback p2) {}
    void unregisterIntentInterceptor(android.companion.virtual.VirtualDeviceManager.IntentInterceptorCallback p0) {}

    private static class ActivityListenerDelegate {
        ActivityListenerDelegate(android.companion.virtual.VirtualDeviceManager.ActivityListener p0, java.util.concurrent.Executor p1) {}
        public void onTopActivityChanged(int p0, android.content.ComponentName p1) {}
        public void onTopActivityChanged(int p0, android.content.ComponentName p1, int p2) {}
        public void onDisplayEmpty(int p0) {}
        public void onActivityLaunchBlocked(int p0, android.content.ComponentName p1, android.os.UserHandle p2, android.content.IntentSender p3) {}
        public void onSecureWindowShown(int p0, android.content.ComponentName p1, android.os.UserHandle p2) {}
        public void onSecureWindowHidden(int p0) {}
    }

    private static class IntentInterceptorDelegate extends android.companion.virtual.IVirtualDeviceIntentInterceptor.Stub {
        public void onIntentIntercepted(android.content.Intent p0) {}
    }

    private static class SoundEffectListenerDelegate {
        public void onPlaySoundEffect(int p0) {}
    }
}
