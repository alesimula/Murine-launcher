package android.hardware.display;

public final class WifiDisplayStatus implements android.os.Parcelable {
    private final int mFeatureState = 0;
    private final int mScanState = 0;
    private final int mActiveDisplayState = 0;
    private final android.hardware.display.WifiDisplay mActiveDisplay = null;
    private final android.hardware.display.WifiDisplay[] mDisplays = null;
    private final android.hardware.display.WifiDisplaySessionInfo mSessionInfo = null;
    public static final int FEATURE_STATE_UNAVAILABLE = 0;
    public static final int FEATURE_STATE_DISABLED = 1;
    public static final int FEATURE_STATE_OFF = 2;
    public static final int FEATURE_STATE_ON = 3;
    public static final int SCAN_STATE_NOT_SCANNING = 0;
    public static final int SCAN_STATE_SCANNING = 1;
    public static final int DISPLAY_STATE_NOT_CONNECTED = 0;
    public static final int DISPLAY_STATE_CONNECTING = 1;
    public static final int DISPLAY_STATE_CONNECTED = 2;
    public static final android.os.Parcelable.Creator<android.hardware.display.WifiDisplayStatus> CREATOR = null;
    public WifiDisplayStatus() {}
    public WifiDisplayStatus(int p0, int p1, int p2, android.hardware.display.WifiDisplay p3, android.hardware.display.WifiDisplay[] p4, android.hardware.display.WifiDisplaySessionInfo p5) {}
    public int getFeatureState() { return 0; }
    public int getScanState() { return 0; }
    public int getActiveDisplayState() { return 0; }
    public android.hardware.display.WifiDisplay getActiveDisplay() { return null; }
    public android.hardware.display.WifiDisplay[] getDisplays() { return null; }
    public android.hardware.display.WifiDisplaySessionInfo getSessionInfo() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
}
