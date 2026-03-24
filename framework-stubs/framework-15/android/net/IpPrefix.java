package android.net;

public final class IpPrefix implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.IpPrefix> CREATOR = null;
    public IpPrefix(java.net.InetAddress p0, int p1) {}
    public IpPrefix(java.lang.String p0) {}
    public boolean contains(java.net.InetAddress p0) { return false; }
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.net.InetAddress getAddress() { return null; }
    public int getPrefixLength() { return 0; }
    @android.annotation.NonNull
    public byte[] getRawAddress() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
