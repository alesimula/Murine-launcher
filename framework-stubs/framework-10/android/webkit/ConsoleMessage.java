package android.webkit;

public class ConsoleMessage {
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private android.webkit.ConsoleMessage.MessageLevel mLevel;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private java.lang.String mMessage;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private java.lang.String mSourceId;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private int mLineNumber;
    public ConsoleMessage(java.lang.String p0, java.lang.String p1, int p2, android.webkit.ConsoleMessage.MessageLevel p3) {}
    public android.webkit.ConsoleMessage.MessageLevel messageLevel() { return null; }
    public java.lang.String message() { return null; }
    public java.lang.String sourceId() { return null; }
    public int lineNumber() { return 0; }

    public static enum MessageLevel {
        TIP,
        LOG,
        WARNING,
        ERROR,
        DEBUG;
        private MessageLevel() {}
    }
}
