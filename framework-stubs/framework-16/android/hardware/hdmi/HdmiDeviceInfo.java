package android.hardware.hdmi;

@android.annotation.SystemApi
public class HdmiDeviceInfo implements android.os.Parcelable {
    public static final int DEVICE_TV = 0;
    public static final int DEVICE_RECORDER = 1;
    public static final int DEVICE_RESERVED = 2;
    public static final int DEVICE_TUNER = 3;
    public static final int DEVICE_PLAYBACK = 4;
    public static final int DEVICE_AUDIO_SYSTEM = 5;
    public static final int DEVICE_PURE_CEC_SWITCH = 6;
    public static final int DEVICE_VIDEO_PROCESSOR = 7;
    public static final int DEVICE_INACTIVE = -1;
    public static final int ADDR_INTERNAL = 0;
    public static final int ADDR_INVALID = -1;
    public static final int PATH_INTERNAL = 0;
    public static final int PATH_INVALID = 65535;
    public static final int PORT_INVALID = -1;
    public static final int ID_INVALID = 65535;
    public static final int VENDOR_ID_UNKNOWN = 16777215;
    public static final android.hardware.hdmi.HdmiDeviceInfo INACTIVE_DEVICE = null;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.hdmi.HdmiDeviceInfo> CREATOR = null;
    @java.lang.Deprecated
    public HdmiDeviceInfo() {}
    public android.hardware.hdmi.HdmiDeviceInfo.Builder toBuilder() { return null; }
    public static android.hardware.hdmi.HdmiDeviceInfo.Builder cecDeviceBuilder() { return null; }
    public static android.hardware.hdmi.HdmiDeviceInfo mhlDevice(int p0, int p1, int p2, int p3) { return null; }
    public static android.hardware.hdmi.HdmiDeviceInfo hardwarePort(int p0, int p1) { return null; }
    public int getId() { return 0; }
    public android.hardware.hdmi.DeviceFeatures getDeviceFeatures() { return null; }
    public static int idForCecDevice(int p0) { return 0; }
    public static int idForMhlDevice(int p0) { return 0; }
    public static int idForHardware(int p0) { return 0; }
    public int getLogicalAddress() { return 0; }
    public int getPhysicalAddress() { return 0; }
    public int getPortId() { return 0; }
    public int getDeviceType() { return 0; }
    public int getCecVersion() { return 0; }
    public int getDevicePowerStatus() { return 0; }
    public int getDeviceId() { return 0; }
    public int getAdopterId() { return 0; }
    public boolean isSourceType() { return false; }
    public boolean isCecDevice() { return false; }
    public boolean isMhlDevice() { return false; }
    public boolean isInactivated() { return false; }
    public java.lang.String getDisplayName() { return null; }
    public int getVendorId() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        @android.annotation.NonNull
        public android.hardware.hdmi.HdmiDeviceInfo build() { return null; }
        @android.annotation.NonNull
        public android.hardware.hdmi.HdmiDeviceInfo.Builder setPhysicalAddress(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.hdmi.HdmiDeviceInfo.Builder setPortId(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.hdmi.HdmiDeviceInfo.Builder setLogicalAddress(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.hdmi.HdmiDeviceInfo.Builder setDeviceType(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.hdmi.HdmiDeviceInfo.Builder setCecVersion(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.hdmi.HdmiDeviceInfo.Builder setVendorId(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.hdmi.HdmiDeviceInfo.Builder setDisplayName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.hdmi.HdmiDeviceInfo.Builder setDevicePowerStatus(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.hdmi.HdmiDeviceInfo.Builder setDeviceFeatures(android.hardware.hdmi.DeviceFeatures p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.hdmi.HdmiDeviceInfo.Builder setDeviceId(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.hdmi.HdmiDeviceInfo.Builder setAdopterId(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.hdmi.HdmiDeviceInfo.Builder updateDeviceFeatures(android.hardware.hdmi.DeviceFeatures p0) { return null; }
    }
}
