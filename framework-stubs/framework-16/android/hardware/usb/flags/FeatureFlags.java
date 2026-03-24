package android.hardware.usb.flags;

public interface FeatureFlags {
    public boolean enableAccessoryStreamApi();
    public boolean enableInputPowerLimitedWarning();
    public boolean enableInterfaceNameDeviceFilter();
    public boolean enableIsModeChangeSupportedApi();
    public boolean enableIsPdCompliantApi();
    public boolean enableReportUsbDataComplianceWarning();
    public boolean enableUdcSysfsUsbStateUpdate();
    public boolean enableUsbDataComplianceWarning();
    public boolean enableUsbDataSignalStaking();
    public boolean enableUsbDataSignalStakingInternal();
    public boolean enableUsbSysfsMidiIdentification();
    public boolean exposeUsbSpeedSystemApi();
}
