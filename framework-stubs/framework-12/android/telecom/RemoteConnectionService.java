package android.telecom;

final class RemoteConnectionService {
    private static final android.telecom.RemoteConnection NULL_CONNECTION = null;
    private static final android.telecom.RemoteConference NULL_CONFERENCE = null;
    private final com.android.internal.telecom.IConnectionServiceAdapter mServantDelegate = null;
    private final android.telecom.ConnectionServiceAdapterServant mServant = null;
    private final android.os.IBinder.DeathRecipient mDeathRecipient = null;
    private final com.android.internal.telecom.IConnectionService mOutgoingConnectionServiceRpc = null;
    private final android.telecom.ConnectionService mOurConnectionServiceImpl = null;
    private final java.util.Map<java.lang.String, android.telecom.RemoteConnection> mConnectionById = null;
    private final java.util.Map<java.lang.String, android.telecom.RemoteConference> mConferenceById = null;
    private final java.util.Set<android.telecom.RemoteConnection> mPendingConnections = null;
    RemoteConnectionService(com.android.internal.telecom.IConnectionService p0, android.telecom.ConnectionService p1) throws android.os.RemoteException {}
    public java.lang.String toString() { return null; }
    final android.telecom.RemoteConnection createRemoteConnection(android.telecom.PhoneAccountHandle p0, android.telecom.ConnectionRequest p1, boolean p2) { return null; }
    android.telecom.RemoteConference createRemoteConference(android.telecom.PhoneAccountHandle p0, android.telecom.ConnectionRequest p1, boolean p2) { return null; }
    private boolean hasConnection(java.lang.String p0) { return false; }
    private android.telecom.RemoteConnection findConnectionForAction(java.lang.String p0, java.lang.String p1) { return null; }
    private android.telecom.RemoteConference findConferenceForAction(java.lang.String p0, java.lang.String p1) { return null; }
    private void maybeDisconnectAdapter() {}
}
