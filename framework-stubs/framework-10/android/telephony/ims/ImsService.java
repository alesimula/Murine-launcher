package android.telephony.ims;

@android.annotation.SystemApi
public class ImsService extends android.app.Service {
    private static final java.lang.String LOG_TAG = "ImsService";
    public static final java.lang.String SERVICE_INTERFACE = "android.telephony.ims.ImsService";
    private final android.util.SparseArray<android.util.SparseArray<android.telephony.ims.feature.ImsFeature>> mFeaturesBySlot = null;
    private android.telephony.ims.aidl.IImsServiceControllerListener mListener;
    protected final android.os.IBinder mImsServiceController = null;
    public ImsService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public android.util.SparseArray<android.telephony.ims.feature.ImsFeature> getFeatures(int p0) { return null; }
    private android.telephony.ims.aidl.IImsMmTelFeature createMmTelFeatureInternal(int p0, com.android.ims.internal.IImsFeatureStatusCallback p1) { return null; }
    private android.telephony.ims.aidl.IImsRcsFeature createRcsFeatureInternal(int p0, com.android.ims.internal.IImsFeatureStatusCallback p1) { return null; }
    private void setupFeature(android.telephony.ims.feature.ImsFeature p0, int p1, int p2, com.android.ims.internal.IImsFeatureStatusCallback p3) {}
    private void addImsFeature(int p0, int p1, android.telephony.ims.feature.ImsFeature p2) {}
    private void removeImsFeature(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) {}
    public android.telephony.ims.stub.ImsFeatureConfiguration querySupportedImsFeatures() { return null; }
    public final void onUpdateSupportedImsFeatures(android.telephony.ims.stub.ImsFeatureConfiguration p0) throws android.os.RemoteException {}
    public void readyForFeatureCreation() {}
    public void enableIms(int p0) {}
    public void disableIms(int p0) {}
    public android.telephony.ims.feature.MmTelFeature createMmTelFeature(int p0) { return null; }
    public android.telephony.ims.feature.RcsFeature createRcsFeature(int p0) { return null; }
    public android.telephony.ims.stub.ImsConfigImplBase getConfig(int p0) { return null; }
    public android.telephony.ims.stub.ImsRegistrationImplBase getRegistration(int p0) { return null; }

    public static class Listener extends android.telephony.ims.aidl.IImsServiceControllerListener.Stub {
        public Listener() { super(); }
        public void onUpdateSupportedImsFeatures(android.telephony.ims.stub.ImsFeatureConfiguration p0) {}
    }
}
