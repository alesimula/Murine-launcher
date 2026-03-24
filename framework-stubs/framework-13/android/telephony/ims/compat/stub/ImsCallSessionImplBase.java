package android.telephony.ims.compat.stub;

public class ImsCallSessionImplBase extends com.android.ims.internal.IImsCallSession.Stub {
    public ImsCallSessionImplBase() { super(); }
    public final void setListener(android.telephony.ims.aidl.IImsCallSessionListener p0) throws android.os.RemoteException {}
    public void setListener(com.android.ims.internal.IImsCallSessionListener p0) {}
    public void close() {}
    public java.lang.String getCallId() { return null; }
    public android.telephony.ims.ImsCallProfile getCallProfile() { return null; }
    public android.telephony.ims.ImsCallProfile getLocalCallProfile() { return null; }
    public android.telephony.ims.ImsCallProfile getRemoteCallProfile() { return null; }
    public java.lang.String getProperty(java.lang.String p0) { return null; }
    public int getState() { return 0; }
    public boolean isInCall() { return false; }
    public void setMute(boolean p0) {}
    public void start(java.lang.String p0, android.telephony.ims.ImsCallProfile p1) {}
    public void startConference(java.lang.String[] p0, android.telephony.ims.ImsCallProfile p1) {}
    public void accept(int p0, android.telephony.ims.ImsStreamMediaProfile p1) {}
    public void deflect(java.lang.String p0) {}
    public void transfer(java.lang.String p0, boolean p1) {}
    public void consultativeTransfer(com.android.ims.internal.IImsCallSession p0) {}
    public void reject(int p0) {}
    public void terminate(int p0) {}
    public void hold(android.telephony.ims.ImsStreamMediaProfile p0) {}
    public void resume(android.telephony.ims.ImsStreamMediaProfile p0) {}
    public void merge() {}
    public void update(int p0, android.telephony.ims.ImsStreamMediaProfile p1) {}
    public void extendToConference(java.lang.String[] p0) {}
    public void inviteParticipants(java.lang.String[] p0) {}
    public void removeParticipants(java.lang.String[] p0) {}
    public void sendDtmf(char p0, android.os.Message p1) {}
    public void startDtmf(char p0) {}
    public void stopDtmf() {}
    public void sendUssd(java.lang.String p0) {}
    public com.android.ims.internal.IImsVideoCallProvider getVideoCallProvider() { return null; }
    public boolean isMultiparty() { return false; }
    public void sendRttModifyRequest(android.telephony.ims.ImsCallProfile p0) {}
    public void sendRttModifyResponse(boolean p0) {}
    public void sendRttMessage(java.lang.String p0) {}
    public void sendRtpHeaderExtensions(java.util.List<android.telephony.ims.RtpHeaderExtension> p0) {}

    private class ImsCallSessionListenerConverter extends com.android.ims.internal.IImsCallSessionListener.Stub {
        public ImsCallSessionListenerConverter(android.telephony.ims.compat.stub.ImsCallSessionImplBase p0, android.telephony.ims.aidl.IImsCallSessionListener p1) { super(); }
        public void callSessionProgressing(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsStreamMediaProfile p1) throws android.os.RemoteException {}
        public void callSessionStarted(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException {}
        public void callSessionStartFailed(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException {}
        public void callSessionTerminated(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException {}
        public void callSessionHeld(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException {}
        public void callSessionHoldFailed(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException {}
        public void callSessionHoldReceived(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException {}
        public void callSessionResumed(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException {}
        public void callSessionResumeFailed(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException {}
        public void callSessionResumeReceived(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException {}
        public void callSessionMergeStarted(com.android.ims.internal.IImsCallSession p0, com.android.ims.internal.IImsCallSession p1, android.telephony.ims.ImsCallProfile p2) throws android.os.RemoteException {}
        public void callSessionMergeComplete(com.android.ims.internal.IImsCallSession p0) throws android.os.RemoteException {}
        public void callSessionMergeFailed(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException {}
        public void callSessionUpdated(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException {}
        public void callSessionUpdateFailed(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException {}
        public void callSessionUpdateReceived(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException {}
        public void callSessionConferenceExtended(com.android.ims.internal.IImsCallSession p0, com.android.ims.internal.IImsCallSession p1, android.telephony.ims.ImsCallProfile p2) throws android.os.RemoteException {}
        public void callSessionConferenceExtendFailed(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException {}
        public void callSessionConferenceExtendReceived(com.android.ims.internal.IImsCallSession p0, com.android.ims.internal.IImsCallSession p1, android.telephony.ims.ImsCallProfile p2) throws android.os.RemoteException {}
        public void callSessionInviteParticipantsRequestDelivered(com.android.ims.internal.IImsCallSession p0) throws android.os.RemoteException {}
        public void callSessionInviteParticipantsRequestFailed(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException {}
        public void callSessionRemoveParticipantsRequestDelivered(com.android.ims.internal.IImsCallSession p0) throws android.os.RemoteException {}
        public void callSessionRemoveParticipantsRequestFailed(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException {}
        public void callSessionConferenceStateUpdated(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsConferenceState p1) throws android.os.RemoteException {}
        public void callSessionUssdMessageReceived(com.android.ims.internal.IImsCallSession p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void callSessionHandover(com.android.ims.internal.IImsCallSession p0, int p1, int p2, android.telephony.ims.ImsReasonInfo p3) throws android.os.RemoteException {}
        public void callSessionHandoverFailed(com.android.ims.internal.IImsCallSession p0, int p1, int p2, android.telephony.ims.ImsReasonInfo p3) throws android.os.RemoteException {}
        public void callSessionMayHandover(com.android.ims.internal.IImsCallSession p0, int p1, int p2) throws android.os.RemoteException {}
        public void callSessionTtyModeReceived(com.android.ims.internal.IImsCallSession p0, int p1) throws android.os.RemoteException {}
        public void callSessionMultipartyStateChanged(com.android.ims.internal.IImsCallSession p0, boolean p1) throws android.os.RemoteException {}
        public void callSessionSuppServiceReceived(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsSuppServiceNotification p1) throws android.os.RemoteException {}
        public void callSessionRttModifyRequestReceived(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException {}
        public void callSessionRttModifyResponseReceived(int p0) throws android.os.RemoteException {}
        public void callSessionRttMessageReceived(java.lang.String p0) throws android.os.RemoteException {}
        public void callSessionRttAudioIndicatorChanged(android.telephony.ims.ImsStreamMediaProfile p0) throws android.os.RemoteException {}
        public void callSessionTransferred() throws android.os.RemoteException {}
        public void callSessionTransferFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
        public void callQualityChanged(android.telephony.CallQuality p0) throws android.os.RemoteException {}
    }
}
