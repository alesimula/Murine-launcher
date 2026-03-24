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
    public int describeContents() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    @android.annotation.Nullable
    public java.net.InetAddress getIpAddress() { return null; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.OuiKeyedData> getVendorData() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.ScanResult.InformationElement> getVendorElements() { return null; }
    @android.annotation.Nullable
    public android.net.wifi.p2p.WifiP2pWfdInfo getWfdInfo() { return null; }
    public boolean isGroupOwner() { return false; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public boolean isOpportunisticBootstrappingMethodSupported() { return false; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public boolean isPassphraseDisplayBootstrappingMethodSupported() { return false; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public boolean isPassphraseKeypadBootstrappingMethodSupported() { return false; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public boolean isPinCodeDisplayBootstrappingMethodSupported() { return false; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public boolean isPinCodeKeypadBootstrappingMethodSupported() { return false; }
    public boolean isServiceDiscoveryCapable() { return false; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public void setVendorData(java.util.List<android.net.wifi.OuiKeyedData> p0) {}
    public void update(android.net.wifi.p2p.WifiP2pDevice p0) {}
    public boolean wpsDisplaySupported() { return false; }
    public boolean wpsKeypadSupported() { return false; }
    public boolean wpsPbcSupported() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
