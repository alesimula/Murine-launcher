package android.system;

public final class StructMsghdr {
    @android.annotation.Nullable
    public android.system.StructCmsghdr[] msg_control;
    public int msg_flags;
    @android.annotation.NonNull
    public final java.nio.ByteBuffer[] msg_iov = null;
    @android.annotation.Nullable
    public java.net.SocketAddress msg_name;
    public StructMsghdr(java.net.SocketAddress p0, java.nio.ByteBuffer[] p1, android.system.StructCmsghdr[] p2, int p3) {}
}
