package android.accessibilityservice;

@android.annotation.SuppressLint("NotCloseable")
@android.annotation.FlaggedApi("android.view.accessibility.braille_display_hid")
public interface BrailleDisplayController {
    @android.annotation.FlaggedApi("android.view.accessibility.braille_display_hid")
    public static final java.lang.String TEST_BRAILLE_DISPLAY_HIDRAW_PATH = "HIDRAW_PATH";
    @android.annotation.FlaggedApi("android.view.accessibility.braille_display_hid")
    public static final java.lang.String TEST_BRAILLE_DISPLAY_DESCRIPTOR = "DESCRIPTOR";
    @android.annotation.FlaggedApi("android.view.accessibility.braille_display_hid")
    public static final java.lang.String TEST_BRAILLE_DISPLAY_BUS_BLUETOOTH = "BUS_BLUETOOTH";
    @android.annotation.FlaggedApi("android.view.accessibility.braille_display_hid")
    public static final java.lang.String TEST_BRAILLE_DISPLAY_UNIQUE_ID = "UNIQUE_ID";
    public static final java.lang.String TEST_BRAILLE_DISPLAY_NAME = "NAME";
    public static void checkApiFlagIsEnabled() {}
    @android.annotation.FlaggedApi("android.view.accessibility.braille_display_hid")
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void connect(android.bluetooth.BluetoothDevice p0, android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback p1);
    @android.annotation.FlaggedApi("android.view.accessibility.braille_display_hid")
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void connect(android.bluetooth.BluetoothDevice p0, java.util.concurrent.Executor p1, android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback p2);
    @android.annotation.FlaggedApi("android.view.accessibility.braille_display_hid")
    public void connect(android.hardware.usb.UsbDevice p0, android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback p1);
    @android.annotation.FlaggedApi("android.view.accessibility.braille_display_hid")
    public void connect(android.hardware.usb.UsbDevice p0, java.util.concurrent.Executor p1, android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback p2);
    @android.annotation.FlaggedApi("android.view.accessibility.braille_display_hid")
    public boolean isConnected();
    @android.annotation.FlaggedApi("android.view.accessibility.braille_display_hid")
    public void write(byte[] p0) throws java.io.IOException;
    @android.annotation.FlaggedApi("android.view.accessibility.braille_display_hid")
    public void disconnect();
    @android.annotation.FlaggedApi("android.view.accessibility.braille_display_hid")
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACCESSIBILITY")
    public static void setTestBrailleDisplayData(android.accessibilityservice.AccessibilityService p0, java.util.List<android.os.Bundle> p1) {}

    @android.annotation.FlaggedApi("android.view.accessibility.braille_display_hid")
    public static interface BrailleDisplayCallback {
        @android.annotation.FlaggedApi("android.view.accessibility.braille_display_hid")
        public static final int FLAG_ERROR_CANNOT_ACCESS = 1;
        @android.annotation.FlaggedApi("android.view.accessibility.braille_display_hid")
        public static final int FLAG_ERROR_BRAILLE_DISPLAY_NOT_FOUND = 2;
        @android.annotation.FlaggedApi("android.view.accessibility.braille_display_hid")
        public void onConnected(byte[] p0);
        @android.annotation.FlaggedApi("android.view.accessibility.braille_display_hid")
        public void onConnectionFailed(int p0);
        @android.annotation.FlaggedApi("android.view.accessibility.braille_display_hid")
        public void onInput(byte[] p0);
        @android.annotation.FlaggedApi("android.view.accessibility.braille_display_hid")
        public void onDisconnected();

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ErrorCode {
        }
    }
}
