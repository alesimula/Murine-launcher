package android.telephony.ims;

public class ImsRcsManager {
    private static final java.lang.String TAG = "ImsRcsManager";
    public static final java.lang.String ACTION_SHOW_CAPABILITY_DISCOVERY_OPT_IN = "android.telephony.ims.action.SHOW_CAPABILITY_DISCOVERY_OPT_IN";
    private final int mSubId = 0;
    private final android.content.Context mContext = null;
    public ImsRcsManager(android.content.Context p0, int p1) {}
    public android.telephony.ims.RcsUceAdapter getUceAdapter() { return null; }
    public void registerImsRegistrationCallback(java.util.concurrent.Executor p0, android.telephony.ims.RegistrationManager.RegistrationCallback p1) throws android.telephony.ims.ImsException {}
    public void unregisterImsRegistrationCallback(android.telephony.ims.RegistrationManager.RegistrationCallback p0) {}
    public void getRegistrationState(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    public void getRegistrationTransportType(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    public void registerRcsAvailabilityCallback(java.util.concurrent.Executor p0, android.telephony.ims.ImsRcsManager.AvailabilityCallback p1) throws android.telephony.ims.ImsException {}
    public void unregisterRcsAvailabilityCallback(android.telephony.ims.ImsRcsManager.AvailabilityCallback p0) throws android.telephony.ims.ImsException {}
    public boolean isCapable(int p0, int p1) throws android.telephony.ims.ImsException { return false; }
    public boolean isAvailable(int p0) throws android.telephony.ims.ImsException { return false; }
    private android.telephony.ims.aidl.IImsRcsController getIImsRcsController() { return null; }

    public static class AvailabilityCallback {
        private final android.telephony.ims.ImsRcsManager.AvailabilityCallback.CapabilityBinder mBinder = null;
        public AvailabilityCallback() {}
        public void onAvailabilityChanged(android.telephony.ims.feature.RcsFeature.RcsImsCapabilities p0) {}
        public final android.telephony.ims.aidl.IImsCapabilityCallback getBinder() { return null; }
        private void setExecutor(java.util.concurrent.Executor p0) {}

        private static class CapabilityBinder extends android.telephony.ims.aidl.IImsCapabilityCallback.Stub {
            private final android.telephony.ims.ImsRcsManager.AvailabilityCallback mLocalCallback = null;
            private java.util.concurrent.Executor mExecutor;
            CapabilityBinder(android.telephony.ims.ImsRcsManager.AvailabilityCallback p0) { super(); }
            public void onCapabilitiesStatusChanged(int p0) {}
            public void onQueryCapabilityConfiguration(int p0, int p1, boolean p2) {}
            public void onChangeCapabilityConfigurationError(int p0, int p1, int p2) {}
            private void setExecutor(java.util.concurrent.Executor p0) {}
        }
    }
}
