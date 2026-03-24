package android.telephony.ims.aidl;

public class CapabilityExchangeAidlWrapper implements android.telephony.ims.stub.CapabilityExchangeEventListener {
    private static final java.lang.String LOG_TAG = "CapExchangeListener";
    private final android.telephony.ims.aidl.ICapabilityExchangeEventListener mListenerBinder = null;
    public CapabilityExchangeAidlWrapper(android.telephony.ims.aidl.ICapabilityExchangeEventListener p0) {}
    public void onRequestPublishCapabilities(int p0) throws android.telephony.ims.ImsException {}
    public void onUnpublish() throws android.telephony.ims.ImsException {}
    public void onRemoteCapabilityRequest(android.net.Uri p0, java.util.Set<java.lang.String> p1, android.telephony.ims.stub.CapabilityExchangeEventListener.OptionsRequestCallback p2) throws android.telephony.ims.ImsException {}
}
