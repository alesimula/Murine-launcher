package android.nfc;

@android.annotation.FlaggedApi("android.nfc.enable_nfc_charging")
public final class WlcListenerDeviceInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.nfc.WlcListenerDeviceInfo> CREATOR = null;
    public static final int STATE_CONNECTED_CHARGING = 2;
    public static final int STATE_CONNECTED_DISCHARGING = 3;
    public static final int STATE_DISCONNECTED = 1;
    public WlcListenerDeviceInfo(int p0, double p1, double p2, int p3) {}
    public int describeContents() { return 0; }
    public double getBatteryLevel() { return 0.0; }
    public int getProductId() { return 0; }
    public int getState() { return 0; }
    public double getTemperature() { return 0.0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
