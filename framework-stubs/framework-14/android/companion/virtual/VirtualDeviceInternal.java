package android.companion.virtual;

public class VirtualDeviceInternal {
    VirtualDeviceInternal(android.companion.virtual.IVirtualDeviceManager p0, android.content.Context p1, int p2, android.companion.virtual.VirtualDeviceParams p3) throws android.os.RemoteException {}
    int getDeviceId() { return 0; }
    android.content.Context createContext() { return null; }
    java.util.List<android.companion.virtual.sensor.VirtualSensor> getVirtualSensorList() { return null; }
    void launchPendingIntent(int p0, android.app.PendingIntent p1, java.util.concurrent.Executor p2, java.util.function.IntConsumer p3) {}
    android.hardware.display.VirtualDisplay createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, java.util.concurrent.Executor p1, android.hardware.display.VirtualDisplay.Callback p2) { return null; }
    void close() {}
    android.hardware.input.VirtualDpad createVirtualDpad(android.hardware.input.VirtualDpadConfig p0) { return null; }
    android.hardware.input.VirtualKeyboard createVirtualKeyboard(android.hardware.input.VirtualKeyboardConfig p0) { return null; }
    android.hardware.input.VirtualMouse createVirtualMouse(android.hardware.input.VirtualMouseConfig p0) { return null; }
    android.hardware.input.VirtualTouchscreen createVirtualTouchscreen(android.hardware.input.VirtualTouchscreenConfig p0) { return null; }
    android.hardware.input.VirtualNavigationTouchpad createVirtualNavigationTouchpad(android.hardware.input.VirtualNavigationTouchpadConfig p0) { return null; }
    android.companion.virtual.audio.VirtualAudioDevice createVirtualAudioDevice(android.hardware.display.VirtualDisplay p0, java.util.concurrent.Executor p1, android.companion.virtual.audio.VirtualAudioDevice.AudioConfigurationChangeCallback p2) { return null; }
    void setShowPointerIcon(boolean p0) {}
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
    }

    private static class IntentInterceptorDelegate extends android.companion.virtual.IVirtualDeviceIntentInterceptor.Stub {
        public void onIntentIntercepted(android.content.Intent p0) {}
    }

    private static class SoundEffectListenerDelegate {
        public void onPlaySoundEffect(int p0) {}
    }
}
