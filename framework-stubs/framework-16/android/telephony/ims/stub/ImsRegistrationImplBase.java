package android.telephony.ims.stub;

public class ImsRegistrationImplBase {
    public static final int REGISTRATION_TECH_NONE = -1;
    public static final int REGISTRATION_TECH_LTE = 0;
    public static final int REGISTRATION_TECH_IWLAN = 1;
    public static final int REGISTRATION_TECH_CROSS_SIM = 2;
    public static final int REGISTRATION_TECH_NR = 3;
    public static final int REGISTRATION_TECH_3G = 4;
    public static final int REGISTRATION_TECH_MAX = 5;
    public static final int REASON_UNKNOWN = 0;
    public static final int REASON_SIM_REMOVED = 1;
    public static final int REASON_SIM_REFRESH = 2;
    public static final int REASON_ALLOWED_NETWORK_TYPES_CHANGED = 3;
    public static final int REASON_NON_IMS_CAPABLE_NETWORK = 4;
    public static final int REASON_RADIO_POWER_OFF = 5;
    public static final int REASON_HANDOVER_FAILED = 6;
    public static final int REASON_VOPS_NOT_SUPPORTED = 7;
    @android.annotation.SystemApi
    public ImsRegistrationImplBase() {}
    @android.annotation.SystemApi
    public ImsRegistrationImplBase(java.util.concurrent.Executor p0) {}
    public final android.telephony.ims.aidl.IImsRegistration getBinder() { return null; }
    @android.annotation.SystemApi
    public void updateSipDelegateRegistration() {}
    @android.annotation.SystemApi
    public void triggerSipDelegateDeregistration() {}
    @android.annotation.SystemApi
    public void triggerFullNetworkRegistration(int p0, java.lang.String p1) {}
    public void triggerDeregistration(int p0) {}
    @android.annotation.SystemApi
    public final void onRegistered(int p0) {}
    @android.annotation.SystemApi
    public final void onRegistered(android.telephony.ims.ImsRegistrationAttributes p0) {}
    @android.annotation.SystemApi
    public final void onRegistering(int p0) {}
    @android.annotation.SystemApi
    public final void onRegistering(android.telephony.ims.ImsRegistrationAttributes p0) {}
    @android.annotation.SystemApi
    public final void onDeregistered(android.telephony.ims.ImsReasonInfo p0) {}
    @android.annotation.SystemApi
    public final void onDeregistered(android.telephony.ims.ImsReasonInfo p0, int p1, int p2) {}
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.emergency_registration_state")
    public final void onDeregistered(android.telephony.ims.ImsReasonInfo p0, int p1, android.telephony.ims.ImsRegistrationAttributes p2) {}
    @android.annotation.SystemApi
    public final void onDeregistered(android.telephony.ims.ImsReasonInfo p0, android.telephony.ims.SipDetails p1) {}
    @android.annotation.SystemApi
    public final void onDeregistered(android.telephony.ims.ImsReasonInfo p0, int p1, int p2, android.telephony.ims.SipDetails p3) {}
    @android.annotation.SystemApi
    public final void onTechnologyChangeFailed(int p0, android.telephony.ims.ImsReasonInfo p1) {}
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.emergency_registration_state")
    public final void onTechnologyChangeFailed(android.telephony.ims.ImsReasonInfo p0, android.telephony.ims.ImsRegistrationAttributes p1) {}
    @android.annotation.SystemApi
    public final void onSubscriberAssociatedUriChanged(android.net.Uri[] p0) {}
    public final void setDefaultExecutor(java.util.concurrent.Executor p0) {}
    public final void clearRegistrationCache() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsDeregistrationReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsRegistrationTech {
    }
}
