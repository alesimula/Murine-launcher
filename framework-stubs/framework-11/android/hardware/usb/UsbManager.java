package android.hardware.usb;

public class UsbManager {
    private static final java.lang.String TAG = "UsbManager";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_USB_STATE = "android.hardware.usb.action.USB_STATE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_USB_PORT_CHANGED = "android.hardware.usb.action.USB_PORT_CHANGED";
    public static final java.lang.String ACTION_USB_DEVICE_ATTACHED = "android.hardware.usb.action.USB_DEVICE_ATTACHED";
    public static final java.lang.String ACTION_USB_DEVICE_DETACHED = "android.hardware.usb.action.USB_DEVICE_DETACHED";
    public static final java.lang.String ACTION_USB_ACCESSORY_ATTACHED = "android.hardware.usb.action.USB_ACCESSORY_ATTACHED";
    public static final java.lang.String ACTION_USB_ACCESSORY_DETACHED = "android.hardware.usb.action.USB_ACCESSORY_DETACHED";
    @android.annotation.SystemApi
    public static final java.lang.String USB_CONNECTED = "connected";
    public static final java.lang.String USB_HOST_CONNECTED = "host_connected";
    @android.annotation.SystemApi
    public static final java.lang.String USB_CONFIGURED = "configured";
    public static final java.lang.String USB_DATA_UNLOCKED = "unlocked";
    public static final java.lang.String USB_FUNCTION_NONE = "none";
    public static final java.lang.String USB_FUNCTION_ADB = "adb";
    @android.annotation.SystemApi
    public static final java.lang.String USB_FUNCTION_RNDIS = "rndis";
    public static final java.lang.String USB_FUNCTION_MTP = "mtp";
    public static final java.lang.String USB_FUNCTION_PTP = "ptp";
    public static final java.lang.String USB_FUNCTION_AUDIO_SOURCE = "audio_source";
    public static final java.lang.String USB_FUNCTION_MIDI = "midi";
    public static final java.lang.String USB_FUNCTION_ACCESSORY = "accessory";
    @android.annotation.SystemApi
    public static final java.lang.String USB_FUNCTION_NCM = "ncm";
    public static final java.lang.String EXTRA_PORT = "port";
    public static final java.lang.String EXTRA_PORT_STATUS = "portStatus";
    public static final java.lang.String EXTRA_DEVICE = "device";
    public static final java.lang.String EXTRA_ACCESSORY = "accessory";
    public static final java.lang.String EXTRA_PERMISSION_GRANTED = "permission";
    public static final java.lang.String EXTRA_PACKAGE = "android.hardware.usb.extra.PACKAGE";
    public static final java.lang.String EXTRA_CAN_BE_DEFAULT = "android.hardware.usb.extra.CAN_BE_DEFAULT";
    @android.annotation.SystemApi
    public static final long FUNCTION_NONE = 0L;
    @android.annotation.SystemApi
    public static final long FUNCTION_MTP = 4L;
    @android.annotation.SystemApi
    public static final long FUNCTION_PTP = 16L;
    @android.annotation.SystemApi
    public static final long FUNCTION_RNDIS = 32L;
    @android.annotation.SystemApi
    public static final long FUNCTION_MIDI = 8L;
    @android.annotation.SystemApi
    public static final long FUNCTION_ACCESSORY = 2L;
    @android.annotation.SystemApi
    public static final long FUNCTION_AUDIO_SOURCE = 64L;
    @android.annotation.SystemApi
    public static final long FUNCTION_ADB = 1L;
    @android.annotation.SystemApi
    public static final long FUNCTION_NCM = 1024L;
    private static final long SETTABLE_FUNCTIONS = 1084L;
    private static final java.util.Map<java.lang.String, java.lang.Long> FUNCTION_NAME_TO_CODE = null;
    private final android.content.Context mContext = null;
    private final android.hardware.usb.IUsbManager mService = null;
    public UsbManager(android.content.Context p0, android.hardware.usb.IUsbManager p1) {}
    public java.util.HashMap<java.lang.String, android.hardware.usb.UsbDevice> getDeviceList() { return null; }
    public android.hardware.usb.UsbDeviceConnection openDevice(android.hardware.usb.UsbDevice p0) { return null; }
    public android.hardware.usb.UsbAccessory[] getAccessoryList() { return null; }
    public android.os.ParcelFileDescriptor openAccessory(android.hardware.usb.UsbAccessory p0) { return null; }
    public android.os.ParcelFileDescriptor getControlFd(long p0) { return null; }
    public boolean hasPermission(android.hardware.usb.UsbDevice p0) { return false; }
    public boolean hasPermission(android.hardware.usb.UsbAccessory p0) { return false; }
    public void requestPermission(android.hardware.usb.UsbDevice p0, android.app.PendingIntent p1) {}
    public void requestPermission(android.hardware.usb.UsbAccessory p0, android.app.PendingIntent p1) {}
    public void grantPermission(android.hardware.usb.UsbDevice p0) {}
    public void grantPermission(android.hardware.usb.UsbDevice p0, int p1) {}
    @android.annotation.SystemApi
    public void grantPermission(android.hardware.usb.UsbDevice p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public boolean isFunctionEnabled(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    public void setCurrentFunctions(long p0) {}
    @java.lang.Deprecated
    public void setCurrentFunction(java.lang.String p0, boolean p1) {}
    @android.annotation.SystemApi
    public long getCurrentFunctions() { return 0L; }
    public void setScreenUnlockedFunctions(long p0) {}
    public long getScreenUnlockedFunctions() { return 0L; }
    @android.annotation.SystemApi
    public void resetUsbGadget() {}
    @android.annotation.SystemApi
    public java.util.List<android.hardware.usb.UsbPort> getPorts() { return null; }
    android.hardware.usb.UsbPortStatus getPortStatus(android.hardware.usb.UsbPort p0) { return null; }
    void setPortRoles(android.hardware.usb.UsbPort p0, int p1, int p2) {}
    void enableContaminantDetection(android.hardware.usb.UsbPort p0, boolean p1) {}
    public void setUsbDeviceConnectionHandler(android.content.ComponentName p0) {}
    public static boolean areSettableFunctions(long p0) { return false; }
    public static java.lang.String usbFunctionsToString(long p0) { return null; }
    public static long usbFunctionsFromString(java.lang.String p0) { return 0L; }

    public static @interface UsbFunctionMode {
    }
}
