package android.telephony.ims.feature;

@android.annotation.SystemApi
public class RcsFeature extends android.telephony.ims.feature.ImsFeature {
    private static final java.lang.String LOG_TAG = "RcsFeature";
    private final java.util.concurrent.Executor mExecutor = null;
    private final android.telephony.ims.feature.RcsFeature.RcsFeatureBinder mImsRcsBinder = null;
    private android.telephony.ims.stub.RcsCapabilityExchangeImplBase mCapabilityExchangeImpl;
    private android.telephony.ims.stub.CapabilityExchangeEventListener mCapExchangeEventListener;
    @java.lang.Deprecated
    public RcsFeature() { super(); }
    public RcsFeature(java.util.concurrent.Executor p0) { super(); }
    public void initialize(android.content.Context p0, int p1) {}
    public final android.telephony.ims.feature.RcsFeature.RcsImsCapabilities queryCapabilityStatus() { return null; }
    public final void notifyCapabilitiesStatusChanged(android.telephony.ims.feature.RcsFeature.RcsImsCapabilities p0) {}
    public boolean queryCapabilityConfiguration(int p0, int p1) { return false; }
    public void changeEnabledCapabilities(android.telephony.ims.feature.CapabilityChangeRequest p0, android.telephony.ims.feature.ImsFeature.CapabilityCallbackProxy p1) {}
    public android.telephony.ims.stub.RcsCapabilityExchangeImplBase createCapabilityExchangeImpl(android.telephony.ims.stub.CapabilityExchangeEventListener p0) { return null; }
    public void destroyCapabilityExchangeImpl(android.telephony.ims.stub.RcsCapabilityExchangeImplBase p0) {}
    public void onFeatureRemoved() {}
    public void onFeatureReady() {}
    public final android.telephony.ims.aidl.IImsRcsFeature getBinder() { return null; }
    private void setCapabilityExchangeEventListener(android.telephony.ims.stub.CapabilityExchangeEventListener p0) {}
    private void initRcsCapabilityExchangeImplBase(android.telephony.ims.stub.CapabilityExchangeEventListener p0) {}
    private android.telephony.ims.stub.RcsCapabilityExchangeImplBase getCapabilityExchangeImplBaseInternal() { return null; }

    private static final class RcsFeatureBinder extends android.telephony.ims.aidl.IImsRcsFeature.Stub {
        private final android.telephony.ims.feature.RcsFeature mReference = null;
        private final java.util.concurrent.Executor mExecutor = null;
        RcsFeatureBinder(android.telephony.ims.feature.RcsFeature p0, java.util.concurrent.Executor p1) { super(); }
        public int queryCapabilityStatus() throws android.os.RemoteException { return 0; }
        public void addCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) throws android.os.RemoteException {}
        public void removeCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) throws android.os.RemoteException {}
        public void changeCapabilitiesConfiguration(android.telephony.ims.feature.CapabilityChangeRequest p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
        public void queryCapabilityConfiguration(int p0, int p1, android.telephony.ims.aidl.IImsCapabilityCallback p2) throws android.os.RemoteException {}
        public int getFeatureState() throws android.os.RemoteException { return 0; }
        public void setCapabilityExchangeEventListener(android.telephony.ims.aidl.ICapabilityExchangeEventListener p0) throws android.os.RemoteException {}
        public void publishCapabilities(java.lang.String p0, android.telephony.ims.aidl.IPublishResponseCallback p1) throws android.os.RemoteException {}
        public void subscribeForCapabilities(java.util.List<android.net.Uri> p0, android.telephony.ims.aidl.ISubscribeResponseCallback p1) throws android.os.RemoteException {}
        public void sendOptionsCapabilityRequest(android.net.Uri p0, java.util.List<java.lang.String> p1, android.telephony.ims.aidl.IOptionsResponseCallback p2) throws android.os.RemoteException {}
        private void executeMethodAsync(java.lang.Runnable p0, java.lang.String p1) throws android.os.RemoteException {}
        private <T extends java.lang.Object> T executeMethodAsyncForResult(java.util.function.Supplier<T> p0, java.lang.String p1) throws android.os.RemoteException { return null; }
    }

    public static class RcsImsCapabilities extends android.telephony.ims.feature.ImsFeature.Capabilities {
        public static final int CAPABILITY_TYPE_NONE = 0;
        public static final int CAPABILITY_TYPE_OPTIONS_UCE = 1;
        public static final int CAPABILITY_TYPE_PRESENCE_UCE = 2;
        public RcsImsCapabilities(int p0) { super(); }
        private RcsImsCapabilities(android.telephony.ims.feature.ImsFeature.Capabilities p0) { super(); }
        public void addCapabilities(int p0) {}
        public void removeCapabilities(int p0) {}
        public boolean isCapable(int p0) { return false; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface RcsImsCapabilityFlag {
        }
    }
}
