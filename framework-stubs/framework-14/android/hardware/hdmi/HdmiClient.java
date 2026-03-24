package android.hardware.hdmi;

@android.annotation.SystemApi
public abstract class HdmiClient {
    final android.hardware.hdmi.IHdmiControlService mService = null;
    abstract int getDeviceType();
    HdmiClient(android.hardware.hdmi.IHdmiControlService p0) {}
    public void selectDevice(int p0, java.util.concurrent.Executor p1, android.hardware.hdmi.HdmiClient.OnDeviceSelectedListener p2) {}
    public android.hardware.hdmi.HdmiDeviceInfo getActiveSource() { return null; }
    public void sendKeyEvent(int p0, boolean p1) {}
    public void sendVolumeKeyEvent(int p0, boolean p1) {}
    public void sendVendorCommand(int p0, byte[] p1, boolean p2) {}
    public void setVendorCommandListener(android.hardware.hdmi.HdmiControlManager.VendorCommandListener p0) {}
    public void setVendorCommandListener(android.hardware.hdmi.HdmiControlManager.VendorCommandListener p0, int p1) {}

    public static interface OnDeviceSelectedListener {
        public void onDeviceSelected(int p0, int p1);
    }
}
