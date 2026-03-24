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
    public static final int PATH_INTERNAL = 0;
    public static final int PATH_INVALID = 65535;
    public static final int PORT_INVALID = -1;
    public static final int ID_INVALID = 65535;
    public static final android.hardware.hdmi.HdmiDeviceInfo INACTIVE_DEVICE = null;
    private static final int HDMI_DEVICE_TYPE_CEC = 0;
    private static final int HDMI_DEVICE_TYPE_MHL = 1;
    private static final int HDMI_DEVICE_TYPE_HARDWARE = 2;
    private static final int HDMI_DEVICE_TYPE_INACTIVE = 100;
    private static final int ID_OFFSET_CEC = 0;
    private static final int ID_OFFSET_MHL = 128;
    private static final int ID_OFFSET_HARDWARE = 192;
    private final int mId = 0;
    private final int mHdmiDeviceType = 0;
    private final int mPhysicalAddress = 0;
    private final int mPortId = 0;
    private final int mLogicalAddress = 0;
    private final int mDeviceType = 0;
    private final int mHdmiCecVersion = 0;
    private final int mVendorId = 0;
    private final java.lang.String mDisplayName = null;
    private final int mDevicePowerStatus = 0;
    private final int mDeviceId = 0;
    private final int mAdopterId = 0;
    public static final android.os.Parcelable.Creator<android.hardware.hdmi.HdmiDeviceInfo> CREATOR = null;
    public HdmiDeviceInfo(int p0, int p1, int p2, int p3, int p4, java.lang.String p5, int p6, int p7) {}
    public HdmiDeviceInfo(int p0, int p1, int p2, int p3, int p4, java.lang.String p5, int p6) {}
    public HdmiDeviceInfo(int p0, int p1, int p2, int p3, int p4, java.lang.String p5) {}
    public HdmiDeviceInfo(int p0, int p1) {}
    public HdmiDeviceInfo(int p0, int p1, int p2, int p3) {}
    public HdmiDeviceInfo() {}
    public int getId() { return 0; }
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
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
