package android.telephony.ims.aidl;

public interface IImsCallSessionListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IImsCallSessionListener";
    public void callSessionInitiating(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException;
    public void callSessionInitiatingFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException;
    public void callSessionProgressing(android.telephony.ims.ImsStreamMediaProfile p0) throws android.os.RemoteException;
    public void callSessionInitiated(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException;
    public void callSessionInitiatedFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException;
    public void callSessionTerminated(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException;
    public void callSessionHeld(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException;
    public void callSessionHoldFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException;
    public void callSessionHoldReceived(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException;
    public void callSessionResumed(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException;
    public void callSessionResumeFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException;
    public void callSessionResumeReceived(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException;
    public void callSessionMergeStarted(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException;
    public void callSessionMergeComplete(com.android.ims.internal.IImsCallSession p0) throws android.os.RemoteException;
    public void callSessionMergeFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException;
    public void callSessionUpdated(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException;
    public void callSessionUpdateFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException;
    public void callSessionUpdateReceived(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException;
    public void callSessionConferenceExtended(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException;
    public void callSessionConferenceExtendFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException;
    public void callSessionConferenceExtendReceived(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException;
    public void callSessionInviteParticipantsRequestDelivered() throws android.os.RemoteException;
    public void callSessionInviteParticipantsRequestFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException;
    public void callSessionRemoveParticipantsRequestDelivered() throws android.os.RemoteException;
    public void callSessionRemoveParticipantsRequestFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException;
    public void callSessionConferenceStateUpdated(android.telephony.ims.ImsConferenceState p0) throws android.os.RemoteException;
    public void callSessionUssdMessageReceived(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void callSessionHandover(int p0, int p1, android.telephony.ims.ImsReasonInfo p2) throws android.os.RemoteException;
    public void callSessionHandoverFailed(int p0, int p1, android.telephony.ims.ImsReasonInfo p2) throws android.os.RemoteException;
    public void callSessionMayHandover(int p0, int p1) throws android.os.RemoteException;
    public void callSessionTtyModeReceived(int p0) throws android.os.RemoteException;
    public void callSessionMultipartyStateChanged(boolean p0) throws android.os.RemoteException;
    public void callSessionSuppServiceReceived(android.telephony.ims.ImsSuppServiceNotification p0) throws android.os.RemoteException;
    public void callSessionRttModifyRequestReceived(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException;
    public void callSessionRttModifyResponseReceived(int p0) throws android.os.RemoteException;
    public void callSessionRttMessageReceived(java.lang.String p0) throws android.os.RemoteException;
    public void callSessionRttAudioIndicatorChanged(android.telephony.ims.ImsStreamMediaProfile p0) throws android.os.RemoteException;
    public void callSessionTransferred() throws android.os.RemoteException;
    public void callSessionTransferFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException;
    public void callSessionDtmfReceived(char p0) throws android.os.RemoteException;
    public void callQualityChanged(android.telephony.CallQuality p0) throws android.os.RemoteException;
    public void callSessionRtpHeaderExtensionsReceived(java.util.List<android.telephony.ims.RtpHeaderExtension> p0) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IImsCallSessionListener {
        public Default() {}
        public void callSessionInitiating(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException {}
        public void callSessionInitiatingFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
        public void callSessionProgressing(android.telephony.ims.ImsStreamMediaProfile p0) throws android.os.RemoteException {}
        public void callSessionInitiated(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException {}
        public void callSessionInitiatedFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
        public void callSessionTerminated(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
        public void callSessionHeld(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException {}
        public void callSessionHoldFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
        public void callSessionHoldReceived(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException {}
        public void callSessionResumed(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException {}
        public void callSessionResumeFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
        public void callSessionResumeReceived(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException {}
        public void callSessionMergeStarted(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException {}
        public void callSessionMergeComplete(com.android.ims.internal.IImsCallSession p0) throws android.os.RemoteException {}
        public void callSessionMergeFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
        public void callSessionUpdated(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException {}
        public void callSessionUpdateFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
        public void callSessionUpdateReceived(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException {}
        public void callSessionConferenceExtended(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException {}
        public void callSessionConferenceExtendFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
        public void callSessionConferenceExtendReceived(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException {}
        public void callSessionInviteParticipantsRequestDelivered() throws android.os.RemoteException {}
        public void callSessionInviteParticipantsRequestFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
        public void callSessionRemoveParticipantsRequestDelivered() throws android.os.RemoteException {}
        public void callSessionRemoveParticipantsRequestFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
        public void callSessionConferenceStateUpdated(android.telephony.ims.ImsConferenceState p0) throws android.os.RemoteException {}
        public void callSessionUssdMessageReceived(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void callSessionHandover(int p0, int p1, android.telephony.ims.ImsReasonInfo p2) throws android.os.RemoteException {}
        public void callSessionHandoverFailed(int p0, int p1, android.telephony.ims.ImsReasonInfo p2) throws android.os.RemoteException {}
        public void callSessionMayHandover(int p0, int p1) throws android.os.RemoteException {}
        public void callSessionTtyModeReceived(int p0) throws android.os.RemoteException {}
        public void callSessionMultipartyStateChanged(boolean p0) throws android.os.RemoteException {}
        public void callSessionSuppServiceReceived(android.telephony.ims.ImsSuppServiceNotification p0) throws android.os.RemoteException {}
        public void callSessionRttModifyRequestReceived(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException {}
        public void callSessionRttModifyResponseReceived(int p0) throws android.os.RemoteException {}
        public void callSessionRttMessageReceived(java.lang.String p0) throws android.os.RemoteException {}
        public void callSessionRttAudioIndicatorChanged(android.telephony.ims.ImsStreamMediaProfile p0) throws android.os.RemoteException {}
        public void callSessionTransferred() throws android.os.RemoteException {}
        public void callSessionTransferFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
        public void callSessionDtmfReceived(char p0) throws android.os.RemoteException {}
        public void callQualityChanged(android.telephony.CallQuality p0) throws android.os.RemoteException {}
        public void callSessionRtpHeaderExtensionsReceived(java.util.List<android.telephony.ims.RtpHeaderExtension> p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IImsCallSessionListener {
        static final int TRANSACTION_callSessionInitiating = 1;
        static final int TRANSACTION_callSessionInitiatingFailed = 2;
        static final int TRANSACTION_callSessionProgressing = 3;
        static final int TRANSACTION_callSessionInitiated = 4;
        static final int TRANSACTION_callSessionInitiatedFailed = 5;
        static final int TRANSACTION_callSessionTerminated = 6;
        static final int TRANSACTION_callSessionHeld = 7;
        static final int TRANSACTION_callSessionHoldFailed = 8;
        static final int TRANSACTION_callSessionHoldReceived = 9;
        static final int TRANSACTION_callSessionResumed = 10;
        static final int TRANSACTION_callSessionResumeFailed = 11;
        static final int TRANSACTION_callSessionResumeReceived = 12;
        static final int TRANSACTION_callSessionMergeStarted = 13;
        static final int TRANSACTION_callSessionMergeComplete = 14;
        static final int TRANSACTION_callSessionMergeFailed = 15;
        static final int TRANSACTION_callSessionUpdated = 16;
        static final int TRANSACTION_callSessionUpdateFailed = 17;
        static final int TRANSACTION_callSessionUpdateReceived = 18;
        static final int TRANSACTION_callSessionConferenceExtended = 19;
        static final int TRANSACTION_callSessionConferenceExtendFailed = 20;
        static final int TRANSACTION_callSessionConferenceExtendReceived = 21;
        static final int TRANSACTION_callSessionInviteParticipantsRequestDelivered = 22;
        static final int TRANSACTION_callSessionInviteParticipantsRequestFailed = 23;
        static final int TRANSACTION_callSessionRemoveParticipantsRequestDelivered = 24;
        static final int TRANSACTION_callSessionRemoveParticipantsRequestFailed = 25;
        static final int TRANSACTION_callSessionConferenceStateUpdated = 26;
        static final int TRANSACTION_callSessionUssdMessageReceived = 27;
        static final int TRANSACTION_callSessionHandover = 28;
        static final int TRANSACTION_callSessionHandoverFailed = 29;
        static final int TRANSACTION_callSessionMayHandover = 30;
        static final int TRANSACTION_callSessionTtyModeReceived = 31;
        static final int TRANSACTION_callSessionMultipartyStateChanged = 32;
        static final int TRANSACTION_callSessionSuppServiceReceived = 33;
        static final int TRANSACTION_callSessionRttModifyRequestReceived = 34;
        static final int TRANSACTION_callSessionRttModifyResponseReceived = 35;
        static final int TRANSACTION_callSessionRttMessageReceived = 36;
        static final int TRANSACTION_callSessionRttAudioIndicatorChanged = 37;
        static final int TRANSACTION_callSessionTransferred = 38;
        static final int TRANSACTION_callSessionTransferFailed = 39;
        static final int TRANSACTION_callSessionDtmfReceived = 40;
        static final int TRANSACTION_callQualityChanged = 41;
        static final int TRANSACTION_callSessionRtpHeaderExtensionsReceived = 42;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IImsCallSessionListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.ims.aidl.IImsCallSessionListener p0) { return false; }
        public static android.telephony.ims.aidl.IImsCallSessionListener getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.ims.aidl.IImsCallSessionListener {
            private android.os.IBinder mRemote;
            public static android.telephony.ims.aidl.IImsCallSessionListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void callSessionInitiating(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException {}
            public void callSessionInitiatingFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
            public void callSessionProgressing(android.telephony.ims.ImsStreamMediaProfile p0) throws android.os.RemoteException {}
            public void callSessionInitiated(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException {}
            public void callSessionInitiatedFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
            public void callSessionTerminated(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
            public void callSessionHeld(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException {}
            public void callSessionHoldFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
            public void callSessionHoldReceived(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException {}
            public void callSessionResumed(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException {}
            public void callSessionResumeFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
            public void callSessionResumeReceived(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException {}
            public void callSessionMergeStarted(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException {}
            public void callSessionMergeComplete(com.android.ims.internal.IImsCallSession p0) throws android.os.RemoteException {}
            public void callSessionMergeFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
            public void callSessionUpdated(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException {}
            public void callSessionUpdateFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
            public void callSessionUpdateReceived(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException {}
            public void callSessionConferenceExtended(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException {}
            public void callSessionConferenceExtendFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
            public void callSessionConferenceExtendReceived(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException {}
            public void callSessionInviteParticipantsRequestDelivered() throws android.os.RemoteException {}
            public void callSessionInviteParticipantsRequestFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
            public void callSessionRemoveParticipantsRequestDelivered() throws android.os.RemoteException {}
            public void callSessionRemoveParticipantsRequestFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
            public void callSessionConferenceStateUpdated(android.telephony.ims.ImsConferenceState p0) throws android.os.RemoteException {}
            public void callSessionUssdMessageReceived(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void callSessionHandover(int p0, int p1, android.telephony.ims.ImsReasonInfo p2) throws android.os.RemoteException {}
            public void callSessionHandoverFailed(int p0, int p1, android.telephony.ims.ImsReasonInfo p2) throws android.os.RemoteException {}
            public void callSessionMayHandover(int p0, int p1) throws android.os.RemoteException {}
            public void callSessionTtyModeReceived(int p0) throws android.os.RemoteException {}
            public void callSessionMultipartyStateChanged(boolean p0) throws android.os.RemoteException {}
            public void callSessionSuppServiceReceived(android.telephony.ims.ImsSuppServiceNotification p0) throws android.os.RemoteException {}
            public void callSessionRttModifyRequestReceived(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException {}
            public void callSessionRttModifyResponseReceived(int p0) throws android.os.RemoteException {}
            public void callSessionRttMessageReceived(java.lang.String p0) throws android.os.RemoteException {}
            public void callSessionRttAudioIndicatorChanged(android.telephony.ims.ImsStreamMediaProfile p0) throws android.os.RemoteException {}
            public void callSessionTransferred() throws android.os.RemoteException {}
            public void callSessionTransferFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
            public void callSessionDtmfReceived(char p0) throws android.os.RemoteException {}
            public void callQualityChanged(android.telephony.CallQuality p0) throws android.os.RemoteException {}
            public void callSessionRtpHeaderExtensionsReceived(java.util.List<android.telephony.ims.RtpHeaderExtension> p0) throws android.os.RemoteException {}
        }
    }
}
