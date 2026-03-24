package android.view;

public class InsetsAnimationThread extends android.os.HandlerThread {
    private static android.view.InsetsAnimationThread sInstance;
    private static android.os.Handler sHandler;
    private InsetsAnimationThread() { super((java.lang.String)null); }
    private static void ensureThreadLocked() {}
    public static void release() {}
    public static android.view.InsetsAnimationThread get() { return null; }
    public static android.os.Handler getHandler() { return null; }
}
