package android.telecom;

public abstract class ConnectionService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.telecom.ConnectionService";
    public static final java.lang.String EXTRA_IS_HANDOVER = "android.telecom.extra.IS_HANDOVER";
    public ConnectionService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public boolean onUnbind(android.content.Intent p0) { return false; }
    public void onBindClient(android.content.Intent p0) {}
    public final android.telecom.RemoteConnection createRemoteIncomingConnection(android.telecom.PhoneAccountHandle p0, android.telecom.ConnectionRequest p1) { return null; }
    public final android.telecom.RemoteConnection createRemoteOutgoingConnection(android.telecom.PhoneAccountHandle p0, android.telecom.ConnectionRequest p1) { return null; }
    public final android.telecom.RemoteConference createRemoteIncomingConference(android.telecom.PhoneAccountHandle p0, android.telecom.ConnectionRequest p1) { return null; }
    public final android.telecom.RemoteConference createRemoteOutgoingConference(android.telecom.PhoneAccountHandle p0, android.telecom.ConnectionRequest p1) { return null; }
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
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
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
    protected void removeConnection(android.telecom.Connection p0) {}
    static synchronized android.telecom.Connection getNullConnection() { return null; }
    public android.os.Handler getHandler() { return null; }
    public void setReadyForTest() {}
}
