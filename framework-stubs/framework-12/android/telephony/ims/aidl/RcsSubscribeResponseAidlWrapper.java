package android.telephony.ims.aidl;

public class RcsSubscribeResponseAidlWrapper implements android.telephony.ims.stub.RcsCapabilityExchangeImplBase.SubscribeResponseCallback {
    private final android.telephony.ims.aidl.ISubscribeResponseCallback mResponseBinder = null;
    public RcsSubscribeResponseAidlWrapper(android.telephony.ims.aidl.ISubscribeResponseCallback p0) {}
    public void onCommandError(int p0) throws android.telephony.ims.ImsException {}
    public void onNetworkResponse(int p0, java.lang.String p1) throws android.telephony.ims.ImsException {}
    public void onNetworkResponse(int p0, java.lang.String p1, int p2, java.lang.String p3) throws android.telephony.ims.ImsException {}
    public void onNotifyCapabilitiesUpdate(java.util.List<java.lang.String> p0) throws android.telephony.ims.ImsException {}
    public void onResourceTerminated(java.util.List<android.util.Pair<android.net.Uri, java.lang.String>> p0) throws android.telephony.ims.ImsException {}
    private java.util.List<android.telephony.ims.RcsContactTerminatedReason> getTerminatedReasonList(java.util.List<android.util.Pair<android.net.Uri, java.lang.String>> p0) { return null; }
    public void onTerminated(java.lang.String p0, long p1) throws android.telephony.ims.ImsException {}
}
