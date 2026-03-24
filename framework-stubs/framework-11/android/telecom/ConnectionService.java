package android.telecom;

public abstract class ConnectionService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.telecom.ConnectionService";
    public static final java.lang.String EXTRA_IS_HANDOVER = "android.telecom.extra.IS_HANDOVER";
    private static final boolean PII_DEBUG = Boolean.valueOf(false);
    private static final java.lang.String SESSION_HANDLER = "H.";
    private static final java.lang.String SESSION_ADD_CS_ADAPTER = "CS.aCSA";
    private static final java.lang.String SESSION_REMOVE_CS_ADAPTER = "CS.rCSA";
    private static final java.lang.String SESSION_CREATE_CONN = "CS.crCo";
    private static final java.lang.String SESSION_CREATE_CONN_COMPLETE = "CS.crCoC";
    private static final java.lang.String SESSION_CREATE_CONN_FAILED = "CS.crCoF";
    private static final java.lang.String SESSION_ABORT = "CS.ab";
    private static final java.lang.String SESSION_ANSWER = "CS.an";
    private static final java.lang.String SESSION_ANSWER_VIDEO = "CS.anV";
    private static final java.lang.String SESSION_DEFLECT = "CS.def";
    private static final java.lang.String SESSION_TRANSFER = "CS.trans";
    private static final java.lang.String SESSION_CONSULTATIVE_TRANSFER = "CS.cTrans";
    private static final java.lang.String SESSION_REJECT = "CS.r";
    private static final java.lang.String SESSION_REJECT_MESSAGE = "CS.rWM";
    private static final java.lang.String SESSION_SILENCE = "CS.s";
    private static final java.lang.String SESSION_DISCONNECT = "CS.d";
    private static final java.lang.String SESSION_HOLD = "CS.h";
    private static final java.lang.String SESSION_UNHOLD = "CS.u";
    private static final java.lang.String SESSION_CALL_AUDIO_SC = "CS.cASC";
    private static final java.lang.String SESSION_PLAY_DTMF = "CS.pDT";
    private static final java.lang.String SESSION_STOP_DTMF = "CS.sDT";
    private static final java.lang.String SESSION_CONFERENCE = "CS.c";
    private static final java.lang.String SESSION_SPLIT_CONFERENCE = "CS.sFC";
    private static final java.lang.String SESSION_MERGE_CONFERENCE = "CS.mC";
    private static final java.lang.String SESSION_SWAP_CONFERENCE = "CS.sC";
    private static final java.lang.String SESSION_ADD_PARTICIPANT = "CS.aP";
    private static final java.lang.String SESSION_POST_DIAL_CONT = "CS.oPDC";
    private static final java.lang.String SESSION_PULL_EXTERNAL_CALL = "CS.pEC";
    private static final java.lang.String SESSION_SEND_CALL_EVENT = "CS.sCE";
    private static final java.lang.String SESSION_HANDOVER_COMPLETE = "CS.hC";
    private static final java.lang.String SESSION_EXTRAS_CHANGED = "CS.oEC";
    private static final java.lang.String SESSION_START_RTT = "CS.+RTT";
    private static final java.lang.String SESSION_UPDATE_RTT_PIPES = "CS.uRTT";
    private static final java.lang.String SESSION_STOP_RTT = "CS.-RTT";
    private static final java.lang.String SESSION_RTT_UPGRADE_RESPONSE = "CS.rTRUR";
    private static final java.lang.String SESSION_CONNECTION_SERVICE_FOCUS_LOST = "CS.cSFL";
    private static final java.lang.String SESSION_CONNECTION_SERVICE_FOCUS_GAINED = "CS.cSFG";
    private static final java.lang.String SESSION_HANDOVER_FAILED = "CS.haF";
    private static final java.lang.String SESSION_CREATE_CONF = "CS.crConf";
    private static final java.lang.String SESSION_CREATE_CONF_COMPLETE = "CS.crConfC";
    private static final java.lang.String SESSION_CREATE_CONF_FAILED = "CS.crConfF";
    private static final int MSG_ADD_CONNECTION_SERVICE_ADAPTER = 1;
    private static final int MSG_CREATE_CONNECTION = 2;
    private static final int MSG_ABORT = 3;
    private static final int MSG_ANSWER = 4;
    private static final int MSG_REJECT = 5;
    private static final int MSG_DISCONNECT = 6;
    private static final int MSG_HOLD = 7;
    private static final int MSG_UNHOLD = 8;
    private static final int MSG_ON_CALL_AUDIO_STATE_CHANGED = 9;
    private static final int MSG_PLAY_DTMF_TONE = 10;
    private static final int MSG_STOP_DTMF_TONE = 11;
    private static final int MSG_CONFERENCE = 12;
    private static final int MSG_SPLIT_FROM_CONFERENCE = 13;
    private static final int MSG_ON_POST_DIAL_CONTINUE = 14;
    private static final int MSG_REMOVE_CONNECTION_SERVICE_ADAPTER = 16;
    private static final int MSG_ANSWER_VIDEO = 17;
    private static final int MSG_MERGE_CONFERENCE = 18;
    private static final int MSG_SWAP_CONFERENCE = 19;
    private static final int MSG_REJECT_WITH_MESSAGE = 20;
    private static final int MSG_SILENCE = 21;
    private static final int MSG_PULL_EXTERNAL_CALL = 22;
    private static final int MSG_SEND_CALL_EVENT = 23;
    private static final int MSG_ON_EXTRAS_CHANGED = 24;
    private static final int MSG_CREATE_CONNECTION_FAILED = 25;
    private static final int MSG_ON_START_RTT = 26;
    private static final int MSG_ON_STOP_RTT = 27;
    private static final int MSG_RTT_UPGRADE_RESPONSE = 28;
    private static final int MSG_CREATE_CONNECTION_COMPLETE = 29;
    private static final int MSG_CONNECTION_SERVICE_FOCUS_LOST = 30;
    private static final int MSG_CONNECTION_SERVICE_FOCUS_GAINED = 31;
    private static final int MSG_HANDOVER_FAILED = 32;
    private static final int MSG_HANDOVER_COMPLETE = 33;
    private static final int MSG_DEFLECT = 34;
    private static final int MSG_CREATE_CONFERENCE = 35;
    private static final int MSG_CREATE_CONFERENCE_COMPLETE = 36;
    private static final int MSG_CREATE_CONFERENCE_FAILED = 37;
    private static final int MSG_REJECT_WITH_REASON = 38;
    private static final int MSG_ADD_PARTICIPANT = 39;
    private static final int MSG_EXPLICIT_CALL_TRANSFER = 40;
    private static final int MSG_EXPLICIT_CALL_TRANSFER_CONSULTATIVE = 41;
    private static android.telecom.Connection sNullConnection;
    private final java.util.Map<java.lang.String, android.telecom.Connection> mConnectionById = null;
    private final java.util.Map<android.telecom.Connection, java.lang.String> mIdByConnection = null;
    private final java.util.Map<java.lang.String, android.telecom.Conference> mConferenceById = null;
    private final java.util.Map<android.telecom.Conference, java.lang.String> mIdByConference = null;
    private final android.telecom.RemoteConnectionManager mRemoteConnectionManager = null;
    private final java.util.List<java.lang.Runnable> mPreInitializationConnectionRequests = null;
    private final android.telecom.ConnectionServiceAdapter mAdapter = null;
    private boolean mAreAccountsInitialized;
    private android.telecom.Conference sNullConference;
    private java.lang.Object mIdSyncRoot;
    private int mId;
    private final android.os.IBinder mBinder = null;
    private final android.os.Handler mHandler = null;
    private final android.telecom.Conference.Listener mConferenceListener = null;
    private final android.telecom.Connection.Listener mConnectionListener = null;
    public ConnectionService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public boolean onUnbind(android.content.Intent p0) { return false; }
    private void createConference(android.telecom.PhoneAccountHandle p0, java.lang.String p1, android.telecom.ConnectionRequest p2, boolean p3, boolean p4) {}
    private void createConnection(android.telecom.PhoneAccountHandle p0, java.lang.String p1, android.telecom.ConnectionRequest p2, boolean p3, boolean p4) {}
    private void createConnectionFailed(android.telecom.PhoneAccountHandle p0, java.lang.String p1, android.telecom.ConnectionRequest p2, boolean p3) {}
    private void createConferenceFailed(android.telecom.PhoneAccountHandle p0, java.lang.String p1, android.telecom.ConnectionRequest p2, boolean p3) {}
    private void handoverFailed(java.lang.String p0, android.telecom.ConnectionRequest p1, int p2) {}
    private void notifyCreateConnectionComplete(java.lang.String p0) {}
    private void notifyCreateConferenceComplete(java.lang.String p0) {}
    private void abort(java.lang.String p0) {}
    private void answerVideo(java.lang.String p0, int p1) {}
    private void answer(java.lang.String p0) {}
    private void deflect(java.lang.String p0, android.net.Uri p1) {}
    private void reject(java.lang.String p0) {}
    private void reject(java.lang.String p0, java.lang.String p1) {}
    private void reject(java.lang.String p0, int p1) {}
    private void transfer(java.lang.String p0, android.net.Uri p1, boolean p2) {}
    private void consultativeTransfer(java.lang.String p0, java.lang.String p1) {}
    private void silence(java.lang.String p0) {}
    private void disconnect(java.lang.String p0) {}
    private void hold(java.lang.String p0) {}
    private void unhold(java.lang.String p0) {}
    private void onCallAudioStateChanged(java.lang.String p0, android.telecom.CallAudioState p1) {}
    private void playDtmfTone(java.lang.String p0, char p1) {}
    private void stopDtmfTone(java.lang.String p0) {}
    private void conference(java.lang.String p0, java.lang.String p1) {}
    private void splitFromConference(java.lang.String p0) {}
    private void mergeConference(java.lang.String p0) {}
    private void swapConference(java.lang.String p0) {}
    private void addConferenceParticipants(java.lang.String p0, java.util.List<android.net.Uri> p1) {}
    private void pullExternalCall(java.lang.String p0) {}
    private void sendCallEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) {}
    private void notifyHandoverComplete(java.lang.String p0) {}
    private void handleExtrasChanged(java.lang.String p0, android.os.Bundle p1) {}
    private void startRtt(java.lang.String p0, android.telecom.Connection.RttTextStream p1) {}
    private void stopRtt(java.lang.String p0) {}
    private void handleRttUpgradeResponse(java.lang.String p0, android.telecom.Connection.RttTextStream p1) {}
    private void onPostDialContinue(java.lang.String p0, boolean p1) {}
    private void onAdapterAttached() {}
    public final android.telecom.RemoteConnection createRemoteIncomingConnection(android.telecom.PhoneAccountHandle p0, android.telecom.ConnectionRequest p1) { return null; }
    public final android.telecom.RemoteConnection createRemoteOutgoingConnection(android.telecom.PhoneAccountHandle p0, android.telecom.ConnectionRequest p1) { return null; }
    public final void conferenceRemoteConnections(android.telecom.RemoteConnection p0, android.telecom.RemoteConnection p1) {}
    public final void addConference(android.telecom.Conference p0) {}
    public final void addExistingConnection(android.telecom.PhoneAccountHandle p0, android.telecom.Connection p1) {}
    public final void connectionServiceFocusReleased() {}
    @android.annotation.SystemApi
    public final void addExistingConnection(android.telecom.PhoneAccountHandle p0, android.telecom.Connection p1, android.telecom.Conference p2) {}
    public final java.util.Collection<android.telecom.Connection> getAllConnections() { return null; }
    public final java.util.Collection<android.telecom.Conference> getAllConferences() { return null; }
    public android.telecom.Connection onCreateIncomingConnection(android.telecom.PhoneAccountHandle p0, android.telecom.ConnectionRequest p1) { return null; }
    public android.telecom.Conference onCreateIncomingConference(android.telecom.PhoneAccountHandle p0, android.telecom.ConnectionRequest p1) { return null; }
    public void onCreateConnectionComplete(android.telecom.Connection p0) {}
    public void onCreateConferenceComplete(android.telecom.Conference p0) {}
    public void onCreateIncomingConnectionFailed(android.telecom.PhoneAccountHandle p0, android.telecom.ConnectionRequest p1) {}
    public void onCreateOutgoingConnectionFailed(android.telecom.PhoneAccountHandle p0, android.telecom.ConnectionRequest p1) {}
    public void onCreateIncomingConferenceFailed(android.telecom.PhoneAccountHandle p0, android.telecom.ConnectionRequest p1) {}
    public void onCreateOutgoingConferenceFailed(android.telecom.PhoneAccountHandle p0, android.telecom.ConnectionRequest p1) {}
    public void triggerConferenceRecalculate() {}
    public android.telecom.Connection onCreateOutgoingConnection(android.telecom.PhoneAccountHandle p0, android.telecom.ConnectionRequest p1) { return null; }
    public android.telecom.Conference onCreateOutgoingConference(android.telecom.PhoneAccountHandle p0, android.telecom.ConnectionRequest p1) { return null; }
    public android.telecom.Connection onCreateOutgoingHandoverConnection(android.telecom.PhoneAccountHandle p0, android.telecom.ConnectionRequest p1) { return null; }
    public android.telecom.Connection onCreateIncomingHandoverConnection(android.telecom.PhoneAccountHandle p0, android.telecom.ConnectionRequest p1) { return null; }
    public void onHandoverFailed(android.telecom.ConnectionRequest p0, int p1) {}
    public android.telecom.Connection onCreateUnknownConnection(android.telecom.PhoneAccountHandle p0, android.telecom.ConnectionRequest p1) { return null; }
    public void onConference(android.telecom.Connection p0, android.telecom.Connection p1) {}
    public void onConnectionAdded(android.telecom.Connection p0) {}
    public void onConnectionRemoved(android.telecom.Connection p0) {}
    public void onConferenceAdded(android.telecom.Conference p0) {}
    public void onConferenceRemoved(android.telecom.Conference p0) {}
    public void onRemoteConferenceAdded(android.telecom.RemoteConference p0) {}
    public void onRemoteExistingConnectionAdded(android.telecom.RemoteConnection p0) {}
    public void onConnectionServiceFocusLost() {}
    public void onConnectionServiceFocusGained() {}
    public boolean containsConference(android.telecom.Conference p0) { return false; }
    void addRemoteConference(android.telecom.RemoteConference p0) {}
    void addRemoteExistingConnection(android.telecom.RemoteConnection p0) {}
    private void onAccountsInitialized() {}
    private java.lang.String addExistingConnectionInternal(android.telecom.PhoneAccountHandle p0, android.telecom.Connection p1) { return null; }
    private void addConnection(android.telecom.PhoneAccountHandle p0, java.lang.String p1, android.telecom.Connection p2) {}
    protected void removeConnection(android.telecom.Connection p0) {}
    private java.lang.String addConferenceInternal(android.telecom.Conference p0) { return null; }
    private void removeConference(android.telecom.Conference p0) {}
    private android.telecom.Connection findConnectionForAction(java.lang.String p0, java.lang.String p1) { return null; }
    static synchronized android.telecom.Connection getNullConnection() { return null; }
    private android.telecom.Conference findConferenceForAction(java.lang.String p0, java.lang.String p1) { return null; }
    private java.util.List<java.lang.String> createConnectionIdList(java.util.List<android.telecom.Connection> p0) { return null; }
    private java.util.List<java.lang.String> createIdList(java.util.List<android.telecom.Conferenceable> p0) { return null; }
    private android.telecom.Conference getNullConference() { return null; }
    private void endAllConnections() {}
    private int getNextCallId() { return 0; }
    public android.os.Handler getHandler() { return null; }
}
