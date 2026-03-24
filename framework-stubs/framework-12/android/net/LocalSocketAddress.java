package android.net;

public class LocalSocketAddress {
    private final java.lang.String name = null;
    private final android.net.LocalSocketAddress.Namespace namespace = null;
    public LocalSocketAddress(java.lang.String p0, android.net.LocalSocketAddress.Namespace p1) {}
    public LocalSocketAddress(java.lang.String p0) {}
    public java.lang.String getName() { return null; }
    public android.net.LocalSocketAddress.Namespace getNamespace() { return null; }

    public static enum Namespace {
        ABSTRACT,
        RESERVED,
        FILESYSTEM;
        private int id;
        private Namespace() {}
        int getId() { return 0; }
    }
}
