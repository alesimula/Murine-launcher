package android.telephony.ims;

public class ImsRcsManager {
    private static final java.lang.String TAG = "ImsRcsManager";
    public static final java.lang.String ACTION_SHOW_CAPABILITY_DISCOVERY_OPT_IN = "android.telephony.ims.action.SHOW_CAPABILITY_DISCOVERY_OPT_IN";
    private final int mSubId = 0;
    private final android.content.Context mContext = null;
    private final android.telephony.BinderCacheManager<android.telephony.ims.aidl.IImsRcsController> mBinderCache = null;
    private final java.util.Map<android.telephony.ims.ImsRcsManager.OnAvailabilityChangedListener, android.telephony.ims.ImsRcsManager.AvailabilityCallbackAdapter> mAvailabilityChangedCallbacks = null;
    public ImsRcsManager(android.content.Context p0, int p1, android.telephony.BinderCacheManager<android.telephony.ims.aidl.IImsRcsController> p2) {}
    public android.telephony.ims.RcsUceAdapter getUceAdapter() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public void registerImsRegistrationCallback(java.util.concurrent.Executor p0, android.telephony.ims.RegistrationManager.RegistrationCallback p1) throws android.telephony.ims.ImsException {}
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public void unregisterImsRegistrationCallback(android.telephony.ims.RegistrationManager.RegistrationCallback p0) {}
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public void getRegistrationState(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public void getRegistrationTransportType(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void addOnAvailabilityChangedListener(java.util.concurrent.Executor p0, android.telephony.ims.ImsRcsManager.OnAvailabilityChangedListener p1) throws android.telephony.ims.ImsException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void removeOnAvailabilityChangedListener(android.telephony.ims.ImsRcsManager.OnAvailabilityChangedListener p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean isCapable(int p0, int p1) throws android.telephony.ims.ImsException { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean isAvailable(int p0, int p1) throws android.telephony.ims.ImsException { return false; }
    private android.telephony.ims.ImsRcsManager.AvailabilityCallbackAdapter addAvailabilityChangedListenerToCollection(java.util.concurrent.Executor p0, android.telephony.ims.ImsRcsManager.OnAvailabilityChangedListener p1) { return null; }
    private android.telephony.ims.ImsRcsManager.AvailabilityCallbackAdapter removeAvailabilityChangedListenerFromCollection(android.telephony.ims.ImsRcsManager.OnAvailabilityChangedListener p0) { return null; }
    private android.telephony.ims.aidl.IImsRcsController getIImsRcsController() { return null; }

    private static class AvailabilityCallbackAdapter {
        private final android.telephony.ims.ImsRcsManager.AvailabilityCallbackAdapter.CapabilityBinder mBinder = null;
        AvailabilityCallbackAdapter(java.util.concurrent.Executor p0, android.telephony.ims.ImsRcsManager.OnAvailabilityChangedListener p1) {}
        public final android.telephony.ims.aidl.IImsCapabilityCallback getBinder() { return null; }

        private static class CapabilityBinder extends android.telephony.ims.aidl.IImsCapabilityCallback.Stub {
            private final android.telephony.ims.ImsRcsManager.OnAvailabilityChangedListener mOnAvailabilityChangedListener = null;
            private final java.util.concurrent.Executor mExecutor = null;
            CapabilityBinder(android.telephony.ims.ImsRcsManager.OnAvailabilityChangedListener p0, java.util.concurrent.Executor p1) { super(); }
            public void onCapabilitiesStatusChanged(int p0) {}
            public void onQueryCapabilityConfiguration(int p0, int p1, boolean p2) {}
            public void onChangeCapabilityConfigurationError(int p0, int p1, int p2) {}
        }
    }

    @android.annotation.SystemApi
    public static interface OnAvailabilityChangedListener {
        public void onAvailabilityChanged(int p0);
    }
}
