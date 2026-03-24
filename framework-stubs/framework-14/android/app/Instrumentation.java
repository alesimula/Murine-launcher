package android.app;

public class Instrumentation {
    public static final java.lang.String REPORT_KEY_IDENTIFIER = "id";
    public static final java.lang.String REPORT_KEY_STREAMRESULT = "stream";
    public Instrumentation() {}
    public boolean isInstrumenting() { return false; }
    public void onCreate(android.os.Bundle p0) {}
    public void start() {}
    public void onStart() {}
    public boolean onException(java.lang.Object p0, java.lang.Throwable p1) { return false; }
    public void sendStatus(int p0, android.os.Bundle p1) {}
    public void addResults(android.os.Bundle p0) {}
    public void finish(int p0, android.os.Bundle p1) {}
    public void setAutomaticPerformanceSnapshots() {}
    public void startPerformanceSnapshot() {}
    public void endPerformanceSnapshot() {}
    public void onDestroy() {}
    public android.content.Context getContext() { return null; }
    public android.content.ComponentName getComponentName() { return null; }
    public android.content.Context getTargetContext() { return null; }
    public java.lang.String getProcessName() { return null; }
    public boolean isProfiling() { return false; }
    public void startProfiling() {}
    public void stopProfiling() {}
    public void setInTouchMode(boolean p0) {}
    public void resetInTouchMode() {}
    public void waitForIdle(java.lang.Runnable p0) {}
    public void waitForIdleSync() {}
    public void onEnterAnimationComplete() {}
    public void runOnMainSync(java.lang.Runnable p0) {}
    public android.app.Activity startActivitySync(android.content.Intent p0) { return null; }
    public android.app.Activity startActivitySync(android.content.Intent p0, android.os.Bundle p1) { return null; }
    public void addMonitor(android.app.Instrumentation.ActivityMonitor p0) {}
    public android.app.Instrumentation.ActivityMonitor addMonitor(android.content.IntentFilter p0, android.app.Instrumentation.ActivityResult p1, boolean p2) { return null; }
    public android.app.Instrumentation.ActivityMonitor addMonitor(java.lang.String p0, android.app.Instrumentation.ActivityResult p1, boolean p2) { return null; }
    public boolean checkMonitorHit(android.app.Instrumentation.ActivityMonitor p0, int p1) { return false; }
    public android.app.Activity waitForMonitor(android.app.Instrumentation.ActivityMonitor p0) { return null; }
    public android.app.Activity waitForMonitorWithTimeout(android.app.Instrumentation.ActivityMonitor p0, long p1) { return null; }
    public void removeMonitor(android.app.Instrumentation.ActivityMonitor p0) {}
    public boolean invokeMenuActionSync(android.app.Activity p0, int p1, int p2) { return false; }
    public boolean invokeContextMenuAction(android.app.Activity p0, int p1, int p2) { return false; }
    public void sendStringSync(java.lang.String p0) {}
    public void sendKeySync(android.view.KeyEvent p0) {}
    public void sendKeyDownUpSync(int p0) {}
    public void sendCharacterSync(int p0) {}
    public void sendPointerSync(android.view.MotionEvent p0) {}
    public void sendTrackballEventSync(android.view.MotionEvent p0) {}
    public android.app.Application newApplication(java.lang.ClassLoader p0, java.lang.String p1, android.content.Context p2) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException { return null; }
    public static android.app.Application newApplication(java.lang.Class<?> p0, android.content.Context p1) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException { return null; }
    public void callApplicationOnCreate(android.app.Application p0) {}
    public android.app.Activity newActivity(java.lang.Class<?> p0, android.content.Context p1, android.os.IBinder p2, android.app.Application p3, android.content.Intent p4, android.content.pm.ActivityInfo p5, java.lang.CharSequence p6, android.app.Activity p7, java.lang.String p8, java.lang.Object p9) throws java.lang.InstantiationException, java.lang.IllegalAccessException { return null; }
    public android.app.Activity newActivity(java.lang.ClassLoader p0, java.lang.String p1, android.content.Intent p2) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException { return null; }
    public void callActivityOnCreate(android.app.Activity p0, android.os.Bundle p1) {}
    public void callActivityOnCreate(android.app.Activity p0, android.os.Bundle p1, android.os.PersistableBundle p2) {}
    public void callActivityOnDestroy(android.app.Activity p0) {}
    public void callActivityOnRestoreInstanceState(android.app.Activity p0, android.os.Bundle p1) {}
    public void callActivityOnRestoreInstanceState(android.app.Activity p0, android.os.Bundle p1, android.os.PersistableBundle p2) {}
    public void callActivityOnPostCreate(android.app.Activity p0, android.os.Bundle p1) {}
    public void callActivityOnPostCreate(android.app.Activity p0, android.os.Bundle p1, android.os.PersistableBundle p2) {}
    public void callActivityOnNewIntent(android.app.Activity p0, android.content.Intent p1) {}
    public void callActivityOnNewIntent(android.app.Activity p0, com.android.internal.content.ReferrerIntent p1) {}
    public void callActivityOnStart(android.app.Activity p0) {}
    public void callActivityOnRestart(android.app.Activity p0) {}
    public void callActivityOnResume(android.app.Activity p0) {}
    public void callActivityOnStop(android.app.Activity p0) {}
    public void callActivityOnSaveInstanceState(android.app.Activity p0, android.os.Bundle p1) {}
    public void callActivityOnSaveInstanceState(android.app.Activity p0, android.os.Bundle p1, android.os.PersistableBundle p2) {}
    public void callActivityOnPause(android.app.Activity p0) {}
    public void callActivityOnUserLeaving(android.app.Activity p0) {}
    public void callActivityOnPictureInPictureRequested(android.app.Activity p0) {}
    @java.lang.Deprecated
    public void startAllocCounting() {}
    @java.lang.Deprecated
    public void stopAllocCounting() {}
    public android.os.Bundle getAllocCounts() { return null; }
    public android.os.Bundle getBinderCounts() { return null; }
    public android.app.Instrumentation.ActivityResult execStartActivity(android.content.Context p0, android.os.IBinder p1, android.os.IBinder p2, android.app.Activity p3, android.content.Intent p4, int p5, android.os.Bundle p6) { return null; }
    public void execStartActivities(android.content.Context p0, android.os.IBinder p1, android.os.IBinder p2, android.app.Activity p3, android.content.Intent[] p4, android.os.Bundle p5) {}
    public int execStartActivitiesAsUser(android.content.Context p0, android.os.IBinder p1, android.os.IBinder p2, android.app.Activity p3, android.content.Intent[] p4, android.os.Bundle p5, int p6) { return 0; }
    public android.app.Instrumentation.ActivityResult execStartActivity(android.content.Context p0, android.os.IBinder p1, android.os.IBinder p2, java.lang.String p3, android.content.Intent p4, int p5, android.os.Bundle p6) { return null; }
    public android.app.Instrumentation.ActivityResult execStartActivity(android.content.Context p0, android.os.IBinder p1, android.os.IBinder p2, java.lang.String p3, android.content.Intent p4, int p5, android.os.Bundle p6, android.os.UserHandle p7) { return null; }
    public android.app.Instrumentation.ActivityResult execStartActivityAsCaller(android.content.Context p0, android.os.IBinder p1, android.os.IBinder p2, android.app.Activity p3, android.content.Intent p4, int p5, android.os.Bundle p6, boolean p7, int p8) { return null; }
    public void execStartActivityFromAppTask(android.content.Context p0, android.os.IBinder p1, android.app.IAppTask p2, android.content.Intent p3, android.os.Bundle p4) {}
    final void init(android.app.ActivityThread p0, android.content.Context p1, android.content.Context p2, android.content.ComponentName p3, android.app.IInstrumentationWatcher p4, android.app.IUiAutomationConnection p5) {}
    final void basicInit(android.app.ActivityThread p0) {}
    public static void checkStartActivityResult(int p0, java.lang.Object p1) {}
    public android.app.UiAutomation getUiAutomation() { return null; }
    public android.app.UiAutomation getUiAutomation(int p0) { return null; }
    public android.os.TestLooperManager acquireLooperManager(android.os.Looper p0) { return null; }

