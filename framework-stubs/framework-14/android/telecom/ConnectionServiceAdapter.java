package android.telecom;

final class ConnectionServiceAdapter implements android.os.IBinder.DeathRecipient {
    ConnectionServiceAdapter() {}
    void addAdapter(com.android.internal.telecom.IConnectionServiceAdapter p0) {}
    void removeAdapter(com.android.internal.telecom.IConnectionServiceAdapter p0) {}
    public void binderDied() {}
    void handleCreateConnectionComplete(java.lang.String p0, android.telecom.ConnectionRequest p1, android.telecom.ParcelableConnection p2) {}
    void handleCreateConferenceComplete(java.lang.String p0, android.telecom.ConnectionRequest p1, android.telecom.ParcelableConference p2) {}
    void setActive(java.lang.String p0) {}
    void setRinging(java.lang.String p0) {}
    void setDialing(java.lang.String p0) {}
    void setPulling(java.lang.String p0) {}
    void setDisconnected(java.lang.String p0, android.telecom.DisconnectCause p1) {}
    void setOnHold(java.lang.String p0) {}
    void setRingbackRequested(java.lang.String p0, boolean p1) {}
    void setConnectionCapabilities(java.lang.String p0, int p1) {}
    void setConnectionProperties(java.lang.String p0, int p1) {}
    void setIsConferenced(java.lang.String p0, java.lang.String p1) {}
    void onConferenceMergeFailed(java.lang.String p0) {}
    void resetConnectionTime(java.lang.String p0) {}
    void removeCall(java.lang.String p0) {}
    void onPostDialWait(java.lang.String p0, java.lang.String p1) {}
    void onPostDialChar(java.lang.String p0, char p1) {}
    void addConferenceCall(java.lang.String p0, android.telecom.ParcelableConference p1) {}
    void queryRemoteConnectionServices(com.android.internal.telecom.RemoteServiceCallback p0, java.lang.String p1) {}
    void setVideoProvider(java.lang.String p0, android.telecom.Connection.VideoProvider p1) {}
    void setIsVoipAudioMode(java.lang.String p0, boolean p1) {}
    void setStatusHints(java.lang.String p0, android.telecom.StatusHints p1) {}
    void setAddress(java.lang.String p0, android.net.Uri p1, int p2) {}
    void setCallerDisplayName(java.lang.String p0, java.lang.String p1, int p2) {}
    void setVideoState(java.lang.String p0, int p1) {}
    void setConferenceableConnections(java.lang.String p0, java.util.List<java.lang.String> p1) {}
    void addExistingConnection(java.lang.String p0, android.telecom.ParcelableConnection p1) {}
    void putExtras(java.lang.String p0, android.os.Bundle p1) {}
    void putExtra(java.lang.String p0, java.lang.String p1, boolean p2) {}
    void putExtra(java.lang.String p0, java.lang.String p1, int p2) {}
    void putExtra(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    void removeExtras(java.lang.String p0, java.util.List<java.lang.String> p1) {}
    void setAudioRoute(java.lang.String p0, int p1, java.lang.String p2) {}
    void requestCallEndpointChange(java.lang.String p0, android.telecom.CallEndpoint p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<java.lang.Void, android.telecom.CallEndpointException> p3) {}
    void onConnectionEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) {}
    void onRttInitiationSuccess(java.lang.String p0) {}
    void onRttInitiationFailure(java.lang.String p0, int p1) {}
    void onRttSessionRemotelyTerminated(java.lang.String p0) {}
    void onRemoteRttRequest(java.lang.String p0) {}
    void onPhoneAccountChanged(java.lang.String p0, android.telecom.PhoneAccountHandle p1) {}
    void onConnectionServiceFocusReleased() {}
    void setConferenceState(java.lang.String p0, boolean p1) {}
    void setCallDirection(java.lang.String p0, int p1) {}
    void queryLocation(java.lang.String p0, long p1, java.lang.String p2, java.util.concurrent.Executor p3, android.os.OutcomeReceiver<android.location.Location, android.telecom.QueryLocationException> p4) {}
}
