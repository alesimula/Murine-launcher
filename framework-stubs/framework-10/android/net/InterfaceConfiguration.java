package android.net;

public class InterfaceConfiguration implements android.os.Parcelable {
    private java.lang.String mHwAddr;
    private android.net.LinkAddress mAddr;
    private java.util.HashSet<java.lang.String> mFlags;
    private static final java.lang.String FLAG_UP = "up";
    private static final java.lang.String FLAG_DOWN = "down";
    private static final java.lang.String[] EMPTY_STRING_ARRAY = null;
    public static final android.os.Parcelable.Creator<android.net.InterfaceConfiguration> CREATOR = null;
    public InterfaceConfiguration() {}
    public java.lang.String toString() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.Iterable<java.lang.String> getFlags() { return null; }
    public boolean hasFlag(java.lang.String p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public void clearFlag(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setFlag(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setInterfaceUp() {}
    @android.annotation.UnsupportedAppUsage
    public void setInterfaceDown() {}
    public void ignoreInterfaceUpDownStatus() {}
    public android.net.LinkAddress getLinkAddress() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setLinkAddress(android.net.LinkAddress p0) {}
    public java.lang.String getHardwareAddress() { return null; }
    public void setHardwareAddress(java.lang.String p0) {}
    public boolean isActive() { return false; }
    public boolean isUp() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private static void validateFlag(java.lang.String p0) {}
}
