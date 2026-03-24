package android.net;

class LocalSocketImpl {
    java.io.FileDescriptor[] inboundFileDescriptors;
    java.io.FileDescriptor[] outboundFileDescriptors;
    LocalSocketImpl() {}
    LocalSocketImpl(java.io.FileDescriptor p0) {}
    public java.lang.String toString() { return null; }
    public void create(int p0) throws java.io.IOException {}
    public void close() throws java.io.IOException {}
    protected void connect(android.net.LocalSocketAddress p0, int p1) throws java.io.IOException {}
    public void bind(android.net.LocalSocketAddress p0) throws java.io.IOException {}
    protected void listen(int p0) throws java.io.IOException {}
    protected void accept(android.net.LocalSocketImpl p0) throws java.io.IOException {}
    protected java.io.InputStream getInputStream() throws java.io.IOException { return null; }
    protected java.io.OutputStream getOutputStream() throws java.io.IOException { return null; }
    protected int available() throws java.io.IOException { return 0; }
    protected void shutdownInput() throws java.io.IOException {}
    protected void shutdownOutput() throws java.io.IOException {}
    protected java.io.FileDescriptor getFileDescriptor() { return null; }
    protected boolean supportsUrgentData() { return false; }
    protected void sendUrgentData(int p0) throws java.io.IOException {}
    public java.lang.Object getOption(int p0) throws java.io.IOException { return null; }
    public void setOption(int p0, java.lang.Object p1) throws java.io.IOException {}
    public void setFileDescriptorsForSend(java.io.FileDescriptor[] p0) {}
    public java.io.FileDescriptor[] getAncillaryFileDescriptors() throws java.io.IOException { return null; }
    public android.net.Credentials getPeerCredentials() throws java.io.IOException { return null; }
    public android.net.LocalSocketAddress getSockAddress() throws java.io.IOException { return null; }
    protected void finalize() throws java.io.IOException {}

    class SocketInputStream extends java.io.InputStream {
        SocketInputStream(android.net.LocalSocketImpl p0) { super(); }
        public int available() throws java.io.IOException { return 0; }
        public void close() throws java.io.IOException {}
        public int read() throws java.io.IOException { return 0; }
        public int read(byte[] p0) throws java.io.IOException { return 0; }
        public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
    }

    class SocketOutputStream extends java.io.OutputStream {
        SocketOutputStream(android.net.LocalSocketImpl p0) { super(); }
        public void close() throws java.io.IOException {}
        public void write(byte[] p0) throws java.io.IOException {}
        public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public void write(int p0) throws java.io.IOException {}
    }
}
