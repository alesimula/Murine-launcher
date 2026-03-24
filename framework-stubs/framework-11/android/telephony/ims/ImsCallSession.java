package android.telephony.ims;

public class ImsCallSession {
    private static final java.lang.String TAG = "ImsCallSession";
    private final com.android.ims.internal.IImsCallSession miSession = null;
    private boolean mClosed;
    private android.telephony.ims.ImsCallSession.Listener mListener;
    public ImsCallSession(com.android.ims.internal.IImsCallSession p0) {}
    public ImsCallSession(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallSession.Listener p1) {}
    public void close() {}
    public java.lang.String getCallId() { return null; }
    public android.telephony.ims.ImsCallProfile getCallProfile() { return null; }
    public android.telephony.ims.ImsCallProfile getLocalCallProfile() { return null; }
    public android.telephony.ims.ImsCallProfile getRemoteCallProfile() { return null; }
    public com.android.ims.internal.IImsVideoCallProvider getVideoCallProvider() { return null; }
    public java.lang.String getProperty(java.lang.String p0) { return null; }
    public int getState() { return 0; }
    public boolean isAlive() { return false; }
    public com.android.ims.internal.IImsCallSession getSession() { return null; }
    public boolean isInCall() { return false; }
    public void setListener(android.telephony.ims.ImsCallSession.Listener p0) {}
    public void setMute(boolean p0) {}
    public void start(java.lang.String p0, android.telephony.ims.ImsCallProfile p1) {}
    public void start(java.lang.String[] p0, android.telephony.ims.ImsCallProfile p1) {}
    public void accept(int p0, android.telephony.ims.ImsStreamMediaProfile p1) {}
    public void deflect(java.lang.String p0) {}
    public void reject(int p0) {}
    public void transfer(java.lang.String p0, boolean p1) {}
    public void transfer(android.telephony.ims.ImsCallSession p0) {}
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
    public boolean isMultiparty() { return false; }
    public void sendRttMessage(java.lang.String p0) {}
    public void sendRttModifyRequest(android.telephony.ims.ImsCallProfile p0) {}
    public void sendRttModifyResponse(boolean p0) {}
    public java.lang.String toString() { return null; }

    private class IImsCallSessionListenerProxy extends android.telephony.ims.aidl.IImsCallSessionListener.Stub {
        private IImsCallSessionListenerProxy(android.telephony.ims.ImsCallSession p0) { super(); }
        public void callSessionProgressing(android.telephony.ims.ImsStreamMediaProfile p0) {}
        public void callSessionInitiated(android.telephony.ims.ImsCallProfile p0) {}
        public void callSessionInitiatedFailed(android.telephony.ims.ImsReasonInfo p0) {}
        public void callSessionTerminated(android.telephony.ims.ImsReasonInfo p0) {}
        public void callSessionHeld(android.telephony.ims.ImsCallProfile p0) {}
        public void callSessionHoldFailed(android.telephony.ims.ImsReasonInfo p0) {}
        public void callSessionHoldReceived(android.telephony.ims.ImsCallProfile p0) {}
        public void callSessionResumed(android.telephony.ims.ImsCallProfile p0) {}
        public void callSessionResumeFailed(android.telephony.ims.ImsReasonInfo p0) {}
        public void callSessionResumeReceived(android.telephony.ims.ImsCallProfile p0) {}
        public void callSessionMergeStarted(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) {}
        public void callSessionMergeComplete(com.android.ims.internal.IImsCallSession p0) {}
        public void callSessionMergeFailed(android.telephony.ims.ImsReasonInfo p0) {}
        public void callSessionUpdated(android.telephony.ims.ImsCallProfile p0) {}
        public void callSessionUpdateFailed(android.telephony.ims.ImsReasonInfo p0) {}
        public void callSessionUpdateReceived(android.telephony.ims.ImsCallProfile p0) {}
        public void callSessionConferenceExtended(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) {}
        public void callSessionConferenceExtendFailed(android.telephony.ims.ImsReasonInfo p0) {}
        public void callSessionConferenceExtendReceived(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) {}
        public void callSessionInviteParticipantsRequestDelivered() {}
        public void callSessionInviteParticipantsRequestFailed(android.telephony.ims.ImsReasonInfo p0) {}
        public void callSessionRemoveParticipantsRequestDelivered() {}
        public void callSessionRemoveParticipantsRequestFailed(android.telephony.ims.ImsReasonInfo p0) {}
        public void callSessionConferenceStateUpdated(android.telephony.ims.ImsConferenceState p0) {}
        public void callSessionUssdMessageReceived(int p0, java.lang.String p1) {}
        public void callSessionMayHandover(int p0, int p1) {}
        public void callSessionHandover(int p0, int p1, android.telephony.ims.ImsReasonInfo p2) {}
        public void callSessionHandoverFailed(int p0, int p1, android.telephony.ims.ImsReasonInfo p2) {}
        public void callSessionTtyModeReceived(int p0) {}
        public void callSessionMultipartyStateChanged(boolean p0) {}
        public void callSessionSuppServiceReceived(android.telephony.ims.ImsSuppServiceNotification p0) {}
        public void callSessionRttModifyRequestReceived(android.telephony.ims.ImsCallProfile p0) {}
        public void callSessionRttModifyResponseReceived(int p0) {}
        public void callSessionRttMessageReceived(java.lang.String p0) {}
        public void callSessionRttAudioIndicatorChanged(android.telephony.ims.ImsStreamMediaProfile p0) {}
        public void callSessionTransferred() {}
        public void callSessionTransferFailed(android.telephony.ims.ImsReasonInfo p0) {}
        public void callQualityChanged(android.telephony.CallQuality p0) {}
    }

