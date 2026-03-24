package android.net.wifi.p2p;

public class WifiP2pDevice implements android.os.Parcelable {
    public static final int AVAILABLE = 3;
    public static final int CONNECTED = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pDevice> CREATOR = null;
    public static final int FAILED = 2;
    public static final int INVITED = 1;
    public static final int UNAVAILABLE = 4;
    public java.lang.String deviceAddress;
    public java.lang.String deviceName;
    public java.lang.String primaryDeviceType;
    public java.lang.String secondaryDeviceType;
    public int status;
    public WifiP2pDevice() {}
    public WifiP2pDevice(android.net.wifi.p2p.WifiP2pDevice p0) {}
    @android.annotation.Nullable
    public android.net.wifi.p2p.WifiP2pWfdInfo getWfdInfo() { return null; }
    public boolean wpsPbcSupported() { return false; }
    public boolean wpsKeypadSupported() { return false; }
    public boolean wpsDisplaySupported() { return false; }
    public boolean isServiceDiscoveryCapable() { return false; }
    public boolean isGroupOwner() { return false; }
    public void update(android.net.wifi.p2p.WifiP2pDevice p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
