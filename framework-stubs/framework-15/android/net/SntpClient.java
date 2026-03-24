package android.net;

public class SntpClient {
    public static final int STANDARD_NTP_PORT = 123;
    public SntpClient() {}
    public SntpClient(java.util.function.Supplier<java.time.Instant> p0, java.util.Random p1) {}
    public boolean requestTime(java.lang.String p0, int p1, int p2, android.net.Network p3) { return false; }
    public boolean requestTime(java.net.InetAddress p0, int p1, int p2, android.net.Network p3) { return false; }
    public static java.time.Duration calculateClockOffset(android.net.sntp.Timestamp64 p0, android.net.sntp.Timestamp64 p1, android.net.sntp.Timestamp64 p2, android.net.sntp.Timestamp64 p3) { return null; }
    @java.lang.Deprecated
    public boolean requestTime(java.lang.String p0, int p1) { return false; }
    public long getClockOffset() { return 0L; }
    public long getNtpTime() { return 0L; }
    public long getNtpTimeReference() { return 0L; }
    public long getRoundTripTime() { return 0L; }
    @android.annotation.Nullable
    public java.net.InetSocketAddress getServerSocketAddress() { return null; }

    private static class InvalidServerReplyException extends java.lang.Exception {
        public InvalidServerReplyException(java.lang.String p0) { super(); }
    }
}
