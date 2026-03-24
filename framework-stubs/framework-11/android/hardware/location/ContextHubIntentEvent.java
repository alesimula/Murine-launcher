package android.hardware.location;

@android.annotation.SystemApi
public class ContextHubIntentEvent {
    private final int mEventType = 0;
    private final android.hardware.location.ContextHubInfo mContextHubInfo = null;
    private final long mNanoAppId = 0L;
    private final android.hardware.location.NanoAppMessage mNanoAppMessage = null;
    private final int mNanoAppAbortCode = 0;
    private ContextHubIntentEvent(android.hardware.location.ContextHubInfo p0, int p1, long p2, android.hardware.location.NanoAppMessage p3, int p4) {}
    private ContextHubIntentEvent(android.hardware.location.ContextHubInfo p0, int p1) {}
    private ContextHubIntentEvent(android.hardware.location.ContextHubInfo p0, int p1, long p2) {}
    private ContextHubIntentEvent(android.hardware.location.ContextHubInfo p0, int p1, long p2, android.hardware.location.NanoAppMessage p3) {}
    private ContextHubIntentEvent(android.hardware.location.ContextHubInfo p0, int p1, long p2, int p3) {}
    public static android.hardware.location.ContextHubIntentEvent fromIntent(android.content.Intent p0) { return null; }
    public int getEventType() { return 0; }
    public android.hardware.location.ContextHubInfo getContextHubInfo() { return null; }
    public long getNanoAppId() { return 0L; }
    public int getNanoAppAbortCode() { return 0; }
    public android.hardware.location.NanoAppMessage getNanoAppMessage() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    private static void hasExtraOrThrow(android.content.Intent p0, java.lang.String p1) {}
    private static int getIntExtraOrThrow(android.content.Intent p0, java.lang.String p1) { return 0; }
    private static long getLongExtraOrThrow(android.content.Intent p0, java.lang.String p1) { return 0L; }
}
