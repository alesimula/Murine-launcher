package android.telecom;

public final class RemoteConnection {
    private com.android.internal.telecom.IConnectionService mConnectionService;
    private final java.lang.String mConnectionId = null;
    private final java.util.Set<android.telecom.RemoteConnection.CallbackRecord> mCallbackRecords = null;
    private final java.util.List<android.telecom.RemoteConnection> mConferenceableConnections = null;
    private final java.util.List<android.telecom.RemoteConnection> mUnmodifiableconferenceableConnections = null;
    private int mState;
    private android.telecom.DisconnectCause mDisconnectCause;
    private boolean mRingbackRequested;
    private boolean mConnected;
    private int mConnectionCapabilities;
    private int mConnectionProperties;
    private int mVideoState;
    private android.telecom.RemoteConnection.VideoProvider mVideoProvider;
    private boolean mIsVoipAudioMode;
    private android.telecom.StatusHints mStatusHints;
    private android.net.Uri mAddress;
    private int mAddressPresentation;
    private java.lang.String mCallerDisplayName;
    private int mCallerDisplayNamePresentation;
    private android.telecom.RemoteConference mConference;
    private android.os.Bundle mExtras;
    RemoteConnection(java.lang.String p0, com.android.internal.telecom.IConnectionService p1, android.telecom.ConnectionRequest p2) {}
    RemoteConnection(java.lang.String p0, com.android.internal.telecom.IConnectionService p1, android.telecom.ParcelableConnection p2, java.lang.String p3, int p4) {}
    RemoteConnection(android.telecom.DisconnectCause p0) {}
    public void registerCallback(android.telecom.RemoteConnection.Callback p0) {}
    public void registerCallback(android.telecom.RemoteConnection.Callback p0, android.os.Handler p1) {}
    public void unregisterCallback(android.telecom.RemoteConnection.Callback p0) {}
    public int getState() { return 0; }
    public android.telecom.DisconnectCause getDisconnectCause() { return null; }
    public int getConnectionCapabilities() { return 0; }
    public int getConnectionProperties() { return 0; }
    public boolean isVoipAudioMode() { return false; }
    public android.telecom.StatusHints getStatusHints() { return null; }
    public android.net.Uri getAddress() { return null; }
    public int getAddressPresentation() { return 0; }
    public java.lang.CharSequence getCallerDisplayName() { return null; }
    public int getCallerDisplayNamePresentation() { return 0; }
    public int getVideoState() { return 0; }
    public final android.telecom.RemoteConnection.VideoProvider getVideoProvider() { return null; }
    public final android.os.Bundle getExtras() { return null; }
    public boolean isRingbackRequested() { return false; }
    public void abort() {}
    public void answer() {}
    public void answer(int p0) {}
    public void reject() {}
    public void hold() {}
    public void unhold() {}
    public void disconnect() {}
    public void playDtmfTone(char p0) {}
    public void stopDtmfTone() {}
    public void postDialContinue(boolean p0) {}
    public void pullExternalCall() {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void setAudioState(android.telecom.AudioState p0) {}
    public void setCallAudioState(android.telecom.CallAudioState p0) {}
    public void startRtt(android.telecom.Connection.RttTextStream p0) {}
    public void stopRtt() {}
    public void sendRttUpgradeResponse(android.telecom.Connection.RttTextStream p0) {}
    public java.util.List<android.telecom.RemoteConnection> getConferenceableConnections() { return null; }
    public android.telecom.RemoteConference getConference() { return null; }
    java.lang.String getId() { return null; }
    com.android.internal.telecom.IConnectionService getConnectionService() { return null; }
    void setState(int p0) {}
    void setDisconnected(android.telecom.DisconnectCause p0) {}
    void setRingbackRequested(boolean p0) {}
    void setConnectionCapabilities(int p0) {}
    void setConnectionProperties(int p0) {}
    void setDestroyed() {}
    void setPostDialWait(java.lang.String p0) {}
    void onPostDialChar(char p0) {}
    void setVideoState(int p0) {}
    void setVideoProvider(android.telecom.RemoteConnection.VideoProvider p0) {}
    void setIsVoipAudioMode(boolean p0) {}
    void setStatusHints(android.telecom.StatusHints p0) {}
    void setAddress(android.net.Uri p0, int p1) {}
    void setCallerDisplayName(java.lang.String p0, int p1) {}
    void setConferenceableConnections(java.util.List<android.telecom.RemoteConnection> p0) {}
    void setConference(android.telecom.RemoteConference p0) {}
    void putExtras(android.os.Bundle p0) {}
    void removeExtras(java.util.List<java.lang.String> p0) {}
    private void notifyExtrasChanged() {}
    void onConnectionEvent(java.lang.String p0, android.os.Bundle p1) {}
    void onRttInitiationSuccess() {}
    void onRttInitiationFailure(int p0) {}
    void onRttSessionRemotelyTerminated() {}
    void onRemoteRttRequest() {}
    public static android.telecom.RemoteConnection failure(android.telecom.DisconnectCause p0) { return null; }

    public static class VideoProvider {
        private final com.android.internal.telecom.IVideoCallback mVideoCallbackDelegate = null;
        private final android.telecom.VideoCallbackServant mVideoCallbackServant = null;
        private final com.android.internal.telecom.IVideoProvider mVideoProviderBinder = null;
        private final java.lang.String mCallingPackage = null;
        private final int mTargetSdkVersion = 0;
        private final java.util.Set<android.telecom.RemoteConnection.VideoProvider.Callback> mCallbacks = null;
        VideoProvider(com.android.internal.telecom.IVideoProvider p0, java.lang.String p1, int p2) {}
        public void registerCallback(android.telecom.RemoteConnection.VideoProvider.Callback p0) {}
        public void unregisterCallback(android.telecom.RemoteConnection.VideoProvider.Callback p0) {}
        public void setCamera(java.lang.String p0) {}
        public void setPreviewSurface(android.view.Surface p0) {}
        public void setDisplaySurface(android.view.Surface p0) {}
        public void setDeviceOrientation(int p0) {}
        public void setZoom(float p0) {}
        public void sendSessionModifyRequest(android.telecom.VideoProfile p0, android.telecom.VideoProfile p1) {}
        public void sendSessionModifyResponse(android.telecom.VideoProfile p0) {}
        public void requestCameraCapabilities() {}
        public void requestCallDataUsage() {}
        public void setPauseImage(android.net.Uri p0) {}

        public static abstract class Callback {
            public Callback() {}
            public void onSessionModifyRequestReceived(android.telecom.RemoteConnection.VideoProvider p0, android.telecom.VideoProfile p1) {}
            public void onSessionModifyResponseReceived(android.telecom.RemoteConnection.VideoProvider p0, int p1, android.telecom.VideoProfile p2, android.telecom.VideoProfile p3) {}
            public void onCallSessionEvent(android.telecom.RemoteConnection.VideoProvider p0, int p1) {}
            public void onPeerDimensionsChanged(android.telecom.RemoteConnection.VideoProvider p0, int p1, int p2) {}
            public void onCallDataUsageChanged(android.telecom.RemoteConnection.VideoProvider p0, long p1) {}
            public void onCameraCapabilitiesChanged(android.telecom.RemoteConnection.VideoProvider p0, android.telecom.VideoProfile.CameraCapabilities p1) {}
            public void onVideoQualityChanged(android.telecom.RemoteConnection.VideoProvider p0, int p1) {}
        }
    }

    private static final class CallbackRecord extends android.telecom.RemoteConnection.Callback {
        private final android.telecom.RemoteConnection.Callback mCallback = null;
        private final android.os.Handler mHandler = null;
        public CallbackRecord(android.telecom.RemoteConnection.Callback p0, android.os.Handler p1) { super(); }
        public android.telecom.RemoteConnection.Callback getCallback() { return null; }
        public android.os.Handler getHandler() { return null; }
    }

    public static abstract class Callback {
        public Callback() {}
        public void onStateChanged(android.telecom.RemoteConnection p0, int p1) {}
        public void onDisconnected(android.telecom.RemoteConnection p0, android.telecom.DisconnectCause p1) {}
        public void onRingbackRequested(android.telecom.RemoteConnection p0, boolean p1) {}
        public void onConnectionCapabilitiesChanged(android.telecom.RemoteConnection p0, int p1) {}
        public void onConnectionPropertiesChanged(android.telecom.RemoteConnection p0, int p1) {}
        public void onPostDialWait(android.telecom.RemoteConnection p0, java.lang.String p1) {}
        public void onPostDialChar(android.telecom.RemoteConnection p0, char p1) {}
        public void onVoipAudioChanged(android.telecom.RemoteConnection p0, boolean p1) {}
        public void onStatusHintsChanged(android.telecom.RemoteConnection p0, android.telecom.StatusHints p1) {}
        public void onAddressChanged(android.telecom.RemoteConnection p0, android.net.Uri p1, int p2) {}
        public void onCallerDisplayNameChanged(android.telecom.RemoteConnection p0, java.lang.String p1, int p2) {}
        public void onVideoStateChanged(android.telecom.RemoteConnection p0, int p1) {}
        public void onDestroyed(android.telecom.RemoteConnection p0) {}
        public void onConferenceableConnectionsChanged(android.telecom.RemoteConnection p0, java.util.List<android.telecom.RemoteConnection> p1) {}
        public void onVideoProviderChanged(android.telecom.RemoteConnection p0, android.telecom.RemoteConnection.VideoProvider p1) {}
        public void onConferenceChanged(android.telecom.RemoteConnection p0, android.telecom.RemoteConference p1) {}
        public void onExtrasChanged(android.telecom.RemoteConnection p0, android.os.Bundle p1) {}
        public void onConnectionEvent(android.telecom.RemoteConnection p0, java.lang.String p1, android.os.Bundle p2) {}
        public void onRttInitiationSuccess(android.telecom.RemoteConnection p0) {}
        public void onRttInitiationFailure(android.telecom.RemoteConnection p0, int p1) {}
        public void onRttSessionRemotelyTerminated(android.telecom.RemoteConnection p0) {}
        public void onRemoteRttRequest(android.telecom.RemoteConnection p0) {}
    }
}
