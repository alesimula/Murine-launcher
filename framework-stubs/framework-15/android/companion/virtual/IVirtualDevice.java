package android.companion.virtual;

public interface IVirtualDevice extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.virtual.IVirtualDevice";
    public int getAssociationId() throws android.os.RemoteException;
    public int getDeviceId() throws android.os.RemoteException;
    public java.lang.String getPersistentDeviceId() throws android.os.RemoteException;
    public int[] getDisplayIds() throws android.os.RemoteException;
    public int getDevicePolicy(int p0) throws android.os.RemoteException;
    public boolean hasCustomAudioInputSupport() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void close() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void setDevicePolicy(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void addActivityPolicyExemption(android.content.ComponentName p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void removeActivityPolicyExemption(android.content.ComponentName p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void onAudioSessionStarting(int p0, android.companion.virtual.audio.IAudioRoutingCallback p1, android.companion.virtual.audio.IAudioConfigChangedCallback p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void onAudioSessionEnded() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void createVirtualDpad(android.hardware.input.VirtualDpadConfig p0, android.os.IBinder p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void createVirtualKeyboard(android.hardware.input.VirtualKeyboardConfig p0, android.os.IBinder p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void createVirtualMouse(android.hardware.input.VirtualMouseConfig p0, android.os.IBinder p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void createVirtualTouchscreen(android.hardware.input.VirtualTouchscreenConfig p0, android.os.IBinder p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void createVirtualNavigationTouchpad(android.hardware.input.VirtualNavigationTouchpadConfig p0, android.os.IBinder p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void createVirtualStylus(android.hardware.input.VirtualStylusConfig p0, android.os.IBinder p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void unregisterInputDevice(android.os.IBinder p0) throws android.os.RemoteException;
    public int getInputDeviceId(android.os.IBinder p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public boolean sendDpadKeyEvent(android.os.IBinder p0, android.hardware.input.VirtualKeyEvent p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public boolean sendKeyEvent(android.os.IBinder p0, android.hardware.input.VirtualKeyEvent p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public boolean sendButtonEvent(android.os.IBinder p0, android.hardware.input.VirtualMouseButtonEvent p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public boolean sendRelativeEvent(android.os.IBinder p0, android.hardware.input.VirtualMouseRelativeEvent p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public boolean sendScrollEvent(android.os.IBinder p0, android.hardware.input.VirtualMouseScrollEvent p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public boolean sendTouchEvent(android.os.IBinder p0, android.hardware.input.VirtualTouchEvent p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public boolean sendStylusMotionEvent(android.os.IBinder p0, android.hardware.input.VirtualStylusMotionEvent p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public boolean sendStylusButtonEvent(android.os.IBinder p0, android.hardware.input.VirtualStylusButtonEvent p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public java.util.List<android.companion.virtual.sensor.VirtualSensor> getVirtualSensorList() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public boolean sendSensorEvent(android.os.IBinder p0, android.companion.virtual.sensor.VirtualSensorEvent p1) throws android.os.RemoteException;
    public void launchPendingIntent(int p0, android.app.PendingIntent p1, android.os.ResultReceiver p2) throws android.os.RemoteException;
    public android.graphics.PointF getCursorPosition(android.os.IBinder p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void setShowPointerIcon(boolean p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void setDisplayImePolicy(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void registerIntentInterceptor(android.companion.virtual.IVirtualDeviceIntentInterceptor p0, android.content.IntentFilter p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void unregisterIntentInterceptor(android.companion.virtual.IVirtualDeviceIntentInterceptor p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void registerVirtualCamera(android.companion.virtual.camera.VirtualCameraConfig p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void unregisterVirtualCamera(android.companion.virtual.camera.VirtualCameraConfig p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public java.lang.String getVirtualCameraId(android.companion.virtual.camera.VirtualCameraConfig p0) throws android.os.RemoteException;

    public static class Default implements android.companion.virtual.IVirtualDevice {
        public Default() {}
        public int getAssociationId() throws android.os.RemoteException { return 0; }
        public int getDeviceId() throws android.os.RemoteException { return 0; }
        public java.lang.String getPersistentDeviceId() throws android.os.RemoteException { return null; }
        public int[] getDisplayIds() throws android.os.RemoteException { return null; }
        public int getDevicePolicy(int p0) throws android.os.RemoteException { return 0; }
        public boolean hasCustomAudioInputSupport() throws android.os.RemoteException { return false; }
        public void close() throws android.os.RemoteException {}
        public void setDevicePolicy(int p0, int p1) throws android.os.RemoteException {}
        public void addActivityPolicyExemption(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void removeActivityPolicyExemption(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void onAudioSessionStarting(int p0, android.companion.virtual.audio.IAudioRoutingCallback p1, android.companion.virtual.audio.IAudioConfigChangedCallback p2) throws android.os.RemoteException {}
        public void onAudioSessionEnded() throws android.os.RemoteException {}
        public void createVirtualDpad(android.hardware.input.VirtualDpadConfig p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void createVirtualKeyboard(android.hardware.input.VirtualKeyboardConfig p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void createVirtualMouse(android.hardware.input.VirtualMouseConfig p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void createVirtualTouchscreen(android.hardware.input.VirtualTouchscreenConfig p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void createVirtualNavigationTouchpad(android.hardware.input.VirtualNavigationTouchpadConfig p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void createVirtualStylus(android.hardware.input.VirtualStylusConfig p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void unregisterInputDevice(android.os.IBinder p0) throws android.os.RemoteException {}
        public int getInputDeviceId(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
        public boolean sendDpadKeyEvent(android.os.IBinder p0, android.hardware.input.VirtualKeyEvent p1) throws android.os.RemoteException { return false; }
        public boolean sendKeyEvent(android.os.IBinder p0, android.hardware.input.VirtualKeyEvent p1) throws android.os.RemoteException { return false; }
        public boolean sendButtonEvent(android.os.IBinder p0, android.hardware.input.VirtualMouseButtonEvent p1) throws android.os.RemoteException { return false; }
        public boolean sendRelativeEvent(android.os.IBinder p0, android.hardware.input.VirtualMouseRelativeEvent p1) throws android.os.RemoteException { return false; }
        public boolean sendScrollEvent(android.os.IBinder p0, android.hardware.input.VirtualMouseScrollEvent p1) throws android.os.RemoteException { return false; }
        public boolean sendTouchEvent(android.os.IBinder p0, android.hardware.input.VirtualTouchEvent p1) throws android.os.RemoteException { return false; }
        public boolean sendStylusMotionEvent(android.os.IBinder p0, android.hardware.input.VirtualStylusMotionEvent p1) throws android.os.RemoteException { return false; }
        public boolean sendStylusButtonEvent(android.os.IBinder p0, android.hardware.input.VirtualStylusButtonEvent p1) throws android.os.RemoteException { return false; }
        public java.util.List<android.companion.virtual.sensor.VirtualSensor> getVirtualSensorList() throws android.os.RemoteException { return null; }
        public boolean sendSensorEvent(android.os.IBinder p0, android.companion.virtual.sensor.VirtualSensorEvent p1) throws android.os.RemoteException { return false; }
        public void launchPendingIntent(int p0, android.app.PendingIntent p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
        public android.graphics.PointF getCursorPosition(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public void setShowPointerIcon(boolean p0) throws android.os.RemoteException {}
        public void setDisplayImePolicy(int p0, int p1) throws android.os.RemoteException {}
        public void registerIntentInterceptor(android.companion.virtual.IVirtualDeviceIntentInterceptor p0, android.content.IntentFilter p1) throws android.os.RemoteException {}
        public void unregisterIntentInterceptor(android.companion.virtual.IVirtualDeviceIntentInterceptor p0) throws android.os.RemoteException {}
        public void registerVirtualCamera(android.companion.virtual.camera.VirtualCameraConfig p0) throws android.os.RemoteException {}
        public void unregisterVirtualCamera(android.companion.virtual.camera.VirtualCameraConfig p0) throws android.os.RemoteException {}
        public java.lang.String getVirtualCameraId(android.companion.virtual.camera.VirtualCameraConfig p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.virtual.IVirtualDevice {
        static final int TRANSACTION_getAssociationId = 1;
        static final int TRANSACTION_getDeviceId = 2;
        static final int TRANSACTION_getPersistentDeviceId = 3;
        static final int TRANSACTION_getDisplayIds = 4;
        static final int TRANSACTION_getDevicePolicy = 5;
        static final int TRANSACTION_hasCustomAudioInputSupport = 6;
        static final int TRANSACTION_close = 7;
        static final int TRANSACTION_setDevicePolicy = 8;
        static final int TRANSACTION_addActivityPolicyExemption = 9;
        static final int TRANSACTION_removeActivityPolicyExemption = 10;
        static final int TRANSACTION_onAudioSessionStarting = 11;
        static final int TRANSACTION_onAudioSessionEnded = 12;
        static final int TRANSACTION_createVirtualDpad = 13;
        static final int TRANSACTION_createVirtualKeyboard = 14;
        static final int TRANSACTION_createVirtualMouse = 15;
        static final int TRANSACTION_createVirtualTouchscreen = 16;
        static final int TRANSACTION_createVirtualNavigationTouchpad = 17;
        static final int TRANSACTION_createVirtualStylus = 18;
        static final int TRANSACTION_unregisterInputDevice = 19;
        static final int TRANSACTION_getInputDeviceId = 20;
        static final int TRANSACTION_sendDpadKeyEvent = 21;
        static final int TRANSACTION_sendKeyEvent = 22;
        static final int TRANSACTION_sendButtonEvent = 23;
        static final int TRANSACTION_sendRelativeEvent = 24;
        static final int TRANSACTION_sendScrollEvent = 25;
        static final int TRANSACTION_sendTouchEvent = 26;
        static final int TRANSACTION_sendStylusMotionEvent = 27;
        static final int TRANSACTION_sendStylusButtonEvent = 28;
        static final int TRANSACTION_getVirtualSensorList = 29;
        static final int TRANSACTION_sendSensorEvent = 30;
        static final int TRANSACTION_launchPendingIntent = 31;
        static final int TRANSACTION_getCursorPosition = 32;
        static final int TRANSACTION_setShowPointerIcon = 33;
        static final int TRANSACTION_setDisplayImePolicy = 34;
        static final int TRANSACTION_registerIntentInterceptor = 35;
        static final int TRANSACTION_unregisterIntentInterceptor = 36;
        static final int TRANSACTION_registerVirtualCamera = 37;
        static final int TRANSACTION_unregisterVirtualCamera = 38;
        static final int TRANSACTION_getVirtualCameraId = 39;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.companion.virtual.IVirtualDevice asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void close_enforcePermission() throws java.lang.SecurityException {}
        protected void setDevicePolicy_enforcePermission() throws java.lang.SecurityException {}
        protected void addActivityPolicyExemption_enforcePermission() throws java.lang.SecurityException {}
        protected void removeActivityPolicyExemption_enforcePermission() throws java.lang.SecurityException {}
        protected void onAudioSessionStarting_enforcePermission() throws java.lang.SecurityException {}
        protected void onAudioSessionEnded_enforcePermission() throws java.lang.SecurityException {}
        protected void createVirtualDpad_enforcePermission() throws java.lang.SecurityException {}
        protected void createVirtualKeyboard_enforcePermission() throws java.lang.SecurityException {}
        protected void createVirtualMouse_enforcePermission() throws java.lang.SecurityException {}
        protected void createVirtualTouchscreen_enforcePermission() throws java.lang.SecurityException {}
        protected void createVirtualNavigationTouchpad_enforcePermission() throws java.lang.SecurityException {}
        protected void createVirtualStylus_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterInputDevice_enforcePermission() throws java.lang.SecurityException {}
        protected void sendDpadKeyEvent_enforcePermission() throws java.lang.SecurityException {}
        protected void sendKeyEvent_enforcePermission() throws java.lang.SecurityException {}
        protected void sendButtonEvent_enforcePermission() throws java.lang.SecurityException {}
        protected void sendRelativeEvent_enforcePermission() throws java.lang.SecurityException {}
        protected void sendScrollEvent_enforcePermission() throws java.lang.SecurityException {}
        protected void sendTouchEvent_enforcePermission() throws java.lang.SecurityException {}
        protected void sendStylusMotionEvent_enforcePermission() throws java.lang.SecurityException {}
        protected void sendStylusButtonEvent_enforcePermission() throws java.lang.SecurityException {}
        protected void getVirtualSensorList_enforcePermission() throws java.lang.SecurityException {}
        protected void sendSensorEvent_enforcePermission() throws java.lang.SecurityException {}
        protected void setShowPointerIcon_enforcePermission() throws java.lang.SecurityException {}
        protected void setDisplayImePolicy_enforcePermission() throws java.lang.SecurityException {}
        protected void registerIntentInterceptor_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterIntentInterceptor_enforcePermission() throws java.lang.SecurityException {}
        protected void registerVirtualCamera_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterVirtualCamera_enforcePermission() throws java.lang.SecurityException {}
        protected void getVirtualCameraId_enforcePermission() throws java.lang.SecurityException {}
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
            public void close() throws android.os.RemoteException {}
            public void setDevicePolicy(int p0, int p1) throws android.os.RemoteException {}
            public void addActivityPolicyExemption(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void removeActivityPolicyExemption(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void onAudioSessionStarting(int p0, android.companion.virtual.audio.IAudioRoutingCallback p1, android.companion.virtual.audio.IAudioConfigChangedCallback p2) throws android.os.RemoteException {}
            public void onAudioSessionEnded() throws android.os.RemoteException {}
            public void createVirtualDpad(android.hardware.input.VirtualDpadConfig p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void createVirtualKeyboard(android.hardware.input.VirtualKeyboardConfig p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void createVirtualMouse(android.hardware.input.VirtualMouseConfig p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void createVirtualTouchscreen(android.hardware.input.VirtualTouchscreenConfig p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void createVirtualNavigationTouchpad(android.hardware.input.VirtualNavigationTouchpadConfig p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void createVirtualStylus(android.hardware.input.VirtualStylusConfig p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void unregisterInputDevice(android.os.IBinder p0) throws android.os.RemoteException {}
            public int getInputDeviceId(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
            public boolean sendDpadKeyEvent(android.os.IBinder p0, android.hardware.input.VirtualKeyEvent p1) throws android.os.RemoteException { return false; }
            public boolean sendKeyEvent(android.os.IBinder p0, android.hardware.input.VirtualKeyEvent p1) throws android.os.RemoteException { return false; }
            public boolean sendButtonEvent(android.os.IBinder p0, android.hardware.input.VirtualMouseButtonEvent p1) throws android.os.RemoteException { return false; }
            public boolean sendRelativeEvent(android.os.IBinder p0, android.hardware.input.VirtualMouseRelativeEvent p1) throws android.os.RemoteException { return false; }
            public boolean sendScrollEvent(android.os.IBinder p0, android.hardware.input.VirtualMouseScrollEvent p1) throws android.os.RemoteException { return false; }
            public boolean sendTouchEvent(android.os.IBinder p0, android.hardware.input.VirtualTouchEvent p1) throws android.os.RemoteException { return false; }
            public boolean sendStylusMotionEvent(android.os.IBinder p0, android.hardware.input.VirtualStylusMotionEvent p1) throws android.os.RemoteException { return false; }
            public boolean sendStylusButtonEvent(android.os.IBinder p0, android.hardware.input.VirtualStylusButtonEvent p1) throws android.os.RemoteException { return false; }
            public java.util.List<android.companion.virtual.sensor.VirtualSensor> getVirtualSensorList() throws android.os.RemoteException { return null; }
            public boolean sendSensorEvent(android.os.IBinder p0, android.companion.virtual.sensor.VirtualSensorEvent p1) throws android.os.RemoteException { return false; }
            public void launchPendingIntent(int p0, android.app.PendingIntent p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
            public android.graphics.PointF getCursorPosition(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public void setShowPointerIcon(boolean p0) throws android.os.RemoteException {}
            public void setDisplayImePolicy(int p0, int p1) throws android.os.RemoteException {}
            public void registerIntentInterceptor(android.companion.virtual.IVirtualDeviceIntentInterceptor p0, android.content.IntentFilter p1) throws android.os.RemoteException {}
            public void unregisterIntentInterceptor(android.companion.virtual.IVirtualDeviceIntentInterceptor p0) throws android.os.RemoteException {}
            public void registerVirtualCamera(android.companion.virtual.camera.VirtualCameraConfig p0) throws android.os.RemoteException {}
            public void unregisterVirtualCamera(android.companion.virtual.camera.VirtualCameraConfig p0) throws android.os.RemoteException {}
            public java.lang.String getVirtualCameraId(android.companion.virtual.camera.VirtualCameraConfig p0) throws android.os.RemoteException { return null; }
        }
    }
}
