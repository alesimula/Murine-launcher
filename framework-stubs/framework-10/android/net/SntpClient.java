package android.net;

public class SntpClient {
    private static final java.lang.String TAG = "SntpClient";
    private static final boolean DBG = true;
    private static final int REFERENCE_TIME_OFFSET = 16;
    private static final int ORIGINATE_TIME_OFFSET = 24;
    private static final int RECEIVE_TIME_OFFSET = 32;
    private static final int TRANSMIT_TIME_OFFSET = 40;
    private static final int NTP_PACKET_SIZE = 48;
    private static final int NTP_PORT = 123;
    private static final int NTP_MODE_CLIENT = 3;
    private static final int NTP_MODE_SERVER = 4;
    private static final int NTP_MODE_BROADCAST = 5;
    private static final int NTP_VERSION = 3;
    private static final int NTP_LEAP_NOSYNC = 3;
    private static final int NTP_STRATUM_DEATH = 0;
    private static final int NTP_STRATUM_MAX = 15;
    private static final long OFFSET_1900_TO_1970 = 2208988800L;
    private long mNtpTime;
    private long mNtpTimeReference;
    private long mRoundTripTime;
    public SntpClient() {}
    public boolean requestTime(java.lang.String p0, int p1, android.net.Network p2) { return false; }
    public boolean requestTime(java.net.InetAddress p0, int p1, int p2, android.net.Network p3) { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public boolean requestTime(java.lang.String p0, int p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public long getNtpTime() { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long getNtpTimeReference() { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long getRoundTripTime() { return 0L; }
    private static void checkValidServerReply(byte p0, byte p1, int p2, long p3) throws android.net.SntpClient.InvalidServerReplyException {}
    private long read32(byte[] p0, int p1) { return 0L; }
    private long readTimeStamp(byte[] p0, int p1) { return 0L; }
    private void writeTimeStamp(byte[] p0, int p1, long p2) {}

    private static class InvalidServerReplyException extends java.lang.Exception {
        public InvalidServerReplyException(java.lang.String p0) { super(); }
    }
}
