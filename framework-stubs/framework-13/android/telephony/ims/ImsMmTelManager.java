package android.telephony.ims;

public class ImsMmTelManager implements android.telephony.ims.RegistrationManager {
    public static final int WIFI_MODE_WIFI_ONLY = 0;
    public static final int WIFI_MODE_CELLULAR_PREFERRED = 1;
    public static final int WIFI_MODE_WIFI_PREFERRED = 2;
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PRECISE_PHONE_STATE"})
    @android.annotation.SuppressLint("ManagerLookup")
    public static android.telephony.ims.ImsMmTelManager createForSubscriptionId(int p0) { return null; }
    public ImsMmTelManager(int p0, android.telephony.BinderCacheManager<com.android.internal.telephony.ITelephony> p1) {}
    public ImsMmTelManager(android.content.Context p0, int p1, android.telephony.BinderCacheManager<com.android.internal.telephony.ITelephony> p2) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void registerImsRegistrationCallback(java.util.concurrent.Executor p0, android.telephony.ims.ImsMmTelManager.RegistrationCallback p1) throws android.telephony.ims.ImsException {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PRECISE_PHONE_STATE"})
    public void registerImsRegistrationCallback(java.util.concurrent.Executor p0, android.telephony.ims.RegistrationManager.RegistrationCallback p1) throws android.telephony.ims.ImsException {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void unregisterImsRegistrationCallback(android.telephony.ims.ImsMmTelManager.RegistrationCallback p0) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PRECISE_PHONE_STATE"})
    public void unregisterImsRegistrationCallback(android.telephony.ims.RegistrationManager.RegistrationCallback p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void getRegistrationState(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PRECISE_PHONE_STATE"})
    public void getRegistrationTransportType(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PRECISE_PHONE_STATE"})
    public void registerMmTelCapabilityCallback(java.util.concurrent.Executor p0, android.telephony.ims.ImsMmTelManager.CapabilityCallback p1) throws android.telephony.ims.ImsException {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PRECISE_PHONE_STATE"})
    public void unregisterMmTelCapabilityCallback(android.telephony.ims.ImsMmTelManager.CapabilityCallback p0) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PRECISE_PHONE_STATE"})
    public boolean isAdvancedCallingSettingEnabled() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setAdvancedCallingSettingEnabled(boolean p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean isCapable(int p0, int p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean isAvailable(int p0, int p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void isSupported(int p0, int p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) throws android.telephony.ims.ImsException {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PRECISE_PHONE_STATE"})
    public boolean isVtSettingEnabled() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setVtSettingEnabled(boolean p0) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PRECISE_PHONE_STATE"})
    public boolean isVoWiFiSettingEnabled() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setVoWiFiSettingEnabled(boolean p0) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PRECISE_PHONE_STATE"})
    public boolean isCrossSimCallingEnabled() throws android.telephony.ims.ImsException { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setCrossSimCallingEnabled(boolean p0) throws android.telephony.ims.ImsException {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PRECISE_PHONE_STATE"})
    public boolean isVoWiFiRoamingSettingEnabled() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setVoWiFiRoamingSettingEnabled(boolean p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setVoWiFiNonPersistent(boolean p0, int p1) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PRECISE_PHONE_STATE"})
    public int getVoWiFiModeSetting() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setVoWiFiModeSetting(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getVoWiFiRoamingModeSetting() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setVoWiFiRoamingModeSetting(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setRttCapabilitySetting(boolean p0) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PRECISE_PHONE_STATE"})
    public boolean isTtyOverVolteEnabled() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void getFeatureState(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) throws android.telephony.ims.ImsException {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRECISE_PHONE_STATE", "android.permission.READ_PRIVILEGED_PHONE_STATE"})
    public void registerImsStateCallback(java.util.concurrent.Executor p0, android.telephony.ims.ImsStateCallback p1) throws android.telephony.ims.ImsException {}
    public void unregisterImsStateCallback(android.telephony.ims.ImsStateCallback p0) {}

    public static class CapabilityCallback {
        public CapabilityCallback() {}
        public void onCapabilitiesStatusChanged(android.telephony.ims.feature.MmTelFeature.MmTelCapabilities p0) {}
        public final android.telephony.ims.aidl.IImsCapabilityCallback getBinder() { return null; }
        public final void setExecutor(java.util.concurrent.Executor p0) {}

        private static class CapabilityBinder extends android.telephony.ims.aidl.IImsCapabilityCallback.Stub {
            CapabilityBinder(android.telephony.ims.ImsMmTelManager.CapabilityCallback p0) { super(); }
            public void onCapabilitiesStatusChanged(int p0) {}
            public void onQueryCapabilityConfiguration(int p0, int p1, boolean p2) {}
            public void onChangeCapabilityConfigurationError(int p0, int p1, int p2) {}
        }
    }

    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static class RegistrationCallback extends android.telephony.ims.RegistrationManager.RegistrationCallback {
        public RegistrationCallback() { super(); }
        public void onRegistered(int p0) {}
        public void onRegistering(int p0) {}
        public void onUnregistered(android.telephony.ims.ImsReasonInfo p0) {}
        public void onTechnologyChangeFailed(int p0, android.telephony.ims.ImsReasonInfo p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WiFiCallingMode {
    }
}
