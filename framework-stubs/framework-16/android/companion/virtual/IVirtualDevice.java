package android.companion.virtual;

public interface IVirtualDevice extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.virtual.IVirtualDevice";
    public int getAssociationId() throws android.os.RemoteException;
    public int getDeviceId() throws android.os.RemoteException;
    public java.lang.String getPersistentDeviceId() throws android.os.RemoteException;
    public int[] getDisplayIds() throws android.os.RemoteException;
    public int getDevicePolicy(int p0) throws android.os.RemoteException;
    public boolean hasCustomAudioInputSupport() throws android.os.RemoteException;
    public boolean canCreateMirrorDisplays() throws android.os.RemoteException;
    public void goToSleep() throws android.os.RemoteException;
    public void wakeUp() throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;
    public void setDevicePolicy(int p0, int p1) throws android.os.RemoteException;
    public void addActivityPolicyExemption(android.companion.virtual.ActivityPolicyExemption p0) throws android.os.RemoteException;
    public void removeActivityPolicyExemption(android.companion.virtual.ActivityPolicyExemption p0) throws android.os.RemoteException;
    public void setDevicePolicyForDisplay(int p0, int p1, int p2) throws android.os.RemoteException;
    public void onAudioSessionStarting(int p0, android.companion.virtual.audio.IAudioRoutingCallback p1, android.companion.virtual.audio.IAudioConfigChangedCallback p2) throws android.os.RemoteException;
    public void onAudioSessionEnded() throws android.os.RemoteException;
    public int createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, android.hardware.display.IVirtualDisplayCallback p1) throws android.os.RemoteException;
    public android.hardware.input.IVirtualInputDevice createVirtualDpad(android.hardware.input.VirtualDpadConfig p0, android.os.IBinder p1) throws android.os.RemoteException;
    public android.hardware.input.IVirtualInputDevice createVirtualKeyboard(android.hardware.input.VirtualKeyboardConfig p0, android.os.IBinder p1) throws android.os.RemoteException;
    public android.hardware.input.IVirtualInputDevice createVirtualMouse(android.hardware.input.VirtualMouseConfig p0, android.os.IBinder p1) throws android.os.RemoteException;
    public android.hardware.input.IVirtualInputDevice createVirtualTouchscreen(android.hardware.input.VirtualTouchscreenConfig p0, android.os.IBinder p1) throws android.os.RemoteException;
    public android.hardware.input.IVirtualInputDevice createVirtualNavigationTouchpad(android.hardware.input.VirtualNavigationTouchpadConfig p0, android.os.IBinder p1) throws android.os.RemoteException;
    public android.hardware.input.IVirtualInputDevice createVirtualStylus(android.hardware.input.VirtualStylusConfig p0, android.os.IBinder p1) throws android.os.RemoteException;
    public android.hardware.input.IVirtualInputDevice createVirtualRotaryEncoder(android.hardware.input.VirtualRotaryEncoderConfig p0, android.os.IBinder p1) throws android.os.RemoteException;
    public java.util.List<android.companion.virtual.sensor.VirtualSensor> getVirtualSensorList() throws android.os.RemoteException;
    public boolean sendSensorEvent(android.os.IBinder p0, android.companion.virtual.sensor.VirtualSensorEvent p1) throws android.os.RemoteException;
    public boolean sendSensorAdditionalInfo(android.os.IBinder p0, android.companion.virtual.sensor.VirtualSensorAdditionalInfo p1) throws android.os.RemoteException;
    public void launchPendingIntent(int p0, android.app.PendingIntent p1, android.os.ResultReceiver p2) throws android.os.RemoteException;
    public void setShowPointerIcon(boolean p0) throws android.os.RemoteException;
    public void setDisplayImePolicy(int p0, int p1) throws android.os.RemoteException;
    public void registerIntentInterceptor(android.companion.virtual.IVirtualDeviceIntentInterceptor p0, android.content.IntentFilter p1) throws android.os.RemoteException;
    public void unregisterIntentInterceptor(android.companion.virtual.IVirtualDeviceIntentInterceptor p0) throws android.os.RemoteException;
    public void registerVirtualCamera(android.companion.virtual.camera.VirtualCameraConfig p0) throws android.os.RemoteException;
    public void unregisterVirtualCamera(android.companion.virtual.camera.VirtualCameraConfig p0) throws android.os.RemoteException;
    public java.lang.String getVirtualCameraId(android.companion.virtual.camera.VirtualCameraConfig p0) throws android.os.RemoteException;
    public void setListeners(android.companion.virtual.IVirtualDeviceActivityListener p0, android.companion.virtual.IVirtualDeviceSoundEffectListener p1) throws android.os.RemoteException;

    public static class Default implements android.companion.virtual.IVirtualDevice {
        public Default() {}
        public int getAssociationId() throws android.os.RemoteException { return 0; }
        public int getDeviceId() throws android.os.RemoteException { return 0; }
        public java.lang.String getPersistentDeviceId() throws android.os.RemoteException { return null; }
        public int[] getDisplayIds() throws android.os.RemoteException { return null; }
        public int getDevicePolicy(int p0) throws android.os.RemoteException { return 0; }
        public boolean hasCustomAudioInputSupport() throws android.os.RemoteException { return false; }
        public boolean canCreateMirrorDisplays() throws android.os.RemoteException { return false; }
        public void goToSleep() throws android.os.RemoteException {}
        public void wakeUp() throws android.os.RemoteException {}
        public void close() throws android.os.RemoteException {}
        public void setDevicePolicy(int p0, int p1) throws android.os.RemoteException {}
        public void addActivityPolicyExemption(android.companion.virtual.ActivityPolicyExemption p0) throws android.os.RemoteException {}
        public void removeActivityPolicyExemption(android.companion.virtual.ActivityPolicyExemption p0) throws android.os.RemoteException {}
        public void setDevicePolicyForDisplay(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void onAudioSessionStarting(int p0, android.companion.virtual.audio.IAudioRoutingCallback p1, android.companion.virtual.audio.IAudioConfigChangedCallback p2) throws android.os.RemoteException {}
        public void onAudioSessionEnded() throws android.os.RemoteException {}
        public int createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, android.hardware.display.IVirtualDisplayCallback p1) throws android.os.RemoteException { return 0; }
        public android.hardware.input.IVirtualInputDevice createVirtualDpad(android.hardware.input.VirtualDpadConfig p0, android.os.IBinder p1) throws android.os.RemoteException { return null; }
        public android.hardware.input.IVirtualInputDevice createVirtualKeyboard(android.hardware.input.VirtualKeyboardConfig p0, android.os.IBinder p1) throws android.os.RemoteException { return null; }
        public android.hardware.input.IVirtualInputDevice createVirtualMouse(android.hardware.input.VirtualMouseConfig p0, android.os.IBinder p1) throws android.os.RemoteException { return null; }
        public android.hardware.input.IVirtualInputDevice createVirtualTouchscreen(android.hardware.input.VirtualTouchscreenConfig p0, android.os.IBinder p1) throws android.os.RemoteException { return null; }
        public android.hardware.input.IVirtualInputDevice createVirtualNavigationTouchpad(android.hardware.input.VirtualNavigationTouchpadConfig p0, android.os.IBinder p1) throws android.os.RemoteException { return null; }
        public android.hardware.input.IVirtualInputDevice createVirtualStylus(android.hardware.input.VirtualStylusConfig p0, android.os.IBinder p1) throws android.os.RemoteException { return null; }
        public android.hardware.input.IVirtualInputDevice createVirtualRotaryEncoder(android.hardware.input.VirtualRotaryEncoderConfig p0, android.os.IBinder p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.companion.virtual.sensor.VirtualSensor> getVirtualSensorList() throws android.os.RemoteException { return null; }
        public boolean sendSensorEvent(android.os.IBinder p0, android.companion.virtual.sensor.VirtualSensorEvent p1) throws android.os.RemoteException { return false; }
        public boolean sendSensorAdditionalInfo(android.os.IBinder p0, android.companion.virtual.sensor.VirtualSensorAdditionalInfo p1) throws android.os.RemoteException { return false; }
        public void launchPendingIntent(int p0, android.app.PendingIntent p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
        public void setShowPointerIcon(boolean p0) throws android.os.RemoteException {}
        public void setDisplayImePolicy(int p0, int p1) throws android.os.RemoteException {}
        public void registerIntentInterceptor(android.companion.virtual.IVirtualDeviceIntentInterceptor p0, android.content.IntentFilter p1) throws android.os.RemoteException {}
        public void unregisterIntentInterceptor(android.companion.virtual.IVirtualDeviceIntentInterceptor p0) throws android.os.RemoteException {}
        public void registerVirtualCamera(android.companion.virtual.camera.VirtualCameraConfig p0) throws android.os.RemoteException {}
        public void unregisterVirtualCamera(android.companion.virtual.camera.VirtualCameraConfig p0) throws android.os.RemoteException {}
        public java.lang.String getVirtualCameraId(android.companion.virtual.camera.VirtualCameraConfig p0) throws android.os.RemoteException { return null; }
        public void setListeners(android.companion.virtual.IVirtualDeviceActivityListener p0, android.companion.virtual.IVirtualDeviceSoundEffectListener p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.virtual.IVirtualDevice {
        static final int TRANSACTION_getAssociationId = 1;
        static final int TRANSACTION_getDeviceId = 2;
        static final int TRANSACTION_getPersistentDeviceId = 3;
        static final int TRANSACTION_getDisplayIds = 4;
        static final int TRANSACTION_getDevicePolicy = 5;
        static final int TRANSACTION_hasCustomAudioInputSupport = 6;
        static final int TRANSACTION_canCreateMirrorDisplays = 7;
        static final int TRANSACTION_goToSleep = 8;
        static final int TRANSACTION_wakeUp = 9;
        static final int TRANSACTION_close = 10;
        static final int TRANSACTION_setDevicePolicy = 11;
        static final int TRANSACTION_addActivityPolicyExemption = 12;
        static final int TRANSACTION_removeActivityPolicyExemption = 13;
        static final int TRANSACTION_setDevicePolicyForDisplay = 14;
        static final int TRANSACTION_onAudioSessionStarting = 15;
        static final int TRANSACTION_onAudioSessionEnded = 16;
        static final int TRANSACTION_createVirtualDisplay = 17;
        static final int TRANSACTION_createVirtualDpad = 18;
        static final int TRANSACTION_createVirtualKeyboard = 19;
        static final int TRANSACTION_createVirtualMouse = 20;
        static final int TRANSACTION_createVirtualTouchscreen = 21;
        static final int TRANSACTION_createVirtualNavigationTouchpad = 22;
        static final int TRANSACTION_createVirtualStylus = 23;
        static final int TRANSACTION_createVirtualRotaryEncoder = 24;
        static final int TRANSACTION_getVirtualSensorList = 25;
        static final int TRANSACTION_sendSensorEvent = 26;
        static final int TRANSACTION_sendSensorAdditionalInfo = 27;
        static final int TRANSACTION_launchPendingIntent = 28;
        static final int TRANSACTION_setShowPointerIcon = 29;
        static final int TRANSACTION_setDisplayImePolicy = 30;
        static final int TRANSACTION_registerIntentInterceptor = 31;
        static final int TRANSACTION_unregisterIntentInterceptor = 32;
        static final int TRANSACTION_registerVirtualCamera = 33;
        static final int TRANSACTION_unregisterVirtualCamera = 34;
        static final int TRANSACTION_getVirtualCameraId = 35;
        static final int TRANSACTION_setListeners = 36;
        public Stub() { super(); }
        public static android.companion.virtual.IVirtualDevice asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.companion.virtual.IVirtualDevice {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int getAssociationId() throws android.os.RemoteException { return 0; }
            public int getDeviceId() throws android.os.RemoteException { return 0; }
            public java.lang.String getPersistentDeviceId() throws android.os.RemoteException { return null; }
            public int[] getDisplayIds() throws android.os.RemoteException { return null; }
            public int getDevicePolicy(int p0) throws android.os.RemoteException { return 0; }
            public boolean hasCustomAudioInputSupport() throws android.os.RemoteException { return false; }
            public boolean canCreateMirrorDisplays() throws android.os.RemoteException { return false; }
            public void goToSleep() throws android.os.RemoteException {}
            public void wakeUp() throws android.os.RemoteException {}
            public void close() throws android.os.RemoteException {}
            public void setDevicePolicy(int p0, int p1) throws android.os.RemoteException {}
            public void addActivityPolicyExemption(android.companion.virtual.ActivityPolicyExemption p0) throws android.os.RemoteException {}
            public void removeActivityPolicyExemption(android.companion.virtual.ActivityPolicyExemption p0) throws android.os.RemoteException {}
            public void setDevicePolicyForDisplay(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void onAudioSessionStarting(int p0, android.companion.virtual.audio.IAudioRoutingCallback p1, android.companion.virtual.audio.IAudioConfigChangedCallback p2) throws android.os.RemoteException {}
            public void onAudioSessionEnded() throws android.os.RemoteException {}
            public int createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, android.hardware.display.IVirtualDisplayCallback p1) throws android.os.RemoteException { return 0; }
            public android.hardware.input.IVirtualInputDevice createVirtualDpad(android.hardware.input.VirtualDpadConfig p0, android.os.IBinder p1) throws android.os.RemoteException { return null; }
            public android.hardware.input.IVirtualInputDevice createVirtualKeyboard(android.hardware.input.VirtualKeyboardConfig p0, android.os.IBinder p1) throws android.os.RemoteException { return null; }
            public android.hardware.input.IVirtualInputDevice createVirtualMouse(android.hardware.input.VirtualMouseConfig p0, android.os.IBinder p1) throws android.os.RemoteException { return null; }
            public android.hardware.input.IVirtualInputDevice createVirtualTouchscreen(android.hardware.input.VirtualTouchscreenConfig p0, android.os.IBinder p1) throws android.os.RemoteException { return null; }
            public android.hardware.input.IVirtualInputDevice createVirtualNavigationTouchpad(android.hardware.input.VirtualNavigationTouchpadConfig p0, android.os.IBinder p1) throws android.os.RemoteException { return null; }
            public android.hardware.input.IVirtualInputDevice createVirtualStylus(android.hardware.input.VirtualStylusConfig p0, android.os.IBinder p1) throws android.os.RemoteException { return null; }
            public android.hardware.input.IVirtualInputDevice createVirtualRotaryEncoder(android.hardware.input.VirtualRotaryEncoderConfig p0, android.os.IBinder p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.companion.virtual.sensor.VirtualSensor> getVirtualSensorList() throws android.os.RemoteException { return null; }
            public boolean sendSensorEvent(android.os.IBinder p0, android.companion.virtual.sensor.VirtualSensorEvent p1) throws android.os.RemoteException { return false; }
            public boolean sendSensorAdditionalInfo(android.os.IBinder p0, android.companion.virtual.sensor.VirtualSensorAdditionalInfo p1) throws android.os.RemoteException { return false; }
            public void launchPendingIntent(int p0, android.app.PendingIntent p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
            public void setShowPointerIcon(boolean p0) throws android.os.RemoteException {}
            public void setDisplayImePolicy(int p0, int p1) throws android.os.RemoteException {}
            public void registerIntentInterceptor(android.companion.virtual.IVirtualDeviceIntentInterceptor p0, android.content.IntentFilter p1) throws android.os.RemoteException {}
            public void unregisterIntentInterceptor(android.companion.virtual.IVirtualDeviceIntentInterceptor p0) throws android.os.RemoteException {}
            public void registerVirtualCamera(android.companion.virtual.camera.VirtualCameraConfig p0) throws android.os.RemoteException {}
            public void unregisterVirtualCamera(android.companion.virtual.camera.VirtualCameraConfig p0) throws android.os.RemoteException {}
            public java.lang.String getVirtualCameraId(android.companion.virtual.camera.VirtualCameraConfig p0) throws android.os.RemoteException { return null; }
            public void setListeners(android.companion.virtual.IVirtualDeviceActivityListener p0, android.companion.virtual.IVirtualDeviceSoundEffectListener p1) throws android.os.RemoteException {}
        }
    }
}
