package android.hardware.hdmi;

@android.annotation.SystemApi
public abstract class HdmiClient {
    private static final java.lang.String TAG = "HdmiClient";
    final android.hardware.hdmi.IHdmiControlService mService = null;
    private android.hardware.hdmi.IHdmiVendorCommandListener mIHdmiVendorCommandListener;
    abstract int getDeviceType();
    HdmiClient(android.hardware.hdmi.IHdmiControlService p0) {}
    public android.hardware.hdmi.HdmiDeviceInfo getActiveSource() { return null; }
    public void sendKeyEvent(int p0, boolean p1) {}
    public void sendVolumeKeyEvent(int p0, boolean p1) {}
    public void sendVendorCommand(int p0, byte[] p1, boolean p2) {}
    public void setVendorCommandListener(android.hardware.hdmi.HdmiControlManager.VendorCommandListener p0) {}
    private static android.hardware.hdmi.IHdmiVendorCommandListener getListenerWrapper(android.hardware.hdmi.HdmiControlManager.VendorCommandListener p0) { return null; }
}
