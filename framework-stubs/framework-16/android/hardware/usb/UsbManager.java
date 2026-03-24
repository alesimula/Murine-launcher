package android.hardware.usb;

public class UsbManager {
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_USB_STATE = "android.hardware.usb.action.USB_STATE";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    public static final java.lang.String ACTION_USB_PORT_CHANGED = "android.hardware.usb.action.USB_PORT_CHANGED";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    public static final java.lang.String ACTION_USB_PORT_COMPLIANCE_CHANGED = "android.hardware.usb.action.USB_PORT_COMPLIANCE_CHANGED";
    public static final java.lang.String ACTION_USB_DEVICE_ATTACHED = "android.hardware.usb.action.USB_DEVICE_ATTACHED";
    public static final java.lang.String ACTION_USB_DEVICE_DETACHED = "android.hardware.usb.action.USB_DEVICE_DETACHED";
    public static final java.lang.String ACTION_USB_ACCESSORY_ATTACHED = "android.hardware.usb.action.USB_ACCESSORY_ATTACHED";
    public static final java.lang.String ACTION_USB_ACCESSORY_DETACHED = "android.hardware.usb.action.USB_ACCESSORY_DETACHED";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    public static final java.lang.String ACTION_USB_ACCESSORY_HANDSHAKE = "android.hardware.usb.action.USB_ACCESSORY_HANDSHAKE";
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
    public static final java.lang.String USB_FUNCTION_UVC = "uvc";
    public static final java.lang.String GADGET_HAL_UNKNOWN = "unknown";
    public static final java.lang.String GADGET_HAL_VERSION_1_0 = "V1_0";
    public static final java.lang.String GADGET_HAL_VERSION_1_1 = "V1_1";
    public static final java.lang.String GADGET_HAL_VERSION_1_2 = "V1_2";
    public static final java.lang.String GADGET_HAL_VERSION_2_0 = "V2_0";
    public static final java.lang.String EXTRA_PORT = "port";
    public static final java.lang.String EXTRA_PORT_STATUS = "portStatus";
    public static final java.lang.String EXTRA_DEVICE = "device";
    public static final java.lang.String EXTRA_ACCESSORY = "accessory";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_ACCESSORY_UEVENT_TIME = "android.hardware.usb.extra.ACCESSORY_UEVENT_TIME";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_ACCESSORY_STRING_COUNT = "android.hardware.usb.extra.ACCESSORY_STRING_COUNT";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_ACCESSORY_START = "android.hardware.usb.extra.ACCESSORY_START";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_ACCESSORY_HANDSHAKE_END = "android.hardware.usb.extra.ACCESSORY_HANDSHAKE_END";
    public static final java.lang.String EXTRA_PERMISSION_GRANTED = "permission";
    public static final java.lang.String EXTRA_PACKAGE = "android.hardware.usb.extra.PACKAGE";
    public static final java.lang.String EXTRA_CAN_BE_DEFAULT = "android.hardware.usb.extra.CAN_BE_DEFAULT";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int GADGET_HAL_NOT_SUPPORTED = -1;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int GADGET_HAL_V1_0 = 10;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int GADGET_HAL_V1_1 = 11;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int GADGET_HAL_V1_2 = 12;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int GADGET_HAL_V2_0 = 20;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.hardware.usb.flags.expose_usb_speed_system_api")
    public static final int USB_DATA_TRANSFER_RATE_UNKNOWN = -1;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.hardware.usb.flags.expose_usb_speed_system_api")
    public static final int USB_DATA_TRANSFER_RATE_LOW_SPEED = 2;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.hardware.usb.flags.expose_usb_speed_system_api")
    public static final int USB_DATA_TRANSFER_RATE_FULL_SPEED = 12;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.hardware.usb.flags.expose_usb_speed_system_api")
    public static final int USB_DATA_TRANSFER_RATE_HIGH_SPEED = 480;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.hardware.usb.flags.expose_usb_speed_system_api")
    public static final int USB_DATA_TRANSFER_RATE_5G = 5120;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.hardware.usb.flags.expose_usb_speed_system_api")
    public static final int USB_DATA_TRANSFER_RATE_10G = 10240;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.hardware.usb.flags.expose_usb_speed_system_api")
    public static final int USB_DATA_TRANSFER_RATE_20G = 20480;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.hardware.usb.flags.expose_usb_speed_system_api")
    public static final int USB_DATA_TRANSFER_RATE_40G = 40960;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int USB_HAL_RETRY = -2;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int USB_HAL_NOT_SUPPORTED = -1;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int USB_HAL_V1_0 = 10;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int USB_HAL_V1_1 = 11;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int USB_HAL_V1_2 = 12;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int USB_HAL_V1_3 = 13;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int USB_HAL_V2_0 = 20;
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
    @android.annotation.SystemApi
    public static final long FUNCTION_UVC = 128L;
    public UsbManager(android.content.Context p0, android.hardware.usb.IUsbManager p1) {}
    public java.util.HashMap<java.lang.String, android.hardware.usb.UsbDevice> getDeviceList() { return null; }
    public android.hardware.usb.UsbDeviceConnection openDevice(android.hardware.usb.UsbDevice p0) { return null; }
    public android.hardware.usb.UsbAccessory[] getAccessoryList() { return null; }
    public android.os.ParcelFileDescriptor openAccessory(android.hardware.usb.UsbAccessory p0) { return null; }
    @android.annotation.FlaggedApi("android.hardware.usb.flags.enable_accessory_stream_api")
    @android.annotation.NonNull
    public java.io.InputStream openAccessoryInputStream(android.hardware.usb.UsbAccessory p0) { return null; }
    @android.annotation.FlaggedApi("android.hardware.usb.flags.enable_accessory_stream_api")
    @android.annotation.NonNull
    public java.io.OutputStream openAccessoryOutputStream(android.hardware.usb.UsbAccessory p0) { return null; }
    public android.os.ParcelFileDescriptor getControlFd(long p0) { return null; }
    public boolean hasPermission(android.hardware.usb.UsbDevice p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    public boolean hasPermission(android.hardware.usb.UsbDevice p0, java.lang.String p1, int p2, int p3) { return false; }
    public boolean hasPermission(android.hardware.usb.UsbAccessory p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    public boolean hasPermission(android.hardware.usb.UsbAccessory p0, int p1, int p2) { return false; }
    public void requestPermission(android.hardware.usb.UsbDevice p0, android.app.PendingIntent p1) {}
    public void requestPermission(android.hardware.usb.UsbAccessory p0, android.app.PendingIntent p1) {}
    public void grantPermission(android.hardware.usb.UsbDevice p0) {}
    public void grantPermission(android.hardware.usb.UsbDevice p0, int p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    public void grantPermission(android.hardware.usb.UsbDevice p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public boolean isFunctionEnabled(java.lang.String p0) { return false; }
    @android.annotation.SuppressLint("UnflaggedApi")
    public boolean isUvcGadgetSupportEnabled() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    public void setCurrentFunctions(long p0) {}
    @java.lang.Deprecated
    public void setCurrentFunction(java.lang.String p0, boolean p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    public long getCurrentFunctions() { return 0L; }
    public void setScreenUnlockedFunctions(long p0) {}
    public long getScreenUnlockedFunctions() { return 0L; }
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.hardware.usb.flags.expose_usb_speed_system_api")
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    public int getUsbBandwidthMbps() { return 0; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    public int getGadgetHalVersion() { return 0; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    public int getUsbHalVersion() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    public void resetUsbGadget() {}
    @android.annotation.SystemApi
    public static boolean isUvcSupportEnabled() { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    public boolean enableUsbDataSignal(boolean p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    @android.annotation.NonNull
    public java.util.List<android.hardware.usb.UsbPort> getPorts() { return null; }
    android.hardware.usb.UsbPortStatus getPortStatus(android.hardware.usb.UsbPort p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    boolean isModeChangeSupported(android.hardware.usb.UsbPort p0) { return false; }
    void setPortRoles(android.hardware.usb.UsbPort p0, int p1, int p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    void enableContaminantDetection(android.hardware.usb.UsbPort p0, boolean p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    void enableLimitPowerTransfer(android.hardware.usb.UsbPort p0, boolean p1, int p2, android.hardware.usb.IUsbOperationInternal p3) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    void resetUsbPort(android.hardware.usb.UsbPort p0, int p1, android.hardware.usb.IUsbOperationInternal p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    boolean enableUsbData(android.hardware.usb.UsbPort p0, boolean p1, int p2, android.hardware.usb.IUsbOperationInternal p3) { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    void enableUsbDataWhileDocked(android.hardware.usb.UsbPort p0, int p1, android.hardware.usb.IUsbOperationInternal p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    public void registerDisplayPortAltModeInfoListener(java.util.concurrent.Executor p0, android.hardware.usb.UsbManager.DisplayPortAltModeInfoListener p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    public void unregisterDisplayPortAltModeInfoListener(android.hardware.usb.UsbManager.DisplayPortAltModeInfoListener p0) {}
    public void setUsbDeviceConnectionHandler(android.content.ComponentName p0) {}
    public static boolean areSettableFunctions(long p0) { return false; }
    public static java.lang.String usbFunctionsToString(long p0) { return null; }
    public static long usbFunctionsFromString(java.lang.String p0) { return 0L; }
    public static int usbSpeedToBandwidth(int p0) { return 0; }
    @android.annotation.NonNull
    public static java.lang.String usbGadgetHalVersionToString(int p0) { return null; }

    private class AccessoryAutoCloseInputStream extends java.io.FileInputStream {
        AccessoryAutoCloseInputStream(android.hardware.usb.UsbManager p0, android.hardware.usb.UsbAccessory p1, android.os.ParcelFileDescriptor p2) { super((java.io.FileDescriptor)null); }
        public void close() throws java.io.IOException {}
        public int read() throws java.io.IOException { return 0; }
        public int read(byte[] p0) throws java.io.IOException { return 0; }
        public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
    }

    private class AccessoryAutoCloseOutputStream extends java.io.FileOutputStream {
        AccessoryAutoCloseOutputStream(android.hardware.usb.UsbManager p0, android.hardware.usb.UsbAccessory p1, android.os.ParcelFileDescriptor p2) { super((java.io.FileDescriptor)null); }
        public void close() throws java.io.IOException {}
    }

    private static class AccessoryHandle {
        AccessoryHandle(android.os.ParcelFileDescriptor p0, boolean p1, boolean p2) {}
        public android.os.ParcelFileDescriptor getPfd() { return null; }
        public boolean isInputStreamOpened() { return false; }
        public boolean isOutputStreamOpened() { return false; }
        public boolean isOpen() { return false; }
    }

    private class DisplayPortAltModeInfoDispatchingListener extends android.hardware.usb.IDisplayPortAltModeInfoListener.Stub {
        public void onDisplayPortAltModeInfoChanged(java.lang.String p0, android.hardware.usb.DisplayPortAltModeInfo p1) {}
    }

    @android.annotation.SystemApi
    public static interface DisplayPortAltModeInfoListener {
        public void onDisplayPortAltModeInfoChanged(java.lang.String p0, android.hardware.usb.DisplayPortAltModeInfo p1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UsbFunctionMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UsbGadgetHalVersion {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UsbHalVersion {
    }
}
