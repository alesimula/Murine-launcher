package android.telephony.ims;

public interface RegistrationManager {
    public static final int REGISTRATION_STATE_NOT_REGISTERED = 0;
    public static final int REGISTRATION_STATE_REGISTERING = 1;
    public static final int REGISTRATION_STATE_REGISTERED = 2;
    public static final java.util.Map<java.lang.Integer, java.lang.Integer> IMS_REG_TO_ACCESS_TYPE_MAP = null;
    public static java.lang.String registrationStateToString(int p0) { return null; }
    public static int getAccessType(int p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void registerImsRegistrationCallback(java.util.concurrent.Executor p0, android.telephony.ims.RegistrationManager.RegistrationCallback p1) throws android.telephony.ims.ImsException;
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void unregisterImsRegistrationCallback(android.telephony.ims.RegistrationManager.RegistrationCallback p0);
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void getRegistrationState(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1);
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void getRegistrationTransportType(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsRegistrationState {
    }

    public static class RegistrationCallback {
        public RegistrationCallback() {}
        @java.lang.Deprecated
        public void onRegistered(int p0) {}
        public void onRegistered(android.telephony.ims.ImsRegistrationAttributes p0) {}
        public void onRegistering(int p0) {}
        public void onRegistering(android.telephony.ims.ImsRegistrationAttributes p0) {}
        public void onUnregistered(android.telephony.ims.ImsReasonInfo p0) {}
        public void onTechnologyChangeFailed(int p0, android.telephony.ims.ImsReasonInfo p1) {}
        public void onSubscriberAssociatedUriChanged(android.net.Uri[] p0) {}
        public final android.telephony.ims.aidl.IImsRegistrationCallback getBinder() { return null; }
        public void setExecutor(java.util.concurrent.Executor p0) {}

        private static class RegistrationBinder extends android.telephony.ims.aidl.IImsRegistrationCallback.Stub {
            RegistrationBinder(android.telephony.ims.RegistrationManager.RegistrationCallback p0) { super(); }
            public void onRegistered(android.telephony.ims.ImsRegistrationAttributes p0) {}
            public void onRegistering(android.telephony.ims.ImsRegistrationAttributes p0) {}
            public void onDeregistered(android.telephony.ims.ImsReasonInfo p0) {}
            public void onTechnologyChangeFailed(int p0, android.telephony.ims.ImsReasonInfo p1) {}
            public void onSubscriberAssociatedUriChanged(android.net.Uri[] p0) {}
        }
    }
}
