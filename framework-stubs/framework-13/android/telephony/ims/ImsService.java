package android.telephony.ims;

@android.annotation.SystemApi
public class ImsService extends android.app.Service {
    public static final long CAPABILITY_EMERGENCY_OVER_MMTEL = 1L;
    public static final long CAPABILITY_SIP_DELEGATE_CREATION = 2L;
    public static final long CAPABILITY_MAX_INDEX = Long.valueOf(0L);
    public static final java.lang.String SERVICE_INTERFACE = "android.telephony.ims.ImsService";
    protected final android.os.IBinder mImsServiceController = null;
    public ImsService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public android.telephony.ims.feature.ImsFeature getImsFeature(int p0, int p1) { return null; }
    public boolean isImsFeatureCreatedForSlot(int p0, int p1) { return false; }
    public android.telephony.ims.stub.ImsFeatureConfiguration querySupportedImsFeatures() { return null; }
    public final void onUpdateSupportedImsFeatures(android.telephony.ims.stub.ImsFeatureConfiguration p0) throws android.os.RemoteException {}
    @android.annotation.SuppressLint("OnNameExpected")
    public long getImsServiceCapabilities() { return 0L; }
    public void readyForFeatureCreation() {}
    public void enableImsForSubscription(int p0, int p1) {}
    public void disableImsForSubscription(int p0, int p1) {}
    @java.lang.Deprecated
    public void enableIms(int p0) {}
    @java.lang.Deprecated
    public void disableIms(int p0) {}
    public android.telephony.ims.feature.MmTelFeature createMmTelFeatureForSubscription(int p0, int p1) { return null; }
    public android.telephony.ims.feature.RcsFeature createRcsFeatureForSubscription(int p0, int p1) { return null; }
    public android.telephony.ims.feature.MmTelFeature createEmergencyOnlyMmTelFeature(int p0) { return null; }
    @java.lang.Deprecated
    public android.telephony.ims.feature.MmTelFeature createMmTelFeature(int p0) { return null; }
    @java.lang.Deprecated
    public android.telephony.ims.feature.RcsFeature createRcsFeature(int p0) { return null; }
    public android.telephony.ims.stub.ImsConfigImplBase getConfigForSubscription(int p0, int p1) { return null; }
    public android.telephony.ims.stub.ImsRegistrationImplBase getRegistrationForSubscription(int p0, int p1) { return null; }
    @java.lang.Deprecated
    public android.telephony.ims.stub.ImsConfigImplBase getConfig(int p0) { return null; }
    @java.lang.Deprecated
    public android.telephony.ims.stub.ImsRegistrationImplBase getRegistration(int p0) { return null; }
    @android.annotation.SuppressLint("OnNameExpected")
    public android.telephony.ims.stub.SipTransportImplBase getSipTransport(int p0) { return null; }
    public static java.lang.String getCapabilitiesString(long p0) { return null; }
    public java.util.concurrent.Executor getExecutor() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsServiceCapability {
    }

    public static class Listener extends android.telephony.ims.aidl.IImsServiceControllerListener.Stub {
        public Listener() { super(); }
        public void onUpdateSupportedImsFeatures(android.telephony.ims.stub.ImsFeatureConfiguration p0) {}
    }
}
