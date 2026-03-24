package android.hardware.display;

public final class WifiDisplaySessionInfo implements android.os.Parcelable {
    @android.annotation.NonNull
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
