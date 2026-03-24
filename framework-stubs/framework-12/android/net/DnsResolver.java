package android.net;

public final class DnsResolver {
    public static final int CLASS_IN = 1;
    public static final int ERROR_PARSE = 0;
    public static final int ERROR_SYSTEM = 1;
    public static final int FLAG_EMPTY = 0;
    public static final int FLAG_NO_CACHE_LOOKUP = 4;
    public static final int FLAG_NO_CACHE_STORE = 2;
    public static final int FLAG_NO_RETRY = 1;
    public static final int TYPE_A = 1;
    public static final int TYPE_AAAA = 28;
    private DnsResolver() {}
    @android.annotation.NonNull
    public static android.net.DnsResolver getInstance() { return null; }
    public void rawQuery(android.net.Network p0, byte[] p1, int p2, java.util.concurrent.Executor p3, android.os.CancellationSignal p4, android.net.DnsResolver.Callback<? super byte[]> p5) {}
    public void rawQuery(android.net.Network p0, java.lang.String p1, int p2, int p3, int p4, java.util.concurrent.Executor p5, android.os.CancellationSignal p6, android.net.DnsResolver.Callback<? super byte[]> p7) {}
    public void query(android.net.Network p0, java.lang.String p1, int p2, java.util.concurrent.Executor p3, android.os.CancellationSignal p4, android.net.DnsResolver.Callback<? super java.util.List<java.net.InetAddress>> p5) {}
    public void query(android.net.Network p0, java.lang.String p1, int p2, int p3, java.util.concurrent.Executor p4, android.os.CancellationSignal p5, android.net.DnsResolver.Callback<? super java.util.List<java.net.InetAddress>> p6) {}

    public static interface Callback<T extends java.lang.Object> {
        public void onAnswer(T p0, int p1);
        public void onError(android.net.DnsResolver.DnsException p0);
    }

    public static class DnsException extends java.lang.Exception {
        public final int code = 0;
        DnsException() { super(); }
    }
}
