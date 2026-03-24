package android.telephony.ims.feature;

@android.annotation.SystemApi
public abstract class ImsFeature {
    private static final java.lang.String LOG_TAG = "ImsFeature";
    public static final java.lang.String ACTION_IMS_SERVICE_UP = "com.android.ims.IMS_SERVICE_UP";
    public static final java.lang.String ACTION_IMS_SERVICE_DOWN = "com.android.ims.IMS_SERVICE_DOWN";
    public static final java.lang.String EXTRA_PHONE_ID = "android:phone_id";
    public static final int FEATURE_INVALID = -1;
    public static final int FEATURE_EMERGENCY_MMTEL = 0;
    public static final int FEATURE_MMTEL = 1;
    public static final int FEATURE_RCS = 2;
    public static final int FEATURE_MAX = 3;
    public static final int STATE_UNAVAILABLE = 0;
    public static final int STATE_INITIALIZING = 1;
    public static final int STATE_READY = 2;
    public static final int CAPABILITY_ERROR_GENERIC = -1;
    public static final int CAPABILITY_SUCCESS = 0;
    protected android.content.Context mContext;
    protected final java.lang.Object mLock = null;
    private final java.util.Set<com.android.ims.internal.IImsFeatureStatusCallback> mStatusCallbacks = null;
    private int mState;
    private int mSlotId;
    private final android.os.RemoteCallbackList<android.telephony.ims.aidl.IImsCapabilityCallback> mCapabilityCallbacks = null;
    private android.telephony.ims.feature.ImsFeature.Capabilities mCapabilityStatus;
    public ImsFeature() {}
    public final void initialize(android.content.Context p0, int p1) {}
    public int getFeatureState() { return 0; }
    public final void setFeatureState(int p0) {}
    public void addImsFeatureStatusCallback(com.android.ims.internal.IImsFeatureStatusCallback p0) {}
    public void removeImsFeatureStatusCallback(com.android.ims.internal.IImsFeatureStatusCallback p0) {}
    private void notifyFeatureState(int p0) {}
    public final void addCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) {}
    public final void removeCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) {}
    public android.telephony.ims.feature.ImsFeature.Capabilities queryCapabilityStatus() { return null; }
    public final void requestChangeEnabledCapabilities(android.telephony.ims.feature.CapabilityChangeRequest p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) {}
    protected final void notifyCapabilitiesStatusChanged(android.telephony.ims.feature.ImsFeature.Capabilities p0) {}
    public abstract void changeEnabledCapabilities(android.telephony.ims.feature.CapabilityChangeRequest p0, android.telephony.ims.feature.ImsFeature.CapabilityCallbackProxy p1);
    public abstract void onFeatureRemoved();
    public abstract void onFeatureReady();
    protected abstract android.os.IInterface getBinder();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsCapabilityError {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FeatureType {
    }

    protected static class CapabilityCallbackProxy {
        private final android.telephony.ims.aidl.IImsCapabilityCallback mCallback = null;
        public CapabilityCallbackProxy(android.telephony.ims.aidl.IImsCapabilityCallback p0) {}
        public void onChangeCapabilityConfigurationError(int p0, int p1, int p2) {}
    }

    @android.annotation.SystemApi
    public static class Capabilities {
        protected int mCapabilities;
        public Capabilities() {}
        protected Capabilities(int p0) {}
        public void addCapabilities(int p0) {}
        public void removeCapabilities(int p0) {}
        public boolean isCapable(int p0) { return false; }
        public android.telephony.ims.feature.ImsFeature.Capabilities copy() { return null; }
        public int getMask() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
