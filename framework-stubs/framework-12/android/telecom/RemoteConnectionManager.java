package android.telecom;

public class RemoteConnectionManager {
    private final java.util.Map<android.content.ComponentName, android.telecom.RemoteConnectionService> mRemoteConnectionServices = null;
    private final android.telecom.ConnectionService mOurConnectionServiceImpl = null;
    public RemoteConnectionManager(android.telecom.ConnectionService p0) {}
    void addConnectionService(android.content.ComponentName p0, com.android.internal.telecom.IConnectionService p1) {}
    public android.telecom.RemoteConnection createRemoteConnection(android.telecom.PhoneAccountHandle p0, android.telecom.ConnectionRequest p1, boolean p2) { return null; }
    public android.telecom.RemoteConference createRemoteConference(android.telecom.PhoneAccountHandle p0, android.telecom.ConnectionRequest p1, boolean p2) { return null; }
    public void conferenceRemoteConnections(android.telecom.RemoteConnection p0, android.telecom.RemoteConnection p1) {}
}
