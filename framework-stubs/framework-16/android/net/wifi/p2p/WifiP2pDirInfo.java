package android.net.wifi.p2p;

@android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
public final class WifiP2pDirInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pDirInfo> CREATOR = null;
    public WifiP2pDirInfo(android.net.MacAddress p0, byte[] p1, byte[] p2) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public byte[] getDirTag() { return null; }
    @android.annotation.NonNull
    public android.net.MacAddress getMacAddress() { return null; }
    @android.annotation.NonNull
    public byte[] getNonce() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
