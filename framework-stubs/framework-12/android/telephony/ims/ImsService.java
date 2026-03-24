package android.telephony.ims;

@android.annotation.SystemApi
public class ImsService extends android.app.Service {
    private static final java.lang.String LOG_TAG = "ImsService";
    public static final long CAPABILITY_EMERGENCY_OVER_MMTEL = 1L;
    public static final long CAPABILITY_SIP_DELEGATE_CREATION = 2L;
    public static final long CAPABILITY_MAX_INDEX = Long.valueOf(0L);
    private static final java.util.Map<java.lang.Long, java.lang.String> CAPABILITIES_LOG_MAP = null;
    public static final java.lang.String SERVICE_INTERFACE = "android.telephony.ims.ImsService";
    private final android.util.SparseArray<android.util.SparseArray<android.telephony.ims.feature.ImsFeature>> mFeaturesBySlot = null;
    private android.telephony.ims.aidl.IImsServiceControllerListener mListener;
    protected final android.os.IBinder mImsServiceController = null;
    public ImsService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public android.util.SparseArray<android.telephony.ims.feature.ImsFeature> getFeatures(int p0) { return null; }
    private android.telephony.ims.aidl.IImsMmTelFeature createMmTelFeatureInternal(int p0) { return null; }
    private android.telephony.ims.aidl.IImsRcsFeature createRcsFeatureInternal(int p0) { return null; }
    private void setupFeature(android.telephony.ims.feature.ImsFeature p0, int p1, int p2) {}
    private void addImsFeatureStatusCallback(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) {}
    private void removeImsFeatureStatusCallback(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) {}
    private void addImsFeature(int p0, int p1, android.telephony.ims.feature.ImsFeature p2) {}
    private void removeImsFeature(int p0, int p1) {}
    public android.telephony.ims.stub.ImsFeatureConfiguration querySupportedImsFeatures() { return null; }
    public final void onUpdateSupportedImsFeatures(android.telephony.ims.stub.ImsFeatureConfiguration p0) throws android.os.RemoteException {}
    @android.annotation.SuppressLint("OnNameExpected")
    public long getImsServiceCapabilities() { return 0L; }
    public void readyForFeatureCreation() {}
    public void enableIms(int p0) {}
    public void disableIms(int p0) {}
    public android.telephony.ims.feature.MmTelFeature createMmTelFeature(int p0) { return null; }
    public android.telephony.ims.feature.RcsFeature createRcsFeature(int p0) { return null; }
    public android.telephony.ims.stub.ImsConfigImplBase getConfig(int p0) { return null; }
    public android.telephony.ims.stub.ImsRegistrationImplBase getRegistration(int p0) { return null; }
    @android.annotation.SuppressLint("OnNameExpected")
    public android.telephony.ims.stub.SipTransportImplBase getSipTransport(int p0) { return null; }
    private static long sanitizeCapabilities(long p0) { return 0L; }
    public static java.lang.String getCapabilitiesString(long p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsServiceCapability {
    }

    public static class Listener extends android.telephony.ims.aidl.IImsServiceControllerListener.Stub {
        public Listener() { super(); }
        public void onUpdateSupportedImsFeatures(android.telephony.ims.stub.ImsFeatureConfiguration p0) {}
    }
}
