package com.android.ims.internal;

public interface IImsCallSessionListener extends android.os.IInterface {
    public void callSessionProgressing(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsStreamMediaProfile p1) throws android.os.RemoteException;
    public void callSessionStarted(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException;
    public void callSessionStartFailed(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException;
    public void callSessionTerminated(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException;
    public void callSessionHeld(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException;
    public void callSessionHoldFailed(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException;
    public void callSessionHoldReceived(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException;
    public void callSessionResumed(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException;
    public void callSessionResumeFailed(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException;
    public void callSessionResumeReceived(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException;
    public void callSessionMergeStarted(com.android.ims.internal.IImsCallSession p0, com.android.ims.internal.IImsCallSession p1, android.telephony.ims.ImsCallProfile p2) throws android.os.RemoteException;
    public void callSessionMergeComplete(com.android.ims.internal.IImsCallSession p0) throws android.os.RemoteException;
    public void callSessionMergeFailed(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException;
    public void callSessionUpdated(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException;
    public void callSessionUpdateFailed(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException;
    public void callSessionUpdateReceived(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException;
    public void callSessionConferenceExtended(com.android.ims.internal.IImsCallSession p0, com.android.ims.internal.IImsCallSession p1, android.telephony.ims.ImsCallProfile p2) throws android.os.RemoteException;
    public void callSessionConferenceExtendFailed(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException;
    public void callSessionConferenceExtendReceived(com.android.ims.internal.IImsCallSession p0, com.android.ims.internal.IImsCallSession p1, android.telephony.ims.ImsCallProfile p2) throws android.os.RemoteException;
    public void callSessionInviteParticipantsRequestDelivered(com.android.ims.internal.IImsCallSession p0) throws android.os.RemoteException;
    public void callSessionInviteParticipantsRequestFailed(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException;
    public void callSessionRemoveParticipantsRequestDelivered(com.android.ims.internal.IImsCallSession p0) throws android.os.RemoteException;
    public void callSessionRemoveParticipantsRequestFailed(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException;
    public void callSessionConferenceStateUpdated(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsConferenceState p1) throws android.os.RemoteException;
    public void callSessionUssdMessageReceived(com.android.ims.internal.IImsCallSession p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void callSessionHandover(com.android.ims.internal.IImsCallSession p0, int p1, int p2, android.telephony.ims.ImsReasonInfo p3) throws android.os.RemoteException;
    public void callSessionHandoverFailed(com.android.ims.internal.IImsCallSession p0, int p1, int p2, android.telephony.ims.ImsReasonInfo p3) throws android.os.RemoteException;
    public void callSessionMayHandover(com.android.ims.internal.IImsCallSession p0, int p1, int p2) throws android.os.RemoteException;
    public void callSessionTtyModeReceived(com.android.ims.internal.IImsCallSession p0, int p1) throws android.os.RemoteException;
    public void callSessionMultipartyStateChanged(com.android.ims.internal.IImsCallSession p0, boolean p1) throws android.os.RemoteException;
    public void callSessionSuppServiceReceived(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsSuppServiceNotification p1) throws android.os.RemoteException;
    public void callSessionRttModifyRequestReceived(com.android.ims.internal.IImsCallSession p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException;
    public void callSessionRttModifyResponseReceived(int p0) throws android.os.RemoteException;
    public void callSessionRttMessageReceived(java.lang.String p0) throws android.os.RemoteException;
    public void callSessionRttAudioIndicatorChanged(android.telephony.ims.ImsStreamMediaProfile p0) throws android.os.RemoteException;
    public void callSessionTransferred() throws android.os.RemoteException;
    public void callSessionTransferFailed(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException;
    public void callQualityChanged(android.telephony.CallQuality p0) throws android.os.RemoteException;

    public static class Default implements com.android.ims.internal.IImsCallSessionListener {
        public Default() {}
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
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsCallSessionListener {
        public static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsCallSessionListener";
        static final int TRANSACTION_callSessionProgressing = 1;
        static final int TRANSACTION_callSessionStarted = 2;
        static final int TRANSACTION_callSessionStartFailed = 3;
        static final int TRANSACTION_callSessionTerminated = 4;
        static final int TRANSACTION_callSessionHeld = 5;
        static final int TRANSACTION_callSessionHoldFailed = 6;
        static final int TRANSACTION_callSessionHoldReceived = 7;
        static final int TRANSACTION_callSessionResumed = 8;
        static final int TRANSACTION_callSessionResumeFailed = 9;
        static final int TRANSACTION_callSessionResumeReceived = 10;
        static final int TRANSACTION_callSessionMergeStarted = 11;
        static final int TRANSACTION_callSessionMergeComplete = 12;
        static final int TRANSACTION_callSessionMergeFailed = 13;
        static final int TRANSACTION_callSessionUpdated = 14;
        static final int TRANSACTION_callSessionUpdateFailed = 15;
        static final int TRANSACTION_callSessionUpdateReceived = 16;
        static final int TRANSACTION_callSessionConferenceExtended = 17;
        static final int TRANSACTION_callSessionConferenceExtendFailed = 18;
        static final int TRANSACTION_callSessionConferenceExtendReceived = 19;
        static final int TRANSACTION_callSessionInviteParticipantsRequestDelivered = 20;
        static final int TRANSACTION_callSessionInviteParticipantsRequestFailed = 21;
        static final int TRANSACTION_callSessionRemoveParticipantsRequestDelivered = 22;
        static final int TRANSACTION_callSessionRemoveParticipantsRequestFailed = 23;
        static final int TRANSACTION_callSessionConferenceStateUpdated = 24;
        static final int TRANSACTION_callSessionUssdMessageReceived = 25;
        static final int TRANSACTION_callSessionHandover = 26;
        static final int TRANSACTION_callSessionHandoverFailed = 27;
        static final int TRANSACTION_callSessionMayHandover = 28;
        static final int TRANSACTION_callSessionTtyModeReceived = 29;
        static final int TRANSACTION_callSessionMultipartyStateChanged = 30;
        static final int TRANSACTION_callSessionSuppServiceReceived = 31;
        static final int TRANSACTION_callSessionRttModifyRequestReceived = 32;
        static final int TRANSACTION_callSessionRttModifyResponseReceived = 33;
        static final int TRANSACTION_callSessionRttMessageReceived = 34;
        static final int TRANSACTION_callSessionRttAudioIndicatorChanged = 35;
        static final int TRANSACTION_callSessionTransferred = 36;
        static final int TRANSACTION_callSessionTransferFailed = 37;
        static final int TRANSACTION_callQualityChanged = 38;
        public Stub() { super(); }
        public static com.android.ims.internal.IImsCallSessionListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.ims.internal.IImsCallSessionListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
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
}
