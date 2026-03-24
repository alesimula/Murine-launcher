package android.hardware.usb;

@android.annotation.SystemApi
public final class UsbPort {
    private final java.lang.String mId = null;
    private final int mSupportedModes = 0;
    private final android.hardware.usb.UsbManager mUsbManager = null;
    private final int mSupportedContaminantProtectionModes = 0;
    private final boolean mSupportsEnableContaminantPresenceProtection = false;
    private final boolean mSupportsEnableContaminantPresenceDetection = false;
    private static final int NUM_DATA_ROLES = 3;
    private static final int POWER_ROLE_OFFSET = 0;
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
    public void enableContaminantDetection(boolean p0) {}
    public static int combineRolesAsBit(int p0, int p1) { return 0; }
    public static java.lang.String modeToString(int p0) { return null; }
    public static java.lang.String powerRoleToString(int p0) { return null; }
    public static java.lang.String dataRoleToString(int p0) { return null; }
    public static java.lang.String contaminantPresenceStatusToString(int p0) { return null; }
    public static java.lang.String roleCombinationsToString(int p0) { return null; }
    public static void checkMode(int p0) {}
    public static void checkPowerRole(int p0) {}
    public static void checkDataRole(int p0) {}
    public static void checkRoles(int p0, int p1) {}
    public boolean isModeSupported(int p0) { return false; }
    public java.lang.String toString() { return null; }
}
