package android.hardware.display;

public final class WifiDisplaySessionInfo implements android.os.Parcelable {
    private final boolean mClient = false;
    private final int mSessionId = 0;
    private final java.lang.String mGroupId = null;
    private final java.lang.String mPassphrase = null;
    private final java.lang.String mIP = null;
    public static final android.os.Parcelable.Creator<android.hardware.display.WifiDisplaySessionInfo> CREATOR = null;
    public WifiDisplaySessionInfo() {}
    public WifiDisplaySessionInfo(boolean p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) {}
    public boolean isClient() { return false; }
    public int getSessionId() { return 0; }
    public java.lang.String getGroupId() { return null; }
    public java.lang.String getPassphrase() { return null; }
    public java.lang.String getIP() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
}
