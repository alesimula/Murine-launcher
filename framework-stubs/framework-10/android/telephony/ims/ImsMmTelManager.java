package android.telephony.ims;

@android.annotation.SystemApi
public class ImsMmTelManager {
    private static final java.lang.String TAG = "ImsMmTelManager";
    public static final int WIFI_MODE_WIFI_ONLY = 0;
    public static final int WIFI_MODE_CELLULAR_PREFERRED = 1;
    public static final int WIFI_MODE_WIFI_PREFERRED = 2;
    private int mSubId;
    public static android.telephony.ims.ImsMmTelManager createForSubscriptionId(int p0) { return null; }
    public ImsMmTelManager(int p0) {}
    public void registerImsRegistrationCallback(java.util.concurrent.Executor p0, android.telephony.ims.ImsMmTelManager.RegistrationCallback p1) throws android.telephony.ims.ImsException {}
    public void unregisterImsRegistrationCallback(android.telephony.ims.ImsMmTelManager.RegistrationCallback p0) {}
    public void registerMmTelCapabilityCallback(java.util.concurrent.Executor p0, android.telephony.ims.ImsMmTelManager.CapabilityCallback p1) throws android.telephony.ims.ImsException {}
    public void unregisterMmTelCapabilityCallback(android.telephony.ims.ImsMmTelManager.CapabilityCallback p0) {}
    public boolean isAdvancedCallingSettingEnabled() { return false; }
    public void setAdvancedCallingSettingEnabled(boolean p0) {}
    public boolean isCapable(int p0, int p1) { return false; }
    public boolean isAvailable(int p0, int p1) { return false; }
    public boolean isVtSettingEnabled() { return false; }
    public void setVtSettingEnabled(boolean p0) {}
    public boolean isVoWiFiSettingEnabled() { return false; }
    public void setVoWiFiSettingEnabled(boolean p0) {}
    public boolean isVoWiFiRoamingSettingEnabled() { return false; }
    public void setVoWiFiRoamingSettingEnabled(boolean p0) {}
    public void setVoWiFiNonPersistent(boolean p0, int p1) {}
    public int getVoWiFiModeSetting() { return 0; }
    public void setVoWiFiModeSetting(int p0) {}
    public int getVoWiFiRoamingModeSetting() { return 0; }
    public void setVoWiFiRoamingModeSetting(int p0) {}
    public void setRttCapabilitySetting(boolean p0) {}
    boolean isTtyOverVolteEnabled() { return false; }
    private static boolean isImsAvailableOnDevice() { return false; }
    private static com.android.internal.telephony.ITelephony getITelephony() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WiFiCallingMode {
    }

    public static class RegistrationCallback {
        private final android.telephony.ims.ImsMmTelManager.RegistrationCallback.RegistrationBinder mBinder = null;
        public RegistrationCallback() {}
        public void onRegistered(int p0) {}
        public void onRegistering(int p0) {}
        public void onUnregistered(android.telephony.ims.ImsReasonInfo p0) {}
        public void onTechnologyChangeFailed(int p0, android.telephony.ims.ImsReasonInfo p1) {}
        public void onSubscriberAssociatedUriChanged(android.net.Uri[] p0) {}
        public final android.telephony.ims.aidl.IImsRegistrationCallback getBinder() { return null; }
        public void setExecutor(java.util.concurrent.Executor p0) {}

        private static class RegistrationBinder extends android.telephony.ims.aidl.IImsRegistrationCallback.Stub {
            private static final java.util.Map<java.lang.Integer, java.lang.Integer> IMS_REG_TO_ACCESS_TYPE_MAP = null;
            private final android.telephony.ims.ImsMmTelManager.RegistrationCallback mLocalCallback = null;
            private java.util.concurrent.Executor mExecutor;
            RegistrationBinder(android.telephony.ims.ImsMmTelManager.RegistrationCallback p0) { super(); }
            public void onRegistered(int p0) {}
            public void onRegistering(int p0) {}
            public void onDeregistered(android.telephony.ims.ImsReasonInfo p0) {}
            public void onTechnologyChangeFailed(int p0, android.telephony.ims.ImsReasonInfo p1) {}
            public void onSubscriberAssociatedUriChanged(android.net.Uri[] p0) {}
            private void setExecutor(java.util.concurrent.Executor p0) {}
            private static int getAccessType(int p0) { return 0; }
        }
    }

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
}
