package android.telephony.ims.aidl;

public class RcsPublishResponseAidlWrapper implements android.telephony.ims.stub.RcsCapabilityExchangeImplBase.PublishResponseCallback {
    public RcsPublishResponseAidlWrapper(android.telephony.ims.aidl.IPublishResponseCallback p0) {}
    public void onCommandError(int p0) throws android.telephony.ims.ImsException {}
    @java.lang.Deprecated
    public void onNetworkResponse(int p0, java.lang.String p1) throws android.telephony.ims.ImsException {}
    @java.lang.Deprecated
    public void onNetworkResponse(int p0, java.lang.String p1, int p2, java.lang.String p3) throws android.telephony.ims.ImsException {}
    public void onNetworkResponse(android.telephony.ims.SipDetails p0) throws android.telephony.ims.ImsException {}
}
