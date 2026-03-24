package android.telephony.ims.aidl;

public class RcsSubscribeResponseAidlWrapper implements android.telephony.ims.stub.RcsCapabilityExchangeImplBase.SubscribeResponseCallback {
    public RcsSubscribeResponseAidlWrapper(android.telephony.ims.aidl.ISubscribeResponseCallback p0) {}
    public void onCommandError(int p0) throws android.telephony.ims.ImsException {}
    @java.lang.Deprecated
    public void onNetworkResponse(int p0, java.lang.String p1) throws android.telephony.ims.ImsException {}
    @java.lang.Deprecated
    public void onNetworkResponse(int p0, java.lang.String p1, int p2, java.lang.String p3) throws android.telephony.ims.ImsException {}
    public void onNetworkResponse(android.telephony.ims.SipDetails p0) throws android.telephony.ims.ImsException {}
    public void onNotifyCapabilitiesUpdate(java.util.List<java.lang.String> p0) throws android.telephony.ims.ImsException {}
    public void onResourceTerminated(java.util.List<android.util.Pair<android.net.Uri, java.lang.String>> p0) throws android.telephony.ims.ImsException {}
    public void onTerminated(java.lang.String p0, long p1) throws android.telephony.ims.ImsException {}
}
