package android.telephony.ims.stub;

@android.annotation.SystemApi
public class ImsRegistrationImplBase {
    private static final java.lang.String LOG_TAG = "ImsRegistrationImplBase";
    public static final int REGISTRATION_TECH_NONE = -1;
    public static final int REGISTRATION_TECH_LTE = 0;
    public static final int REGISTRATION_TECH_IWLAN = 1;
    private static final int REGISTRATION_STATE_UNKNOWN = -1;
    private final android.telephony.ims.aidl.IImsRegistration mBinder = null;
    private final com.android.internal.telephony.util.RemoteCallbackListExt<android.telephony.ims.aidl.IImsRegistrationCallback> mCallbacks = null;
    private final java.lang.Object mLock = null;
    private int mConnectionType;
    private int mRegistrationState;
    private android.telephony.ims.ImsReasonInfo mLastDisconnectCause;
    private android.net.Uri[] mUris;
    private boolean mUrisSet;
    public ImsRegistrationImplBase() {}
    public final android.telephony.ims.aidl.IImsRegistration getBinder() { return null; }
    private void addRegistrationCallback(android.telephony.ims.aidl.IImsRegistrationCallback p0) throws android.os.RemoteException {}
    private void removeRegistrationCallback(android.telephony.ims.aidl.IImsRegistrationCallback p0) {}
    public final void onRegistered(int p0) {}
    public final void onRegistering(int p0) {}
    public final void onDeregistered(android.telephony.ims.ImsReasonInfo p0) {}
    public final void onTechnologyChangeFailed(int p0, android.telephony.ims.ImsReasonInfo p1) {}
    public final void onSubscriberAssociatedUriChanged(android.net.Uri[] p0) {}
    private void onSubscriberAssociatedUriChanged(android.telephony.ims.aidl.IImsRegistrationCallback p0, android.net.Uri[] p1) {}
    private void updateToState(int p0, int p1) {}
    private void updateToDisconnectedState(android.telephony.ims.ImsReasonInfo p0) {}
    public final int getConnectionType() { return 0; }
    private void updateNewCallbackWithState(android.telephony.ims.aidl.IImsRegistrationCallback p0) throws android.os.RemoteException {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsRegistrationTech {
    }
}
