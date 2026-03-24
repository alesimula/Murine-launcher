package android.hardware.usb;

@android.annotation.SystemApi
public final class UsbPortStatus implements android.os.Parcelable {
    public static final int POWER_ROLE_NONE = 0;
    public static final int POWER_ROLE_SOURCE = 1;
    public static final int POWER_ROLE_SINK = 2;
    public static final int DATA_ROLE_NONE = 0;
    public static final int DATA_ROLE_HOST = 1;
    public static final int DATA_ROLE_DEVICE = 2;
    public static final int MODE_NONE = 0;
    public static final int MODE_UFP = 1;
    public static final int MODE_DFP = 2;
    public static final int MODE_DUAL = 3;
    public static final int MODE_AUDIO_ACCESSORY = 4;
    public static final int MODE_DEBUG_ACCESSORY = 8;
    public static final int CONTAMINANT_DETECTION_NOT_SUPPORTED = 0;
    public static final int CONTAMINANT_DETECTION_DISABLED = 1;
    public static final int CONTAMINANT_DETECTION_NOT_DETECTED = 2;
    public static final int CONTAMINANT_DETECTION_DETECTED = 3;
    public static final int CONTAMINANT_PROTECTION_NONE = 0;
    public static final int CONTAMINANT_PROTECTION_SINK = 1;
    public static final int CONTAMINANT_PROTECTION_SOURCE = 2;
    public static final int CONTAMINANT_PROTECTION_FORCE_DISABLE = 4;
    public static final int CONTAMINANT_PROTECTION_DISABLED = 8;
    public static final int DATA_STATUS_UNKNOWN = 0;
    public static final int DATA_STATUS_ENABLED = 1;
    public static final int DATA_STATUS_DISABLED_OVERHEAT = 2;
    public static final int DATA_STATUS_DISABLED_CONTAMINANT = 4;
    public static final int DATA_STATUS_DISABLED_DOCK = 8;
    public static final int DATA_STATUS_DISABLED_FORCE = 16;
    public static final int DATA_STATUS_DISABLED_DEBUG = 32;
    public static final int POWER_BRICK_STATUS_UNKNOWN = 0;
    public static final int POWER_BRICK_STATUS_CONNECTED = 1;
    public static final int POWER_BRICK_STATUS_DISCONNECTED = 2;
    public static final android.os.Parcelable.Creator<android.hardware.usb.UsbPortStatus> CREATOR = null;
    public UsbPortStatus(int p0, int p1, int p2, int p3, int p4, int p5, int p6, boolean p7, int p8) {}
    public UsbPortStatus(int p0, int p1, int p2, int p3, int p4, int p5) {}
    public boolean isConnected() { return false; }
    public int getCurrentMode() { return 0; }
    public int getCurrentPowerRole() { return 0; }
    public int getCurrentDataRole() { return 0; }
    public boolean isRoleCombinationSupported(int p0, int p1) { return false; }
    public int getSupportedRoleCombinations() { return 0; }
    public int getContaminantDetectionStatus() { return 0; }
    public int getContaminantProtectionStatus() { return 0; }
    public int getUsbDataStatus() { return 0; }
    public boolean isPowerTransferLimited() { return false; }
    public int getPowerBrickConnectionStatus() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public android.hardware.usb.UsbPortStatus.Builder setCurrentMode(int p0) { return null; }
        public android.hardware.usb.UsbPortStatus.Builder setCurrentRoles(int p0, int p1) { return null; }
        public android.hardware.usb.UsbPortStatus.Builder setSupportedRoleCombinations(int p0) { return null; }
        public android.hardware.usb.UsbPortStatus.Builder setContaminantStatus(int p0, int p1) { return null; }
        public android.hardware.usb.UsbPortStatus.Builder setPowerTransferLimited(boolean p0) { return null; }
        public android.hardware.usb.UsbPortStatus.Builder setUsbDataStatus(int p0) { return null; }
        public android.hardware.usb.UsbPortStatus.Builder setPowerBrickConnectionStatus(int p0) { return null; }
        public android.hardware.usb.UsbPortStatus build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ContaminantDetectionStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ContaminantProtectionStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface PowerBrickConnectionStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface UsbDataRole {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface UsbDataStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface UsbPortMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface UsbPowerRole {
    }
}
