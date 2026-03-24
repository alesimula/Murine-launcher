package com.android.internal.telephony;

public abstract class Call {
    protected final java.lang.String LOG_TAG = null;
    public com.android.internal.telephony.Call.State mState;
    public java.util.ArrayList<com.android.internal.telephony.Connection> mConnections;
    public Call() {}
    public static com.android.internal.telephony.Call.State stateFromDCState(com.android.internal.telephony.DriverCall.State p0) { return null; }
    public java.util.ArrayList<com.android.internal.telephony.Connection> getConnections() { return null; }
    public void copyConnectionFrom(com.android.internal.telephony.Call p0) {}
    public int getConnectionsCount() { return 0; }
    public java.lang.String getConnectionSummary() { return null; }
    public abstract com.android.internal.telephony.Phone getPhone();
    public abstract boolean isMultiparty();
    public abstract void hangup() throws com.android.internal.telephony.CallStateException;
    public abstract void hangup(int p0) throws com.android.internal.telephony.CallStateException;
    public boolean hasConnection(com.android.internal.telephony.Connection p0) { return false; }
    public boolean hasConnections() { return false; }
    public void removeConnection(com.android.internal.telephony.Connection p0) {}
    public void addConnection(com.android.internal.telephony.Connection p0) {}
    public void clearConnections() {}
    public com.android.internal.telephony.Call.State getState() { return null; }
    public java.util.List<com.android.ims.internal.ConferenceParticipant> getConferenceParticipants() { return null; }
    public boolean isIdle() { return false; }
    public com.android.internal.telephony.Connection getEarliestConnection() { return null; }
    public long getEarliestCreateTime() { return 0L; }
    public long getEarliestConnectTime() { return 0L; }
    public boolean isDialingOrAlerting() { return false; }
    public boolean isRinging() { return false; }
    public com.android.internal.telephony.Connection getLatestConnection() { return null; }
    public void hangupIfAlive() {}
    public void clearDisconnected() {}
    protected void setState(com.android.internal.telephony.Call.State p0) {}

    public static enum SrvccState {
        NONE,
        STARTED,
        COMPLETED,
        FAILED,
        CANCELED;
    }

    public static enum State {
        IDLE,
        ACTIVE,
        HOLDING,
        DIALING,
        ALERTING,
        INCOMING,
        WAITING,
        DISCONNECTED,
        DISCONNECTING;
        public boolean isAlive() { return false; }
        public boolean isRinging() { return false; }
        public boolean isDialing() { return false; }
    }
}
