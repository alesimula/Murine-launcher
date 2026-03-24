package android.telephony.ims;

public class ImsMmTelManager implements android.telephony.ims.RegistrationManager {
    public static final int WIFI_MODE_WIFI_ONLY = 0;
    public static final int WIFI_MODE_CELLULAR_PREFERRED = 1;
    public static final int WIFI_MODE_WIFI_PREFERRED = 2;
    private final int mSubId = 0;
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.SuppressLint("ManagerLookup")
    public static android.telephony.ims.ImsMmTelManager createForSubscriptionId(int p0) { return null; }
    public ImsMmTelManager(int p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public void registerImsRegistrationCallback(java.util.concurrent.Executor p0, android.telephony.ims.ImsMmTelManager.RegistrationCallback p1) throws android.telephony.ims.ImsException {}
    public void registerImsRegistrationCallback(java.util.concurrent.Executor p0, android.telephony.ims.RegistrationManager.RegistrationCallback p1) throws android.telephony.ims.ImsException {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public void unregisterImsRegistrationCallback(android.telephony.ims.ImsMmTelManager.RegistrationCallback p0) {}
    public void unregisterImsRegistrationCallback(android.telephony.ims.RegistrationManager.RegistrationCallback p0) {}
    @android.annotation.SystemApi
    public void getRegistrationState(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    public void getRegistrationTransportType(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    public void registerMmTelCapabilityCallback(java.util.concurrent.Executor p0, android.telephony.ims.ImsMmTelManager.CapabilityCallback p1) throws android.telephony.ims.ImsException {}
    public void unregisterMmTelCapabilityCallback(android.telephony.ims.ImsMmTelManager.CapabilityCallback p0) {}
    public boolean isAdvancedCallingSettingEnabled() { return false; }
    @android.annotation.SystemApi
    public void setAdvancedCallingSettingEnabled(boolean p0) {}
    @android.annotation.SystemApi
    public boolean isCapable(int p0, int p1) { return false; }
    @android.annotation.SystemApi
    public boolean isAvailable(int p0, int p1) { return false; }
    @android.annotation.SystemApi
    public void isSupported(int p0, int p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) throws android.telephony.ims.ImsException {}
    public boolean isVtSettingEnabled() { return false; }
    @android.annotation.SystemApi
    public void setVtSettingEnabled(boolean p0) {}
    public boolean isVoWiFiSettingEnabled() { return false; }
    @android.annotation.SystemApi
    public void setVoWiFiSettingEnabled(boolean p0) {}
    public boolean isVoWiFiRoamingSettingEnabled() { return false; }
    @android.annotation.SystemApi
    public void setVoWiFiRoamingSettingEnabled(boolean p0) {}
    @android.annotation.SystemApi
    public void setVoWiFiNonPersistent(boolean p0, int p1) {}
    public int getVoWiFiModeSetting() { return 0; }
    @android.annotation.SystemApi
    public void setVoWiFiModeSetting(int p0) {}
    @android.annotation.SystemApi
    public int getVoWiFiRoamingModeSetting() { return 0; }
    @android.annotation.SystemApi
    public void setVoWiFiRoamingModeSetting(int p0) {}
    @android.annotation.SystemApi
    public void setRttCapabilitySetting(boolean p0) {}
    public boolean isTtyOverVolteEnabled() { return false; }
    @android.annotation.SystemApi
    public void getFeatureState(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) throws android.telephony.ims.ImsException {}
    private static com.android.internal.telephony.ITelephony getITelephony() { return null; }

    public static class CapabilityCallback {
        private final android.telephony.ims.ImsMmTelManager.CapabilityCallback.CapabilityBinder mBinder = null;
        public CapabilityCallback() {}
        public void onCapabilitiesStatusChanged(android.telephony.ims.feature.MmTelFeature.MmTelCapabilities p0) {}
        public final android.telephony.ims.aidl.IImsCapabilityCallback getBinder() { return null; }
        public final void setExecutor(java.util.concurrent.Executor p0) {}

        private static class CapabilityBinder extends android.telephony.ims.aidl.IImsCapabilityCallback.Stub {
            private final android.telephony.ims.ImsMmTelManager.CapabilityCallback mLocalCallback = null;
            private java.util.concurrent.Executor mExecutor;
            CapabilityBinder(android.telephony.ims.ImsMmTelManager.CapabilityCallback p0) { super(); }
            public void onCapabilitiesStatusChanged(int p0) {}
            public void onQueryCapabilityConfiguration(int p0, int p1, boolean p2) {}
            public void onChangeCapabilityConfigurationError(int p0, int p1, int p2) {}
            private void setExecutor(java.util.concurrent.Executor p0) {}
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
