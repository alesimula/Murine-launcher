package android.webkit;

public class EventLogTags {
    public static final int BROWSER_ZOOM_LEVEL_CHANGE = 70101;
    public static final int BROWSER_DOUBLE_TAP_DURATION = 70102;
    public static final int BROWSER_SNAP_CENTER = 70150;
    public static final int EXP_DET_ATTEMPT_TO_CALL_OBJECT_GETCLASS = 70151;
    private EventLogTags() {}
    public static void writeBrowserZoomLevelChange(int p0, int p1, long p2) {}
    public static void writeBrowserDoubleTapDuration(int p0, long p1) {}
    public static void writeBrowserSnapCenter() {}
    public static void writeExpDetAttemptToCallObjectGetclass(java.lang.String p0) {}
}
