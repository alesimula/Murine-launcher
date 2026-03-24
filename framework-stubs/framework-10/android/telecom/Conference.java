package android.telecom;

public abstract class Conference extends android.telecom.Conferenceable {
    public static final long CONNECT_TIME_NOT_SPECIFIED = 0L;
    private final java.util.Set<android.telecom.Conference.Listener> mListeners = null;
    private final java.util.List<android.telecom.Connection> mChildConnections = null;
    private final java.util.List<android.telecom.Connection> mUnmodifiableChildConnections = null;
    private final java.util.List<android.telecom.Connection> mConferenceableConnections = null;
    private final java.util.List<android.telecom.Connection> mUnmodifiableConferenceableConnections = null;
    private java.lang.String mTelecomCallId;
    private android.telecom.PhoneAccountHandle mPhoneAccount;
    private android.telecom.CallAudioState mCallAudioState;
    private int mState;
    private android.telecom.DisconnectCause mDisconnectCause;
    private int mConnectionCapabilities;
    private int mConnectionProperties;
    private java.lang.String mDisconnectMessage;
    private long mConnectTimeMillis;
    private long mConnectionStartElapsedRealTime;
    private android.telecom.StatusHints mStatusHints;
    private android.os.Bundle mExtras;
    private java.util.Set<java.lang.String> mPreviousExtraKeys;
    private final java.lang.Object mExtrasLock = null;
    private android.net.Uri mAddress;
    private int mAddressPresentation;
    private java.lang.String mCallerDisplayName;
    private int mCallerDisplayNamePresentation;
    private final android.telecom.Connection.Listener mConnectionDeathListener = null;
    public Conference(android.telecom.PhoneAccountHandle p0) { super(); }
    public final java.lang.String getTelecomCallId() { return null; }
    public final void setTelecomCallId(java.lang.String p0) {}
    public final android.telecom.PhoneAccountHandle getPhoneAccountHandle() { return null; }
    public final java.util.List<android.telecom.Connection> getConnections() { return null; }
    public final int getState() { return 0; }
    public final int getConnectionCapabilities() { return 0; }
    public final int getConnectionProperties() { return 0; }
    public static boolean can(int p0, int p1) { return false; }
    public boolean can(int p0) { return false; }
    public void removeCapability(int p0) {}
    public void addCapability(int p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public final android.telecom.AudioState getAudioState() { return null; }
    public final android.telecom.CallAudioState getCallAudioState() { return null; }
    public android.telecom.Connection.VideoProvider getVideoProvider() { return null; }
    public int getVideoState() { return 0; }
    public void onDisconnect() {}
    public void onSeparate(android.telecom.Connection p0) {}
    public void onMerge(android.telecom.Connection p0) {}
    public void onHold() {}
    public void onUnhold() {}
    public void onMerge() {}
    public void onSwap() {}
    public void onPlayDtmfTone(char p0) {}
    public void onStopDtmfTone() {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void onAudioStateChanged(android.telecom.AudioState p0) {}
    public void onCallAudioStateChanged(android.telecom.CallAudioState p0) {}
    public void onConnectionAdded(android.telecom.Connection p0) {}
    public final void setOnHold() {}
    public final void setDialing() {}
    public final void setActive() {}
    public final void setDisconnected(android.telecom.DisconnectCause p0) {}
    public final android.telecom.DisconnectCause getDisconnectCause() { return null; }
    public final void setConnectionCapabilities(int p0) {}
    public final void setConnectionProperties(int p0) {}
    public final boolean addConnection(android.telecom.Connection p0) { return false; }
    public final void removeConnection(android.telecom.Connection p0) {}
    public final void setConferenceableConnections(java.util.List<android.telecom.Connection> p0) {}
    public final void setVideoState(android.telecom.Connection p0, int p1) {}
    public final void setVideoProvider(android.telecom.Connection p0, android.telecom.Connection.VideoProvider p1) {}
    private final void fireOnConferenceableConnectionsChanged() {}
    public final java.util.List<android.telecom.Connection> getConferenceableConnections() { return null; }
    public final void destroy() {}
    public final android.telecom.Conference addListener(android.telecom.Conference.Listener p0) { return null; }
    public final android.telecom.Conference removeListener(android.telecom.Conference.Listener p0) { return null; }
    @android.annotation.SystemApi
    public android.telecom.Connection getPrimaryConnection() { return null; }
    public void updateCallRadioTechAfterCreation() {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public final void setConnectTimeMillis(long p0) {}
    public final void setConnectionTime(long p0) {}
    public final void setConnectionStartElapsedRealTime(long p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public final long getConnectTimeMillis() { return 0L; }
    public final long getConnectionTime() { return 0L; }
    public final long getConnectionStartElapsedRealTime() { return 0L; }
    public final void setCallRadioTech(int p0) {}
    public final int getCallRadioTech() { return 0; }
    final void setCallAudioState(android.telecom.CallAudioState p0) {}
    private void setState(int p0) {}
    private final void clearConferenceableList() {}
    public java.lang.String toString() { return null; }
    public final void setStatusHints(android.telecom.StatusHints p0) {}
    public final android.telecom.StatusHints getStatusHints() { return null; }
    public final void setExtras(android.os.Bundle p0) {}
    public final void putExtras(android.os.Bundle p0) {}
    public final void putExtra(java.lang.String p0, boolean p1) {}
    public final void putExtra(java.lang.String p0, int p1) {}
    public final void putExtra(java.lang.String p0, java.lang.String p1) {}
    public final void removeExtras(java.util.List<java.lang.String> p0) {}
    public final void removeExtras(java.lang.String... p0) {}
    public final android.os.Bundle getExtras() { return null; }
    public void onExtrasChanged(android.os.Bundle p0) {}
    public void setConferenceState(boolean p0) {}
    public final void setAddress(android.net.Uri p0, int p1) {}
    public final android.net.Uri getAddress() { return null; }
    public final int getAddressPresentation() { return 0; }
    public final java.lang.String getCallerDisplayName() { return null; }
    public final int getCallerDisplayNamePresentation() { return 0; }
    public final void setCallerDisplayName(java.lang.String p0, int p1) {}
    final void handleExtrasChanged(android.os.Bundle p0) {}
    public void sendConnectionEvent(java.lang.String p0, android.os.Bundle p1) {}

    public static abstract class Listener {
        public Listener() {}
        public void onStateChanged(android.telecom.Conference p0, int p1, int p2) {}
        public void onDisconnected(android.telecom.Conference p0, android.telecom.DisconnectCause p1) {}
        public void onConnectionAdded(android.telecom.Conference p0, android.telecom.Connection p1) {}
        public void onConnectionRemoved(android.telecom.Conference p0, android.telecom.Connection p1) {}
        public void onConferenceableConnectionsChanged(android.telecom.Conference p0, java.util.List<android.telecom.Connection> p1) {}
        public void onDestroyed(android.telecom.Conference p0) {}
        public void onConnectionCapabilitiesChanged(android.telecom.Conference p0, int p1) {}
        public void onConnectionPropertiesChanged(android.telecom.Conference p0, int p1) {}
        public void onVideoStateChanged(android.telecom.Conference p0, int p1) {}
        public void onVideoProviderChanged(android.telecom.Conference p0, android.telecom.Connection.VideoProvider p1) {}
        public void onStatusHintsChanged(android.telecom.Conference p0, android.telecom.StatusHints p1) {}
        public void onExtrasChanged(android.telecom.Conference p0, android.os.Bundle p1) {}
        public void onExtrasRemoved(android.telecom.Conference p0, java.util.List<java.lang.String> p1) {}
        public void onConferenceStateChanged(android.telecom.Conference p0, boolean p1) {}
        public void onAddressChanged(android.telecom.Conference p0, android.net.Uri p1, int p2) {}
        public void onConnectionEvent(android.telecom.Conference p0, java.lang.String p1, android.os.Bundle p2) {}
        public void onCallerDisplayNameChanged(android.telecom.Conference p0, java.lang.String p1, int p2) {}
    }
}
