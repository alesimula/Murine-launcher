package android.net.wifi.p2p;

public class WifiP2pWfdInfo implements android.os.Parcelable {
    private static final java.lang.String TAG = "WifiP2pWfdInfo";
    private boolean mWfdEnabled;
    private int mDeviceInfo;
    public static final int WFD_SOURCE = 0;
    public static final int PRIMARY_SINK = 1;
    public static final int SECONDARY_SINK = 2;
    public static final int SOURCE_OR_PRIMARY_SINK = 3;
    private static final int DEVICE_TYPE = 3;
    private static final int COUPLED_SINK_SUPPORT_AT_SOURCE = 4;
    private static final int COUPLED_SINK_SUPPORT_AT_SINK = 8;
    private static final int SESSION_AVAILABLE = 48;
    private static final int SESSION_AVAILABLE_BIT1 = 16;
    private static final int SESSION_AVAILABLE_BIT2 = 32;
    private int mCtrlPort;
    private int mMaxThroughput;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pWfdInfo> CREATOR = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public WifiP2pWfdInfo() {}
    @android.annotation.UnsupportedAppUsage
    public WifiP2pWfdInfo(int p0, int p1, int p2) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isWfdEnabled() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setWfdEnabled(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public int getDeviceType() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public boolean setDeviceType(int p0) { return false; }
    public boolean isCoupledSinkSupportedAtSource() { return false; }
    public void setCoupledSinkSupportAtSource(boolean p0) {}
    public boolean isCoupledSinkSupportedAtSink() { return false; }
    public void setCoupledSinkSupportAtSink(boolean p0) {}
    public boolean isSessionAvailable() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setSessionAvailable(boolean p0) {}
    public int getControlPort() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setControlPort(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setMaxThroughput(int p0) {}
    public int getMaxThroughput() { return 0; }
    public java.lang.String getDeviceInfoHex() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public WifiP2pWfdInfo(android.net.wifi.p2p.WifiP2pWfdInfo p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
}
