package android.telephony.ims.stub;

@android.annotation.SystemApi
public class ImsCallSessionImplBase implements java.lang.AutoCloseable {
    public static final int USSD_MODE_NOTIFY = 0;
    public static final int USSD_MODE_REQUEST = 1;
    private com.android.ims.internal.IImsCallSession mServiceImpl;
    public ImsCallSessionImplBase() {}
    public final void setListener(android.telephony.ims.aidl.IImsCallSessionListener p0) throws android.os.RemoteException {}
    public void setListener(android.telephony.ims.ImsCallSessionListener p0) {}
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
    public void reject(int p0) {}
    public void transfer(java.lang.String p0, boolean p1) {}
    public void transfer(android.telephony.ims.stub.ImsCallSessionImplBase p0) {}
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
    public android.telephony.ims.ImsVideoCallProvider getImsVideoCallProvider() { return null; }
    public boolean isMultiparty() { return false; }
    public void sendRttModifyRequest(android.telephony.ims.ImsCallProfile p0) {}
    public void sendRttModifyResponse(boolean p0) {}
    public void sendRttMessage(java.lang.String p0) {}
    public com.android.ims.internal.IImsCallSession getServiceImpl() { return null; }
    public void setServiceImpl(com.android.ims.internal.IImsCallSession p0) {}

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
