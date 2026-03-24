package android.telephony.ims;

@android.annotation.SystemApi
public class ImsCallSessionListener {
    private final android.telephony.ims.aidl.IImsCallSessionListener mListener = null;
    public ImsCallSessionListener(android.telephony.ims.aidl.IImsCallSessionListener p0) {}
    public void callSessionInitiating(android.telephony.ims.ImsCallProfile p0) {}
    public void callSessionInitiatingFailed(android.telephony.ims.ImsReasonInfo p0) {}
    public void callSessionProgressing(android.telephony.ims.ImsStreamMediaProfile p0) {}
    public void callSessionInitiated(android.telephony.ims.ImsCallProfile p0) {}
    @java.lang.Deprecated
    public void callSessionInitiatedFailed(android.telephony.ims.ImsReasonInfo p0) {}
    public void callSessionTerminated(android.telephony.ims.ImsReasonInfo p0) {}
    public void callSessionHeld(android.telephony.ims.ImsCallProfile p0) {}
    public void callSessionHoldFailed(android.telephony.ims.ImsReasonInfo p0) {}
    public void callSessionHoldReceived(android.telephony.ims.ImsCallProfile p0) {}
    public void callSessionResumed(android.telephony.ims.ImsCallProfile p0) {}
    public void callSessionResumeFailed(android.telephony.ims.ImsReasonInfo p0) {}
    public void callSessionResumeReceived(android.telephony.ims.ImsCallProfile p0) {}
    public void callSessionMergeStarted(android.telephony.ims.stub.ImsCallSessionImplBase p0, android.telephony.ims.ImsCallProfile p1) {}
    public void callSessionMergeStarted(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) {}
    public void callSessionMergeComplete(android.telephony.ims.stub.ImsCallSessionImplBase p0) {}
    public void callSessionMergeComplete(com.android.ims.internal.IImsCallSession p0) {}
    public void callSessionMergeFailed(android.telephony.ims.ImsReasonInfo p0) {}
    public void callSessionUpdated(android.telephony.ims.ImsCallProfile p0) {}
    public void callSessionUpdateFailed(android.telephony.ims.ImsReasonInfo p0) {}
    public void callSessionUpdateReceived(android.telephony.ims.ImsCallProfile p0) {}
    public void callSessionConferenceExtended(android.telephony.ims.stub.ImsCallSessionImplBase p0, android.telephony.ims.ImsCallProfile p1) {}
    public void callSessionConferenceExtended(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) {}
    public void callSessionConferenceExtendFailed(android.telephony.ims.ImsReasonInfo p0) {}
    public void callSessionConferenceExtendReceived(android.telephony.ims.stub.ImsCallSessionImplBase p0, android.telephony.ims.ImsCallProfile p1) {}
    public void callSessionConferenceExtendReceived(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) {}
    public void callSessionInviteParticipantsRequestDelivered() {}
    public void callSessionInviteParticipantsRequestFailed(android.telephony.ims.ImsReasonInfo p0) {}
    public void callSessionRemoveParticipantsRequestDelivered() {}
    public void callSessionRemoveParticipantsRequestFailed(android.telephony.ims.ImsReasonInfo p0) {}
    public void callSessionConferenceStateUpdated(android.telephony.ims.ImsConferenceState p0) {}
    public void callSessionUssdMessageReceived(int p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public void callSessionMayHandover(int p0, int p1) {}
    public void onMayHandover(int p0, int p1) {}
    @java.lang.Deprecated
    public void callSessionHandover(int p0, int p1, android.telephony.ims.ImsReasonInfo p2) {}
    public void onHandover(int p0, int p1, android.telephony.ims.ImsReasonInfo p2) {}
    @java.lang.Deprecated
    public void callSessionHandoverFailed(int p0, int p1, android.telephony.ims.ImsReasonInfo p2) {}
    public void onHandoverFailed(int p0, int p1, android.telephony.ims.ImsReasonInfo p2) {}
    public void callSessionTtyModeReceived(int p0) {}
    public void callSessionMultipartyStateChanged(boolean p0) {}
    public void callSessionSuppServiceReceived(android.telephony.ims.ImsSuppServiceNotification p0) {}
    public void callSessionRttModifyRequestReceived(android.telephony.ims.ImsCallProfile p0) {}
    public void callSessionRttModifyResponseReceived(int p0) {}
    public void callSessionRttMessageReceived(java.lang.String p0) {}
    public void callSessionRttAudioIndicatorChanged(android.telephony.ims.ImsStreamMediaProfile p0) {}
    public void callQualityChanged(android.telephony.CallQuality p0) {}
    public void callSessionDtmfReceived(char p0) {}
    public void callSessionRtpHeaderExtensionsReceived(java.util.Set<android.telephony.ims.RtpHeaderExtension> p0) {}
    public void callSessionTransferred() {}
    public void callSessionTransferFailed(android.telephony.ims.ImsReasonInfo p0) {}
}
