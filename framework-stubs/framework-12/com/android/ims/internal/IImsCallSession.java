package com.android.ims.internal;

public interface IImsCallSession extends android.os.IInterface {
    public void close() throws android.os.RemoteException;
    public java.lang.String getCallId() throws android.os.RemoteException;
    public android.telephony.ims.ImsCallProfile getCallProfile() throws android.os.RemoteException;
    public android.telephony.ims.ImsCallProfile getLocalCallProfile() throws android.os.RemoteException;
    public android.telephony.ims.ImsCallProfile getRemoteCallProfile() throws android.os.RemoteException;
    public java.lang.String getProperty(java.lang.String p0) throws android.os.RemoteException;
    public int getState() throws android.os.RemoteException;
    public boolean isInCall() throws android.os.RemoteException;
    public void setListener(android.telephony.ims.aidl.IImsCallSessionListener p0) throws android.os.RemoteException;
    public void setMute(boolean p0) throws android.os.RemoteException;
    public void start(java.lang.String p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException;
    public void startConference(java.lang.String[] p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException;
    public void accept(int p0, android.telephony.ims.ImsStreamMediaProfile p1) throws android.os.RemoteException;
    public void deflect(java.lang.String p0) throws android.os.RemoteException;
    public void reject(int p0) throws android.os.RemoteException;
    public void transfer(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void consultativeTransfer(com.android.ims.internal.IImsCallSession p0) throws android.os.RemoteException;
    public void terminate(int p0) throws android.os.RemoteException;
    public void hold(android.telephony.ims.ImsStreamMediaProfile p0) throws android.os.RemoteException;
    public void resume(android.telephony.ims.ImsStreamMediaProfile p0) throws android.os.RemoteException;
    public void merge() throws android.os.RemoteException;
    public void update(int p0, android.telephony.ims.ImsStreamMediaProfile p1) throws android.os.RemoteException;
    public void extendToConference(java.lang.String[] p0) throws android.os.RemoteException;
    public void inviteParticipants(java.lang.String[] p0) throws android.os.RemoteException;
    public void removeParticipants(java.lang.String[] p0) throws android.os.RemoteException;
    public void sendDtmf(char p0, android.os.Message p1) throws android.os.RemoteException;
    public void startDtmf(char p0) throws android.os.RemoteException;
    public void stopDtmf() throws android.os.RemoteException;
    public void sendUssd(java.lang.String p0) throws android.os.RemoteException;
    public com.android.ims.internal.IImsVideoCallProvider getVideoCallProvider() throws android.os.RemoteException;
    public boolean isMultiparty() throws android.os.RemoteException;
    public void sendRttModifyRequest(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException;
    public void sendRttModifyResponse(boolean p0) throws android.os.RemoteException;
    public void sendRttMessage(java.lang.String p0) throws android.os.RemoteException;
    public void sendRtpHeaderExtensions(java.util.List<android.telephony.ims.RtpHeaderExtension> p0) throws android.os.RemoteException;

    public static class Default implements com.android.ims.internal.IImsCallSession {
        public Default() {}
        public void close() throws android.os.RemoteException {}
        public java.lang.String getCallId() throws android.os.RemoteException { return null; }
        public android.telephony.ims.ImsCallProfile getCallProfile() throws android.os.RemoteException { return null; }
        public android.telephony.ims.ImsCallProfile getLocalCallProfile() throws android.os.RemoteException { return null; }
        public android.telephony.ims.ImsCallProfile getRemoteCallProfile() throws android.os.RemoteException { return null; }
        public java.lang.String getProperty(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int getState() throws android.os.RemoteException { return 0; }
        public boolean isInCall() throws android.os.RemoteException { return false; }
        public void setListener(android.telephony.ims.aidl.IImsCallSessionListener p0) throws android.os.RemoteException {}
        public void setMute(boolean p0) throws android.os.RemoteException {}
        public void start(java.lang.String p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException {}
        public void startConference(java.lang.String[] p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException {}
        public void accept(int p0, android.telephony.ims.ImsStreamMediaProfile p1) throws android.os.RemoteException {}
        public void deflect(java.lang.String p0) throws android.os.RemoteException {}
        public void reject(int p0) throws android.os.RemoteException {}
        public void transfer(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void consultativeTransfer(com.android.ims.internal.IImsCallSession p0) throws android.os.RemoteException {}
        public void terminate(int p0) throws android.os.RemoteException {}
        public void hold(android.telephony.ims.ImsStreamMediaProfile p0) throws android.os.RemoteException {}
        public void resume(android.telephony.ims.ImsStreamMediaProfile p0) throws android.os.RemoteException {}
        public void merge() throws android.os.RemoteException {}
        public void update(int p0, android.telephony.ims.ImsStreamMediaProfile p1) throws android.os.RemoteException {}
        public void extendToConference(java.lang.String[] p0) throws android.os.RemoteException {}
        public void inviteParticipants(java.lang.String[] p0) throws android.os.RemoteException {}
        public void removeParticipants(java.lang.String[] p0) throws android.os.RemoteException {}
        public void sendDtmf(char p0, android.os.Message p1) throws android.os.RemoteException {}
        public void startDtmf(char p0) throws android.os.RemoteException {}
        public void stopDtmf() throws android.os.RemoteException {}
        public void sendUssd(java.lang.String p0) throws android.os.RemoteException {}
        public com.android.ims.internal.IImsVideoCallProvider getVideoCallProvider() throws android.os.RemoteException { return null; }
        public boolean isMultiparty() throws android.os.RemoteException { return false; }
        public void sendRttModifyRequest(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException {}
        public void sendRttModifyResponse(boolean p0) throws android.os.RemoteException {}
        public void sendRttMessage(java.lang.String p0) throws android.os.RemoteException {}
        public void sendRtpHeaderExtensions(java.util.List<android.telephony.ims.RtpHeaderExtension> p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsCallSession {
        public static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsCallSession";
        static final int TRANSACTION_close = 1;
        static final int TRANSACTION_getCallId = 2;
        static final int TRANSACTION_getCallProfile = 3;
        static final int TRANSACTION_getLocalCallProfile = 4;
        static final int TRANSACTION_getRemoteCallProfile = 5;
        static final int TRANSACTION_getProperty = 6;
        static final int TRANSACTION_getState = 7;
        static final int TRANSACTION_isInCall = 8;
        static final int TRANSACTION_setListener = 9;
        static final int TRANSACTION_setMute = 10;
        static final int TRANSACTION_start = 11;
        static final int TRANSACTION_startConference = 12;
        static final int TRANSACTION_accept = 13;
        static final int TRANSACTION_deflect = 14;
        static final int TRANSACTION_reject = 15;
        static final int TRANSACTION_transfer = 16;
        static final int TRANSACTION_consultativeTransfer = 17;
        static final int TRANSACTION_terminate = 18;
        static final int TRANSACTION_hold = 19;
        static final int TRANSACTION_resume = 20;
        static final int TRANSACTION_merge = 21;
        static final int TRANSACTION_update = 22;
        static final int TRANSACTION_extendToConference = 23;
        static final int TRANSACTION_inviteParticipants = 24;
        static final int TRANSACTION_removeParticipants = 25;
        static final int TRANSACTION_sendDtmf = 26;
        static final int TRANSACTION_startDtmf = 27;
        static final int TRANSACTION_stopDtmf = 28;
        static final int TRANSACTION_sendUssd = 29;
        static final int TRANSACTION_getVideoCallProvider = 30;
        static final int TRANSACTION_isMultiparty = 31;
        static final int TRANSACTION_sendRttModifyRequest = 32;
        static final int TRANSACTION_sendRttModifyResponse = 33;
        static final int TRANSACTION_sendRttMessage = 34;
        static final int TRANSACTION_sendRtpHeaderExtensions = 35;
        public Stub() { super(); }
        public static com.android.ims.internal.IImsCallSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.ims.internal.IImsCallSession p0) { return false; }
        public static com.android.ims.internal.IImsCallSession getDefaultImpl() { return null; }

        private static class Proxy implements com.android.ims.internal.IImsCallSession {
            private android.os.IBinder mRemote;
            public static com.android.ims.internal.IImsCallSession sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void close() throws android.os.RemoteException {}
            public java.lang.String getCallId() throws android.os.RemoteException { return null; }
            public android.telephony.ims.ImsCallProfile getCallProfile() throws android.os.RemoteException { return null; }
            public android.telephony.ims.ImsCallProfile getLocalCallProfile() throws android.os.RemoteException { return null; }
            public android.telephony.ims.ImsCallProfile getRemoteCallProfile() throws android.os.RemoteException { return null; }
            public java.lang.String getProperty(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int getState() throws android.os.RemoteException { return 0; }
            public boolean isInCall() throws android.os.RemoteException { return false; }
            public void setListener(android.telephony.ims.aidl.IImsCallSessionListener p0) throws android.os.RemoteException {}
            public void setMute(boolean p0) throws android.os.RemoteException {}
            public void start(java.lang.String p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException {}
            public void startConference(java.lang.String[] p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException {}
            public void accept(int p0, android.telephony.ims.ImsStreamMediaProfile p1) throws android.os.RemoteException {}
            public void deflect(java.lang.String p0) throws android.os.RemoteException {}
            public void reject(int p0) throws android.os.RemoteException {}
            public void transfer(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void consultativeTransfer(com.android.ims.internal.IImsCallSession p0) throws android.os.RemoteException {}
            public void terminate(int p0) throws android.os.RemoteException {}
            public void hold(android.telephony.ims.ImsStreamMediaProfile p0) throws android.os.RemoteException {}
            public void resume(android.telephony.ims.ImsStreamMediaProfile p0) throws android.os.RemoteException {}
            public void merge() throws android.os.RemoteException {}
            public void update(int p0, android.telephony.ims.ImsStreamMediaProfile p1) throws android.os.RemoteException {}
            public void extendToConference(java.lang.String[] p0) throws android.os.RemoteException {}
            public void inviteParticipants(java.lang.String[] p0) throws android.os.RemoteException {}
            public void removeParticipants(java.lang.String[] p0) throws android.os.RemoteException {}
            public void sendDtmf(char p0, android.os.Message p1) throws android.os.RemoteException {}
            public void startDtmf(char p0) throws android.os.RemoteException {}
            public void stopDtmf() throws android.os.RemoteException {}
            public void sendUssd(java.lang.String p0) throws android.os.RemoteException {}
            public com.android.ims.internal.IImsVideoCallProvider getVideoCallProvider() throws android.os.RemoteException { return null; }
            public boolean isMultiparty() throws android.os.RemoteException { return false; }
            public void sendRttModifyRequest(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException {}
            public void sendRttModifyResponse(boolean p0) throws android.os.RemoteException {}
            public void sendRttMessage(java.lang.String p0) throws android.os.RemoteException {}
            public void sendRtpHeaderExtensions(java.util.List<android.telephony.ims.RtpHeaderExtension> p0) throws android.os.RemoteException {}
        }
    }
}
