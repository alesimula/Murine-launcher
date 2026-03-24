package android.net;

public class Network implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.Network> CREATOR = null;
    public Network(android.net.Network p0) {}
    public void bindSocket(java.io.FileDescriptor p0) throws java.io.IOException {}
    public void bindSocket(java.net.DatagramSocket p0) throws java.io.IOException {}
    public void bindSocket(java.net.Socket p0) throws java.io.IOException {}
    public int describeContents() { return 0; }
    public static android.net.Network fromNetworkHandle(long p0) { return null; }
    public java.net.InetAddress[] getAllByName(java.lang.String p0) throws java.net.UnknownHostException { return null; }
    public java.net.InetAddress getByName(java.lang.String p0) throws java.net.UnknownHostException { return null; }
    public int getNetId() { return 0; }
    public long getNetworkHandle() { return 0L; }
    @android.annotation.NonNull
    public android.net.Network getPrivateDnsBypassingCopy() { return null; }
    public javax.net.SocketFactory getSocketFactory() { return null; }
    public java.net.URLConnection openConnection(java.net.URL p0) throws java.io.IOException { return null; }
    public java.net.URLConnection openConnection(java.net.URL p0, java.net.Proxy p1) throws java.io.IOException { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
