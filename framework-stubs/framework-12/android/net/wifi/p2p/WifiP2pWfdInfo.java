package android.net.wifi.p2p;

public final class WifiP2pWfdInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pWfdInfo> CREATOR = null;
    public static final int DEVICE_INFO_AUDIO_ONLY_SUPPORT_AT_SOURCE = 2048;
    public static final int DEVICE_INFO_AUDIO_UNSUPPORTED_AT_PRIMARY_SINK = 1024;
    public static final int DEVICE_INFO_CONTENT_PROTECTION_SUPPORT = 256;
    public static final int DEVICE_INFO_COUPLED_SINK_SUPPORT_AT_SINK = 8;
    public static final int DEVICE_INFO_COUPLED_SINK_SUPPORT_AT_SOURCE = 4;
    public static final int DEVICE_INFO_DEVICE_TYPE_MASK = 3;
    public static final int DEVICE_INFO_PREFERRED_CONNECTIVITY_MASK = 128;
    public static final int DEVICE_INFO_SESSION_AVAILABLE_MASK = 48;
    public static final int DEVICE_INFO_TDLS_PERSISTENT_GROUP = 4096;
    public static final int DEVICE_INFO_TDLS_PERSISTENT_GROUP_REINVOKE = 8192;
    public static final int DEVICE_INFO_TIME_SYNCHRONIZATION_SUPPORT = 512;
    public static final int DEVICE_INFO_WFD_SERVICE_DISCOVERY_SUPPORT = 64;
    public static final int DEVICE_TYPE_PRIMARY_SINK = 1;
    public static final int DEVICE_TYPE_SECONDARY_SINK = 2;
    public static final int DEVICE_TYPE_SOURCE_OR_PRIMARY_SINK = 3;
    public static final int DEVICE_TYPE_WFD_SOURCE = 0;
    public static final int PREFERRED_CONNECTIVITY_P2P = 0;
    public static final int PREFERRED_CONNECTIVITY_TDLS = 1;
    public WifiP2pWfdInfo() {}
    public WifiP2pWfdInfo(android.net.wifi.p2p.WifiP2pWfdInfo p0) {}
    public int getDeviceInfo() { return 0; }
    public int getR2DeviceInfo() { return 0; }
    public boolean isEnabled() { return false; }
    public boolean isR2Supported() { return false; }
    public void setEnabled(boolean p0) {}
    public boolean setR2DeviceType(int p0) { return false; }
    public int getDeviceType() { return 0; }
    public int getR2DeviceType() { return 0; }
    public boolean setDeviceType(int p0) { return false; }
    public boolean isSessionAvailable() { return false; }
    public void setSessionAvailable(boolean p0) {}
    public boolean isContentProtectionSupported() { return false; }
    public void setContentProtectionSupported(boolean p0) {}
    public boolean isCoupledSinkSupportedAtSource() { return false; }
    public void setCoupledSinkSupportAtSource(boolean p0) {}
    public boolean isCoupledSinkSupportedAtSink() { return false; }
    public void setCoupledSinkSupportAtSink(boolean p0) {}
    public int getControlPort() { return 0; }
    public void setControlPort(int p0) {}
    public void setMaxThroughput(int p0) {}
    public int getMaxThroughput() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
