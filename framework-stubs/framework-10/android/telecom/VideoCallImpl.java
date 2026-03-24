package android.telecom;

public class VideoCallImpl extends android.telecom.InCallService.VideoCall {
    private final com.android.internal.telecom.IVideoProvider mVideoProvider = null;
    private final android.telecom.VideoCallImpl.VideoCallListenerBinder mBinder = null;
    private android.telecom.InCallService.VideoCall.Callback mCallback;
    private int mVideoQuality;
    private int mVideoState;
    private final java.lang.String mCallingPackageName = null;
    private int mTargetSdkVersion;
    private android.os.IBinder.DeathRecipient mDeathRecipient;
    private android.os.Handler mHandler;
    VideoCallImpl(com.android.internal.telecom.IVideoProvider p0, java.lang.String p1, int p2) throws android.os.RemoteException { super(); }
    public void setTargetSdkVersion(int p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=127403196L)
    public void destroy() {}
    public void registerCallback(android.telecom.InCallService.VideoCall.Callback p0) {}
    public void registerCallback(android.telecom.InCallService.VideoCall.Callback p0, android.os.Handler p1) {}
    public void unregisterCallback(android.telecom.InCallService.VideoCall.Callback p0) {}
    public void setCamera(java.lang.String p0) {}
    public void setPreviewSurface(android.view.Surface p0) {}
    public void setDisplaySurface(android.view.Surface p0) {}
    public void setDeviceOrientation(int p0) {}
    public void setZoom(float p0) {}
    public void sendSessionModifyRequest(android.telecom.VideoProfile p0) {}
    public void sendSessionModifyResponse(android.telecom.VideoProfile p0) {}
    public void requestCameraCapabilities() {}
    public void requestCallDataUsage() {}
    public void setPauseImage(android.net.Uri p0) {}
    public void setVideoState(int p0) {}

    private final class VideoCallListenerBinder extends com.android.internal.telecom.IVideoCallback.Stub {
        private VideoCallListenerBinder(android.telecom.VideoCallImpl p0) { super(); }
        public void receiveSessionModifyRequest(android.telecom.VideoProfile p0) {}
        public void receiveSessionModifyResponse(int p0, android.telecom.VideoProfile p1, android.telecom.VideoProfile p2) {}
        public void handleCallSessionEvent(int p0) {}
        public void changePeerDimensions(int p0, int p1) {}
        public void changeVideoQuality(int p0) {}
        public void changeCallDataUsage(long p0) {}
        public void changeCameraCapabilities(android.telecom.VideoProfile.CameraCapabilities p0) {}
    }

    private final class MessageHandler extends android.os.Handler {
        private static final int MSG_RECEIVE_SESSION_MODIFY_REQUEST = 1;
        private static final int MSG_RECEIVE_SESSION_MODIFY_RESPONSE = 2;
        private static final int MSG_HANDLE_CALL_SESSION_EVENT = 3;
        private static final int MSG_CHANGE_PEER_DIMENSIONS = 4;
        private static final int MSG_CHANGE_CALL_DATA_USAGE = 5;
        private static final int MSG_CHANGE_CAMERA_CAPABILITIES = 6;
        private static final int MSG_CHANGE_VIDEO_QUALITY = 7;
        public MessageHandler(android.telecom.VideoCallImpl p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
