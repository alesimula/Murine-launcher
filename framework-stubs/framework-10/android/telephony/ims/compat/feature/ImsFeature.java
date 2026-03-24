package android.telephony.ims.compat.feature;

public abstract class ImsFeature {
    private static final java.lang.String LOG_TAG = "ImsFeature";
    public static final int INVALID = -1;
    public static final int EMERGENCY_MMTEL = 0;
    public static final int MMTEL = 1;
    public static final int RCS = 2;
    public static final int MAX = 3;
    public static final int STATE_NOT_AVAILABLE = 0;
    public static final int STATE_INITIALIZING = 1;
    public static final int STATE_READY = 2;
    private final java.util.Set<com.android.ims.internal.IImsFeatureStatusCallback> mStatusCallbacks = null;
    private int mState;
    private int mSlotId;
    protected android.content.Context mContext;
    public ImsFeature() {}
    public void setContext(android.content.Context p0) {}
    public void setSlotId(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public int getFeatureState() { return 0; }
    @android.annotation.UnsupportedAppUsage
    protected final void setFeatureState(int p0) {}
    public void addImsFeatureStatusCallback(com.android.ims.internal.IImsFeatureStatusCallback p0) {}
    public void removeImsFeatureStatusCallback(com.android.ims.internal.IImsFeatureStatusCallback p0) {}
    private void notifyFeatureState(int p0) {}
    public abstract void onFeatureReady();
    public abstract void onFeatureRemoved();
    public abstract android.os.IInterface getBinder();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsState {
    }
}
