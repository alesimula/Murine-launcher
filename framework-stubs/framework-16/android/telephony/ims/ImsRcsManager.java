package android.telephony.ims;

public class ImsRcsManager {
    public static final java.lang.String ACTION_SHOW_CAPABILITY_DISCOVERY_OPT_IN = "android.telephony.ims.action.SHOW_CAPABILITY_DISCOVERY_OPT_IN";
    public static final int CAPABILITY_TYPE_NONE = 0;
    public static final int CAPABILITY_TYPE_OPTIONS_UCE = 1;
    public static final int CAPABILITY_TYPE_PRESENCE_UCE = 2;
    public static final int CAPABILITY_TYPE_MAX = 3;
    public ImsRcsManager(android.content.Context p0, int p1, android.telephony.BinderCacheManager<android.telephony.ims.aidl.IImsRcsController> p2, android.telephony.BinderCacheManager<com.android.internal.telephony.ITelephony> p3) {}
    @android.annotation.NonNull
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
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRECISE_PHONE_STATE", "android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.ACCESS_RCS_USER_CAPABILITY_EXCHANGE"})
    public void registerImsStateCallback(java.util.concurrent.Executor p0, android.telephony.ims.ImsStateCallback p1) throws android.telephony.ims.ImsException {}
    public void unregisterImsStateCallback(android.telephony.ims.ImsStateCallback p0) {}

    private static class AvailabilityCallbackAdapter {
        AvailabilityCallbackAdapter(java.util.concurrent.Executor p0, android.telephony.ims.ImsRcsManager.OnAvailabilityChangedListener p1) {}
        public final android.telephony.ims.aidl.IImsCapabilityCallback getBinder() { return null; }

        private static class CapabilityBinder extends android.telephony.ims.aidl.IImsCapabilityCallback.Stub {
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

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RcsImsCapabilityFlag {
    }
}
