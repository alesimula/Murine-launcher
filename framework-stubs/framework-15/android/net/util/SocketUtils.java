package android.net.util;

@android.annotation.SystemApi
public final class SocketUtils {
    public static void bindSocketToInterface(java.io.FileDescriptor p0, java.lang.String p1) throws android.system.ErrnoException {}
    @android.annotation.NonNull
    public static java.net.SocketAddress makeNetlinkSocketAddress(int p0, int p1) { return null; }
    @android.annotation.NonNull
    public static java.net.SocketAddress makePacketSocketAddress(int p0, int p1) { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public static java.net.SocketAddress makePacketSocketAddress(int p0, byte[] p1) { return null; }
    @android.annotation.NonNull
    public static java.net.SocketAddress makePacketSocketAddress(int p0, int p1, byte[] p2) { return null; }
    public static void closeSocket(java.io.FileDescriptor p0) throws java.io.IOException {}
}
