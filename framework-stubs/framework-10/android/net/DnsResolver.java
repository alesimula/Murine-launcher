package android.net;

public final class DnsResolver {
    private static final java.lang.String TAG = "DnsResolver";
    private static final int FD_EVENTS = 5;
    private static final int MAXPACKET = 8192;
    private static final int SLEEP_TIME_MS = 2;
    public static final int CLASS_IN = 1;
    public static final int TYPE_A = 1;
    public static final int TYPE_AAAA = 28;
    public static final int FLAG_EMPTY = 0;
    public static final int FLAG_NO_RETRY = 1;
    public static final int FLAG_NO_CACHE_STORE = 2;
    public static final int FLAG_NO_CACHE_LOOKUP = 4;
    public static final int ERROR_PARSE = 0;
    public static final int ERROR_SYSTEM = 1;
    private static final int NETID_UNSET = 0;
    private static final android.net.DnsResolver sInstance = null;
    public static android.net.DnsResolver getInstance() { return null; }
    private DnsResolver() {}
    public void rawQuery(android.net.Network p0, byte[] p1, int p2, java.util.concurrent.Executor p3, android.os.CancellationSignal p4, android.net.DnsResolver.Callback<? super byte[]> p5) {}
    public void rawQuery(android.net.Network p0, java.lang.String p1, int p2, int p3, int p4, java.util.concurrent.Executor p5, android.os.CancellationSignal p6, android.net.DnsResolver.Callback<? super byte[]> p7) {}
    public void query(android.net.Network p0, java.lang.String p1, int p2, java.util.concurrent.Executor p3, android.os.CancellationSignal p4, android.net.DnsResolver.Callback<? super java.util.List<java.net.InetAddress>> p5) {}
    public void query(android.net.Network p0, java.lang.String p1, int p2, int p3, java.util.concurrent.Executor p4, android.os.CancellationSignal p5, android.net.DnsResolver.Callback<? super java.util.List<java.net.InetAddress>> p6) {}
    private void registerFDListener(java.util.concurrent.Executor p0, java.io.FileDescriptor p1, android.net.DnsResolver.Callback<? super byte[]> p2, android.os.CancellationSignal p3, java.lang.Object p4) {}
    private void cancelQuery(java.io.FileDescriptor p0) {}
    private void addCancellationSignal(android.os.CancellationSignal p0, java.io.FileDescriptor p1, java.lang.Object p2) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface QueryType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface QueryFlag {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface QueryClass {
    }

    private class InetAddressAnswerAccumulator implements android.net.DnsResolver.Callback<byte[]> {
        private final java.util.List<java.net.InetAddress> mAllAnswers = null;
        private final android.net.Network mNetwork = null;
        private int mRcode;
        private android.net.DnsResolver.DnsException mDnsException;
        private final android.net.DnsResolver.Callback<? super java.util.List<java.net.InetAddress>> mUserCallback = null;
        private final int mTargetAnswerCount = 0;
        private int mReceivedAnswerCount;
        InetAddressAnswerAccumulator(android.net.Network p0, int p1, android.net.DnsResolver.Callback<? super java.util.List<java.net.InetAddress>> p2) {}
        private boolean maybeReportError() { return false; }
        private void maybeReportAnswer() {}
        public void onAnswer(byte[] p0, int p1) {}
        public void onError(android.net.DnsResolver.DnsException p0) {}
    }

    public static final class DnsResponse {
        public final byte[] answerbuf = null;
        public final int rcode = 0;
        public DnsResponse(byte[] p0, int p1) {}
    }

    public static class DnsException extends java.lang.Exception {
        public final int code = 0;
        DnsException(int p0, java.lang.Throwable p1) { super(); }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface DnsError {
    }

    private static class DnsAddressAnswer extends android.net.DnsPacket {
        private static final java.lang.String TAG = "DnsResolver.DnsAddressAnswer";
        private static final boolean DBG = false;
        private final int mQueryType = 0;
        DnsAddressAnswer(byte[] p0) throws android.net.ParseException { super(null); }
        public java.util.List<java.net.InetAddress> getAddresses() { return null; }
    }

    public static interface Callback<T extends java.lang.Object> {
        public void onAnswer(T p0, int p1);
        public void onError(android.net.DnsResolver.DnsException p0);
    }
}
