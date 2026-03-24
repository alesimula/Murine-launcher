package android.hardware.usb;

@android.annotation.SystemApi
public final class UsbPort {
    public static final int ENABLE_USB_DATA_SUCCESS = 0;
    public static final int ENABLE_USB_DATA_ERROR_INTERNAL = 1;
    public static final int ENABLE_USB_DATA_ERROR_NOT_SUPPORTED = 2;
    public static final int ENABLE_USB_DATA_ERROR_PORT_MISMATCH = 3;
    public static final int ENABLE_USB_DATA_ERROR_OTHER = 4;
    public static final int ENABLE_LIMIT_POWER_TRANSFER_SUCCESS = 0;
    public static final int ENABLE_LIMIT_POWER_TRANSFER_ERROR_INTERNAL = 1;
    public static final int ENABLE_LIMIT_POWER_TRANSFER_ERROR_NOT_SUPPORTED = 2;
    public static final int ENABLE_LIMIT_POWER_TRANSFER_ERROR_PORT_MISMATCH = 3;
    public static final int ENABLE_LIMIT_POWER_TRANSFER_ERROR_OTHER = 4;
    public static final int ENABLE_USB_DATA_WHILE_DOCKED_SUCCESS = 0;
    public static final int ENABLE_USB_DATA_WHILE_DOCKED_ERROR_INTERNAL = 1;
    public static final int ENABLE_USB_DATA_WHILE_DOCKED_ERROR_NOT_SUPPORTED = 2;
    public static final int ENABLE_USB_DATA_WHILE_DOCKED_ERROR_PORT_MISMATCH = 3;
    public static final int ENABLE_USB_DATA_WHILE_DOCKED_ERROR_DATA_ENABLED = 4;
    public static final int ENABLE_USB_DATA_WHILE_DOCKED_ERROR_OTHER = 5;
    public static final int RESET_USB_PORT_SUCCESS = 0;
    public static final int RESET_USB_PORT_ERROR_INTERNAL = 1;
    public static final int RESET_USB_PORT_ERROR_NOT_SUPPORTED = 2;
    public static final int RESET_USB_PORT_ERROR_PORT_MISMATCH = 3;
    public static final int RESET_USB_PORT_ERROR_OTHER = 4;
    public UsbPort(android.hardware.usb.UsbManager p0, java.lang.String p1, int p2, int p3, boolean p4, boolean p5) {}
    public java.lang.String getId() { return null; }
    public int getSupportedModes() { return 0; }
    public int getSupportedContaminantProtectionModes() { return 0; }
    public boolean supportsEnableContaminantPresenceProtection() { return false; }
    public boolean supportsEnableContaminantPresenceDetection() { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    public android.hardware.usb.UsbPortStatus getStatus() { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    public void setRoles(int p0, int p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    public void resetUsbPort(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    public int enableUsbData(boolean p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    public int enableUsbDataWhileDocked() { return 0; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_USB")
    public int enableLimitPowerTransfer(boolean p0) { return 0; }
    public void enableContaminantDetection(boolean p0) {}
    public static int combineRolesAsBit(int p0, int p1) { return 0; }
    public static java.lang.String modeToString(int p0) { return null; }
    public static java.lang.String powerRoleToString(int p0) { return null; }
    public static java.lang.String dataRoleToString(int p0) { return null; }
    public static java.lang.String contaminantPresenceStatusToString(int p0) { return null; }
    public static java.lang.String usbDataStatusToString(int p0) { return null; }
    public static java.lang.String powerBrickConnectionStatusToString(int p0) { return null; }
    public static java.lang.String roleCombinationsToString(int p0) { return null; }
    public static void checkMode(int p0) {}
    public static void checkPowerRole(int p0) {}
    public static void checkDataRole(int p0) {}
    public static void checkRoles(int p0, int p1) {}
    public boolean isModeSupported(int p0) { return false; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface EnableLimitPowerTransferStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface EnableUsbDataStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface EnableUsbDataWhileDockedStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ResetUsbPortStatus {
    }
}
