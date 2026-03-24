package android.telephony.ims.feature;

@android.annotation.SystemApi
public abstract class ImsFeature {
    private static final java.lang.String LOG_TAG = "ImsFeature";
    public static final int FEATURE_INVALID = -1;
    @android.annotation.SystemApi
    public static final int FEATURE_EMERGENCY_MMTEL = 0;
    @android.annotation.SystemApi
    public static final int FEATURE_MMTEL = 1;
    @android.annotation.SystemApi
    public static final int FEATURE_RCS = 2;
    public static final int FEATURE_MAX = 3;
    public static final java.util.Map<java.lang.Integer, java.lang.String> FEATURE_LOG_MAP = null;
    @android.annotation.SystemApi
    public static final int STATE_UNAVAILABLE = 0;
    @android.annotation.SystemApi
    public static final int STATE_INITIALIZING = 1;
    @android.annotation.SystemApi
    public static final int STATE_READY = 2;
    public static final java.util.Map<java.lang.Integer, java.lang.String> STATE_LOG_MAP = null;
    @android.annotation.SystemApi
    public static final int CAPABILITY_ERROR_GENERIC = -1;
    @android.annotation.SystemApi
    public static final int CAPABILITY_SUCCESS = 0;
    protected android.content.Context mContext;
    protected final java.lang.Object mLock = null;
    private final com.android.internal.telephony.util.RemoteCallbackListExt<com.android.ims.internal.IImsFeatureStatusCallback> mStatusCallbacks = null;
    private int mState;
    private int mSlotId;
    private final com.android.internal.telephony.util.RemoteCallbackListExt<android.telephony.ims.aidl.IImsCapabilityCallback> mCapabilityCallbacks = null;
    private android.telephony.ims.feature.ImsFeature.Capabilities mCapabilityStatus;
    public ImsFeature() {}
    public final void initialize(android.content.Context p0, int p1) {}
    @android.annotation.SystemApi
    public final int getSlotIndex() { return 0; }
    @android.annotation.SystemApi
    public int getFeatureState() { return 0; }
    @android.annotation.SystemApi
    public final void setFeatureState(int p0) {}
    public void addImsFeatureStatusCallback(com.android.ims.internal.IImsFeatureStatusCallback p0) {}
    public void removeImsFeatureStatusCallback(com.android.ims.internal.IImsFeatureStatusCallback p0) {}
    private void notifyFeatureState(int p0) {}
    public final void addCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) {}
    final void removeCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) {}
    final void queryCapabilityConfigurationInternal(int p0, int p1, android.telephony.ims.aidl.IImsCapabilityCallback p2) {}
    public android.telephony.ims.feature.ImsFeature.Capabilities queryCapabilityStatus() { return null; }
    public final void requestChangeEnabledCapabilities(android.telephony.ims.feature.CapabilityChangeRequest p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) {}
    protected final void notifyCapabilitiesStatusChanged(android.telephony.ims.feature.ImsFeature.Capabilities p0) {}
    public abstract boolean queryCapabilityConfiguration(int p0, int p1);
    public abstract void changeEnabledCapabilities(android.telephony.ims.feature.CapabilityChangeRequest p0, android.telephony.ims.feature.ImsFeature.CapabilityCallbackProxy p1);
    public abstract void onFeatureRemoved();
    public abstract void onFeatureReady();
    protected abstract android.os.IInterface getBinder();

    @java.lang.Deprecated
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

    protected static class CapabilityCallbackProxy {
        private final android.telephony.ims.aidl.IImsCapabilityCallback mCallback = null;
        public CapabilityCallbackProxy(android.telephony.ims.aidl.IImsCapabilityCallback p0) {}
        public void onChangeCapabilityConfigurationError(int p0, int p1, int p2) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FeatureType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsCapabilityError {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsState {
    }
}
