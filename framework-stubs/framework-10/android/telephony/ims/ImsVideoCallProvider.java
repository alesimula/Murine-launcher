package android.telephony.ims;

@android.annotation.SystemApi
public abstract class ImsVideoCallProvider {
    private static final int MSG_SET_CALLBACK = 1;
    private static final int MSG_SET_CAMERA = 2;
    private static final int MSG_SET_PREVIEW_SURFACE = 3;
    private static final int MSG_SET_DISPLAY_SURFACE = 4;
    private static final int MSG_SET_DEVICE_ORIENTATION = 5;
    private static final int MSG_SET_ZOOM = 6;
    private static final int MSG_SEND_SESSION_MODIFY_REQUEST = 7;
    private static final int MSG_SEND_SESSION_MODIFY_RESPONSE = 8;
    private static final int MSG_REQUEST_CAMERA_CAPABILITIES = 9;
    private static final int MSG_REQUEST_CALL_DATA_USAGE = 10;
    private static final int MSG_SET_PAUSE_IMAGE = 11;
    private final android.telephony.ims.ImsVideoCallProvider.ImsVideoCallProviderBinder mBinder = null;
    private com.android.ims.internal.IImsVideoCallCallback mCallback;
    private final android.os.Handler mProviderHandler = null;
    public ImsVideoCallProvider() {}
    @android.annotation.UnsupportedAppUsage
    public final com.android.ims.internal.IImsVideoCallProvider getInterface() { return null; }
    public abstract void onSetCamera(java.lang.String p0);
    public void onSetCamera(java.lang.String p0, int p1) {}
    public abstract void onSetPreviewSurface(android.view.Surface p0);
    public abstract void onSetDisplaySurface(android.view.Surface p0);
    public abstract void onSetDeviceOrientation(int p0);
    public abstract void onSetZoom(float p0);
    public abstract void onSendSessionModifyRequest(android.telecom.VideoProfile p0, android.telecom.VideoProfile p1);
    public abstract void onSendSessionModifyResponse(android.telecom.VideoProfile p0);
    public abstract void onRequestCameraCapabilities();
    public abstract void onRequestCallDataUsage();
    public abstract void onSetPauseImage(android.net.Uri p0);
    public void receiveSessionModifyRequest(android.telecom.VideoProfile p0) {}
    public void receiveSessionModifyResponse(int p0, android.telecom.VideoProfile p1, android.telecom.VideoProfile p2) {}
    public void handleCallSessionEvent(int p0) {}
    public void changePeerDimensions(int p0, int p1) {}
    public void changeCallDataUsage(long p0) {}
    public void changeCameraCapabilities(android.telecom.VideoProfile.CameraCapabilities p0) {}
    public void changeVideoQuality(int p0) {}

    private final class ImsVideoCallProviderBinder extends com.android.ims.internal.IImsVideoCallProvider.Stub {
        private ImsVideoCallProviderBinder(android.telephony.ims.ImsVideoCallProvider p0) { super(); }
        public void setCallback(com.android.ims.internal.IImsVideoCallCallback p0) {}
        public void setCamera(java.lang.String p0, int p1) {}
        public void setPreviewSurface(android.view.Surface p0) {}
        public void setDisplaySurface(android.view.Surface p0) {}
        public void setDeviceOrientation(int p0) {}
        public void setZoom(float p0) {}
        public void sendSessionModifyRequest(android.telecom.VideoProfile p0, android.telecom.VideoProfile p1) {}
        public void sendSessionModifyResponse(android.telecom.VideoProfile p0) {}
        public void requestCameraCapabilities() {}
        public void requestCallDataUsage() {}
        public void setPauseImage(android.net.Uri p0) {}
    }
}
