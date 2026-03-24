package android.telephony.ims;

@android.annotation.SystemApi
public class ProvisioningManager {
    public static final java.lang.String STRING_QUERY_RESULT_ERROR_GENERIC = "STRING_QUERY_RESULT_ERROR_GENERIC";
    public static final java.lang.String STRING_QUERY_RESULT_ERROR_NOT_READY = "STRING_QUERY_RESULT_ERROR_NOT_READY";
    public static final int PROVISIONING_VALUE_DISABLED = 0;
    public static final int PROVISIONING_VALUE_ENABLED = 1;
    public static final int KEY_VOICE_OVER_WIFI_ROAMING_ENABLED_OVERRIDE = 26;
    public static final int KEY_VOICE_OVER_WIFI_MODE_OVERRIDE = 27;
    private int mSubId;
    public static android.telephony.ims.ProvisioningManager createForSubscriptionId(int p0) { return null; }
    private ProvisioningManager(int p0) {}
    public void registerProvisioningChangedCallback(java.util.concurrent.Executor p0, android.telephony.ims.ProvisioningManager.Callback p1) throws android.telephony.ims.ImsException {}
    public void unregisterProvisioningChangedCallback(android.telephony.ims.ProvisioningManager.Callback p0) {}
    public int getProvisioningIntValue(int p0) { return 0; }
    public java.lang.String getProvisioningStringValue(int p0) { return null; }
    public int setProvisioningIntValue(int p0, int p1) { return 0; }
    public int setProvisioningStringValue(int p0, java.lang.String p1) { return 0; }
    public void setProvisioningStatusForCapability(int p0, int p1, boolean p2) {}
    public boolean getProvisioningStatusForCapability(int p0, int p1) { return false; }
    private static boolean isImsAvailableOnDevice() { return false; }
    private static com.android.internal.telephony.ITelephony getITelephony() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StringResultError {
    }

    public static class Callback {
        private final android.telephony.ims.ProvisioningManager.Callback.CallbackBinder mBinder = null;
        public Callback() {}
        public void onProvisioningIntChanged(int p0, int p1) {}
        public void onProvisioningStringChanged(int p0, java.lang.String p1) {}
        public final android.telephony.ims.aidl.IImsConfigCallback getBinder() { return null; }
        public void setExecutor(java.util.concurrent.Executor p0) {}

        private static class CallbackBinder extends android.telephony.ims.aidl.IImsConfigCallback.Stub {
            private final android.telephony.ims.ProvisioningManager.Callback mLocalConfigurationCallback = null;
            private java.util.concurrent.Executor mExecutor;
            private CallbackBinder(android.telephony.ims.ProvisioningManager.Callback p0) { super(); }
            public final void onIntConfigChanged(int p0, int p1) {}
            public final void onStringConfigChanged(int p0, java.lang.String p1) {}
            private void setExecutor(java.util.concurrent.Executor p0) {}
        }
    }
}
