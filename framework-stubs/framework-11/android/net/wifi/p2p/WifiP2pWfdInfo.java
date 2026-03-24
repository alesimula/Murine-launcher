package android.net.wifi.p2p;

public final class WifiP2pWfdInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pWfdInfo> CREATOR = null;
    public static final int DEVICE_TYPE_PRIMARY_SINK = 1;
    public static final int DEVICE_TYPE_SECONDARY_SINK = 2;
    public static final int DEVICE_TYPE_SOURCE_OR_PRIMARY_SINK = 3;
    public static final int DEVICE_TYPE_WFD_SOURCE = 0;
    public WifiP2pWfdInfo() {}
    public WifiP2pWfdInfo(android.net.wifi.p2p.WifiP2pWfdInfo p0) {}
    public boolean isEnabled() { return false; }
    public void setEnabled(boolean p0) {}
    public int getDeviceType() { return 0; }
    public boolean setDeviceType(int p0) { return false; }
    public boolean isSessionAvailable() { return false; }
    public void setSessionAvailable(boolean p0) {}
    public boolean isContentProtectionSupported() { return false; }
    public void setContentProtectionSupported(boolean p0) {}
    public int getControlPort() { return 0; }
    public void setControlPort(int p0) {}
    public void setMaxThroughput(int p0) {}
    public int getMaxThroughput() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
