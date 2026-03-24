package android.net;

public class Network implements android.os.Parcelable {
    @android.annotation.UnsupportedAppUsage
    public final int netId = 0;
    private volatile android.net.Network.NetworkBoundSocketFactory mNetworkBoundSocketFactory;
    private final java.lang.Object mLock = null;
    private static final boolean httpKeepAlive = Boolean.valueOf(false);
    private static final int httpMaxConnections = Integer.valueOf(0);
    private static final long httpKeepAliveDurationMs = Long.valueOf(0L);
    private static final long HANDLE_MAGIC = 3405697037L;
    private static final int HANDLE_MAGIC_SIZE = 32;
    private final transient boolean mPrivateDnsBypass = false;
    public static final android.os.Parcelable.Creator<android.net.Network> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public Network(int p0) {}
    public Network(int p0, boolean p1) {}
    @android.annotation.SystemApi
    public Network(android.net.Network p0) {}
    public java.net.InetAddress[] getAllByName(java.lang.String p0) throws java.net.UnknownHostException { return null; }
    public java.net.InetAddress getByName(java.lang.String p0) throws java.net.UnknownHostException { return null; }
    @android.annotation.SystemApi
    public android.net.Network getPrivateDnsBypassingCopy() { return null; }
    public int getNetIdForResolv() { return 0; }
    public javax.net.SocketFactory getSocketFactory() { return null; }
    private void maybeInitUrlConnectionFactory() {}
    public java.net.URLConnection openConnection(java.net.URL p0) throws java.io.IOException { return null; }
    public java.net.URLConnection openConnection(java.net.URL p0, java.net.Proxy p1) throws java.io.IOException { return null; }
    public void bindSocket(java.net.DatagramSocket p0) throws java.io.IOException {}
    public void bindSocket(java.net.Socket p0) throws java.io.IOException {}
    public void bindSocket(java.io.FileDescriptor p0) throws java.io.IOException {}
    public static android.net.Network fromNetworkHandle(long p0) { return null; }
    public long getNetworkHandle() { return 0L; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToProto(android.util.proto.ProtoOutputStream p0, long p1) {}

    private class NetworkBoundSocketFactory extends javax.net.SocketFactory {
        private NetworkBoundSocketFactory(android.net.Network p0) { super(); }
        private java.net.Socket connectToHost(java.lang.String p0, int p1, java.net.SocketAddress p2) throws java.io.IOException { return null; }
        public java.net.Socket createSocket(java.lang.String p0, int p1, java.net.InetAddress p2, int p3) throws java.io.IOException { return null; }
        public java.net.Socket createSocket(java.net.InetAddress p0, int p1, java.net.InetAddress p2, int p3) throws java.io.IOException { return null; }
        public java.net.Socket createSocket(java.net.InetAddress p0, int p1) throws java.io.IOException { return null; }
        public java.net.Socket createSocket(java.lang.String p0, int p1) throws java.io.IOException { return null; }
        public java.net.Socket createSocket() throws java.io.IOException { return null; }
    }
}