    public static class ActivityMonitor {
        int mHits;
        android.app.Activity mLastActivity;
        public ActivityMonitor(android.content.IntentFilter p0, android.app.Instrumentation.ActivityResult p1, boolean p2) {}
        public ActivityMonitor(java.lang.String p0, android.app.Instrumentation.ActivityResult p1, boolean p2) {}
        public ActivityMonitor() {}
        final boolean ignoreMatchingSpecificIntents() { return false; }
        public final android.content.IntentFilter getFilter() { return null; }
        public final android.app.Instrumentation.ActivityResult getResult() { return null; }
        public final boolean isBlocking() { return false; }
        public final int getHits() { return 0; }
        public final android.app.Activity getLastActivity() { return null; }
        public final android.app.Activity waitForActivity() { return null; }
        public final android.app.Activity waitForActivityWithTimeout(long p0) { return null; }
        public android.app.Instrumentation.ActivityResult onStartActivity(android.content.Context p0, android.content.Intent p1, android.os.Bundle p2) { return null; }
        public android.app.Instrumentation.ActivityResult onStartActivity(android.content.Intent p0) { return null; }
        public void onStartActivityResult(int p0, android.os.Bundle p1) {}
        final boolean match(android.content.Context p0, android.app.Activity p1, android.content.Intent p2) { return false; }
    }

    public static final class ActivityResult {
        public ActivityResult(int p0, android.content.Intent p1) {}
        public int getResultCode() { return 0; }
        public android.content.Intent getResultData() { return null; }
    }

    private final class ActivityGoing implements android.os.MessageQueue.IdleHandler {
        public ActivityGoing(android.app.Instrumentation p0, android.app.Instrumentation.ActivityWaiter p1) {}
        public final boolean queueIdle() { return false; }
    }

    private static final class ActivityWaiter {
        public final android.content.Intent intent = null;
        public android.app.Activity activity;
        public ActivityWaiter(android.content.Intent p0) {}
    }

    private static final class EmptyRunnable implements java.lang.Runnable {
        public void run() {}
    }

    private static final class Idler implements android.os.MessageQueue.IdleHandler {
        public Idler(java.lang.Runnable p0) {}
        public final boolean queueIdle() { return false; }
        public void waitForIdle() {}
    }

    private final class InstrumentationThread extends java.lang.Thread {
        public InstrumentationThread(android.app.Instrumentation p0, java.lang.String p1) { super(); }
        public void run() {}
    }

    private static final class SyncRunnable implements java.lang.Runnable {
        public SyncRunnable(java.lang.Runnable p0) {}
        public void run() {}
        public void waitForComplete() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UiAutomationFlags {
    }
}
