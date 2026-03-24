package android.telephony.ims;

@android.annotation.SystemApi
public class ImsUtListener {
    @java.lang.Deprecated
    public static final java.lang.String BUNDLE_KEY_CLIR = "queryClir";
    @java.lang.Deprecated
    public static final java.lang.String BUNDLE_KEY_SSINFO = "imsSsInfo";
    private com.android.ims.internal.IImsUtListener mServiceInterface;
    private static final java.lang.String LOG_TAG = "ImsUtListener";
    public void onUtConfigurationUpdated(int p0) {}
    public void onUtConfigurationUpdateFailed(int p0, android.telephony.ims.ImsReasonInfo p1) {}
    @java.lang.Deprecated
    public void onUtConfigurationQueried(int p0, android.os.Bundle p1) {}
    public void onLineIdentificationSupplementaryServiceResponse(int p0, android.telephony.ims.ImsSsInfo p1) {}
    public void onUtConfigurationQueryFailed(int p0, android.telephony.ims.ImsReasonInfo p1) {}
    public void onUtConfigurationCallBarringQueried(int p0, android.telephony.ims.ImsSsInfo[] p1) {}
    public void onUtConfigurationCallForwardQueried(int p0, android.telephony.ims.ImsCallForwardInfo[] p1) {}
    public void onUtConfigurationCallWaitingQueried(int p0, android.telephony.ims.ImsSsInfo[] p1) {}
    public void onSupplementaryServiceIndication(android.telephony.ims.ImsSsData p0) {}
    public ImsUtListener(com.android.ims.internal.IImsUtListener p0) {}
    public com.android.ims.internal.IImsUtListener getListenerInterface() { return null; }
}
