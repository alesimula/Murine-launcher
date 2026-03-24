package android.net.wifi;

public final class WifiClient implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.WifiClient> CREATOR = null;
    WifiClient() {}
    public int describeContents() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.softap_disconnect_reason")
    public int getDisconnectReason() { return 0; }
    @android.annotation.NonNull
    public android.net.MacAddress getMacAddress() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