    public static class Listener {
        public Listener() {}
        public void callSessionProgressing(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsStreamMediaProfile p1) {}
        public void callSessionStarted(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsCallProfile p1) {}
        public void callSessionStartFailed(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) {}
        public void callSessionTerminated(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) {}
        public void callSessionHeld(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsCallProfile p1) {}
        public void callSessionHoldFailed(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) {}
        public void callSessionHoldReceived(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsCallProfile p1) {}
        public void callSessionResumed(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsCallProfile p1) {}
        public void callSessionResumeFailed(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) {}
        public void callSessionResumeReceived(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsCallProfile p1) {}
        public void callSessionMergeStarted(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsCallSession p1, android.telephony.ims.ImsCallProfile p2) {}
        public void callSessionMergeComplete(android.telephony.ims.ImsCallSession p0) {}
        public void callSessionMergeFailed(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) {}
        public void callSessionUpdated(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsCallProfile p1) {}
        public void callSessionUpdateFailed(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) {}
        public void callSessionUpdateReceived(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsCallProfile p1) {}
        public void callSessionConferenceExtended(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsCallSession p1, android.telephony.ims.ImsCallProfile p2) {}
        public void callSessionConferenceExtendFailed(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) {}
        public void callSessionConferenceExtendReceived(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsCallSession p1, android.telephony.ims.ImsCallProfile p2) {}
        public void callSessionInviteParticipantsRequestDelivered(android.telephony.ims.ImsCallSession p0) {}
        public void callSessionInviteParticipantsRequestFailed(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) {}
        public void callSessionRemoveParticipantsRequestDelivered(android.telephony.ims.ImsCallSession p0) {}
        public void callSessionRemoveParticipantsRequestFailed(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) {}
        public void callSessionConferenceStateUpdated(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsConferenceState p1) {}
        public void callSessionUssdMessageReceived(android.telephony.ims.ImsCallSession p0, int p1, java.lang.String p2) {}
        public void callSessionMayHandover(android.telephony.ims.ImsCallSession p0, int p1, int p2) {}
        public void callSessionHandover(android.telephony.ims.ImsCallSession p0, int p1, int p2, android.telephony.ims.ImsReasonInfo p3) {}
        public void callSessionHandoverFailed(android.telephony.ims.ImsCallSession p0, int p1, int p2, android.telephony.ims.ImsReasonInfo p3) {}
        public void callSessionTtyModeReceived(android.telephony.ims.ImsCallSession p0, int p1) {}
        public void callSessionMultipartyStateChanged(android.telephony.ims.ImsCallSession p0, boolean p1) {}
        public void callSessionSuppServiceReceived(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsSuppServiceNotification p1) {}
        public void callSessionRttModifyRequestReceived(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsCallProfile p1) {}
        public void callSessionRttModifyResponseReceived(int p0) {}
        public void callSessionRttMessageReceived(java.lang.String p0) {}
        public void callSessionRttAudioIndicatorChanged(android.telephony.ims.ImsStreamMediaProfile p0) {}
        public void callSessionTransferred(android.telephony.ims.ImsCallSession p0) {}
        public void callSessionTransferFailed(android.telephony.ims.ImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) {}
        public void callQualityChanged(android.telephony.CallQuality p0) {}
    }

    public static class State {
        public static final int IDLE = 0;
        public static final int INITIATED = 1;
        public static final int NEGOTIATING = 2;
        public static final int ESTABLISHING = 3;
        public static final int ESTABLISHED = 4;
        public static final int RENEGOTIATING = 5;
        public static final int REESTABLISHING = 6;
        public static final int TERMINATING = 7;
        public static final int TERMINATED = 8;
        public static final int INVALID = -1;
        public static java.lang.String toString(int p0) { return null; }
        private State() {}
    }
}
