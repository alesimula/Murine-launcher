package android.hardware.hdmi;

public final class HdmiAudioSystemClient extends android.hardware.hdmi.HdmiClient {
    public HdmiAudioSystemClient(android.hardware.hdmi.IHdmiControlService p0) { super(null); }
    public HdmiAudioSystemClient(android.hardware.hdmi.IHdmiControlService p0, android.os.Handler p1) { super(null); }
    public int getDeviceType() { return 0; }
    public void sendReportAudioStatusCecCommand(boolean p0, int p1, int p2, boolean p3) {}
    public void setSystemAudioMode(boolean p0, android.hardware.hdmi.HdmiAudioSystemClient.SetSystemAudioModeCallback p1) {}
    public void setSystemAudioModeOnForAudioOnlySource() {}

    public static interface SetSystemAudioModeCallback {
        public void onComplete(int p0);
    }
}
