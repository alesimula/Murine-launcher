package android.telecom;

public final class RemoteConference {
    RemoteConference(java.lang.String p0, com.android.internal.telecom.IConnectionService p1) {}
    RemoteConference(android.telecom.DisconnectCause p0) {}
    java.lang.String getId() { return null; }
    void setDestroyed() {}
    void setState(int p0) {}
    void addConnection(android.telecom.RemoteConnection p0) {}
    void removeConnection(android.telecom.RemoteConnection p0) {}
    void setConnectionCapabilities(int p0) {}
    void setConnectionProperties(int p0) {}
    void setConferenceableConnections(java.util.List<android.telecom.RemoteConnection> p0) {}
    void setDisconnected(android.telecom.DisconnectCause p0) {}
    void putExtras(android.os.Bundle p0) {}
    void removeExtras(java.util.List<java.lang.String> p0) {}
    public final java.util.List<android.telecom.RemoteConnection> getConnections() { return null; }
    public final int getState() { return 0; }
    public final int getConnectionCapabilities() { return 0; }
    public final int getConnectionProperties() { return 0; }
    public final android.os.Bundle getExtras() { return null; }
    public void disconnect() {}
    public void separate(android.telecom.RemoteConnection p0) {}
    public void merge() {}
    public void swap() {}
    public void hold() {}
    public void unhold() {}
    public android.telecom.DisconnectCause getDisconnectCause() { return null; }
    public void playDtmfTone(char p0) {}
    public void stopDtmfTone() {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void setAudioState(android.telecom.AudioState p0) {}
    public void setCallAudioState(android.telecom.CallAudioState p0) {}
    public java.util.List<android.telecom.RemoteConnection> getConferenceableConnections() { return null; }
    public final void registerCallback(android.telecom.RemoteConference.Callback p0) {}
    public final void registerCallback(android.telecom.RemoteConference.Callback p0, android.os.Handler p1) {}
    public final void unregisterCallback(android.telecom.RemoteConference.Callback p0) {}
    public static android.telecom.RemoteConference failure(android.telecom.DisconnectCause p0) { return null; }

    public static abstract class Callback {
        public Callback() {}
        public void onStateChanged(android.telecom.RemoteConference p0, int p1, int p2) {}
        public void onDisconnected(android.telecom.RemoteConference p0, android.telecom.DisconnectCause p1) {}
        public void onConnectionAdded(android.telecom.RemoteConference p0, android.telecom.RemoteConnection p1) {}
        public void onConnectionRemoved(android.telecom.RemoteConference p0, android.telecom.RemoteConnection p1) {}
        public void onConnectionCapabilitiesChanged(android.telecom.RemoteConference p0, int p1) {}
        public void onConnectionPropertiesChanged(android.telecom.RemoteConference p0, int p1) {}
        public void onConferenceableConnectionsChanged(android.telecom.RemoteConference p0, java.util.List<android.telecom.RemoteConnection> p1) {}
        public void onDestroyed(android.telecom.RemoteConference p0) {}
        public void onExtrasChanged(android.telecom.RemoteConference p0, android.os.Bundle p1) {}
    }
}
