package android.hardware.hdmi;

@android.annotation.SystemApi
public class HdmiSwitchClient extends android.hardware.hdmi.HdmiClient {
    private static final java.lang.String TAG = "HdmiSwitchClient";
    HdmiSwitchClient(android.hardware.hdmi.IHdmiControlService p0) { super(null); }
    private static android.hardware.hdmi.IHdmiControlCallback getCallbackWrapper(android.hardware.hdmi.HdmiSwitchClient.OnSelectListener p0) { return null; }
    public int getDeviceType() { return 0; }
    public void selectDevice(int p0, android.hardware.hdmi.HdmiSwitchClient.OnSelectListener p1) {}
    @android.annotation.SystemApi
    public void selectPort(int p0, android.hardware.hdmi.HdmiSwitchClient.OnSelectListener p1) {}
    public void selectDevice(int p0, java.util.concurrent.Executor p1, android.hardware.hdmi.HdmiSwitchClient.OnSelectListener p2) {}
    @android.annotation.SystemApi
    public void selectPort(int p0, java.util.concurrent.Executor p1, android.hardware.hdmi.HdmiSwitchClient.OnSelectListener p2) {}
    public java.util.List<android.hardware.hdmi.HdmiDeviceInfo> getDeviceList() { return null; }

    @android.annotation.SystemApi
    public static interface OnSelectListener {
        public void onSelect(int p0);
    }
}
