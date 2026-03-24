package android.net;

public class LocalSocket implements java.io.Closeable {
    @android.annotation.UnsupportedAppUsage
    private final android.net.LocalSocketImpl impl = null;
    private volatile boolean implCreated;
    private android.net.LocalSocketAddress localAddress;
    private boolean isBound;
    private boolean isConnected;
    private final int sockType = 0;
    static final int SOCKET_UNKNOWN = 0;
    public static final int SOCKET_DGRAM = 1;
    public static final int SOCKET_STREAM = 2;
    public static final int SOCKET_SEQPACKET = 3;
    public LocalSocket() {}
    public LocalSocket(int p0) {}
    private LocalSocket(android.net.LocalSocketImpl p0, int p1) {}
    public static android.net.LocalSocket createConnectedLocalSocket(java.io.FileDescriptor p0) { return null; }
    static android.net.LocalSocket createLocalSocketForAccept(android.net.LocalSocketImpl p0) { return null; }
    private static android.net.LocalSocket createConnectedLocalSocket(android.net.LocalSocketImpl p0, int p1) { return null; }
    public java.lang.String toString() { return null; }
    private void implCreateIfNeeded() throws java.io.IOException {}
    public void connect(android.net.LocalSocketAddress p0) throws java.io.IOException {}
    public void bind(android.net.LocalSocketAddress p0) throws java.io.IOException {}
    public android.net.LocalSocketAddress getLocalSocketAddress() { return null; }
    public java.io.InputStream getInputStream() throws java.io.IOException { return null; }
    public java.io.OutputStream getOutputStream() throws java.io.IOException { return null; }
    public void close() throws java.io.IOException {}
    public void shutdownInput() throws java.io.IOException {}
    public void shutdownOutput() throws java.io.IOException {}
    public void setReceiveBufferSize(int p0) throws java.io.IOException {}
    public int getReceiveBufferSize() throws java.io.IOException { return 0; }
    public void setSoTimeout(int p0) throws java.io.IOException {}
    public int getSoTimeout() throws java.io.IOException { return 0; }
    public void setSendBufferSize(int p0) throws java.io.IOException {}
    public int getSendBufferSize() throws java.io.IOException { return 0; }
    public android.net.LocalSocketAddress getRemoteSocketAddress() { return null; }
    public synchronized boolean isConnected() { return false; }
    public boolean isClosed() { return false; }
    public synchronized boolean isBound() { return false; }
    public boolean isOutputShutdown() { return false; }
    public boolean isInputShutdown() { return false; }
    public void connect(android.net.LocalSocketAddress p0, int p1) throws java.io.IOException {}
    public void setFileDescriptorsForSend(java.io.FileDescriptor[] p0) {}
    public java.io.FileDescriptor[] getAncillaryFileDescriptors() throws java.io.IOException { return null; }
    public android.net.Credentials getPeerCredentials() throws java.io.IOException { return null; }
    public java.io.FileDescriptor getFileDescriptor() { return null; }
}
