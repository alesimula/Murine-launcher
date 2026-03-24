package android.telephony.ims.compat.stub;

public class ImsUtListenerImplBase extends com.android.ims.internal.IImsUtListener.Stub {
    public ImsUtListenerImplBase() { super(); }
    public void utConfigurationUpdated(com.android.ims.internal.IImsUt p0, int p1) throws android.os.RemoteException {}
    public void utConfigurationUpdateFailed(com.android.ims.internal.IImsUt p0, int p1, android.telephony.ims.ImsReasonInfo p2) throws android.os.RemoteException {}
    public void utConfigurationQueried(com.android.ims.internal.IImsUt p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
    public void utConfigurationQueryFailed(com.android.ims.internal.IImsUt p0, int p1, android.telephony.ims.ImsReasonInfo p2) throws android.os.RemoteException {}
    public void lineIdentificationSupplementaryServiceResponse(int p0, android.telephony.ims.ImsSsInfo p1) {}
    public void utConfigurationCallBarringQueried(com.android.ims.internal.IImsUt p0, int p1, android.telephony.ims.ImsSsInfo[] p2) throws android.os.RemoteException {}
    public void utConfigurationCallForwardQueried(com.android.ims.internal.IImsUt p0, int p1, android.telephony.ims.ImsCallForwardInfo[] p2) throws android.os.RemoteException {}
    public void utConfigurationCallWaitingQueried(com.android.ims.internal.IImsUt p0, int p1, android.telephony.ims.ImsSsInfo[] p2) throws android.os.RemoteException {}
    public void onSupplementaryServiceIndication(android.telephony.ims.ImsSsData p0) {}
}
