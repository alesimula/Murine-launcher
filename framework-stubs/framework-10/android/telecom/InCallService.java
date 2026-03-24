package android.telecom;

public abstract class InCallService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.telecom.InCallService";
    private static final int MSG_SET_IN_CALL_ADAPTER = 1;
    private static final int MSG_ADD_CALL = 2;
    private static final int MSG_UPDATE_CALL = 3;
    private static final int MSG_SET_POST_DIAL_WAIT = 4;
    private static final int MSG_ON_CALL_AUDIO_STATE_CHANGED = 5;
    private static final int MSG_BRING_TO_FOREGROUND = 6;
    private static final int MSG_ON_CAN_ADD_CALL_CHANGED = 7;
    private static final int MSG_SILENCE_RINGER = 8;
    private static final int MSG_ON_CONNECTION_EVENT = 9;
    private static final int MSG_ON_RTT_UPGRADE_REQUEST = 10;
    private static final int MSG_ON_RTT_INITIATION_FAILURE = 11;
    private static final int MSG_ON_HANDOVER_FAILED = 12;
    private static final int MSG_ON_HANDOVER_COMPLETE = 13;
    private final android.os.Handler mHandler = null;
    private android.telecom.Phone.Listener mPhoneListener;
    private android.telecom.Phone mPhone;
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
    public final android.telecom.CallAudioState getCallAudioState() { return null; }
    public final void setMuted(boolean p0) {}
    public final void setAudioRoute(int p0) {}
    public final void requestBluetoothAudio(android.bluetooth.BluetoothDevice p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void onPhoneCreated(android.telecom.Phone p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void onPhoneDestroyed(android.telecom.Phone p0) {}
    @java.lang.Deprecated
    public void onAudioStateChanged(android.telecom.AudioState p0) {}
    public void onCallAudioStateChanged(android.telecom.CallAudioState p0) {}
    public void onBringToForeground(boolean p0) {}
    public void onCallAdded(android.telecom.Call p0) {}
    public void onCallRemoved(android.telecom.Call p0) {}
    public void onCanAddCallChanged(boolean p0) {}
    public void onSilenceRinger() {}
    public void onConnectionEvent(android.telecom.Call p0, java.lang.String p1, android.os.Bundle p2) {}

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

    private final class InCallServiceBinder extends com.android.internal.telecom.IInCallService.Stub {
        private InCallServiceBinder(android.telecom.InCallService p0) { super(); }
        public void setInCallAdapter(com.android.internal.telecom.IInCallAdapter p0) {}
        public void addCall(android.telecom.ParcelableCall p0) {}
        public void updateCall(android.telecom.ParcelableCall p0) {}
        public void setPostDial(java.lang.String p0, java.lang.String p1) {}
        public void setPostDialWait(java.lang.String p0, java.lang.String p1) {}
        public void onCallAudioStateChanged(android.telecom.CallAudioState p0) {}
        public void bringToForeground(boolean p0) {}
        public void onCanAddCallChanged(boolean p0) {}
        public void silenceRinger() {}
        public void onConnectionEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) {}
        public void onRttUpgradeRequest(java.lang.String p0, int p1) {}
        public void onRttInitiationFailure(java.lang.String p0, int p1) {}
        public void onHandoverFailed(java.lang.String p0, int p1) {}
        public void onHandoverComplete(java.lang.String p0) {}
    }
}
