package android.accessibilityservice;

@android.annotation.FlaggedApi("android.view.accessibility.braille_display_hid")
public final class BrailleDisplayControllerImpl implements android.accessibilityservice.BrailleDisplayController {
    BrailleDisplayControllerImpl(android.accessibilityservice.AccessibilityService p0, java.lang.Object p1) {}
    public BrailleDisplayControllerImpl(android.accessibilityservice.AccessibilityService p0, java.lang.Object p1, boolean p2) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void connect(android.bluetooth.BluetoothDevice p0, android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback p1) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void connect(android.bluetooth.BluetoothDevice p0, java.util.concurrent.Executor p1, android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback p2) {}
    public void connect(android.hardware.usb.UsbDevice p0, android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback p1) {}
    public void connect(android.hardware.usb.UsbDevice p0, java.util.concurrent.Executor p1, android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback p2) {}
    public boolean isConnected() { return false; }
    public void write(byte[] p0) throws java.io.IOException {}
    public void disconnect() {}

    private final class IBrailleDisplayControllerWrapper extends android.accessibilityservice.IBrailleDisplayController.Stub {
        public void onConnected(android.accessibilityservice.IBrailleDisplayConnection p0, byte[] p1) {}
        public void onConnectionFailed(int p0) {}
        public void onInput(byte[] p0) {}
        public void onDisconnected() {}
    }
}
