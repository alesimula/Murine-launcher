package android.hardware.hdmi;

@android.annotation.SystemApi
public final class HdmiPlaybackClient extends android.hardware.hdmi.HdmiClient {
    private static final java.lang.String TAG = "HdmiPlaybackClient";
    private static final int ADDR_TV = 0;
    HdmiPlaybackClient(android.hardware.hdmi.IHdmiControlService p0) { super(null); }
    public void oneTouchPlay(android.hardware.hdmi.HdmiPlaybackClient.OneTouchPlayCallback p0) {}
    public int getDeviceType() { return 0; }
    public void queryDisplayStatus(android.hardware.hdmi.HdmiPlaybackClient.DisplayStatusCallback p0) {}
    public void sendStandby() {}
    private android.hardware.hdmi.IHdmiControlCallback getCallbackWrapper(android.hardware.hdmi.HdmiPlaybackClient.OneTouchPlayCallback p0) { return null; }
    private android.hardware.hdmi.IHdmiControlCallback getCallbackWrapper(android.hardware.hdmi.HdmiPlaybackClient.DisplayStatusCallback p0) { return null; }

    public static interface OneTouchPlayCallback {
        public void onComplete(int p0);
    }

    public static interface DisplayStatusCallback {
        public void onComplete(int p0);
    }
}
