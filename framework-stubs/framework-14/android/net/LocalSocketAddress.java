package android.net;

public class LocalSocketAddress {
    public LocalSocketAddress(java.lang.String p0, android.net.LocalSocketAddress.Namespace p1) {}
    public LocalSocketAddress(java.lang.String p0) {}
    public java.lang.String getName() { return null; }
    public android.net.LocalSocketAddress.Namespace getNamespace() { return null; }

    public static enum Namespace {
        ABSTRACT,
        RESERVED,
        FILESYSTEM;
        int getId() { return 0; }
    }
}
