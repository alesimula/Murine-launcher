package android.net;

public class EventLogTags {
    public static final int NTP_SUCCESS = 50080;
    public static final int NTP_FAILURE = 50081;
    private EventLogTags() {}
    public static void writeNtpSuccess(java.lang.String p0, long p1, long p2) {}
    public static void writeNtpFailure(java.lang.String p0, java.lang.String p1) {}
}
