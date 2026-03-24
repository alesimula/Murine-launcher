package android.app;

public class EventLogTags {
    public static final int WM_ON_PAUSED_CALLED = 30021;
    public static final int WM_ON_RESUME_CALLED = 30022;
    public static final int WM_STOP_ACTIVITY = 30048;
    public static final int WM_ON_STOP_CALLED = 30049;
    public static final int WM_ON_CREATE_CALLED = 30057;
    public static final int WM_ON_RESTART_CALLED = 30058;
    public static final int WM_ON_START_CALLED = 30059;
    public static final int WM_ON_DESTROY_CALLED = 30060;
    public static final int WM_ON_ACTIVITY_RESULT_CALLED = 30062;
    public static final int WM_ON_TOP_RESUMED_GAINED_CALLED = 30064;
    public static final int WM_ON_TOP_RESUMED_LOST_CALLED = 30065;
    public static final int WM_ADD_TO_STOPPING = 30066;
    private EventLogTags() {}
    public static void writeWmOnPausedCalled(int p0, java.lang.String p1, java.lang.String p2) {}
    public static void writeWmOnResumeCalled(int p0, java.lang.String p1, java.lang.String p2) {}
    public static void writeWmStopActivity(int p0, int p1, java.lang.String p2) {}
    public static void writeWmOnStopCalled(int p0, java.lang.String p1, java.lang.String p2) {}
    public static void writeWmOnCreateCalled(int p0, java.lang.String p1, java.lang.String p2) {}
    public static void writeWmOnRestartCalled(int p0, java.lang.String p1, java.lang.String p2) {}
    public static void writeWmOnStartCalled(int p0, java.lang.String p1, java.lang.String p2) {}
    public static void writeWmOnDestroyCalled(int p0, java.lang.String p1, java.lang.String p2) {}
    public static void writeWmOnActivityResultCalled(int p0, java.lang.String p1, java.lang.String p2) {}
    public static void writeWmOnTopResumedGainedCalled(int p0, java.lang.String p1, java.lang.String p2) {}
    public static void writeWmOnTopResumedLostCalled(int p0, java.lang.String p1, java.lang.String p2) {}
    public static void writeWmAddToStopping(int p0, int p1, java.lang.String p2, java.lang.String p3) {}
}
