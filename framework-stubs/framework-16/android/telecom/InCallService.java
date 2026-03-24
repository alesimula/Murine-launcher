package android.telecom;

public abstract class InCallService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.telecom.InCallService";
    public InCallService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public boolean onUnbind(android.content.Intent p0) { return false; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public android.telecom.Phone getPhone() { return null; }
    public final java.util.List<android.telecom.Call> getCalls() { return null; }
    public final boolean canAddCall() { return false; }
    @java.lang.Deprecated
    public final android.telecom.AudioState getAudioState() { return null; }
    @java.lang.Deprecated
    public final android.telecom.CallAudioState getCallAudioState() { return null; }
    public final void setMuted(boolean p0) {}
    @java.lang.Deprecated
    public final void setAudioRoute(int p0) {}
    @java.lang.Deprecated
    public final void requestBluetoothAudio(android.bluetooth.BluetoothDevice p0) {}
    public final void requestCallEndpointChange(android.telecom.CallEndpoint p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.telecom.CallEndpointException> p2) {}
    @android.annotation.NonNull
    public final android.telecom.CallEndpoint getCurrentCallEndpoint() { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void onPhoneCreated(android.telecom.Phone p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void onPhoneDestroyed(android.telecom.Phone p0) {}
    @java.lang.Deprecated
    public void onAudioStateChanged(android.telecom.AudioState p0) {}
    @java.lang.Deprecated
    public void onCallAudioStateChanged(android.telecom.CallAudioState p0) {}
    public void onCallEndpointChanged(android.telecom.CallEndpoint p0) {}
    public void onAvailableCallEndpointsChanged(java.util.List<android.telecom.CallEndpoint> p0) {}
    public void onMuteStateChanged(boolean p0) {}
    public void onBringToForeground(boolean p0) {}
    public void onCallAdded(android.telecom.Call p0) {}
    public void onCallRemoved(android.telecom.Call p0) {}
    public void onCanAddCallChanged(boolean p0) {}
    public void onSilenceRinger() {}
    public void onConnectionEvent(android.telecom.Call p0, java.lang.String p1, android.os.Bundle p2) {}

    private final class InCallServiceBinder extends com.android.internal.telecom.IInCallService.Stub {
        public void setInCallAdapter(com.android.internal.telecom.IInCallAdapter p0) {}
        public void addCall(android.telecom.ParcelableCall p0) {}
        public void updateCall(android.telecom.ParcelableCall p0) {}
        public void setPostDial(java.lang.String p0, java.lang.String p1) {}
        public void setPostDialWait(java.lang.String p0, java.lang.String p1) {}
        public void onCallAudioStateChanged(android.telecom.CallAudioState p0) {}
        public void onCallEndpointChanged(android.telecom.CallEndpoint p0) {}
        public void onAvailableCallEndpointsChanged(java.util.List<android.telecom.CallEndpoint> p0) {}
        public void onMuteStateChanged(boolean p0) {}
        public void bringToForeground(boolean p0) {}
        public void onCanAddCallChanged(boolean p0) {}
        public void silenceRinger() {}
        public void onConnectionEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) {}
        public void onRttUpgradeRequest(java.lang.String p0, int p1) {}
        public void onRttInitiationFailure(java.lang.String p0, int p1) {}
        public void onHandoverFailed(java.lang.String p0, int p1) {}
        public void onHandoverComplete(java.lang.String p0) {}
    }

    public static abstract class VideoCall {
        public VideoCall() {}
        public abstract void destroy();
        public abstract void registerCallback(android.telecom.InCallService.VideoCall.Callback p0);
        public abstract void registerCallback(android.telecom.InCallService.VideoCall.Callback p0, android.os.Handler p1);
        public abstract void unregisterCallback(android.telecom.InCallService.VideoCall.Callback p0);
        public abstract void setCamera(java.lang.String p0);
        public abstract void setPreviewSurface(android.view.Surface p0);
        public abstract void setDisplaySurface(android.view.Surface p0);
        public abstract void setDeviceOrientation(int p0);
        public abstract void setZoom(float p0);
        public abstract void sendSessionModifyRequest(android.telecom.VideoProfile p0);
        public abstract void sendSessionModifyResponse(android.telecom.VideoProfile p0);
        public abstract void requestCameraCapabilities();
        public abstract void requestCallDataUsage();
        public abstract void setPauseImage(android.net.Uri p0);

        public static abstract class Callback {
            public Callback() {}
            public abstract void onSessionModifyRequestReceived(android.telecom.VideoProfile p0);
            public abstract void onSessionModifyResponseReceived(int p0, android.telecom.VideoProfile p1, android.telecom.VideoProfile p2);
            public abstract void onCallSessionEvent(int p0);
            public abstract void onPeerDimensionsChanged(int p0, int p1);
            public abstract void onVideoQualityChanged(int p0);
            public abstract void onCallDataUsageChanged(long p0);
            public abstract void onCameraCapabilitiesChanged(android.telecom.VideoProfile.CameraCapabilities p0);
        }
    }
}
