package android.net.wifi;

public class WpsInfo implements android.os.Parcelable {
    public static final int PBC = 0;
    public static final int DISPLAY = 1;
    public static final int KEYPAD = 2;
    public static final int LABEL = 3;
    public static final int INVALID = 4;
    public int setup;
    public java.lang.String BSSID;
    public java.lang.String pin;
    public static final android.os.Parcelable.Creator<android.net.wifi.WpsInfo> CREATOR = null;
    public WpsInfo() {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public WpsInfo(android.net.wifi.WpsInfo p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
