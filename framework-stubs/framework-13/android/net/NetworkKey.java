package android.net;

@java.lang.Deprecated
@android.annotation.SystemApi
public class NetworkKey implements android.os.Parcelable {
    public static final int TYPE_WIFI = 1;
    public final int type = 0;
    public final android.net.WifiKey wifiKey = null;
    public static final android.os.Parcelable.Creator<android.net.NetworkKey> CREATOR = null;
    public static android.net.NetworkKey createFromScanResult(android.net.wifi.ScanResult p0) { return null; }
    public static android.net.NetworkKey createFromWifiInfo(android.net.wifi.WifiInfo p0) { return null; }
    public NetworkKey(android.net.WifiKey p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NetworkType {
    }
}
