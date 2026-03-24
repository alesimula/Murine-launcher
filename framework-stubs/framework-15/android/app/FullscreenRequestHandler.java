package android.app;

public class FullscreenRequestHandler {
    public static final int RESULT_APPROVED = 0;
    public static final int RESULT_FAILED_NOT_IN_FULLSCREEN_WITH_HISTORY = 1;
    public static final int RESULT_FAILED_NOT_TOP_FOCUSED = 2;
    public static final java.lang.String REMOTE_CALLBACK_RESULT_KEY = "result";
    public FullscreenRequestHandler() {}
    static void requestFullscreenMode(int p0, android.os.OutcomeReceiver<java.lang.Void, java.lang.Throwable> p1, android.content.res.Configuration p2, android.os.IBinder p3) {}

    public static @interface RequestResult {
    }
}
