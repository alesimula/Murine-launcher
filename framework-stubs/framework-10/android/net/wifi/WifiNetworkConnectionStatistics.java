package android.net.wifi;

@android.annotation.SystemApi
public class WifiNetworkConnectionStatistics implements android.os.Parcelable {
    private static final java.lang.String TAG = "WifiNetworkConnnectionStatistics";
    public int numConnection;
    public int numUsage;
    public static final android.os.Parcelable.Creator<android.net.wifi.WifiNetworkConnectionStatistics> CREATOR = null;
    public WifiNetworkConnectionStatistics(int p0, int p1) {}
    public WifiNetworkConnectionStatistics() {}
    public java.lang.String toString() { return null; }
    public WifiNetworkConnectionStatistics(android.net.wifi.WifiNetworkConnectionStatistics p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
