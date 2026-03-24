package android.hardware.usb.flags;

public class CustomFeatureFlags implements android.hardware.usb.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.hardware.usb.flags.FeatureFlags>> p0) {}
    public boolean enableInputPowerLimitedWarning() { return false; }
    public boolean enableInterfaceNameDeviceFilter() { return false; }
    public boolean enableIsModeChangeSupportedApi() { return false; }
    public boolean enableIsPdCompliantApi() { return false; }
    public boolean enableReportUsbDataComplianceWarning() { return false; }
    public boolean enableUsbDataComplianceWarning() { return false; }
    public boolean enableUsbDataSignalStaking() { return false; }
    public boolean enableUsbSysfsMidiIdentification() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.hardware.usb.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
