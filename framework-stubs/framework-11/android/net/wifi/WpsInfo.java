package android.net.wifi;

public class WpsInfo implements android.os.Parcelable {
    public java.lang.String BSSID;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.WpsInfo> CREATOR = null;
    public static final int DISPLAY = 1;
    public static final int INVALID = 4;
    public static final int KEYPAD = 2;
    public static final int LABEL = 3;
    public static final int PBC = 0;
    public java.lang.String pin;
    public int setup;
    public WpsInfo() {}
    public WpsInfo(android.net.wifi.WpsInfo p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
