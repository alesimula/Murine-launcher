package android.hardware.hdmi;

@android.annotation.SystemApi
public final class HdmiTvClient extends android.hardware.hdmi.HdmiClient {
    public static final int VENDOR_DATA_SIZE = 16;
    HdmiTvClient(android.hardware.hdmi.IHdmiControlService p0) { super(null); }
    static android.hardware.hdmi.HdmiTvClient create(android.hardware.hdmi.IHdmiControlService p0) { return null; }
    public int getDeviceType() { return 0; }
    @java.lang.Deprecated
    public void deviceSelect(int p0, android.hardware.hdmi.HdmiTvClient.SelectCallback p1) {}
    public void portSelect(int p0, android.hardware.hdmi.HdmiTvClient.SelectCallback p1) {}
    public void setInputChangeListener(android.hardware.hdmi.HdmiTvClient.InputChangeListener p0) {}
    @java.lang.Deprecated
    public java.util.List<android.hardware.hdmi.HdmiDeviceInfo> getDeviceList() { return null; }
    public void setSystemAudioMode(boolean p0, android.hardware.hdmi.HdmiTvClient.SelectCallback p1) {}
    public void setSystemAudioVolume(int p0, int p1, int p2) {}
    public void setSystemAudioMute(boolean p0) {}
    public void setRecordListener(android.hardware.hdmi.HdmiRecordListener p0) {}
    public void sendStandby(int p0) {}
    public void startOneTouchRecord(int p0, android.hardware.hdmi.HdmiRecordSources.RecordSource p1) {}
    public void stopOneTouchRecord(int p0) {}
    public void startTimerRecording(int p0, int p1, android.hardware.hdmi.HdmiTimerRecordSources.TimerRecordSource p2) {}
    public void clearTimerRecording(int p0, int p1, android.hardware.hdmi.HdmiTimerRecordSources.TimerRecordSource p2) {}
    public void setHdmiMhlVendorCommandListener(android.hardware.hdmi.HdmiTvClient.HdmiMhlVendorCommandListener p0) {}
    public void sendMhlVendorCommand(int p0, int p1, int p2, byte[] p3) {}

    public static interface HdmiMhlVendorCommandListener {
        public void onReceived(int p0, int p1, int p2, byte[] p3);
    }

    public static interface InputChangeListener {
        public void onChanged(android.hardware.hdmi.HdmiDeviceInfo p0);
    }

    public static interface SelectCallback {
        public void onComplete(int p0);
    }
}
