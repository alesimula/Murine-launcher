package android.net;

public class InterfaceConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.net.InterfaceConfiguration> CREATOR = null;
    public InterfaceConfiguration() {}
    public java.lang.String toString() { return null; }
    public java.lang.Iterable<java.lang.String> getFlags() { return null; }
    public boolean hasFlag(java.lang.String p0) { return false; }
    public void clearFlag(java.lang.String p0) {}
    public void setFlag(java.lang.String p0) {}
    public void setInterfaceUp() {}
    public void setInterfaceDown() {}
    public void ignoreInterfaceUpDownStatus() {}
    public android.net.LinkAddress getLinkAddress() { return null; }
    public void setLinkAddress(android.net.LinkAddress p0) {}
    public java.lang.String getHardwareAddress() { return null; }
    public void setHardwareAddress(java.lang.String p0) {}
    public boolean isActive() { return false; }
    public boolean isUp() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
