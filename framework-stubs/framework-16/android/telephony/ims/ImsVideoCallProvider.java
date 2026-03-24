package android.telephony.ims;

@android.annotation.SystemApi
public abstract class ImsVideoCallProvider {
    public ImsVideoCallProvider() {}
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
