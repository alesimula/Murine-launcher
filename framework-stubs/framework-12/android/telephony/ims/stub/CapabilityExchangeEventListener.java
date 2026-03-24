package android.telephony.ims.stub;

@android.annotation.SystemApi
public interface CapabilityExchangeEventListener {
    public void onRequestPublishCapabilities(int p0) throws android.telephony.ims.ImsException;
    public void onUnpublish() throws android.telephony.ims.ImsException;
    public void onRemoteCapabilityRequest(android.net.Uri p0, java.util.Set<java.lang.String> p1, android.telephony.ims.stub.CapabilityExchangeEventListener.OptionsRequestCallback p2) throws android.telephony.ims.ImsException;

    public static interface OptionsRequestCallback {
        public void onRespondToCapabilityRequest(android.telephony.ims.RcsContactUceCapability p0, boolean p1);
        public void onRespondToCapabilityRequestWithError(int p0, java.lang.String p1);
    }
}
